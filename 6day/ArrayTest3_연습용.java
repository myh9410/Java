package arrayex;

import javax.swing.JOptionPane;

/*
	배열 : 데이터 처리
	
	nSub개 과목 시험을 본다. 과목 수 입력받아야 한다.
	new int[nSub]
	#1. 필수과목은 국영수
	#2. 전체과목은 6과목을 넘을 수 없다.
	#3. 전체과목 순서는
		String [] arSub = {"국어", "영어", "수학", "체육", "음악", "미술"}	//암시적 배열, String타입
	#4. 과목수 선택시, 순서대로 입력해야한다.
		과목수 : 4과목  ---> 국영수체
				 5과목  ---> 국영수체음
				 
	#5. 출력			 
			미응시 과목은 - 표시로 나타냄.
			총점	평균 (소수점 한자리)
			
	#6. 결과
			국어	영어	수학	체육	음악	미술	총점	평균
철수(6)		00		00		00		00		00		00		00		00.0
영희(4)		00		00		00		00		--		--		00		00.0
민수(3)		00		00		00		--		--		--		00		00.0
				 
				 
 */
public class ArrayTest3_연습용 {
	
	public static void main(String[] args) {
		String [] arSub = {"국어", "영어", "수학", "체육", "음악", "미술"};
		int nSub = Integer.parseInt(JOptionPane.showInputDialog("시험과목 수 입력(3~6)"));
		if (nSub < 3){
			System.out.println("국어, 영어, 수학은 필수 과목입니다.");
		}else if (nSub > 6){
			System.out.println("6과목까지만 시험을 칠 수 있습니다.");
			
		}else if (nSub == 3){
		}
		
		
		
		
		
		
		
		
		
		
	}

}
