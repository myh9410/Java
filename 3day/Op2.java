package operatorex;

import javax.swing.JOptionPane;

/*
 	�ִܻ꽬 �������
	  ���� ������(unary): ���� �Ѱ�.
		 +		-		!		~		()		++		--
		 
		 
		 
		 
 */
public class Op2 {
	
	public static void main(String[] args) {
		//1. + , - ���� : ��ȣ�ٲ�(����) ������
		int num = -10;
		System.out.println(+num);	//(+1)*num �� ���� : ��ȣ ����
		System.out.println(-num);	//(-1)*num �� ���� : ��ȣ �ٲ�
		
		//2. ! ������	:	not (����)	<--- �ݴ�� ����ڴ�.
		//			���� <-->����    :    ��Ÿ��
		//	��Ÿ��false<-->true
		//boolean : false�� !�� ���̸� true�� �ȴ�!
		boolean isFly = false;
		System.out.println("�� �� �ִ�? : "+isFly);
		//isFly = true;
		//System.out.println("�� �� �ִ�? : "+isFly);
		System.out.println("�� �� �ִ�? : "+!isFly);	// !false = true
		
		boolean isPower = false;
		isPower = !isPower;
		System.out.println(isPower);
		
		//3. ~ ���� ������,tilde������(1�� ���� ������)	:
		// ���ü�� bit�� ���� �Ŀ� 1->0���� 0->1�� �ٲ��!
		System.out.println(10);
		System.out.println(~10);	// -11
		
		System.out.println(100);
		System.out.println(~100);	//-101
		System.out.println(~1000);	//-1001
		System.out.println(~10000);	//-10001
									// ~���ü : -(���ü+1)
		
		//System.out.println(~10);
		//10�� bit�� ������		s	64	32	16	8	4	2	1	-	Label
		//						0	0	0	0	1	0	1	0
		//					~
		//					�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
		//						1	1	1	1	0	1	0	1
		//2�� ������ : �ؼ��ؾ��ϴ� 2������ �����϶�, 2���� ����
		//	1.	������ -> ���� �������� ��������
		//		@	@	@	@	@	@	@	1
		//	2.	������ 1�� ������ "�� ����"���� 1 -> 0, 0 -> 1�� �ٲ۴�.(sign��Ʈ�� �ٲ��� ����)
		//		1	0	0	0	1	0	1	1
		//	3.	Label�� �ؼ�
		//		-	0	0	0	8	0	2	1
		//	~01101010 ������(tilde���� ���) -> 10010101 -> 01101011 -> 127
		
		//4. () ����ȯ ������
		System.out.println( (double) 5);//4byte -> 8byte
		System.out.println( (int) 5.1);//�Ҽ��θ� ����! �����θ� ������!
		System.out.println("----������ ASCII�ڵ尪 ���� (int)���� ----");
		System.out.println((int) '0');	//���ڿ� ���� �ڵ尪 -> ������ ���´�
		System.out.println((int) '1');
		System.out.println((int) '2');
		System.out.println((int) '3');
		System.out.println((int) '4');
		
		//byte, short, char ���� �ڱ�׳��� ������ �� int�� �ٲ��.
		System.out.println("////////////////////////////////");
		System.out.println((int)'a');	//97
		System.out.println('a'+1);		//98
		//�ִܻ꽬 �������
		System.out.println(	(char)	'a'+1	);	//98�̶�� �ڵ��� ���ڸ� ������!
		System.out.println(	(char)	('a'+1)	);	//98�̶�� �ڵ��� ���ڸ� ������!
		
		//++,	--	:	���� ������ : ���� ��ü�� ���� �ٲ��.
		// ++ : 1�� ���� ������
		// -- : 1�� ���� ������
		
		num = 0;// ����!!!						//num = 0�̹Ƿ� ��� 1�� ���(���� X)
		num++;	//num = num + 1;		System.out.println(num+1);
		
		num++;	//num = num + 1;		System.out.println(num+1);
		
		num++;	//		System.out.println(num+1);
		
		num++;	//		System.out.println(num+1);
		
		num++;	//		System.out.println(num+1);

		
		System.out.println(num);
		
		/*
		 	�׷���... �����ڰ� �ڿ� �ִ�!
		 	~num	-num	!num 
		 	
		 	num++	������
		 	++num	������		 
		 
		 */
		num=0;
		++num;	//��
		++num;	//��
		num++;	//��
		num++;	//��
		num++;	//��

		System.out.println("���� ���� ������ : " + num);
		
		--num;
		--num;
		num--;
		--num;
		num--;
		--num;
		
		System.out.println("���� ���� ������ : " + num);
		
		//�شٸ� �������ϰ� ���� ������
		//������, �������� �� ���� ������ �޶�����.
		
		int result = 0;
		num = 0;
		
		//"��"����	: �ٸ� �����ڸ� �ϱ� "��"�� ��/�� ����
		result = ++num;	//num�� 1 ������Ű�� result�� ��������
		System.out.println("������ result : "+ result + "\tnum : " + num);
		num = 0;
		//"��"����	: �ٸ� �����ڸ� �� "��"�� ��/�� ����
		result = num++;	//num�� 1 ������Ű�� result�� ��������
		System.out.println("������ result : "+ result + "\tnum : " + num);
		
		int jump = 0;
		System.out.println("(��)�ѹ� ������. ���� Ƚ�� : "+ ++jump);
		
		jump = 0;
		System.out.println("(��)�ѹ� ������. ���� Ƚ�� : "+ jump++); //0���̶� ���, ram���� 1�� ����.
		
		System.out.println("jump + 1 : "+(jump+1));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
