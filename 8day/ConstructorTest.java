package constructorex;
/*
	constructor : ������(Ŭ������ �ν��Ͻ��� ������ �� ����ϴ� �޼���)
	
	new Scanner();			() : ������ �޼��带 �θ��� ������!!
								 (���Ӱ� �� Ŭ������ �ν��Ͻ��� ����ڴ�.)
	new Car();
	
	new School();
	
	������ ��Ģ
	1. Ŭ������ �׻� "�⺻(default) ������"�� ���� �ִ�.
		�⺻ ������ : �Ű������� ���� ������!!
			new Ŭ����();	()�ȿ� �ƹ��͵� ����! "�⺻������"�� ȣ���ϰ� �ִ�!
			
		���� �����ڸ� ������ �ʰ� Ŭ������ �ν��Ͻ��� ���� �� �ִ�.
				-> �ڵ����� �����Ϸ��� �����ڸ� ����� ȣ���� �ش�~
				
		"�⺻�����ڴ� �ڵ����� �����Ϸ��� ������ְ� ȣ�����ش�"

	2. �ٵ�!!! �����ڸ� �� Ŭ������ ������ ���� �� �ִ�(�����ε�)
		�����ڸ� ���� ����� ���� �Ǹ�.... �����Ϸ��� �⺻ �����ڸ� ���ش�.
		�⺻ �����ڸ� �ڵ����� ����� ���� �ʱ� ������....
		���� �⺻ �����ڸ� ����� ����Ѵ�.
=========================================================================
 	������ �����
 	1. �������� ���� : �ν��Ͻ��� ������ִ� ��(�⺻ ������ ���)
 	2.				   �ν��Ͻ��� ���� �� �ʱⰪ�� �־��ش�(�μ� �ִ� ������)
 	
 	3. private ����� ���ؼ� setter�� ���� �־��µ�....
 		������ �����ڷε� �����͸� ���� �� �ְ� �Ǿ���.
 	   �ν��Ͻ��� ���� ������ ���� ���� �� �ִ�.(�ʱⰪ)
 	   
 	   int num;		num = new int;	
 	   
 	   num = 10;	num.setNum(10);
 	   num = 20;	num.setNum(20);
 	   ----------------------------
 	   int num = 10;		num = new int(10)	//�����ڿ� �ʱⰪ�� ����ִ�.
							num.setNum(1000);
							num.setNum(11);
							
	4. ������
	
	   �޼��� �⺻������
	   #1. return Ÿ���� ����
	   #2. �޼��� �̸��� Ŭ���� �̸��� �״�� ����.
	   #3. �ʿ信 ���� �Ű������� ���°�(�⺻ ������) ~ �Ű������� �ִ� ������
	   		�� ������ ���� �� �ִ�.(�����ε�)
	   		
	   
	   class Member{
	   		//�����ڸ� ����� ����!
	   		void �޼���()
	   		Member(){	//returnŸ�� �����ϱ� void ����
	   					//�޼��� �̸��� Ŭ���� �̸��� �״�� ���Ƿ� Member()
	   					//�Ű������� �����Ƿ� �⺻ ������ : �����Ϸ��� �˾Ƽ� �⺻ �����ڸ� ����� �ֹǷ� 
	   					// �⺻ �����ڸ� ���ֵ� �������.
	   					//��� : class Member{}
	   		}
	   }
	   
	   
	    class Membership{
	   		private String name;
	   		private int age;
	   		private int weight;
	   		
	   		//�⺻ �����ڸ� ����� �Ŷ��... ���� ����� ����Ѵ�.
	   		// ��? �μ� 3��¥�� �����ڰ� �����ϱ�!!!
	   		Membership(){}
	   		
	   		//������ �Ű����� 3��¥�� �����
	   		Membership(String n, int a, int w){
	   			name = n;
	   			age = a;
	   			weight = w;		//��� ����� ����! �����Ϸ��� �⺻ �����ڸ� �ȸ�����ֹǷ� Membership();�� ������
	   		}
	   }
		
		class A{
			void main(){
			Membership mem1 = new Membership();	//class Membership���� �ڵ����� �⺻ �����ڸ� ����� �����Ƿ�
												// ȣ���� �� ����
			mem1.����Ͻ�("ȫ",12,15);		// <- ����
			
			//�����ڸ� ����ϸ�, ���ٷ� ���� �� �ִ�. <-- �ʱ�ȭ!
			Membership mem2 = new Membership("��",18 13);//class Membership���� �����ڸ� ���� ����� ��� ��.
			
			}
		}
	
 */
class School{
	private String name;
	public School() {
	
	}
	School(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
public class ConstructorTest {
	
	public static void main(String[] args) {
		//��ġ ���б�
		School sc = new School();
		sc.setName("��ġ ���б�");
		System.out.println(sc.getName());
		
		School high = new School("�� ����б�");
		System.out.println(high.getName());

	}

}
