package ifelseex;

import javax.swing.JOptionPane;

/*
	���� ó�� ���α׷�
	���� ���� 0~100��
	~90�� : "A"����
	~80�� : "B"����
	~70�� : "C"����
	~60�� : "D"����
	59~0�� : "F"����
	
	
 */
public class IfElseScore {
	
	public static void main(String[] args) {
		int score = Integer.parseInt(JOptionPane.showInputDialog("���� �Է�"));
		if (score >=90){
			System.out.println(score + " : A����");
		}else if(score >=80){
			System.out.println(score + " : B����");
		}else if(score >=70){
			System.out.println(score + " : C����");
		}else if(score >=60){
			System.out.println(score + " : D����");
		}else {
			System.out.println(score + " : F����");
		}
		
		
		
		
		
		
	}//end main

}//end class
