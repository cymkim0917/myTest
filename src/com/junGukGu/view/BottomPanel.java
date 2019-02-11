package com.junGukGu.view;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BottomPanel extends JPanel {
	private JFrame mf;
	private JPanel bottomPanel;
	
	public BottomPanel() {}
	
	public BottomPanel(JFrame mf) {
		this.mf = mf;
		bottomPanel = this;
		this.setBounds(0, 613, 978, 120);
		this.setLayout(null);
		
		this.add(new BottomDefPanel(mf, bottomPanel));
	}
}
