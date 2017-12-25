package switchex;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
	ifElseScore4문용호.java에서 학점분기
	--->switch로 변경해 보자!
 */
public class SwitchTest5Score문용호 {
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
		
		
		

		
		
		
		
		
		
	
		
		
	}
}
