package ifelseex;

import javax.swing.JOptionPane;

/*
	if(����)
		���๮;
	else
		���๮;

	if(����){
		//������ ���϶� ���� ����
	
	} else {
		//������ �����϶� ���� ����
	
	}
-----------------------------------------------
**���� ���Ϲ�!**
*
	if(true){
	
		A		// �����ϰ� ���� "�ڵ�"���� ��ü ���� ������ ��������.
	
	} else {
	
		B
	
	}

 */
public class IfElse {

	public static void main(String[] args) {
		// num�̶�� ������ ���ڸ� �����? �ι�
		//			�׷��� ������	   	   ����

		int num = Integer.parseInt(JOptionPane.showInputDialog("���� �Է�"));
		
//		int result = 0;
//		if(0 < num && num < 10){
//			result = num*2;		
//		}			
//		
//		if(num < 0 || num>9 ){
//			result = num*num;
//			
//		}
		int result = 0;
		if(0 < num && num < 10){
			result = num*2;		
		} else {
			result = num*num;
		}
		System.out.println("ó�� �Է°� : "+ num + "\n��� ��� : " + num);
			
		if(num%3 == 0){						
			System.out.println(num + "�� 3�� ����̴�.");
		}else{
			System.out.println(num + "�� 3�� ����� �ƴϴ�.");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
