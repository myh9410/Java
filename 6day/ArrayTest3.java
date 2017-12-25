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
//입력 -> 처리 -> 출력
//배열을 만들어야하는데 3~6갯수 체크
// 갯수 new int[갯수]
//for -> 갯수 입력+누적
// 과목배열! [0] : 국어 [1] : 영어 ....

//출력
//배열의 갯수 점수를 반복적 출력
//for - 표시!! 전체 6-입력과목수
public class ArrayTest3 {
	
	public static void main(String[] args) {
		//과목수 체크
		int nSub = 0;
		String msg = "과목수 입력";
		do{
			nSub = Integer.parseInt(JOptionPane.showInputDialog(msg));
		//if (nSub가 3~6이 아니면 다시 받아라!)	-	무한루프를 돌려서 계속 잘못 입력해도 계속 다시 입력하도록
			msg = "3~6만 넣어야 합니다.";
			
		}while(!(3<=nSub && nSub<=6));
		//배열 만들기
		int [] ar = new int[nSub];
		int sum = 0;//누적
		String [] arSub = {"국어", "영어", "수학", "체육", "음악", "미술"};
		String [] strResult = {"총점", "평균"};
		for (int i=0; i<nSub; i++){
			ar[i] = Integer.parseInt(JOptionPane.showInputDialog(arSub[i]+"점수 입력"));//순서대로 나오도록 설정.
			sum += ar[i];//처리
		}
		//출력하기
		for (int i=0; i<6; i++){
			System.out.print(arSub[i] + "\t");
			
		}
		for(int i=0; i<2; i++){
			System.out.print(strResult[i]+ "\t");
		}
		System.out.println();//한줄 띄어쓰기
		//#2. 과목갯수만큼 점수들을 나열하자!
		for (int i=0; i<nSub; i++){
			System.out.print(ar[i]+"\t");
		}
		//#3. 시험 안친 과목 - 표시
		for(int i=0; i<6-nSub;i++){
			System.out.println("-\t");
		}
		//#4. 총점 평균
		System.out.println(sum + "\t");
		System.out.printf("%d\t%.1f\n",sum, (double)sum/nSub);
		
		System.out.println();
		//2번학생
		
		//3번학생
		
	}

}
