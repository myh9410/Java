package ifelseex;

import javax.swing.JOptionPane;

/*
	학점 처리 프로그램

		잘못된 점수 처리하기!
	
 */
public class IfElseScore2 {
	
	public static void main(String[] args) {
		int score = Integer.parseInt(JOptionPane.showInputDialog("점수 입력"));
		if (90<= score && score <= 100){
			System.out.println(score + " : A학점");
		}else if(80 <= score && score < 90){
			System.out.println(score + " : B학점");
		}else if(70 <= score && score < 80){
			System.out.println(score + " : C학점");
		}else if(60<= score && score < 70){
			System.out.println(score + " : D학점");
		}else {
			System.out.println(score + " : F학점");
		}
		
		
		
		
		
		
	}//end main

}//end class
