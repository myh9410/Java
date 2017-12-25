package whileex;

import javax.swing.JOptionPane;

/*
	반복문 (loop)	-	for		while		do while
	
	
	
	//갯수가 있을 때 제어하면 편하다.
	for(초;조;증감){}	//어디서부터 몇번 할까?
						
		
	
	//무한 반복 만들 때 편하다!
	while(조건식){}		//반복할 거니? 말거니?
	
	
 */
public class WhileTest2 {
	public static void main(String[] args) {
		
		while(true){
			int num1 = Integer.parseInt(JOptionPane.showInputDialog("정수1입력(종료 : q)"));
			int num2 = Integer.parseInt(JOptionPane.showInputDialog("정수1입력(종료 : q)"));
		
			String opMenu = "+	-	*	/ 중 택일(종료 : q)";
			
			//문자열 비교
			//기본형 정수, 실수, 문자, 논리		== 		>= 		>= 		연산비교가 가능하다.
			//문자열도 기본형처럼 연산자 비교가 가능하다 하지만...
			//문자열 자체는 객체다! 원래 기본형이 아니다.
			//그래서 비교를 위한 별도의 메서드를 제공하고 있다.
			//  == 비교를 해도 에러는 안나지만 값 비교가 안될 수 있기 때문에...
			// 반드시 메서드로 비교시켜야 한다.
			
			String op = JOptionPane.showInputDialog(opMenu);
			//equals() 메서드로 비교하자.
			/*if(opMenu=="q") break; -----> X   */
			if (op.equalsIgnoreCase("q")){//대소문자 무시하고 q라는 단어만 입력하면 종료 실행하는 메서드.
			//if (opMenu.equals("q")|| opMenu.equalsIgnoreCase("Q")){
				break;
			}
			
			
		
			String result = "";
			switch(op){
			case "+" : result = num1+num2+""; break;
			case "-" : result = num1-num2+""; break;
			case "*" : result = num1*num2+""; break;
			case "/" : 
				if(num2 != 0)
					result = num1/num2+"";
				else
					result = "\"0으로 나눌 수 없어요\"";
				break;
			}
			System.out.println("" + num1 + op + num2 + "=" + result);
		}
		//System.out.println("프로그램을 종료합니다.");
	}
}

