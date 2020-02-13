package skillmeterpack;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import pack.Main;

public class GameSkill  {
	private int second = 0,minute=0;
	public JLabel scoreLabel,l2;
	public JPanel panel;	
	public JButton   button,buttonBack, btnClick;
	public int x, y, nbre = 0;
	public Chrono c;
	public long moyenne = 0;
	private Th the;

	public GameSkill() {
		
		nbre = 0;
		panel = new JPanel();
		panel.setBounds(0, -20, 500, 600);
		
		JLabel l1 = new JLabel();
		try {
		    Image img = ImageIO.read(new File("C:/Users/Home/Desktop/29719.jpg"));
		     img = img.getScaledInstance(600	, 500, Image.SCALE_DEFAULT);
		     l1.setIcon(new ImageIcon(img));
		  } catch (Exception ex) {
		    System.out.println(ex);
		  }
		l1.setBounds(0, 0, 600, 500);
		panel.add(l1);
		
		button = new JButton("?");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.pause();
			    UIManager.put("OptionPane.okButtonText", "Back");
			    UIManager.put("OptionPane.minimumSize",new Dimension(400,300)); 

				int dialogButton = JOptionPane.PLAIN_MESSAGE;	
				JScrollPane scrollPan = new JScrollPane();
				scrollPan.setEnabled(false);
				scrollPan.setBounds(93, 61, 246, 178);
				
				JTextArea txtrToutesCelles = new JTextArea();
				txtrToutesCelles.setBackground(SystemColor.activeCaption);
				txtrToutesCelles.setWrapStyleWord(true);
				txtrToutesCelles.setLineWrap(true);
				txtrToutesCelles.setText("The goal of this game is to test the time that you take to react to an event, when you start the game a bear will appear in a forst and you have to click on it as fast as you can, by clicking the bear will change place and you have to click again on it, finally the time that you took to react to every bear movement will be calculated.");
				scrollPan.setViewportView(txtrToutesCelles);

			    int dialogResult = JOptionPane.showConfirmDialog(panel, scrollPan, "Help", dialogButton);
			    if(dialogResult == 0) {
			    	c.resume();
			    } 
			}
		});		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		button.setBounds(545, 0, 50, 30);
		button.setVisible(true);
		button.setBackground(Color.decode("#9BD5FF"));
		l1.add(button);
		
		

		JLabel lblSkillMeterGame = new JLabel();
	    try {
		    Image  title = ImageIO.read(new File("C:/Users/Home/Desktop/skillmetergame.png"));
		     title = title.getScaledInstance(500	, 120, Image.SCALE_DEFAULT);
		     lblSkillMeterGame.setIcon(new ImageIcon(title));
		  } catch (Exception ex) {
		    System.out.println(ex);
		  }
		lblSkillMeterGame.setBounds(50, -30, 600	, 120);
		l1.add(lblSkillMeterGame);
		
		scoreLabel = new JLabel();
		scoreLabel.setFont(new Font("Sylfaen", Font.BOLD, 25));
		scoreLabel.setBackground(null);
		scoreLabel.setForeground(Color.black);
		scoreLabel.setBounds(535, 40, 60, 25);
		scoreLabel.setOpaque(false);
		scoreLabel.setVisible(true);
		scoreLabel.setText("0");
		l1.add(scoreLabel);
		
		l2 = new JLabel();
		l2.setFont(new Font("Sylfaen", Font.BOLD, 25));
		l2.setBackground(null);
		l2.setForeground(Color.black);
		l2.setBounds(20, 40, 60, 25);
		l2.setText("00:00");
		l2.setOpaque(false);
		l1.add(l2);

		
		buttonBack = new JButton("<<");
		buttonBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//MainSkill m = new MainSkill();
				MainSkill.l1.setVisible(true);
				panel.setVisible(false);
				
			}
		});
		buttonBack.setFont(new Font("Tahoma", Font.BOLD, 10));
		buttonBack.setBackground(Color.decode("#9BD5FF"));
		buttonBack.setBounds(5, 5, 60, 30);
		buttonBack.setVisible(true);
		//buttonBack.setOpaque(false);
		l1.add(buttonBack);
		btnClick = new JButton("Click Me !");
		  try {
			    Image img = ImageIO.read(new File("C:/Users/Home/Desktop/Asset 6.png"));
			     img = img.getScaledInstance(80	, 90, Image.SCALE_DEFAULT);
			    btnClick.setIcon(new ImageIcon(img));
			  } catch (Exception ex) {
			    System.out.println(ex);
			  }
		btnClick.setOpaque(false);
		btnClick.setBorderPainted(false);
		btnClick.setContentAreaFilled(false);
		btnClick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nbre += 1;
				System.out.println(nbre);
				if(nbre != 9) {
				x = (int)(Math.random() * 500);
				y = (int)(Math.random() * ((400-70 ) + 1)+ 70);
				c.stop();
				System.out.println(nbre+" : "+c.getDureeMs());
				moyenne += c.getDureeMs();
				btnClick.setBounds(x, y, 100, 110);
				System.out.println(moyenne);
				scoreLabel.setText(Long.toString(moyenne));
				c = new Chrono();
				c.start();
				}else {
					c.stop();
					the.interrupt();
					moyenne += c.getDureeMs();
					scoreLabel.setText(Long.toString(moyenne));

				    UIManager.put("OptionPane.cancelButtonText", "Annuler");
				    UIManager.put("OptionPane.noButtonText", "NO");
				    UIManager.put("OptionPane.okButtonText", "D'accord");
				    UIManager.put("OptionPane.yesButtonText", "YES");
					int dialogButton = JOptionPane.YES_NO_OPTION;
				    int dialogResult = JOptionPane.showConfirmDialog(panel, "  Your score is : " +moyenne +"\n do you want to replay ?", "Good job", dialogButton);
				    if(dialogResult == 0) {
				    	nbre = 0;
				    	c.resume();
				    	c.start();
				    	moyenne = 0;
						scoreLabel.setText(Long.toString(moyenne));
						
						minute=0;
						second=0;
						l2.setText("0:0");
						the.start();
						} else {
				    	Component component = (Component) e.getSource();
				        JFrame frame = (JFrame) SwingUtilities.getRoot(component);
						MainSkill.l1.setVisible(true);
				        panel.setVisible(false);
				        //Main.backToMain();
				    }
				}
			}
		});
		
		x = (int)(Math.random() * 500);
		y = (int)(Math.random() * ((400-70 ) + 1)+ 70);
		System.out.println(x +" , "+y);
		btnClick.setBounds(x, y, 100, 110);
		btnClick.setVisible(true);
		l1.add(btnClick);
		panel.setVisible(true);
		c = new Chrono();
		the = new Th();
		the.start();

	}
	
	class Th extends Thread{
		public void run() {
			while(true) {
				
			
			try {
				Thread.sleep(1000);
				if(second==59) {
					second = 0;
					minute ++ ;
					
				}else {
					second++;
				}
				l2.setText(minute+":"+second);
			}catch(Exception exc) {
				System.out.println(exc);
			}
		}
	}}
}