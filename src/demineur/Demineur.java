package demineur;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Demineur implements ActionListener {  
	public JButton button[];
	public JButton btnHowToPlay, btnback, b1 , b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25, b26, b27, b28, b29, b30, b31, b32, b33, b34, b35, b36; 
	public JPanel frame;
	public JLabel l1;
    Map<JButton, Boolean> state = new LinkedHashMap<>();


	/**
	 * Create the application.
	 */
	/**
	 * Initialize the contents of the frame.
	 */
	@Override
    public void actionPerformed(ActionEvent e) {
        	System.out.println(((JButton) e.getSource()).getActionCommand());
        	if(((JButton) e.getSource()).getActionCommand()=="show") {
      	      Set<Entry<JButton, Boolean>> setLhm = state.entrySet();
    	      Iterator<Entry<JButton, Boolean>> it2 = setLhm.iterator();
    	      while(it2.hasNext()){
    	         Entry<JButton, Boolean> e1 = it2.next();
    	         System.out.println(e1.getKey() + " : " + e1.getValue());
    	      }
        	}
    }  
	public void visibility(boolean b) {
		frame.setVisible(b);
	}
	public Demineur(int w, int h) {

		System.out.println("width : "+w + "h : "+h);
		button = new JButton[36];
		frame = new JPanel();
		frame.setBounds(0, 0, w, h);
		frame.setLayout(null);
		
		frame.setBackground(Color.DARK_GRAY);
		
		
		l1 = new JLabel();
		try {
		    Image img = ImageIO.read(new File("C:/Users/Home/Desktop/2599319.jpg"));
		     img = img.getScaledInstance(600	, 500, Image.SCALE_DEFAULT);

		     l1.setIcon(new ImageIcon(img));
		  } catch (Exception ex) {
		    System.out.println(ex);
		  }
		l1.setBounds(0, 0, 600, 500);
		frame.add(l1);
		
		btnback = new JButton("back");
		btnback.setBackground(Color.decode("#A6CCBA"));
		btnback.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnback.setForeground(Color.decode("#466CA6"));
		btnback.setBounds(20, 420, 70, 35);
		btnback.setVisible(true);
		l1.add(btnback);

		
	    ImageIcon title = new ImageIcon("C:/Users/Home/Desktop/Minesweeper.png");
		JLabel labelDemineur = new JLabel("Minesweeper");
	    try {
		     labelDemineur.setIcon(title);
		  } catch (Exception ex) {
		    System.out.println(ex);
		  }
		labelDemineur.setBounds(0, 10, 600	, 80);

		l1.add(labelDemineur);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(120, 110, 360, 360);
		l1.add(panel_1);
		panel_1.setLayout(new GridLayout(6 , 6));
		panel_1.setVisible(true);
		Buttons [] buttons =new Buttons[36];
		Random ran=new Random();
		int [] tab=new int[36];

		int nb=0;
		while(nb<6) {
			int x=ran.nextInt(36);
			if (tab[x]!=1) {
				tab[x]=1;
				nb++;
		    }
		}
		
		//int list[] = new int[16];
		int list[]= {7,8,9,10,13,14,15,16,19,20,21,22,25,26,27,28};

		for(int i=0;i<36;i++) 
		{
			//System.out.print(i+":"+tab[i]+" ; ");
			buttons[i]=new Buttons();
			if(i==0) {
			if (tab[i+1]==1){
				buttons[i].addMine();
			}if (tab[i+6]==1){
				buttons[i].addMine();
			}if (tab[i+7]==1){
				buttons[i].addMine();
			}
			}
			
			if(i==5) {
			if (tab[i-1]==1){
				buttons[i].addMine();
			}if (tab[i+6]==1){
				buttons[i].addMine();
			}if (tab[i+5]==1){
				buttons[i].addMine();
			}
			}
			if(i==30) {
			if (tab[i+1]==1){
				buttons[i].addMine();
			}if (tab[i-6]==1){
				buttons[i].addMine();
			}if (tab[i-7]==1){
				buttons[i].addMine();
			}
			}
			if(i==35) {
			if (tab[i-1]==1){
				buttons[i].addMine();
			}if (tab[i-6]==1){
				buttons[i].addMine();
			}if (tab[i-7]==1){
				buttons[i].addMine();
			}
			}
			
			if(i%6 == 0 && i != 30 && i != 0) {
				if (tab[i+1]==1){
					buttons[i].addMine();
				}if (tab[i-6]==1){
					buttons[i].addMine();
				}if (tab[i+6]==1){
					buttons[i].addMine();
				}if (tab[i-5]==1){
					buttons[i].addMine();
				}if (tab[i+7]==1){
					buttons[i].addMine();
				}
			}
			
			if(i == 11 || i == 17 || i == 23 || i == 29) {
				if (tab[i-1]==1){
					buttons[i].addMine();
				}if (tab[i-6]==1){
					buttons[i].addMine();
				}if (tab[i+6]==1){
					buttons[i].addMine();
				}if (tab[i-7]==1){
					buttons[i].addMine();
				}if (tab[i+5]==1){
					buttons[i].addMine();
				}
			}

			
			if(i>0 && i<6) {
			if (tab[i-1]==1){
				buttons[i].addMine();
			}if (tab[i+1]==1){
				buttons[i].addMine();
			}if (tab[i+5]==1){
				buttons[i].addMine();
			}if (tab[i+6]==1){
				buttons[i].addMine();
			}if (tab[i+7]==1){
				buttons[i].addMine();
			}
			}
			if(i>30 && i<35) {
				if (tab[i-1]==1){
					buttons[i].addMine();
				}if (tab[i+1]==1){
					buttons[i].addMine();
				}if (tab[i-5]==1){
					buttons[i].addMine();
				}if (tab[i-6]==1){
					buttons[i].addMine();
				}if (tab[i-7]==1){
					buttons[i].addMine();
				}
				}
			

			
			
			//buttons[i].setNiveau(niveau);
			if (tab[i]==1) {
				buttons[i].setMine(true);
				//buttons[i].setBackground(Color.red);
			}
			panel_1.add(buttons[i]);
		}
		for(int d=0;d<16;d++) {
			//System.out.print(list[d]+" ");
//			for(int e=list[d]-4;e<list[d]+5;e++){
//				System.out.print(e+" ");
//				if (tab[e]==1 && e!=list[d]){
//					//buttons[list[d]].addMine();
//				}
//			}
			if (tab[list[d]-1]==1){
				buttons[list[d]].addMine();
			}if (tab[list[d]+1]==1){
				buttons[list[d]].addMine();
			}if (tab[list[d]-5]==1){
				buttons[list[d]].addMine();
			}if (tab[list[d]-6]==1){
				buttons[list[d]].addMine();
			}if (tab[list[d]-7]==1){
				buttons[list[d]].addMine();
			}if (tab[list[d]+5]==1){
				buttons[list[d]].addMine();
			}if (tab[list[d]+6]==1){
				buttons[list[d]].addMine();
			}if (tab[list[d]+7]==1){
				buttons[list[d]].addMine();
			}

			
			//
		}
//
//		JPanel panel_2 = new JPanel();
//		panel_2.setBounds(panel_1.getWidth(),100, 100, panel_1.getHeight());
//		panel_2.setSize(100, h);
//		panel_2.setBackground(Color.decode("#466CA6"));
//		panel_2.setLayout(null);
//		frame.add(panel_2);
		
//		JLabel nbre_mines = new JLabel("Mine(s) :");
//		nbre_mines.setForeground(Color.black);
//		nbre_mines.setFont(new Font("Bernard MT Condensed", Font.ITALIC, 18));
//		//nbre_mines.setHorizontalAlignment(SwingConstants.CENTER);
//		nbre_mines.setBackground(new Color(0, 0, 139));
//		nbre_mines.setBounds(20, 20, 70, 20);
//		frame.add(nbre_mines);
//		
//		JLabel nbre_mines2 = new JLabel(" "+nb);
//		nbre_mines2.setForeground(Color.black);
//		nbre_mines2.setFont(new Font("Bernard MT Condensed", Font.ITALIC, 18));
//		//nbre_mines2.setHorizontalAlignment(SwingConstants.CENTER);
//		nbre_mines2.setBackground(new Color(0, 0, 139));
//		nbre_mines2.setBounds(35, 50, 80, 20);
//		frame.add(nbre_mines2);

		//panel_2.setBounds(300,300,100,100);

		
		for(int i = 0 ; i<3; i++) {
		    Random random = new Random();
		    state.put(button[i], random.nextBoolean());
		    
		}
		
	      Set<Entry<JButton, Boolean>> setLhm = state.entrySet();
	      Iterator<Entry<JButton, Boolean>> it2 = setLhm.iterator();
	      while(it2.hasNext()){
	         Entry<JButton, Boolean> e = it2.next();
	         System.out.println(e.getKey() + " : " + e.getValue());
	      }
			btnHowToPlay = new JButton("?");
			btnHowToPlay.setBackground(Color.decode("#A6CCBA"));
			btnHowToPlay.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnHowToPlay.setBounds(510, 420, 70, 35);
			btnHowToPlay.setForeground(Color.decode("#466CA6"));
			btnHowToPlay.setVisible(true);
			btnHowToPlay.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("help");
					//panel1.setVisible(true);
				//	panel.setVisible(false);
				}
			});
					l1.add(btnHowToPlay);
					
					frame.setVisible(true);

	}


	


}
