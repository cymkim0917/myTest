package com.junGukGu.view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MiddlePanel extends JPanel{
	private JFrame mf;
	private JPanel middlePanel;
	
	public MiddlePanel(JFrame mf) {
		this.mf = mf;
		middlePanel = this;
//		JPanel middlePanel = new JPanel();
		this.setBounds(0, 68, 978, 509);
//		this.setSize(978, 509);
//		this.setLayout(null);
		
		//중단 화면
		JLabel middle = new JLabel(new ImageIcon(new ImageIcon("ev-Image/gamePage/middlePanel.png").getImage().getScaledInstance(978, 509, 0)));
		middle.setBounds(0,0, 978, 509);
		
		this.add(middle);
	}

}
