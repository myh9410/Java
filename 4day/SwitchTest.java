package switchex;

import java.util.Scanner;

/*
	���� �б�
	���� ���� == ���� if else�� ����!	(break;	:	Ż���ض�)
									switch���� Ż���ض�
									�ݺ������� Ż���ض�

	switch(��value){				value : ����, ����, ���, �޼���	(�Ǽ��� �ȵȴ�)
	
	case ��:						label : ǥ��, ����(x), ����(x)
	case ��:								���(����, ����, ���ڿ�)	: �Ǽ�(x)
	case ��:
	case ��:
	
	
	}
 */
public class SwitchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~4���� �Է�: ");
		int bun = sc.nextInt();
		
		switch(bun){
		case 1:
			System.out.println("1����");
			System.out.println("1����-one�Դϴ�.");
			break;
		case 2:
			System.out.println("2����");
			System.out.println("2����-two�Դϴ�.");
			break;
		case 3:
			System.out.println("3����");
			System.out.println("3����-three�Դϴ�.");
			break;
		case 4:
			System.out.println("4����");
			System.out.println("4����-four�Դϴ�.");
			break;
		default : //�ش��ϴ� case�� ����
			System.out.println("1~4������ �Է��ؾ� �մϴ�.");
		
		
			
		}
		
	}

}
