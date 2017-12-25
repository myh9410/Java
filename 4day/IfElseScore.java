package ifelseex;

import javax.swing.JOptionPane;

/*
	학점 처리 프로그램
	국어 시험 0~100점
	~90점 : "A"학점
	~80점 : "B"학점
	~70점 : "C"학점
	~60점 : "D"학점
	59~0점 : "F"학점
	
	
 */
public class IfElseScore {
	
	public static void main(String[] args) {
		int score = Integer.parseInt(JOptionPane.showInputDialog("점수 입력"));
		if (score >=90){
			System.out.println(score + " : A학점");
		}else if(score >=80){
			System.out.println(score + " : B학점");
		}else if(score >=70){
			System.out.println(score + " : C학점");
		}else if(score >=60){
			System.out.println(score + " : D학점");
		}else {
			System.out.println(score + " : F학점");
		}
		
		
		
		
		
		
	}//end main

}//end class
