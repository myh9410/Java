package extendsex;

import java.awt.Frame;

import javax.swing.JOptionPane;

public class FrameMain {
	public static void main(String[] args) {
		//�̹� ������� �ִ� Ŭ������ �̿��ؼ�
		//������, setter���� �̿��� ����!
		
		Frame frame = new Frame("ù ������");
		//setter �ż���(������, â �ߴ� ��ġ ��� "��������")
		int width = Integer.parseInt(JOptionPane.showInputDialog("����(300~1200)"));
		int height = Integer.parseInt(JOptionPane.showInputDialog("����(300~700)"));
		frame.setSize(width,height);			
		frame.setLocation(300, 300);
		
		//getter�̿��ؼ� ���� �޾ƿ���
		System.out.println("�� �������� ���� ũ���?"+frame.getWidth()+"px");
		System.out.println("�� �������� ���� ũ���?"+frame.getHeight()+"px");
		int di = frame.getHeight()*frame.getWidth();
		System.out.println("�� �������� ���� ũ���?"+di+"px");
		
		
		
		frame.setVisible(true);
		
	}
}
