package exceptionex;

import javax.swing.JOptionPane;

public class ExceptionTest2 {

	public static void main(String[] args) {
		int num = 0; int num2 = 0;
		try {
			num = Integer.parseInt(JOptionPane.showInputDialog("����1�Է�"));
		} catch (NumberFormatException e) {
			//e.printStackTrace();
			//System.out.println("������ �־���~!");
		}
		try {
			num2 = Integer.parseInt(JOptionPane.showInputDialog("����2�Է�"));
		} catch (NumberFormatException e1) {
			//e1.printStackTrace();
			//System.out.println("������ �־���~!");
		}
		try {

			System.out.println(num / num2);

		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("�� ���� �ҽ��� �̾��.");
	}

}
