package com.junGukGu.view;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamePage extends JPanel {
	private JFrame mf;
	private JPanel gamePanel;
	private JPanel topPanel;
	private JPanel middlePanel;
	private JPanel bottomPanel;
	private JPanel resultPanel;
	
	public GamePage(JFrame mf) {
		JPanel gamePanel = new JPanel();
		gamePanel.setBounds(0,0,978,700);
		gamePanel.setLayout(null);
		
		// exit
		JLabel exit = new JLabel(new ImageIcon(new ImageIcon("ev-Image/gamePage/exit.png").getImage().getScaledInstance(150, 50, 0)));
		exit.setBounds(820, 7, 150, 50);
		exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ChangePanel.changePanel(mf, gamePanel, new MainPage(mf));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				exit.setBounds(819, 6, 155, 55);
				exit.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// 마우스가 벗어났을 떄 (마우스 오버)
				exit.setBounds(820, 7, 150, 50);
				exit.repaint();
			}
		});
		
		// win 임시버튼 		
		JLabel win = new JLabel("WIN");
		win.setBounds(400,300,100,50);
		win.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				resultPanel = new WinPanel(mf, gamePanel);
				gamePanel.add(resultPanel);
				gamePanel.setComponentZOrder(resultPanel, 1);
				mf.repaint();
			}
		});
		//lose 임시 버튼
		JLabel lose = new JLabel("Lose");
		lose.setBounds(400,350,100,50);
		lose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				resultPanel = new LosePanel(mf, gamePanel);
				gamePanel.add(resultPanel);
				gamePanel.setComponentZOrder(resultPanel, 1);
				mf.repaint();
			}
		});
		gamePanel.add(exit);
		gamePanel.add(win);
		gamePanel.add(lose);
		
		gamePanel.add(new TopPanel(mf));
		gamePanel.add(new MiddlePanel(mf));
		gamePanel.add(new BottomPanel(mf));
		
		
		gamePanel.add(exit);
		
		topPanel = new TopPanel(mf);
		middlePanel = new MiddlePanel(mf);
		bottomPanel = new BottomPanel(mf);
		
		
		gamePanel.add(topPanel);
		gamePanel.add(middlePanel);
		gamePanel.add(bottomPanel);
		gamePanel.setComponentZOrder(exit, 2);
		gamePanel.setComponentZOrder(topPanel, 6);
		gamePanel.setComponentZOrder(middlePanel, 3);
		gamePanel.setComponentZOrder(bottomPanel, 4);
		
		gamePanel.setVisible(true);
		gamePanel.repaint();
		mf.add(gamePanel);
		mf.setVisible(true);
		
	}
	
}
