package exceptionex;

import javax.swing.JOptionPane;

public class ExceptionTest {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("����1�Է�"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("����2�Է�"));
		
//		if (num2 !=0){
//			System.out.println(num/num2);
		try{
			System.out.println(num/num2);
			System.out.println("������ �ٷ� �ؿ� �ִ� �ҽ�����~");
		}catch(ArithmeticException e){
			//System.out.println(e.getMessage());
			//e.printStackTrace();
			System.out.println("0���� ������ ��! 0���� ���� ������ ó������!!!");
		}
		System.out.println("�� ���� �ҽ��� �̾��.");	//
	}

}
