package classex2;

import javax.swing.JOptionPane;

public class MethodTest2����ȣ {
	public static void main(String[] args) {

		MyCalculator calculator = new MyCalculator();
		//������ 4��
		//��Ȳ���� ��������!
		//�ݺ���Ű��!
		//����? - ������ ������ q�� �����Ű��~
		//���ѹݺ�							 do while()
		//������ ����						 joptionpane.showinputdialog
		//switch������ ������ ������ �� �ְ� case 1 : "+"	case 2 : "-"	case 3 : "*"	case 4 : "/"
		
		//����� ��� �ؾ��ϳ�?			 break;		
		String str = "������ ����(+ - * /	����:Q)";
		
		while(true){
			String op = JOptionPane.showInputDialog(str);
			if(op.equalsIgnoreCase("Q"))	//��ҹ��� ����
				break;
			int a = MyCalculator.getNum();
			int b = MyCalculator.getNum();
			int result = 0;
			//�ּ��ޱ�---������ ����, �� ������� ���....
			String sRe = "";
			switch(op){
			case "+" : 
				sRe="����";
				result = calculator.add(a, b);
				break;
			
			case "-" : 
				sRe="����";
				result = calculator.sub(a, b);
				break;
			
			case "*" : 
				sRe="����";
				result = calculator.mul(a, b);
				break;
				
			case "/" : 
				sRe="������";	//0������ �ذ��Ұ�!
				result = calculator.div(a, b);
				break;
			}
			System.out.println("��� : "+a + op + b +"="+ result);
		}
	}

}
