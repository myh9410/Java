package classex2;

import javax.swing.JOptionPane;

//��Ģ���� �޼��� 4�� ������!

public class MethodTest {
	public static void main(String[] args) {
		MyCalculator calculator = new MyCalculator();

		//�� �޼��带 �θ� ������ ������ 2���� �־�����!
		
		//�� �����͸� ���� �޾ƿͼ� ����غ���!
		//add()ȣ���ϱ� - ���� 2���� �Է¹޾Ƽ� add(1,2)�ڸ��� ���� �־�����Ѵ�.
		//������ �޼��带 ȣ���غ���!
		int a = MyCalculator.getNum();
		int b = MyCalculator.getNum();
		System.out.println("���� : "+calculator.add(a, b));
	
		a = MyCalculator.getNum();		//static����...
		b = MyCalculator.getNum();
		System.out.println("���� : "+calculator.sub(a, b));
		
		a = MyCalculator.getNum();		//��ü�̿��ؼ� �θ�
		b = MyCalculator.getNum();
		System.out.println("���� : "+calculator.mul(a, b));
		
		a = MyCalculator.getNum();
		b = MyCalculator.getNum();
		System.out.println("������ : "+calculator.div(a, b));
		
	}
}
