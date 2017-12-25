package printex;

//System.out.println()에서 연산하기

public class PrintTest4 {

	public static void main(String[] args) {
		System.out.println(1+2);
		System.out.println(1*2);
		System.out.println(1/2);
		System.out.println(1-2);
		
//문자열은 +를 붙여서 표현할 수 있다.
System.out.println("안녕"+" 어서와");//두 문자열을 연결
//문자열은 숫자들, 문자들과도 연결이 가능하다.
System.out.println("결과 : " + 5); //"결과 : 5"
System.out.println("결과 : " + (5+3)); //"결과 : 5"
System.out.println("결과 : " + 5*3); //"결과 : 5"
		
	}

}
