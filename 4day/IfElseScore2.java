package ifelseex;

import javax.swing.JOptionPane;

/*
	���� ó�� ���α׷�

		�߸��� ���� ó���ϱ�!
	
 */
public class IfElseScore2 {
	
	public static void main(String[] args) {
		int score = Integer.parseInt(JOptionPane.showInputDialog("���� �Է�"));
		if (90<= score && score <= 100){
			System.out.println(score + " : A����");
		}else if(80 <= score && score < 90){
			System.out.println(score + " : B����");
		}else if(70 <= score && score < 80){
			System.out.println(score + " : C����");
		}else if(60<= score && score < 70){
			System.out.println(score + " : D����");
		}else {
			System.out.println(score + " : F����");
		}
		
		
		
		
		
		
	}//end main

}//end class
