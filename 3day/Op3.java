package operatorex;

import javax.swing.JOptionPane;

/*
 	�ִܻ꽬 �������
	  	��� ������ : (5�� �׸�) 
		 *		/		%		+		-
		 	������				 ������

		% : ������(�� ��������) ������
		/ : ��(�� ��������) ������
		
		7/2 : 3...................1
		7%2 : 1(���� ������ ������ ����)
		
		num % 2 ---->  0,1
		num % 4 ---->  0,1,2,3
		 5 % 4 --->	1
		 6 % 4 --->	2
		 7 % 4 --->	3
		 8 % 4 --->	0
		 9 % 4 --->	1
		 ...
		 
		 data%2 �� ����� �׻� 0�̶��.. data�� ¦��
		 data%3 �� ����� �׻� 0�̶��.. data�� 3�� ���
		 
 */
public class Op3 {
	
	public static void main(String[] args) {
		//�ð�	:	�ʸ� �Է��ϸ� �ú��ʷ� ȯ���ϴ� ���α׷�!
		//408��	-> 408/60	:	6.......48
		//		   408%60	:	48
		int second = Integer.parseInt(JOptionPane.showInputDialog("�ʸ� �Է��ϼ���(������ �Է�"));
		String strMin = second/60 + "��";
		String strSec = second%60 + "��";
		
		
		System.out.print(second+" : "+strMin + strSec);
		//System.out.print(second/60+"��");
		//System.out.println(second%60+"��");

	}
}
