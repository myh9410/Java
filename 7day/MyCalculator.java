package classex2;

import javax.swing.JOptionPane;

public class MyCalculator {

	int add(int a, int b){ return a+b;}
	
	int sub(int a, int b){ return a-b;}
	
	int mul(int a, int b){ return a*b;}
	
	int div(int a, int b){ return a/b;}
	
	//������ ������ �ִ� �޼���
	
	//static : �̸� ����� ����  "new �ν��Ͻ� ����"
	//�ν��Ͻ� ���� Ŭ������ ���� �θ� �� �ִ�.
	//MyCalculator.getNumber();
	//Ŭ����.�޼���() ���·� �θ���.
	// ��ü.�޼���()�� �θ��� �ʴ´�!!!
	static int getNum(){
		return Integer.parseInt(JOptionPane.showInputDialog("���� �Է�"));
		
	}
	

}
