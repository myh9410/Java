package variableex;
/*
	����, �޼���, Ŭ���� �̸� ���� ��Ģ
	
	1. ������ �� �ִ� �ܾ�� ��������!
	
	2. ������ �ҹ���, �޼��嵵 �ҹ���
	   Ŭ������ �빮�ڷ� ����.	(��Ģ-�����ִ°� ����, ������ �ƴϴ�)
	   
	3. �� �տ� ���ڰ� ���� ����!
	   �߰��� ������ �־ ����!
	   Ư�����ڰ� �־ ����!
	   ($ �� _ �� ����� �� �ִ�)
	   Ű���带 �̸����� ����ϸ� ����
	   
	4. �빮�ڿ� �ҹ��ڴ� ���� �ٸ� �ܾ��̴�.
		Max	 ��  max
	
	ö���� ������ ����.
	4���� ������ ����.			���� ���� ���� ����
	���� 0~100�������� ������    80   90   70   60
	�� �������� ������ �����
	������ ���ؼ� ���غ���!
	
	������ a,b,c,d�� �������� ���� ���� = kor ���� = eng �̷�������...
	
	
	
*/
public class VariableTest2 {

	public static void main(String [] args){
		//�ڵ� ���� : ���� ���� �� �Է� -> ó�� -> ���
		String name = "ö��";				//�Է�
		int kor = 80;
		int eng = 90;
		int math = 70;
		int music = 60;
		
		int �հ� = kor+eng+math+music;		//ó��
		int avg = �հ�/4;
		
		System.out.println("�̸� : "+name);	//���
		System.out.println("���� : "+kor+"��");
		System.out.println("���� : "+eng+"��");
		System.out.println("���� : "+math+"��");
		System.out.println("���� : "+music+"��");
		System.out.println("���� : "+�հ�+"��");
		System.out.println("��� : "+avg+"��");
		
	}
	
}
