package scannerex;

import java.util.Scanner;

/*
	Scanner �������� �������� �Է¹ޱ�
	
	*���ڿ� �Է¹ޱ�
		1. �ܾ� �Է¹ޱ� - next()	  : ����(����)�� ������ �� �������� �о�´�.
		2. ���� �Է¹ޱ� - nextLine() : ���Ͱ����� �� �о�´�.
 */
public class ScannerTest4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�ѱ� �Է¹��� ���� �Է� ��ġ��
		//���콺�� Ŭ���� �� �� �Է�����!
		
		System.out.print("�ּ� : ");	//����� ���ʱ� ���ʵ�
		String address = sc.nextLine();
		System.out.println("�ּ� : "+address);
		
	}

}
