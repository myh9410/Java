package variableex;

public class VariableTest {

	public static void main(String [] args){
		//���� ����
		int a = 0;	//����⸸ �ϰ� �ʱ�ȭ�� �ȵƴ�.
		int b = 0;
		int c = 0;	//�ʱ�ȭ�� �ص־� ����ȭ�� �ȴ�.
		
		//���ذ�, ������ - ������ �Ʒ� ��ȣ

		double d = 0.0;
		
		boolean isPower = false;	//�⺻��
		
		char ch = '\u0000';	
		char ch2 = ' ';	//���� Ȭ����ǥ�� �ݵ�� ��ĭ�� �־�� �Ѵ�.
		
		String name = null;
		String name2 = "";	//��� �ǰ�, ���Ƶ� �ȴ�.
		
		System.out.println("a : "+a);
		
		//���� �Է��� ����
		a = 10;
		b = 20;
		c = 30;
		
		//����� ���� "�ʱ�ȭ:initialize"
		int hap = a+b+c;	//������ ����鼭���� ���� �ְ� �ִ�.
		System.out.println("��� : "+hap);

	}
	
}
