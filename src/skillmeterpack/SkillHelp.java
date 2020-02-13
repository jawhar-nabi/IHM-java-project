package skillmeterpack;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SkillHelp {
	public JPanel panel1;
	public SkillHelp() {

		panel1 = new JPanel();
		panel1.setSize(450	, 400);
		panel1.setBackground(new Color(95, 158, 160));
		panel1.setVisible(false);
		panel1.setLayout(null);
		
		JLabel btnHow = new JLabel("How to play :");
		btnHow.setForeground(new Color(139, 0, 0));
		btnHow.setBackground(new Color(0, 0, 0));
		btnHow.setFont(new Font("Clarendon Blk BT", Font.BOLD, 30));
		btnHow.setBounds(93	, 11, 220, 40);
		panel1.add(btnHow);

		JButton btnExit21 = new JButton("Back");
		btnExit21.setBackground(SystemColor.inactiveCaption);
		btnExit21.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExit21.setBounds(176, 250, 70, 30);
		panel1.add(btnExit21);
		
		JScrollPane scrollPan = new JScrollPane();
		scrollPan.setEnabled(false);
		scrollPan.setBounds(93, 75, 246, 178);
		panel1.add(scrollPan);
		
		JTextArea txtrToutesCelles = new JTextArea();
		txtrToutesCelles.setBackground(SystemColor.activeCaption);
		txtrToutesCelles.setWrapStyleWord(true);
		txtrToutesCelles.setLineWrap(true);
		txtrToutesCelles.setText("\u00C0 toutes celles et ceux qui se disent que cette fen\u00EAtre est toute petite, je r\u00E9ponds : \u00AB Bienvenue dans le monde de la programmation \u00E9v\u00E9nementielle ! \u00BB Il faut que vous vous y fassiez, vos composants ne sont pas intelligents : il va falloir leur dire tout ce qu'ils doivent faire.\r\n\u00C0 toutes celles et ceux qui se disent que cette fen\u00EAtre est toute petite, je r\u00E9ponds : \u00AB Bienvenue dans le monde de la programmation \u00E9v\u00E9nementielle ! \u00BB Il faut que vous vous y fassiez, vos composants ne sont pas intelligents : il va falloir leur dire tout ce qu'ils doivent faire.\r\n\r\nPour obtenir une fen\u00EAtre plus cons\u00E9quente, il faudrait donc :\r\n\r\nqu'elle soit plus grande ;\r\n\r\nqu'elle comporte un titre (ce ne serait pas du luxe !) ;\r\n\r\nqu'elle figure au centre de l'\u00E9cran, ce serait parfait ;\r\n\r\nque notre programme s'arr\u00EAte r\u00E9ellement lorsqu'on clique sur la croix rouge, car, pour ceux qui ne l'auraient pas remarqu\u00E9, le processus Eclipse tourne encore m\u00EAme apr\u00E8s la fermeture de la fen\u00EAtre.\r\n\r\nPour chacun des \u00E9l\u00E9ments que je viens d'\u00E9num\u00E9rer, il y a aura une m\u00E9thode \u00E0 appeler afin que notreJFramesache \u00E0 quoi s'en tenir. Voici d'ailleurs un code r\u00E9pondant \u00E0 toutes nos exigences :\r\n\r\n");
		scrollPan.setColumnHeaderView(txtrToutesCelles);
		btnExit21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				panel1.setVisible(false);
//				panel.setVisible(true);

			}
		});
	}
}
