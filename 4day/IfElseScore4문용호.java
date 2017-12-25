package ifelseex;

import javax.swing.JOptionPane;

/*
	학점 처리 프로그램

		잘못된 점수 처리하기! ---> 연산을 간결하게!
	=> 학점에 +,_부호 붙이기.////////////////과제.
	
		각 학점대 별로 1의 자리가 5이상이면 +를 붙이고
								 4이하면   -를 붙이자
		ex) 93점 -> A-
		ex) 78점 -> C+
		ex) 54점 -> F		//F학점에는 +,-   X
		
		
		문자열에 문자열을 연결하기
		String msg = "A";
		msg = "+";
		msg = msg + "+"			// msg += "+"
	
 */
public class IfElseScore4문용호 {
	
	public static void main(String[] args) {
		
		int score = Integer.parseInt(JOptionPane.showInputDialog("점수 입력"));
		
		if(0<= score && score <= 100){
			
			String grade = "F";	//초기화 반드시 할것.
								//초기값 F를 넣어주면 else가 필요 없음. 처음부터 F지만 점수가 높으면 학점이 바뀌는 느낌.
			
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
			
			System.out.println(score + " : " + grade + "학점");
			
			
			
		}else {
			
			System.out.println("점수가 이상해요~");
		}
		
		
		

		
		
		
		
		
		
	}//end main

}//end class
