package extendsex;
/*
			  �����ִ���			  �����޴���
				�θ�					 �ڽ�
				parent					 Child
				super****					 sub
			����, ����, ����		����, �Ļ�, �ڼ�(��ȭ)
	���踸 �����޴´�....
 */

class Parent{
	private int money = 5000;	//private�ɸ� Parent, Child �� ����
								//�ڽ� ī�װ��� ������ ������ ���Ѵ�.
	int don = 1000;
	public Parent(){
		
	}
	public Parent(int money, int don) {
		super();
		this.money = money;
		this.don = don;
	}
}
class Child extends Parent{		//private�� ����� �Ǳ��ϳ�, ������ �ȵ�.
								//private�� �����ڴ� ���� �ȵ�.
	
}

public class ExtendsTest {
	
	public static void main(String[] args) {
		//System.out.println("�θ� : "+new Parent().money);
		
		//System.out.println("�ڽ� : "+new Child().money);
		
		System.out.println();
	}
}
