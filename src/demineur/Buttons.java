package demineur;
import pack.Main;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
public class Buttons extends JButton implements ActionListener {
	
	public boolean mine;
	public int number;
	public static int err;
	public int niveau;

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	public int getNumber() {
		return number;
	}

	public void addMine() {
		this.number = this.number+1;
	}

	public void setMine(boolean mine) {
		this.mine = mine;
	}
	
	public boolean isMine() {
		return mine;
	}
	public Buttons(){
		this.setMine(false);
		addActionListener(this);
		this.number=0;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(this.isMine()==true) {
			err+=1;
			this.setOpaque(true);
			this.setBackground(Color.RED);
			if (err==3) {
				if(this.getNiveau()==0) {
					this.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Tp2IHM\\src\\package1\\Webp.net-resizeimage.jpg"));
				}else {			
					this.setIcon(new ImageIcon("C:\\Users\\DELL\\eclipse-workspace\\Tp2IHM\\src\\package1\\kisspng-naval-mine-cartoon-mining-clip-art-mines-5ab7a05f9460d4.8808837015219835836078.jpg"));
				}
			    UIManager.put("OptionPane.minimumSize",new Dimension(200,150)); 

			    int dialogButton = JOptionPane.YES_NO_OPTION;
			    int dialogResult = JOptionPane.showConfirmDialog(this, "  Desolé ! vous avez perdu \n Commencer une nouvelle partie? ", "Fin de la partie", dialogButton);
			    if(dialogResult == 0) {
			    	
			    	Component component = (Component) e.getSource();
			        JFrame frame = (JFrame) SwingUtilities.getRoot(component);
			        //frame.dispose();
//			        Demineur d =new Demineur(600, 500);
//			        
//			        frame.getContentPane().add(d.frame);
			        Main.restartDemineur();
			    } else {

			    	Main.backToMain();	
			    	} 
			}
		}
		
		if(this.isMine()==false) {
			
			if (this.getNiveau()==0) {
				this.setFont(new Font("Times New Roman", Font.BOLD, 14));
			}
			if (this.getNiveau()==1) {
				this.setFont(new Font("Times New Roman", Font.PLAIN, 22));
			}
			if (this.getNiveau()==2) {
				this.setFont(new Font("Times New Roman", Font.PLAIN, 22));
			}
			this.setText(Integer.toString(this.getNumber()));
			this.setBackground(Color.green);
			this.setEnabled(false);
			
		}
	}
			
	
}
