package operatorex;

import javax.swing.JOptionPane;

/*
 	�ִܻ꽬 �������
	�ֿ켱 ������ : 	[] , ()
 */
public class Op1 {
	
	//Ŭ���� �޼��� - Ŭ����.
	static void stM(){}
	static void stN(){}
	static void stO(){}
	static void stP(){}
	
	void m(){}
	void n(){}
	void o(){}
	void p(){}
	
	void printMyName(){					//printMyName�̶�� �޼��� ����
		System.out.println("����ȣ");
	}

	public static void main(String[] args) {
		//1. () : �켱���� ����
		System.out.println(2+5*3);
		System.out.println((2+5)*3);

		
		//2. () : �޼��� ȣ��
		//Ŭ���� �ν��Ͻ� ��ü �޼���
		Op1 op/*��ü*/ = new/*�ν��Ͻ�*/ Op1();
		op.printMyName();	//()�� �ٷ� �޼��� : ȣ���ض�!
		
		//3.	. : �� ������(dot ������, period ������)
							// . (��) ��ü "��" op��ü�� �����ִ�.....
		op.o(); //�ν��Ͻ� �޼���
		
		//Ŭ���� �޼��� : static�� ����.		==> �׷��� Ŭ����.�޼���()�� �ٷ� ȣ�� ����
		Op1.stM();
		Op1.stN();

		//�޼��嵵 Ŭ���� �޼����!
		JOptionPane.showInputDialog("������ �Է�");
		
		//4. [] ������ : �迭
		int a1 = 10;
		int a2 = 11;
		int a3 = 12;
		int a4 = 13;		//���ӵ� ����
		//4���� ������ �迭�̶�� ������ ���� �� �ִ�.
		//�迭 ����
		int [] ar = new int[4]; //����� 4���� ����
		
		//����� �迭�� ���ֱ� : Ư���� - ù��° ����Ҹ� �θ���, "1"�� �ƴ�
		//									"0"���� �ҷ����Ѵ�.
		ar[0] = 10;	//4����... ù��° �����(����)�� 10�� �־��!
		ar[1] = 11;	//�� ��(���)�� �θ� �� [0]	[1]	[2]	[����]......
		ar[2] = 12; // [] �κ��� �����ڶ�� �Ѵ�.
		ar[3] = 13;
			

	}

}
