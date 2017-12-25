package switchex;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 */
public class SwitchTest3 {
	public static void main(String[] args) {
		//사칙연산보기
		//하나만 선택해서 보기!
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("정수1입력"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("정수1입력"));
		String opMenu = "+	-	*	/ 중 택일";
		char op = JOptionPane.showInputDialog(opMenu).charAt(0);
		
		int result = 0;
		switch(op){
		case '+' : 
			result = num1+num2;
			break;
		case '-' : 
			result = num1-num2;
			break;
		case '*' : 
			result = num1*num2;
			break;
		case '/' : 
			if(num2 != 0)
				result = num1/num2;
			break;
		}
		System.out.println("" + num1 + op + num2 + "=" + result);
		
	}
}
