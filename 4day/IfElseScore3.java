package ifelseex;

import javax.swing.JOptionPane;

/*
	학점 처리 프로그램

		잘못된 점수 처리하기! ---> 연산을 간결하게!
	
 */
public class IfElseScore3 {
	
	public static void main(String[] args) {
		
		int score = Integer.parseInt(JOptionPane.showInputDialog("점수 입력"));
		
		if(0<= score && score <= 100){
			
			String grade = "F";	//초기화 반드시 할것.
								//초기값 F를 넣어주면 else가 필요 없음. 처음부터 F지만 점수가 높으면 학점이 바뀌는 느낌.
			
			if (90<= score){
				grade = "A";
			}else if(80 <= score){
				grade = "B";
			}else if(70 <= score){
				grade = "C";
			}else if(60<= score){
				grade = "D";
			}
			
			System.out.println(score + " : " + grade + "학점");
			
			
			
		}else {
			
			System.out.println("점수가 이상해요~");
		}
		
		
		

		
		
		
		
		
		
	}//end main

}//end class
