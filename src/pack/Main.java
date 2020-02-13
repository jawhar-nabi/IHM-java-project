package pack;
import paint.InputWH;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
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
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import demineur.Demineur;
import skillmeterpack.GameSkill;
import skillmeterpack.MainSkill;


public class Main implements ActionListener {
	public static JFrame frame;
	JButton jeux1,jeux2,jeux3;
	public static Demineur d;
	public JPanel p1 ;
	static MainSkill ms;
	GameSkill g;
	int restartG1 = 0;
	public static JLabel l1;
	//public JLabel loadingLabel;
//	public Main(int unEntier) {
//		frame = new JFrame("3 in 1 GAME");
//		frame.setSize(600,500);
//		frame.setResizable(false);
//		frame.setLocationRelativeTo(null);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		try{    
//			frame.setIconImage(ImageIO.read(new File("C:/Users/Home/Desktop/2599319.jpg")));   
//		   }
//		catch (Exception ex){
//			System.out.println("image load failed !!");
//		   }
//		d = new Demineur(frame.getWidth(),frame.getHeight());
//		d.frame.setVisible(true);
//		frame.getContentPane().add(d.frame);
//		frame.setVisible(true);
//	}
	public static void restartDemineur() {
		d.visibility(false);
		d = new Demineur(frame.getWidth(),frame.getHeight());
		d.visibility(true);
		frame.getContentPane().add(d.frame);
		d.btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    UIManager.put("OptionPane.noButtonText", "NO");
			    UIManager.put("OptionPane.yesButtonText", "YES");

				int dialogButton = JOptionPane.YES_NO_OPTION;
			    int dialogResult = JOptionPane.showConfirmDialog(d.frame, "  Do you want to quit ?", "Sure ?", dialogButton);
			    if(dialogResult == 0) {
					d.visibility(false);
					frame.setTitle("3 IN 1 GAME");
					l1.setVisible(true);
					//d = new Demineur(frame.getWidth(),frame.getHeight());

			    } else {
			    	
			    }

			}
			});


	}
	public static void backToMain() {
		d.visibility(false);
		ms.panel.setVisible(false);

		frame.setTitle("3 IN 1 GAME");

		l1.setVisible(true);
	}
	
	public Main() {		
		frame = new JFrame("3 in 1 GAME");
		frame.setSize(600,500);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try{    
			frame.setIconImage(ImageIO.read(new File("C:/Users/Home/Desktop/2599319.jpg")));   
		   }
		catch (Exception ex){
		       //do something
			System.out.println("image load failed !!");
		   }
		
//		p1= new JPanel();
//		p1.setBounds(0, 0, frame.getWidth(), frame.getHeight());
//		p1.setLayout(null);		 
//		p1.setVisible(true);
//		frame.getContentPane().add(p1);
		
		l1 = new JLabel();
		try {
		    Image img = ImageIO.read(new File("C:/Users/Home/Desktop/2599319.jpg"));
		     img = img.getScaledInstance(600	, 500, Image.SCALE_DEFAULT);

		     l1.setIcon(new ImageIcon(img));
		  } catch (Exception ex) {
		    System.out.println(ex);
		  }
		l1.setBounds(0, -5, 600, 500);
		frame.add(l1);

		JLabel lblNewLabel = new JLabel();
		
		try {
		    Image img = ImageIO.read(new File("C:/Users/Home/Desktop/3in1.png"));
		     img = img.getScaledInstance(600	, 180, Image.SCALE_DEFAULT);

		     lblNewLabel.setIcon(new ImageIcon(img));
		  } catch (Exception ex) {
		    System.out.println(ex);
		  }
		//lblNewLabel.setForeground(new Color(30, 144, 255));
		//lblNewLabel.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(0, -20, 600, 180);
		lblNewLabel.setVisible(true);
		l1.add(lblNewLabel);

//	    ImageIcon loading = new ImageIcon("C:/Users/Home/Desktop/ajax-loader.gif");
//	    loadingLabel = new JLabel();
//	    try {
//		     loadingLabel.setIcon(loading);
//		  } catch (Exception ex) {
//		    System.out.println(ex);
//		  }
//	    loadingLabel.setBounds(280, 85, 80, 80);
//	    loadingLabel.setVisible(false);
//	    l1.add(loadingLabel);
		
		jeux1 = new JButton();
		jeux1.setBounds(75,	180,	110	,110);
		  try {
			    Image img = ImageIO.read(new File("C:/Users/Home/Desktop/SKILL.jpg"));
			     img = img.getScaledInstance(110	, 110, Image.SCALE_DEFAULT);

			    jeux1.setIcon(new ImageIcon(img));
			  } catch (Exception ex) {
			    System.out.println(ex);
			  }
			jeux1.setVisible(true);
			jeux1.addActionListener(this);

		l1.add(jeux1);
		
		jeux2 = new JButton();
		jeux2.setBounds(245,	160,	110	,110);
		  try {
			    Image img = ImageIO.read(new File("C:/Users/Home/Desktop/DEMINEUR.jpg"));
			     img = img.getScaledInstance(110	, 110, Image.SCALE_DEFAULT);
			    jeux2.setIcon(new ImageIcon(img));
			  } catch (Exception ex) {
			    System.out.println(ex);
			  }
			jeux2.setVisible(true);
			jeux2.addActionListener(this);
		l1.add(jeux2);
		
		jeux3 = new JButton();
		jeux3.setBounds(430,	180,	110	,110);
		  try {
			    Image img = ImageIO.read(new File("C:/Users/Home/Desktop/paint.jpg"));
			     img = img.getScaledInstance(110	, 110, Image.SCALE_DEFAULT);
			    jeux3.setIcon(new ImageIcon(img));
			  } catch (Exception ex) {
			    System.out.println(ex);
			  }
			jeux3.setVisible(true);
			jeux3.addActionListener(this);
		l1.add(jeux3);
		ms = new MainSkill();
		ms.panel.setVisible(false);
		ms.btnStart.addActionListener(this);
		d = new Demineur(frame.getWidth(),frame.getHeight());

		
		g = new GameSkill();
		g.btnClick.addActionListener(this);
		frame.setVisible(true);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		System.out.println("ok");
		m.frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jeux1) {
			frame.getContentPane().add(ms.panel);
			ms.panel.setVisible(true);
			ms.panel.setOpaque(false);
			ms.btnExit.addActionListener(this);
			l1.setVisible(false);
		}
		if(e.getSource() == jeux2) {
			d = new Demineur(frame.getWidth(),frame.getHeight());

			d.btnback.addActionListener(this);

			d.visibility(true);
			frame.getContentPane().add(d.frame);
			frame.setTitle("Minesweeper");
			l1.setVisible(false);
		}
		if(e.getSource() == jeux3) {
			InputWH input = new InputWH();
			//frame.setVisible(false);
		}
			if(e.getSource() == d.btnback) {				  
		    UIManager.put("OptionPane.noButtonText", "NO");
		    UIManager.put("OptionPane.yesButtonText", "YES");
		    UIManager.put("OptionPane.minimumSize",new Dimension(200,150)); 

			int dialogButton = JOptionPane.YES_NO_OPTION;
		    int dialogResult = JOptionPane.showConfirmDialog(d.frame, "  Do you want to quit ?", "Sure ?", dialogButton);
		    if(dialogResult == 0) {
				d.visibility(false);
				frame.setTitle("3 IN 1 GAME");
				l1.setVisible(true);
				//d = new Demineur(frame.getWidth(),frame.getHeight());

		    } else {
		    	
		    }

			}else
				if(e.getSource() == ms.btnExit) {
					ms.panel.setVisible(false);
					frame.setTitle("3 IN 1 GAME");
					l1.setVisible(true);
				}
	}
}
