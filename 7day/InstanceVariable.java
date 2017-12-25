package classex;
/*
	클래스 안에는 변수를 만들 수 있다. : 인스턴스 변수라 한다.
	왜? 만들 수 있게 있을까? - 만들어서 어디다 쓸까?
	
 */

//나만의 타입을 하나 만들자(설계)! 어떤 모델로?
//이름, 정수1, 정수2~정수5

//사용자 타입(클래스)!
class StudentInfo{
	String name;
	int age;
	int kor;	int eng;	int math;	int pe;
	
}


public class InstanceVariable {
	
	public static void main(String[] args) {
		/*
			철수 - "김철수", 19살	라는 데이터를 저장
			30,50,60,80 성적!	-	변수4개를 만들어서 데이터를 저장하기는 불편함 - 배열 이용
		 */
		
		String name = "김철수"; int nai = 19;
		int [] scores = {30,50,60,80};
		
		//3개의 저장소(2개 : 변수, 1개 : 배열)가 존재!
		//				-> 6개의 데이터 저장
		//1개의 저장소만 쓸 수 있을까?
		// type 철수 - {"김철수", 19살  30,50,60,80 성적!};	<-- 배열처럼 쓰면 좋지만, 타입이 섞여 있어서..
		//	내가 이런 형식으로 타입을 만들어 버리면...	
		
		//heap에 새롭게 StudentInfo라는 메서드를 만듬. <--인스턴스!!!!
		//실제로 ram에 해당 클래스의 byte만큼 저장소를 만드는 것
		//객체 = new StudentInfo();
		//객체.방(각각의 저장소) = 데이터;
		//타입 변수 = 인스턴스;
		// T	 V  =  new StudentInfo();
		StudentInfo	cs = new StudentInfo();
		StudentInfo yh = new StudentInfo();
		cs.name = "김철수";
		cs.age = 19;
		cs.kor = 20;
		cs.eng = 30;
		cs.math = 40;
		cs.pe = 50;
		
		//각 변수에 있는 철수의 데이터를 출력해 보자!
		System.out.println("이름 : " + cs.name);
		System.out.println("나이 : " + cs.age);
		System.out.println("국어 : " + cs.kor);
		System.out.println("영어 : " + cs.eng);
		System.out.println("수학 : " + cs.math);
		System.out.println("체육 : " + cs.pe);
		int tot = 0;
		double avg = 0.0;
		tot = cs.kor + cs.eng + cs.math + cs.pe;
		avg = tot/4.0;
		System.out.println("총점 : " + tot + "점");
		System.out.printf("평균 : %.1f\n",avg);
		
		//영희
		yh.name = "김영희";
		yh.age = 19;
		yh.kor = 60;
		yh.eng = 70;
		yh.math = 80;
		yh.pe = 90;
		
		
		
		
		
		
		
		
		
		
	}

}
