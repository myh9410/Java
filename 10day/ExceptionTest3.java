package exceptionex;

import javax.swing.JOptionPane;

public class ExceptionTest3 {

	public static void main(String[] args) {
		int num = 0; int num2 = 0;
		try {
			num = Integer.parseInt(JOptionPane.showInputDialog("����1�Է�"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("����2�Է�"));
			System.out.println(num / num2);

			
		} catch (NumberFormatException e) {
			e.printStackTrace();
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {		//Exception�� Num~�� Arith~�� �θ��̹Ƿ� ���� ��������ָ� �ڽĵ��� �Ұ� ������.
		}
		System.out.println("�� ���� �ҽ��� �̾��.");
	}

}
