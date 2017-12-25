package operatorex;

import javax.swing.JOptionPane;

/*
 	최단산쉬 관리삼대
	최우선 연산자 : 	[] , ()
 */
public class Op1 {
	
	//클래스 메서드 - 클래스.
	static void stM(){}
	static void stN(){}
	static void stO(){}
	static void stP(){}
	
	void m(){}
	void n(){}
	void o(){}
	void p(){}
	
	void printMyName(){					//printMyName이라는 메서드 제작
		System.out.println("문용호");
	}

	public static void main(String[] args) {
		//1. () : 우선순의 변경
		System.out.println(2+5*3);
		System.out.println((2+5)*3);

		
		//2. () : 메서드 호출
		//클래스 인스턴스 객체 메서드
		Op1 op/*객체*/ = new/*인스턴스*/ Op1();
		op.printMyName();	//()가 바로 메서드 : 호출해라!
		
		//3.	. : 점 연산자(dot 연산자, period 연산자)
							// . (쩜) 객체 "의" op객체가 갖고있는.....
		op.o(); //인스턴스 메서드
		
		//클래스 메서드 : static을 붙임.		==> 그래서 클래스.메서드()로 바로 호출 가능
		Op1.stM();
		Op1.stN();

		//메서드도 클래스 메서드다!
		JOptionPane.showInputDialog("데이터 입력");
		
		//4. [] 연산자 : 배열
		int a1 = 10;
		int a2 = 11;
		int a3 = 12;
		int a4 = 13;		//연속된 변수
		//4개의 변수를 배열이라는 공간에 넣을 수 있다.
		//배열 선언
		int [] ar = new int[4]; //저장소 4개를 만듬
		
		//선언된 배열에 값넣기 : 특이점 - 첫번째 저장소를 부를때, "1"이 아닌
		//									"0"부터 불러아한다.
		ar[0] = 10;	//4개중... 첫번째 저장소(변수)에 10을 넣어라!
		ar[1] = 11;	//각 방(요소)를 부를 때 [0]	[1]	[2]	[숫자]......
		ar[2] = 12; // [] 부분을 연산자라고 한다.
		ar[3] = 13;
			

	}

}
