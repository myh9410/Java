package ifelseex;

import javax.swing.JOptionPane;

/*
	���� ó�� ���α׷�

		�߸��� ���� ó���ϱ�! ---> ������ �����ϰ�!
	=> ������ +,_��ȣ ���̱�.////////////////����.
	
		�� ������ ���� 1�� �ڸ��� 5�̻��̸� +�� ���̰�
								 4���ϸ�   -�� ������
		ex) 93�� -> A-
		ex) 78�� -> C+
		ex) 54�� -> F		//F�������� +,-   X
		
		
		���ڿ��� ���ڿ��� �����ϱ�
		String msg = "A";
		msg = "+";
		msg = msg + "+"			// msg += "+"
	
 */
public class IfElseScore4����ȣ {
	
	public static void main(String[] args) {
		
		int score = Integer.parseInt(JOptionPane.showInputDialog("���� �Է�"));
		
		if(0<= score && score <= 100){
			
			String grade = "F";	//�ʱ�ȭ �ݵ�� �Ұ�.
								//�ʱⰪ F�� �־��ָ� else�� �ʿ� ����. ó������ F���� ������ ������ ������ �ٲ�� ����.
			
			if (90<= score){
				grade = "A";
				if(score>95){
					grade+="+";
				}else{
					grade+="-";
				}
			}else if(80 <= score){
				grade = "B";
				if(score>85){
					grade+="+";
				}else{
					grade+="-";
				}
			}else if(70 <= score){
				grade = "C";
				if(score>75){
					grade+="+";
				}else{
					grade+="-";
				}
			}else if(60<= score){
				grade = "D";
				if(score>65){
					grade+="+";
				}else{
					grade+="-";
				}
			}
			
			System.out.println(score + " : " + grade + "����");
			
			
			
		}else {
			
			System.out.println("������ �̻��ؿ�~");
		}
		
		
		

		
		
		
		
		
		
	}//end main

}//end class
