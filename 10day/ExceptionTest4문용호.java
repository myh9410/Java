package exceptionex;

import javax.swing.JOptionPane;

public class ExceptionTest4����ȣ {

	//��� 0�� �ԷµǴ���... �ᱹ�� ������ ����� �� �� �ֵ��� ������!
	//try catch ������ ���ѹݺ���Ű��!
	public static void main(String[] args) {
		int num = 0; 
		int num2 = 0;
		try {
			
			num = Integer.parseInt(JOptionPane.showInputDialog("����1�Է�"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("����2�Է�"));
			System.out.println(num / num2);

		} catch (ArithmeticException e) {
			System.out.println("�ι�° ���ڿ� 0�� ������ 0�� �ƴ� �� �Է¹ٶ�!");
			num2 = Integer.parseInt(JOptionPane.showInputDialog("����2�Է�"));
			System.out.println(num / num2);
			
		} catch (Exception e) {		

		}
		System.out.println("�� ���� �ҽ��� �̾��.");
	}

}
