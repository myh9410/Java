package classex;
/*
	Ŭ���� �ȿ��� ������ ���� �� �ִ�. : �ν��Ͻ� ������ �Ѵ�.
	��? ���� �� �ְ� ������? - ���� ���� ����?
	
 */

//������ Ÿ���� �ϳ� ������(����)! � �𵨷�?
//�̸�, ����1, ����2~����5

//����� Ÿ��(Ŭ����)!
class StudentInfo{
	String name;
	int age;
	int kor;	int eng;	int math;	int pe;
	
}


public class InstanceVariable {
	
	public static void main(String[] args) {
		/*
			ö�� - "��ö��", 19��	��� �����͸� ����
			30,50,60,80 ����!	-	����4���� ���� �����͸� �����ϱ�� ������ - �迭 �̿�
		 */
		
		String name = "��ö��"; int nai = 19;
		int [] scores = {30,50,60,80};
		
		//3���� �����(2�� : ����, 1�� : �迭)�� ����!
		//				-> 6���� ������ ����
		//1���� ����Ҹ� �� �� ������?
		// type ö�� - {"��ö��", 19��  30,50,60,80 ����!};	<-- �迭ó�� ���� ������, Ÿ���� ���� �־..
		//	���� �̷� �������� Ÿ���� ����� ������...	
		
		//heap�� ���Ӱ� StudentInfo��� �޼��带 ����. <--�ν��Ͻ�!!!!
		//������ ram�� �ش� Ŭ������ byte��ŭ ����Ҹ� ����� ��
		//��ü = new StudentInfo();
		//��ü.��(������ �����) = ������;
		//Ÿ�� ���� = �ν��Ͻ�;
		// T	 V  =  new StudentInfo();
		StudentInfo	cs = new StudentInfo();
		StudentInfo yh = new StudentInfo();
		cs.name = "��ö��";
		cs.age = 19;
		cs.kor = 20;
		cs.eng = 30;
		cs.math = 40;
		cs.pe = 50;
		
		//�� ������ �ִ� ö���� �����͸� ����� ����!
		System.out.println("�̸� : " + cs.name);
		System.out.println("���� : " + cs.age);
		System.out.println("���� : " + cs.kor);
		System.out.println("���� : " + cs.eng);
		System.out.println("���� : " + cs.math);
		System.out.println("ü�� : " + cs.pe);
		int tot = 0;
		double avg = 0.0;
		tot = cs.kor + cs.eng + cs.math + cs.pe;
		avg = tot/4.0;
		System.out.println("���� : " + tot + "��");
		System.out.printf("��� : %.1f\n",avg);
		
		//����
		yh.name = "�迵��";
		yh.age = 19;
		yh.kor = 60;
		yh.eng = 70;
		yh.math = 80;
		yh.pe = 90;
		
		
		
		
		
		
		
		
		
		
	}

}
