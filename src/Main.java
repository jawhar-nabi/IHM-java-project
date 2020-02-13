//import java.awt.Color;
//import java.awt.Image;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.File;
//import pack.Demineur;
//import javax.imageio.ImageIO;
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//
//public class Main implements ActionListener {
//	JFrame frame;
//	JButton jeux1,jeux2,jeux3;
//	Demineur d;
//	JPanel p1 ;
//	public Main() {		
//		frame = new JFrame("3 in 1 GAME");
//		frame.setSize(600,500);
//		frame.setResizable(false);
//		frame.setLocationRelativeTo(null);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		try{    
//			frame.setIconImage(ImageIO.read(new File("C:/Users/Home/Desktop/2599319.jpg")));   
//		   }
//		
//		catch (Exception ex){
//		       //do something
//			System.out.println("image load failed !!");
//		   }
//
//		//getContentPane().setLayout(null);
////		Border emptyBorder = BorderFactory.createEmptyBorder();
////		getRootPane().setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(3, 152, 252)));
//
//
//		p1= new JPanel();
//		p1.setBounds(0, 0, frame.getWidth(), frame.getHeight());
//		p1.setLayout(null);
//		p1.setBackground(Color.decode("#466CA6"));
//		 
//		p1.setVisible(true);
//		frame.getContentPane().add(p1);
//		ImageIcon water = new ImageIcon("C:/Users/Home/Desktop/5433.jpg");
//		
//		JLabel l1 = new JLabel();
//		
//		try {
//		    Image img = ImageIO.read(new File("C:/Users/Home/Desktop/2599319.jpg"));
//		     img = img.getScaledInstance(600	, 500, Image.SCALE_DEFAULT);
//
//		     l1.setIcon(new ImageIcon(img));
//		  } catch (Exception ex) {
//		    System.out.println(ex);
//		  }
//		//lblNewLabel.setForeground(new Color(30, 144, 255));
//		//lblNewLabel.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 30));
//		l1.setBounds(0, 0, 600, 500);
//		p1.add(l1);
//
//		JLabel lblNewLabel = new JLabel();
//		
//		try {
//		    Image img = ImageIO.read(new File("C:/Users/Home/Desktop/3in1.gif"));
//		     img = img.getScaledInstance(600	, 180, Image.SCALE_DEFAULT);
//
//		     lblNewLabel.setIcon(new ImageIcon(img));
//		  } catch (Exception ex) {
//		    System.out.println(ex);
//		  }
//		//lblNewLabel.setForeground(new Color(30, 144, 255));
//		//lblNewLabel.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 30));
//		lblNewLabel.setBounds(0, -20, 600, 180);
//		lblNewLabel.setVisible(true);
//		l1.add(lblNewLabel);
//
//		
//		
//		jeux1 = new JButton();
//		jeux1.setBounds(75,	180,	110	,110);
//		  try {
//			    Image img = ImageIO.read(new File("C:/Users/Home/Desktop/SKILL.jpg"));
//			     img = img.getScaledInstance(110	, 110, Image.SCALE_DEFAULT);
//
//			    jeux1.setIcon(new ImageIcon(img));
//			  } catch (Exception ex) {
//			    System.out.println(ex);
//			  }
//			jeux1.setVisible(true);
//			jeux1.addActionListener(this);
//
//		l1.add(jeux1);
//		
//		jeux2 = new JButton();
//		jeux2.setBounds(245,	160,	110	,110);
//		  try {
//			    Image img = ImageIO.read(new File("C:/Users/Home/Desktop/DEMINEUR.jpg"));
//			     img = img.getScaledInstance(110	, 110, Image.SCALE_DEFAULT);
//
//			    jeux2.setIcon(new ImageIcon(img));
//			  } catch (Exception ex) {
//			    System.out.println(ex);
//			  }
//			jeux2.setVisible(true);
//			jeux2.addActionListener(this);
//
//		l1.add(jeux2);
//		
//		jeux3 = new JButton();
//		jeux3.setBounds(430,	180,	110	,110);
//		  try {
//			    Image img = ImageIO.read(new File("C:/Users/Home/Desktop/paint.jpg"));
//			     img = img.getScaledInstance(110	, 110, Image.SCALE_DEFAULT);
//
//			    jeux3.setIcon(new ImageIcon(img));
//			  } catch (Exception ex) {
//			    System.out.println(ex);
//			  }
//			jeux3.setVisible(true);
//			jeux3.addActionListener(this);
//		l1.add(jeux3);
//		p1.setVisible(true);
//		frame.setVisible(true);
//		d = new Demineur(frame.getWidth(),frame.getHeight());
//		d.frame.setVisible(false);
//		frame.getContentPane().add(d.frame);
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Main m = new Main();
//		System.out.println("ok");
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		if(e.getSource() == jeux2) {
//			p1.setVisible(false);
//			d.frame.setVisible(true);
//
//		}
//	}
//
//}
