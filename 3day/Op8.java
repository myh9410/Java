package operatorex;

import javax.swing.JOptionPane;

/*
 	�ִܻ꽬 �������
	  	 		   ���� ������
	  	 		   
	1.	�ܼ� ����
		int num = 20;
		num = 3.5;
		num = int(3.5);
		
		double d = 3;
	
	2. ���� ����
	
	int x = 0;
	
	x += 10;		���� ��, ����
					x = x + 10;
	x *= 5;			���� ��, ����
					x = x * 5;
	x /= 3;			���� ��, ����
	
	x<<= 4;			����Ʈ ��Ų ��, ����
 */
public class Op8 {
	
	public static void main(String[] args) {
		int num = 5;
		
		num+=3;		//num ->5	5+3�� ���Թ޴´� num = 8
		
		num+=4;		//num ->8  +4�� ��, �ٽ� num�� �ִ´�. num = 12
		
		num+=5;		//num = num+5	num = 12+5 = 17
		
		System.out.println(num);
		
		
		/*
		 	8 += 3; ->>�Ұ���
		 	���ʿ� �ݵ�� ������ �־�� ��.
		 
		 */
		
		
	}
}
