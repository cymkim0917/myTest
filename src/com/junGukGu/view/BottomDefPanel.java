package com.junGukGu.view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// Panel 생성만한다.
public class BottomDefPanel extends JPanel{	
	private JFrame mf;
	private JPanel defPanel;

	public BottomDefPanel(JFrame mf, JPanel bottomPanel) {
		this.defPanel = this;
		this.mf = mf;
		this.setBounds(0, 0, 978, 123);
		this.setLayout(null);

		JLabel bottom = new JLabel(new ImageIcon(new ImageIcon("ev-Image/gamePage/bottomDefPanel.png").getImage().getScaledInstance(978, 123, 0)));
		bottom.setBounds(0, 0, 978, 123);	

		int startHeight = 31; 
		int btnHeight = 80;
		int btnWidth = 145;

		// 배경이미지 삽입
		JLabel bottomBg = new JLabel(new ImageIcon(new ImageIcon("ev-Image/gamePage/bottomDefPanel.png").getImage().getScaledInstance(978, 120, 0)));
		bottomBg.setBounds(0, 0, 978, 120);

		// JLabel 랜덤타워 생성
		// ImageIcom은 왜 두개를 쓰는거지..
		JLabel createTow1 = new JLabel(new ImageIcon(new ImageIcon("ev-Image/tower/1_tower1.gif").getImage().getScaledInstance(btnWidth/2, btnHeight, 0)));
		createTow1.setBounds(13, startHeight, btnWidth/2, btnHeight);

		JLabel createTow2 = new JLabel(new ImageIcon(new ImageIcon("ev-Image/tower/1_tower2.gif").getImage().getScaledInstance(btnWidth/2, btnHeight, 0)));
		createTow2.setBounds(84, startHeight, btnWidth/2, btnHeight);


		// 보스 생성버튼 
		JLabel boss1 = new JLabel(new ImageIcon(new ImageIcon("ev-Image/boss/boss_1.gif").getImage().getScaledInstance(btnWidth, btnHeight, 0)));
		boss1.setBounds(175, startHeight, btnWidth, btnHeight);

		JLabel boss2 = new JLabel(new ImageIcon(new ImageIcon("ev-Image/boss/boss_2.gif").getImage().getScaledInstance(btnWidth - 10, btnHeight - 10, 0)));
		boss2.setBounds(335, startHeight, btnWidth, btnHeight);

		JLabel boss3 = new JLabel(new ImageIcon(new ImageIcon("ev-Image/boss/boss_3.gif").getImage().getScaledInstance(btnWidth + 50, btnHeight + 50, 0)));
		//	                   new ImageIcon("ev-Image/boss/boss_3.gif").getImage().getScaledInstance(btnWidth, btnHeight, 0)));
		boss3.setBounds(495, startHeight - 2, btnWidth, btnHeight);

		// 랜덤박스 버튼
		JLabel box = new JLabel(new ImageIcon(new ImageIcon("ev-Image/randomBox/box_1.gif").getImage().getScaledInstance(btnHeight, btnHeight - 10, 0)));
		box.setBounds(660, startHeight, btnWidth, btnHeight);
		box.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// 랜덤패널로 바꾸기 
				ChangePanel.changePanel(bottomPanel, defPanel, new BottomTowPanel());
			}
		});

		// start버튼
		JLabel startBtn = new JLabel(
				new ImageIcon(
						new ImageIcon("ev-Image/gamePage/startPlay.png").getImage().getScaledInstance(btnWidth, btnHeight + 15, 0)));
		startBtn.setBounds(822, 12, btnWidth, btnHeight + 15);


		this.add(createTow1);
		this.add(createTow2);
		this.add(boss1);
		this.add(boss2);
		this.add(boss3);
		this.add(box);
		this.add(startBtn);
		this.add(bottomBg);
		this.add(bottom);
	}
}
