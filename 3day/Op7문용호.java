package operatorex;

import javax.swing.JOptionPane;

/*
 	�ִܻ꽬 �������
	  	  	     ���� ������	"  ?  :  "
	  	  	     
	  	       op1		?	op2 	:		op3
	  	     ����			��		:		����
	  	  (���迬����)
	  	  
	  	  		��		?	"1"		:		"2"		==> "1"�� �ȴ�.
	  	  	  ����		?	"1"		:		"2"		==> "2"�� �ȴ�.

	  �� �߿� �ϳ��� �����ϴ� ������ op1 	  ���̸� op2�� �ȴ�.
											�����̸� op3�� �ȴ�.
 */
public class Op7����ȣ {
	
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("���� �Է�"));
		String str = num>3?"��":"����";
		
		System.out.println(str);
		
		//����� num2�� ����	������ num2�� �ι�� ���� ���
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("���� �Է�"));
		//int result = num2>0	?	num2*num2	:	2*num2;		//��� : num2>0
		// �������� �������� ǥ���ϰ� �ʹٸ�
		String strRe = num2>0	?	"���� : "+ (num2*num2) : "�ι� : " + (num2*2); 
		System.out.println(num2 + "�� ����� : " + strRe);
		
		//������ 60�� �̻��̸� �հ� �׷��� ������ ���հ����� ǥ������!
		int score = Integer.parseInt(JOptionPane.showInputDialog("���� �Է�"));
		String scr = score>60 ? "�հ�!" : "���հ�!";
		System.out.println(score + "�� ������ " + scr +"�ϼ̽��ϴ�.");
		
		//pointX��ǥ�� ������� ���밪���� ���� ���� absX�� �����Ų �� ���.
		int pointX = Integer.parseInt(JOptionPane.showInputDialog("�� �Է�"));
		int absX = pointX>0 ? pointX : -pointX; 
		System.out.println(absX);
		
	}
}

