import java.util.Arrays;
import java.util.Scanner;

/** document 주석 -> class에 대한 설명을 함
 * 클래스명에 호버링하면 document주석의 설명이 보임
 * 클래스, 메서드, 변수의 선언부 앞에 작성해서 부가적인 설명을 달아줌
 */
public class Z01_Test {
	public static void main(String[] args) {
/*
		for (int i =2;i<=8;i+=2) {
			for (int j=1;j<=9;j++) {
				System.out.printf("%d X %d = %2d	%d X %d = %2d",i,j,i*j,i+1,j,(i+1)*j);
				System.out.println();
			}
			System.out.println();
		}
	/*강사님 코드
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++,i++) {//;;만 2개 들어가면 사이에 ,,는 얼마든지 들어가도 상관없음
			for (int j = 1; j <= 9; j++) {
				//System.out.println(i+"*"+j+"="+i*j);
				System.out.printf("%d*%d=%2d\t",i,j,i*j);
				System.out.printf("%d*%d=%2d\n",i+1,j,(i+1)*j);
			}
		}
		*/
/*
		// 변수 - 기본형, 참조형
		// 기본형
		// 정수형 byte(1byte), short(2), "int"(4), long(8)	<< int가 기본형
		// 실수형 float(4), "double"(8)
		// 문자형 char(2)	<< c언어는 1byte
		// 논리형 boolean(1)
		char c = ' ';	//해당하는 문자 '한개'의 코드값이 저장됨(ASCII, UNICODE 등)
		// 문자열
		// JAVA에서는 String Class에 저장
		String s = "";
		s = "hi"+ "hello"; // 문자열끼리의 덧셈연산은 이어붙여준다
		s = "hi"+ 3;		//hi3 (시스템적으로 비문자열을 문자열로 변경해줌)
		s = 3 + 4 + "hi";	//7hi
		s = 3 + 4 + "hi" + 3 + 4;	//7hi34
		
		String str = "abcdefghij";
		str.length();
		str.charAt(4);
		
		//JAVA의 조건식 ( 흐름 제어 ) : if, else, switch-case, 삼항연산자
		//JAVA의 반복문 : for, while, do-while
		//JAVA 배열선언 (1차원배열)
		int [] a;		//배열의 선언
		a = new int[10];//배열의 객체생성 (메모리 확보) - 각 타입의 초기 값으로 초기화
		a[0] = 1;		//초기화 - 값을 처음 할당
		//정수,실수 - 0, char - a
		//참조형 - null
		int [] b = new int[3]; //배열의 선언과 생성을 한번에
		b[0] = 1;
		
		//자바는 배열길이 가변X, 길이 3으로 고정
		int [] cc = {1,2,3};
		// 배열의 선언과 생성, 초기화를 한번에   익명배열 사용시
		int [] d = new int[] {1,2,3};
		//2차원 배열
		for (int k = 0; k < d.length; k++) {
			
		}
		int [][] e;
		//자바의 입력방법 : Scanner, BufferedReader, JOptionPane
		
		//입력 받기 위해서 스캐터객체는 한번만 선언하면 된다.
		Scanner sc = new Scanner(System.in);
//		sc.next(); 		// 입력값을 String 형으로 리턴
//		sc.nextInt(); 	// 입력값을 int형으로 리턴
		System.out.println("나이 : ");
		int age = sc.nextInt();
		System.out.println("이름 : ");
		String name = sc.next();
		
		System.out.println(name + "씨 나이가"+age+"살이군요");
*/	
		
		/*
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for (int testCase = 1; testCase <= TC; testCase++) {
			//10개의 숫자를 입력받아, 홀수들의 합을 출력
			int sum =0;
			for (int i = 0; i < 10; i++) {
				int num = sc.nextInt();
				if (num%2 == 1) { //홀수냐
					sum+=num;
				}
			}
			System.out.println("#"+testCase+" "+sum);
		}
		*/

		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		int [] arrInt = new int [TC];
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = sc.nextInt();
		}
		Arrays.sort(arrInt);
		System.out.println(arrInt[arrInt.length/2]);
		sc.close();
		
	}	// eom
}	// eoc
