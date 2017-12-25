package ifex;

import javax.swing.JOptionPane;

/*

 */
public class ifTest4 {
	
	public static void main(String[] args) {
		//#1. 알파벳이 대문자? 소문자? 판별해보기
		char alphabet = JOptionPane.showInputDialog("알파벳을 입력해주세요.").charAt(0);
		if ('A'<= alphabet && alphabet <= 'Z'){
			System.out.println("알파벳이 대문자입니다.");
		}
		if ('a'<=alphabet && alphabet <= 'z'){
			System.out.println("알파벳이 소문자입니다.");
		}
		
		//#2. 입력받은 두 정수의 사칙연산을 출력해 보기
		//	정수 : 5	9입력받으면
		//	5+9 = 14
		//	5-9 = -4
		//	5*9 = 45
		//	5/9 = 0
		//	===> 왜 if문이 필요한가?
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("정수1"));		
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("정수2"));		
		
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		System.out.println(num1+"-"+num2+"="+(num1-num2));
		System.out.println(num1+"*"+num2+"="+(num1*num2));
		if (num2 == 0){
			System.out.println("0으로 나눌 수 없습니다.");//num2 == 0이면 "0으로 나눌 수 없습니다." 출력
		}												  //num2 != 0이면 num1/num2 출력
		if (num2 != 0){
			System.out.println(num1+"/"+num2+"="+(num1/num2));
		}
	}

}
