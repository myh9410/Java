package variableex;

public class VariableTest {

	public static void main(String [] args){
		//변수 선언
		int a = 0;	//만들기만 하고 초기화가 안됐다.
		int b = 0;
		int c = 0;	//초기화를 해둬야 안정화가 된다.
		
		//기준값, 실제값 - 위보다 아래 선호

		double d = 0.0;
		
		boolean isPower = false;	//기본값
		
		char ch = '\u0000';	
		char ch2 = ' ';	//문자 홑따옴표는 반드시 한칸만 있어야 한다.
		
		String name = null;
		String name2 = "";	//없어도 되고, 많아도 된다.
		
		System.out.println("a : "+a);
		
		//값을 입력해 보자
		a = 10;
		b = 20;
		c = 30;
		
		//선언과 동시 "초기화:initialize"
		int hap = a+b+c;	//변수를 만들면서부터 값을 넣고 있다.
		System.out.println("결과 : "+hap);

	}
	
}
