package ifex;

import javax.swing.JOptionPane;

/*

 */
public class ifTest4 {
	
	public static void main(String[] args) {
		//#1. ���ĺ��� �빮��? �ҹ���? �Ǻ��غ���
		char alphabet = JOptionPane.showInputDialog("���ĺ��� �Է����ּ���.").charAt(0);
		if ('A'<= alphabet && alphabet <= 'Z'){
			System.out.println("���ĺ��� �빮���Դϴ�.");
		}
		if ('a'<=alphabet && alphabet <= 'z'){
			System.out.println("���ĺ��� �ҹ����Դϴ�.");
		}
		
		//#2. �Է¹��� �� ������ ��Ģ������ ����� ����
		//	���� : 5	9�Է¹�����
		//	5+9 = 14
		//	5-9 = -4
		//	5*9 = 45
		//	5/9 = 0
		//	===> �� if���� �ʿ��Ѱ�?
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("����1"));		
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("����2"));		
		
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		System.out.println(num1+"-"+num2+"="+(num1-num2));
		System.out.println(num1+"*"+num2+"="+(num1*num2));
		if (num2 == 0){
			System.out.println("0���� ���� �� �����ϴ�.");//num2 == 0�̸� "0���� ���� �� �����ϴ�." ���
		}												  //num2 != 0�̸� num1/num2 ���
		if (num2 != 0){
			System.out.println(num1+"/"+num2+"="+(num1/num2));
		}
	}

}
