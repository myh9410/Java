package switchex;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 */
public class SwitchTest4 {
	public static void main(String[] args) {
		//��Ģ���꺸��
		//�ϳ��� �����ؼ� ����!
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("����1�Է�"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("����1�Է�"));
		String opMenu = "+	-	*	/ �� ����";
		//char op = JOptionPane.showInputDialog(opMenu).charAt(0);
		String op = JOptionPane.showInputDialog(opMenu);
		
		String result = "";
		switch(op){
		case "+" : 
			result = num1+num2+"";//	+"" --->���ڿ��� �������
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
				result = "\"0���� ���� �� �����\"";	// ���ڿ� ���� ""ǥ���ϱ� \"	\"
			break;
		}
		//op�� ������ ���� ""�� ����Ǵ� �� ���ƾ��Ѵ�.
		//System.out.println("" + num1 + op + num2 + "=" + result);
		
		//op�� ���ڿ��̴ϱ� ���� ""�� ������ �ʾƵ� �ȴ�.
		
	}
}
