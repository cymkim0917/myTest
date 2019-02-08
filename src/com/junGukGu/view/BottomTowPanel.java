package com.junGukGu.view;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BottomTowPanel extends JPanel{
	int startHeight = 31; 
	int btnHeight = 80;
	int btnWidth = 145;
	
	public BottomTowPanel() {	
		this.setLayout(null);
		this.setBounds(0, 0, 978, 129);

		JLabel bottomBg = new JLabel(
				new ImageIcon(
						new ImageIcon("ev-Image/gamePage/bottomTowPanel.png").getImage().getScaledInstance(978, 120, 0)));
		bottomBg.setBounds(0, 0, 978, 123);
		
		JLabel comTow1 = new JLabel(
				new ImageIcon(
						new ImageIcon("ev-Image/tower/2_tower1.gif").getImage().getScaledInstance(btnWidth/2, btnHeight, 0)));
		comTow1.setBounds(13, startHeight, btnWidth/2, btnHeight);
		
		JLabel comTow2 = new JLabel(
				new ImageIcon(
						new ImageIcon("ev-Image/tower/2_tower2.gif").getImage().getScaledInstance(btnWidth/2, btnHeight, 0)));
		comTow2.setBounds(84, startHeight, btnWidth/2, btnHeight);
		
		/*JLabel comTow3 = new JLabel(
				new ImageIcon(
						new ImageIcon("ev-Image/tower/2_tower3.gif").getImage().getScaledInstance(btnWidth/2, btnHeight, 0)));
		comTow3.setBounds(13, startHeight, btnWidth/2, btnHeight);
		
		JLabel comTow4 = new JLabel(
				new ImageIcon(
						new ImageIcon("ev-Image/tower/2_tower4.gif").getImage().getScaledInstance(btnWidth/2, btnHeight, 0)));
		comTow4.setBounds(84, startHeight, btnWidth/2, btnHeight);*/
		
		
		// �Ǹ� ���� 
		// ���߿� Ÿ�� ���� �������� 
		JLabel price = new JLabel("300��");
		price.setBounds(192, startHeight, btnWidth, btnHeight);
		// ��Ʈ ������ ����
		price.setFont(new Font("Times", Font.BOLD, 40));
		
		JLabel info = new JLabel();
		// info���� ���ϱ� 
		
		// ���ư��� ��ư
		JLabel returnDef = new JLabel(
				new ImageIcon(
						new ImageIcon("ev-Image/gamePage/return.png").getImage().getScaledInstance(btnWidth, btnHeight + 15, 0)));
		returnDef.setBounds(822, 12, btnWidth, btnHeight + 15);
		
		
		this.add(comTow1);
		this.add(comTow2);		
		this.add(price);
		this.add(info);
		this.add(returnDef);
		
		this.add(bottomBg);
	}
}
