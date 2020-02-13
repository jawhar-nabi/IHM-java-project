package skillmeterpack;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ScoreSkill {

	public JPanel panelScore;
	public JLabel Score;
	public JButton btnExit;
	public ScoreSkill() {
		panelScore = new JPanel();
		panelScore.setBounds(0,70,450	,400);
		panelScore.setBackground(new Color(95, 158, 165));
		panelScore.setVisible(false);
		panelScore.setLayout(null);
		
		Score = new JLabel();
		Score.setForeground(SystemColor.activeCaptionBorder);
		Score.setBackground(new Color(0, 0, 0));
		Score.setFont(new Font("Arial Black", Font.BOLD, 17));
		Score.setBounds(23	, 11, 392, 40);
		panelScore.add(Score);

		JButton btnExit = new JButton("Back");
		btnExit.setBackground(SystemColor.inactiveCaption);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExit.setBounds(176, 250, 70, 30);
		panelScore.add(btnExit);

	}
}
