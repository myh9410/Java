package exceptionex;

import javax.swing.JOptionPane;

public class ExceptionTest3 {

	public static void main(String[] args) {
		int num = 0; int num2 = 0;
		try {
			num = Integer.parseInt(JOptionPane.showInputDialog("정수1입력"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("정수2입력"));
			System.out.println(num / num2);

			
		} catch (NumberFormatException e) {
			e.printStackTrace();
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {		//Exception이 Num~과 Arith~의 부모이므로 먼저 실행시켜주면 자식들이 할게 없어짐.
		}
		System.out.println("그 다음 소스를 이어간다.");
	}

}
