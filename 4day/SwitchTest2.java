package switchex;

import java.util.Scanner;

/*
 	�籸 1~15 ���Ϻ�
 	1~7 : solid
 	8 : middle
 	9~15 : stripe
 */
public class SwitchTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�籸�� ��ȣ  1~15���� �Է�: ");
		int bun = sc.nextInt();
		
		switch(bun){
		case 1: 
		case 2: 
		case 3: 
		case 4: 
		case 5: 
		case 6: 
		case 7: System.out.println("solid"); break;//1~6������ ��� �۾� ->7���ͼ� solid����Ʈ�ϰ� break
		case 8: System.out.println("black"); break;
		case 9: 
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15: System.out.println("stripe"); break;
			
		}
		
	}

}
