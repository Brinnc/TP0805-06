package org.sp.tproject.member.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

import org.sp.tproject.main.view.MainFrame;
import org.sp.tproject.main.view.Page;

public class MyPage extends Page{
	MainFrame mainFrame;
	JPanel p_west;
	JPanel p_east; //회원별 일일 토마토 획득 수를 보여줄 테이블(pomocountMyPage)을 부착할 오른쪽 패널
	
	public PomocountMyPage pomocountMyPage; 
		
	public MyPage(MainFrame mainFrame) {
		this.mainFrame=mainFrame;
		
		p_west=new JPanel();
		p_east=new JPanel();
		pomocountMyPage=new PomocountMyPage(mainFrame);
		
		//스타일
		setLayout(new BorderLayout());
		
		Dimension d=new Dimension(600, 700);
		p_west.setPreferredSize(d);
		p_east.setPreferredSize(d);
		
		p_west.setBackground(Color.WHITE);
		p_west.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
		p_east.setBackground(Color.WHITE);
		p_east.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
		
		//조립
		add(p_west, BorderLayout.WEST);
		add(p_east, BorderLayout.EAST);
		
		p_east.add(pomocountMyPage);
	
	}

}
