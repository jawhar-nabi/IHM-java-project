package skillmeterpack;
import java.awt.Color;
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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.UIManager;


public class MainSkill  {
	public JPanel p,panel1, panel, panelScore;
	public JButton  btnExit, button, btnStart,btnHowToPlay;
	int x, y, nbre = 0;
	Chrono c;
	long moyenne = 0;
	JLabel Score;
	JButton btnNewButton;
	GameSkill g ;
	public ImageIcon title;
	public static JLabel l1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Main m = new Main();
		MainSkill m = new MainSkill();
		
	}
	public ImageIcon titre() {
		return new ImageIcon("C:/Users/Home/Desktop/skillmetergame.png");
	}
	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public MainSkill() {
		
//		super();
//		this.setTitle("Skill Meter Game");
//	      this.setSize(450, 400);
//	      this.setLocationRelativeTo(null);
//	     // this.setLayout(null);
//	      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			this.setVisible(true);
		panel = new JPanel();
		panel.setBounds(0, -10, 500, 600);
		
		l1 = new JLabel();
		try {
		    Image img = ImageIO.read(new File("C:/Users/Home/Desktop/2599319.jpg"));
		     img = img.getScaledInstance(600	, 500, Image.SCALE_DEFAULT);

		     l1.setIcon(new ImageIcon(img));
		  } catch (Exception ex) {
		    System.out.println(ex);
		  }
		l1.setBounds(0, -10, 600, 500);
		panel.add(l1);
		
		
		
		btnStart = new JButton("Start");
			//btnStart.setBorder(new RoundedBorder(30));
		btnStart.setHorizontalAlignment(SwingConstants.CENTER);
		btnStart.setBackground(Color.decode("#A6CCBA"));
		btnStart.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnStart.setBounds(230, 140, 140, 40);
		btnStart.setFocusPainted(false);
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("start");
				g = new GameSkill();
				panel.add(g.panel);
				g.panel.setVisible(true); 
				l1.setVisible(false);
				g.c.start();
			}
		});
		//panel.setLayout(null);
		l1.add(btnStart);
	    title = new ImageIcon("C:/Users/Home/Desktop/skillmetergame.png");
		JLabel lblSkillMeterGame = new JLabel("Skill Meter Game");
	    try {
		     lblSkillMeterGame.setIcon(title);
		  } catch (Exception ex) {
		    System.out.println(ex);
		  }
		lblSkillMeterGame.setBounds(0, 0, 600	, 80);
		l1.add(lblSkillMeterGame);
		
		

		
		btnHowToPlay = new JButton("How to play");
		btnHowToPlay.setBackground(Color.decode("#A6CCBA"));
		btnHowToPlay.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnHowToPlay.setBounds(215, 235, 170, 40);

		btnHowToPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
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
			    } else {
			    }
			}
		});

		l1.add(btnHowToPlay);

		btnExit = new JButton("Back");
		btnExit.setBackground(Color.decode("#A6CCBA"));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExit.setBounds(230, 320, 140, 40);
		l1.add(btnExit);
		
		l1.setVisible(true);
		panel.setVisible(true);


	}
}