package extendsex;

import java.awt.Frame;

import javax.swing.JOptionPane;

public class FrameMain {
	public static void main(String[] args) {
		//이미 만들어져 있는 클래스를 이용해서
		//생성자, setter등을 이용해 보기!
		
		Frame frame = new Frame("첫 프레임");
		//setter 매서드(사이즈, 창 뜨는 위치 등등 "주입해줌")
		int width = Integer.parseInt(JOptionPane.showInputDialog("가로(300~1200)"));
		int height = Integer.parseInt(JOptionPane.showInputDialog("세로(300~700)"));
		frame.setSize(width,height);			
		frame.setLocation(300, 300);
		
		//getter이용해서 면적 받아오기
		System.out.println("이 프레임의 가로 크기는?"+frame.getWidth()+"px");
		System.out.println("이 프레임의 세로 크기는?"+frame.getHeight()+"px");
		int di = frame.getHeight()*frame.getWidth();
		System.out.println("이 프레임의 면적 크기는?"+di+"px");
		
		
		
		frame.setVisible(true);
		
	}
}
