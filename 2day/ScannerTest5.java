package scannerex;

import java.util.Scanner;

/*
	Scanner �������� �������� �Է¹ޱ�
	
	*���ڿ� �Է¹ޱ�
		���� �Է¹ޱ� - nextLine() : ���Ͱ����� �� �о�´�.
		��nextLine�� ������ ��
	���� : Ű���忡�� �Է��� ���� �ӽ� �����
		�����͸� �Է��ؾ� �ϴµ� �Է����� ���ϴ� ��Ȳ�� �߻��ϸ�:
			������ ���Ͱ������� ������ �߻��� ��!
�ذ����	
	���� : 12
	���� : 12��		12ġ�� ����Ű ������ nextLine�� ���ۿ��� ����Ű�� ã�Ƽ� ������.
	�ּ� : �ּ� : 	
		
		
 */
public class ScannerTest5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�ѱ� �Է¹��� ���� �Է� ��ġ��
		//���콺�� Ŭ���� �� �� �Է�����!

		System.out.print("���� : ");
		int age = sc.nextInt();
		System.out.println("���� : "+age+"��");
		
		sc.nextLine();
		System.out.print("�ּ� : ");
		String address = sc.nextLine();
		System.out.println("�ּ� : "+address);

		
		
	}

}
