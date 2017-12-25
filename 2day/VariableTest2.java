package variableex;
/*
	변수, 메서드, 클래스 이름 짓기 규칙
	
	1. 연상할 수 있는 단어로 지어주자!
	
	2. 변수는 소문자, 메서드도 소문자
	   클래스는 대문자로 시작.	(규칙-지켜주는게 좋다, 문법은 아니다)
	   
	3. 맨 앞에 숫자가 오면 에러!
	   중간에 공백이 있어도 에러!
	   특수문자가 있어도 에러!
	   ($ 와 _ 은 사용할 수 있다)
	   키워드를 이름으로 사용하면 에러
	   
	4. 대문자와 소문자는 서로 다른 단어이다.
		Max	 ≠  max
	
	철수가 시험을 본다.
	4과목 시험을 본다.			국어 영어 수학 음악
	각각 0~100점단위의 점수가    80   90   70   60
	각 점수들의 총점과 평균을
	변수를 통해서 구해보자!
	
	변수를 a,b,c,d로 설정하지 말고 국어 = kor 영어 = eng 이런식으로...
	
	
	
*/
public class VariableTest2 {

	public static void main(String [] args){
		//코딩 순서 : 변수 선택 및 입력 -> 처리 -> 출력
		String name = "철수";				//입력
		int kor = 80;
		int eng = 90;
		int math = 70;
		int music = 60;
		
		int 합계 = kor+eng+math+music;		//처리
		int avg = 합계/4;
		
		System.out.println("이름 : "+name);	//출력
		System.out.println("국어 : "+kor+"점");
		System.out.println("영어 : "+eng+"점");
		System.out.println("수학 : "+math+"점");
		System.out.println("음악 : "+music+"점");
		System.out.println("총점 : "+합계+"점");
		System.out.println("평균 : "+avg+"점");
		
	}
	
}
