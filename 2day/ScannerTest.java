package scannerex;

import java.util.Scanner;

/*
	1) Scanner Ŭ������ ����ϱ� ���� import �۾��� �ؾ��Ѵ�.
	
	2) Scanner Ŭ������ ram�� ����ϱ� ����
			�ν��Ͻ� �۾��� �ʿ��ϴ�
	
			new Ŭ����(); ����.
	
	3) �ν��Ͻ��� ����ϱ� ���� "��ü" ���� �۾�
	
	   	   Scanner        sc          = new Scanner();
			Ÿ��         ����         =  �ν��Ͻ�
 		��ü(��������,���۷��� ����)
 	
	4) ��ü.�޼���() ȣ���� �� �ִ�.

	5) �޼��� ������ ���� ����, �Ǽ�, ���ڿ� ���� �Է¹��� �� �ִ�.

	6) �Է� ���� �����͸� ������ ��� ���� �������!
 */
public class ScannerTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//Ctrl+Spacebar�� import
		System.out.print("�̸� �Է�(����) : ");
		String var = sc.next(); /*��ü.�޼���()	Ctrl+Spacebar ������ � ���� �޾ƿ����� �˷���.*/
		System.out.println("����� �Է��� �̸� : " + var);
		
		System.out.print("���� �Է� : ");
		int age = sc.nextInt();
		System.out.println("���� : " + age);
		
		System.out.print("¦ ���� �Է� : ");
		int fr2 = sc.nextInt();
		System.out.println("���� : " + fr2);
		
		int tot = age+fr2;
		System.out.print("�� ���� �� : " + tot + "��");
		//age,fr2�� �������̶� age: 12 fr2: 23�̸� ���� 1223���� �����Ƿ� int�� �ٲ���.
		double avg = tot/2.0;
		System.out.print("�� ���� ��� : " + avg + "��");
	//	System.out.printf("�� ���� ��� : %.1f��\n", avg);�� ����
		
		
	}

}
