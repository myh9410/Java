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
public class Op3����ȣ {
	
	public static void main(String[] args) {
		//���� 1
		//�ð�	:	�ʸ� �Է��ϸ� �ú��ʷ� ȯ���ϴ� ���α׷�!
		//408��	-> 408/60	:	6.......48
		//		   408%60	:	48
		int second = Integer.parseInt(JOptionPane.showInputDialog("�ʸ� �Է��ϼ���(������ �Է�"));
		int strMin = second/60;
		int strHour = strMin/60;
		int strRealMin = strMin - strHour*60;
		int strSec = second%60;
		
		System.out.print(second+" : "+strHour + "�ð�" + strRealMin + "��" + strSec + "��");
		//System.out.print(second/60+"��");
		//System.out.println(second%60+"��");
		System.out.println("================================================================");
		/* ���� 2
			������� ���� ������ �ַ��� �Ѵ�.
			�̶� �ּ� ȭ�� �ż��� ����غ���!
			
			ex) 58600�� --> 5������ : 
							 ������ : 
						   ��õ���� : 
						   	 õ���� : 
		 */
		int money = Integer.parseInt(JOptionPane.showInputDialog("�󸶸� ���� �ұ��?(������ �Է�"));
		int won50000 = money/50000;
		int won10000 = (money - 50000*won50000)/10000;
		int won5000  = (money - 50000*won50000 - 10000*won10000)/5000;
		int won1000  = (money - 50000*won50000 - 10000*won10000 - 5000*won5000)/1000;
		int won500   = (money - 50000*won50000 - 10000*won10000 - 5000*won5000 - 1000*won1000)/500;
		int won100   = (money - 50000*won50000 - 10000*won10000 - 5000*won5000 - 1000*won1000 - 500*won500)/100;
		int won50   = (money - 50000*won50000 - 10000*won10000 - 5000*won5000 - 1000*won1000 - 500*won500 - 100*won100)/50;
		int won10   = (money - 50000*won50000 - 10000*won10000 - 5000*won5000 - 1000*won1000 - 500*won500 - 100*won100 -50*won50)/10;
		System.out.println(money + " : " );
		System.out.print("5������ : " + won50000 + "\n1������ : " + won10000 + "\n5õ���� : " + won5000 + "\n1õ���� : " + won1000+"\n500�� : " + won500 + "\n100�� : " + won100 + "\n50�� : " + won50 + "\n10�� : " + won10);
				
		
	}
}
