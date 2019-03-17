package cn.sxt.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

//飞机主窗口

public class MyGameFrame extends JFrame{
	
	/**
	 * 
	 */
	Image bk = GameUtil.getImage("images/bk.png");
	Image plan = GameUtil.getImage("images/plan1.png");
	
	@Override
	public void paint(Graphics g) {//自动调用。g相当于画笔
		
		g.drawImage(bk, 0, 50, null);
		g.drawImage(plan, 220, 585, null);
		
	}
/**
 * 初始化窗口
 */
	public void lauchFrame() {
		this.setTitle("小小新作品");
		this.setVisible(true);
		this.setSize(500, 650);
		this.setLocation(700, 200);
		this.addWindowListener(new WindowAdapter() {
			
			//关闭窗口
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}
	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.lauchFrame();
	}
}
