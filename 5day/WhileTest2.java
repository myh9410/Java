package whileex;

import javax.swing.JOptionPane;

/*
	�ݺ��� (loop)	-	for		while		do while
	
	
	
	//������ ���� �� �����ϸ� ���ϴ�.
	for(��;��;����){}	//��𼭺��� ��� �ұ�?
						
		
	
	//���� �ݺ� ���� �� ���ϴ�!
	while(���ǽ�){}		//�ݺ��� �Ŵ�? ���Ŵ�?
	
	
 */
public class WhileTest2 {
	public static void main(String[] args) {
		
		while(true){
			int num1 = Integer.parseInt(JOptionPane.showInputDialog("����1�Է�(���� : q)"));
			int num2 = Integer.parseInt(JOptionPane.showInputDialog("����1�Է�(���� : q)"));
		
			String opMenu = "+	-	*	/ �� ����(���� : q)";
			
			//���ڿ� ��
			//�⺻�� ����, �Ǽ�, ����, ��		== 		>= 		>= 		����񱳰� �����ϴ�.
			//���ڿ��� �⺻��ó�� ������ �񱳰� �����ϴ� ������...
			//���ڿ� ��ü�� ��ü��! ���� �⺻���� �ƴϴ�.
			//�׷��� �񱳸� ���� ������ �޼��带 �����ϰ� �ִ�.
			//  == �񱳸� �ص� ������ �ȳ����� �� �񱳰� �ȵ� �� �ֱ� ������...
			// �ݵ�� �޼���� �񱳽��Ѿ� �Ѵ�.
			
			String op = JOptionPane.showInputDialog(opMenu);
			//equals() �޼���� ������.
			/*if(opMenu=="q") break; -----> X   */
			if (op.equalsIgnoreCase("q")){//��ҹ��� �����ϰ� q��� �ܾ �Է��ϸ� ���� �����ϴ� �޼���.
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
					result = "\"0���� ���� �� �����\"";
				break;
			}
			System.out.println("" + num1 + op + num2 + "=" + result);
		}
		//System.out.println("���α׷��� �����մϴ�.");
	}
}

