package ifelseex;

import javax.swing.JOptionPane;

/*
	���� ó�� ���α׷�

		�߸��� ���� ó���ϱ�! ---> ������ �����ϰ�!
	
 */
public class IfElseScore3 {
	
	public static void main(String[] args) {
		
		int score = Integer.parseInt(JOptionPane.showInputDialog("���� �Է�"));
		
		if(0<= score && score <= 100){
			
			String grade = "F";	//�ʱ�ȭ �ݵ�� �Ұ�.
								//�ʱⰪ F�� �־��ָ� else�� �ʿ� ����. ó������ F���� ������ ������ ������ �ٲ�� ����.
			
			if (90<= score){
				grade = "A";
			}else if(80 <= score){
				grade = "B";
			}else if(70 <= score){
				grade = "C";
			}else if(60<= score){
				grade = "D";
			}
			
			System.out.println(score + " : " + grade + "����");
			
			
			
		}else {
			
			System.out.println("������ �̻��ؿ�~");
		}
		
		
		

		
		
		
		
		
		
	}//end main

}//end class
