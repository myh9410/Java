package classex2;

import javax.swing.JOptionPane;

//사칙연산 메서드 4개 만들자!

public class MethodTest {
	public static void main(String[] args) {
		MyCalculator calculator = new MyCalculator();

		//각 메서드를 부를 때마다 정수를 2개씩 넣어주자!
		
		//그 데이터를 리턴 받아와서 출력해보자!
		//add()호출하기 - 정수 2개를 입력받아서 add(1,2)자리에 각각 넣어줘야한다.
		//각각의 메서드를 호출해보자!
		int a = MyCalculator.getNum();
		int b = MyCalculator.getNum();
		System.out.println("덧셈 : "+calculator.add(a, b));
	
		a = MyCalculator.getNum();		//static으로...
		b = MyCalculator.getNum();
		System.out.println("뺄셈 : "+calculator.sub(a, b));
		
		a = MyCalculator.getNum();		//객체이용해서 부름
		b = MyCalculator.getNum();
		System.out.println("곱셈 : "+calculator.mul(a, b));
		
		a = MyCalculator.getNum();
		b = MyCalculator.getNum();
		System.out.println("나눗셈 : "+calculator.div(a, b));
		
	}
}
