package switchex;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 */
public class SwitchTest3 {
	public static void main(String[] args) {
		//��Ģ���꺸��
		//�ϳ��� �����ؼ� ����!
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("����1�Է�"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("����1�Է�"));
		String opMenu = "+	-	*	/ �� ����";
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
