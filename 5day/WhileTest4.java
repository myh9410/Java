package whileex;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
	do{
	
	}while(���ǽ�);				//do~while������ ���� ;�� �������Ѿ� �Ѵ�.
					//�ּ� �ѹ��� �����Ѵ�.
	
	if(����);{} ��� �Ĺ�����
	
		if(����)
			;
		{
	
				�� �ؼ��Ǿ �ƹ� ���൵ ����... ����
		} 
	
	
	
	
 */
public class WhileTest4 {
	public static void main(String[] args) {
		int i = 0;
		
		for(i=0; i>0; i++){
			System.out.println("�� ������ ������ �ʽ��ϴ�.");
		}
		System.out.println("////////////////////////////////////////////");
		
		while(i>0){
			System.out.println("�� ���嵵 ������ �ʽ��ϴ�.");
		}
		System.out.println("////////////////////////////////////////////");
		
		do{
			System.out.println("do while�� ó������ �����̾ �ּ� �ѹ��� ����˴ϴ�.");
		}while(i>0);//��������!
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
