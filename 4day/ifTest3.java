package ifex;

import javax.swing.JOptionPane;

/*
	�Է� - ó�� - ��� ����.

	if(���ǽ�=>����� : ����T/F){
	
	}
	
	if(����){			//���� "��"�̶��.... ��������
							   "����"�̶��..  if���� ��������.
	
	
	}
	
	
	
 */
public class ifTest3 {
	
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("���� �Է�"));
		
		//�Է¹��� ���� ���� ���ڸ� ����ΰ�?
		//int a, b, c, d;
		//a=b=c=d=0;
		//���� : 0<num<10	--	���迬���ڴ� ������ �������� ����
		//	0<num�ΰ�?	�׸���	num<10�ΰ�?
		//	 true		  ||	 true �϶�	---> t||f �̸� 1�� ����ϹǷ� &&�� ������Ѵ�.
		//	 true		  &&	 true �϶�
		if(0<num && num<10){
			System.out.println(num + "�� ���ڸ� ����̴�.");
		}	
		
		//3�� �����?
		if(num%3 == 0){						// %3==0
			System.out.println(num + "�� 3�� ����̴�.");
		}
		if(num%3 != 0){
			System.out.println(num + "�� 3�� ����� �ƴϴ�.");
		}
		
		//6�� �����?
		if(num%6 == 0){
			System.out.println(num + "�� 6�� ����̴�.");
		}
		if(num%6 !=0){
			System.out.println(num + "�� 6�� ����� �ƴϴ�");
		}
			
		//¦����?
		if(num%2 == 0){
			System.out.println(num + "�� ¦���̴�.");
		}
		if(num%2 !=0){
			System.out.println(num + "�� ¦���� �ƴϴ�.");			
		}
	
		//�ѱ��� �Է¹ޱ�!
		//��ȭ����	JOptionPane.showInputDialog(message) --> ���ڿ��� �Է¹ް�
		//				parseInt	---> int�迭�� �Ľ���.
		double sight = Double.parseDouble(JOptionPane.showInputDialog("�¾� �÷� �Է�"));
		char ch = "abcd".charAt(0);  //---> "���ڿ�"���� ()�� ���� ��ġ�� �ִ� ���ڸ� ������. 0���� ����.
									//abcd���� 0��°�� a�� �����ͼ� ch��� �����ȿ� ����.
		System.out.println(ch);
		
		//������ �̸��� �Է¹ް�..
		//���߿� ���� ��������
		
		//String name = JOptionPane.showInputDialog("�̸��� �Է����ּ���.");
		//char sung = name.charAt(0);
		//System.out.println(name +"�� ���� : " + sung + "�Դϴ�.");
		
		//�ٷ� �ޱ⵵ ����
		char sung = JOptionPane.showInputDialog("�̸��� �Է����ּ���.").charAt(0);
		System.out.println("���� : " + sung + "�Դϴ�.");
	}

}
