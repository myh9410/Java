package switchex;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 */
public class SwitchTest4 {
	public static void main(String[] args) {
		//사칙연산보기
		//하나만 선택해서 보기!
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("정수1입력"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("정수1입력"));
		String opMenu = "+	-	*	/ 중 택일";
		//char op = JOptionPane.showInputDialog(opMenu).charAt(0);
		String op = JOptionPane.showInputDialog(opMenu);
		
		String result = "";
		switch(op){
		case "+" : 
			result = num1+num2+"";//	+"" --->문자열로 만들어줌
			break;
		case "-" : 
			result = num1-num2+"";
			break;
		case "*" : 
			result = num1*num2+"";
			break;
		case "/" : 
			if(num2 != 0)
				result = num1/num2+"";
			else
				result = "\"0으로 나눌 수 없어요\"";	// 문자열 내에 ""표시하기 \"	\"
			break;
		}
		//op가 문자일 때는 ""로 연산되는 걸 막아야한다.
		//System.out.println("" + num1 + op + num2 + "=" + result);
		
		//op가 문자열이니까 굳이 ""를 붙이지 않아도 된다.
		
	}
}
