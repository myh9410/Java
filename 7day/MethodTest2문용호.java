package classex2;

import javax.swing.JOptionPane;

public class MethodTest2문용호 {
	public static void main(String[] args) {

		MyCalculator calculator = new MyCalculator();
		//연산자 4개
		//상황별로 선택하자!
		//반복시키자!
		//종료? - 연산자 받을때 q로 종료시키자~
		//무한반복							 do while()
		//연산자 선택						 joptionpane.showinputdialog
		//switch문으로 연산자 선택할 수 있게 case 1 : "+"	case 2 : "-"	case 3 : "*"	case 4 : "/"
		
		//종료는 어떻게 해야하나?			 break;		
		String str = "연산자 선택(+ - * /	종료:Q)";
		
		while(true){
			String op = JOptionPane.showInputDialog(str);
			if(op.equalsIgnoreCase("Q"))	//대소문자 무시
				break;
			int a = MyCalculator.getNum();
			int b = MyCalculator.getNum();
			int result = 0;
			//주석달기---변수의 목적, 왜 만들었나 등등....
			String sRe = "";
			switch(op){
			case "+" : 
				sRe="덧셈";
				result = calculator.add(a, b);
				break;
			
			case "-" : 
				sRe="뺄셈";
				result = calculator.sub(a, b);
				break;
			
			case "*" : 
				sRe="곱셈";
				result = calculator.mul(a, b);
				break;
				
			case "/" : 
				sRe="나눗셈";	//0나눗셈 해결할것!
				result = calculator.div(a, b);
				break;
			}
			System.out.println("결과 : "+a + op + b +"="+ result);
		}
	}

}
