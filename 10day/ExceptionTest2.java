package exceptionex;

import javax.swing.JOptionPane;

public class ExceptionTest2 {

	public static void main(String[] args) {
		int num = 0; int num2 = 0;
		try {
			num = Integer.parseInt(JOptionPane.showInputDialog("정수1입력"));
		} catch (NumberFormatException e) {
			//e.printStackTrace();
			//System.out.println("정수만 넣어줘~!");
		}
		try {
			num2 = Integer.parseInt(JOptionPane.showInputDialog("정수2입력"));
		} catch (NumberFormatException e1) {
			//e1.printStackTrace();
			//System.out.println("정수만 넣어줘~!");
		}
		try {

			System.out.println(num / num2);

		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("그 다음 소스를 이어간다.");
	}

}
