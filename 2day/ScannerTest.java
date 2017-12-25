package scannerex;

import java.util.Scanner;

/*
	1) Scanner 클래스를 사용하기 위해 import 작업을 해야한다.
	
	2) Scanner 클래스를 ram에 등록하기 위해
			인스턴스 작업이 필요하다
	
			new 클래스(); 형태.
	
	3) 인스턴스를 사용하기 위해 "객체" 연결 작업
	
	   	   Scanner        sc          = new Scanner();
			타입         변수         =  인스턴스
 		객체(참조변수,레퍼런스 변수)
 	
	4) 객체.메서드() 호출할 수 있다.

	5) 메서드 종류에 따라서 정수, 실수, 문자열 등을 입력받을 수 있다.

	6) 입력 받은 데이터를 변수에 담아 놓고 사용하자!
 */
public class ScannerTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//Ctrl+Spacebar로 import
		System.out.print("이름 입력(영어) : ");
		String var = sc.next(); /*객체.메서드()	Ctrl+Spacebar 누르면 어떤 형을 받아오는지 알려줌.*/
		System.out.println("당신이 입력한 이름 : " + var);
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.println("나이 : " + age);
		
		System.out.print("짝 나이 입력 : ");
		int fr2 = sc.nextInt();
		System.out.println("나이 : " + fr2);
		
		int tot = age+fr2;
		System.out.print("둘 나이 합 : " + tot + "살");
		//age,fr2는 문자형이라 age: 12 fr2: 23이면 값이 1223으로 나오므로 int로 바꿔줌.
		double avg = tot/2.0;
		System.out.print("둘 나이 평균 : " + avg + "살");
	//	System.out.printf("둘 나이 평균 : %.1f살\n", avg);도 가능
		
		
	}

}
