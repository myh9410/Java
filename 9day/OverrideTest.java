package overrideex;
/*
	override : �Ⱒ�ϴ� - �����ϴ�!
 */
class Parent{					//�빮�� A,B,C �� ������ ���� �ʾƼ� �ҹ��� a,b,c�� �ް� ������
	void a(){
		System.out.println("A");
	}
	void b(){
		System.out.println("B");
	}
	void c(){
		System.out.println("C");
	}
}
class Child extends Parent{

	@Override		//alt shift s v		 a,b,c ctrl spacebar enter �� �θ� �� ����
	void a() {	
		System.out.println("�� �ҹ��� a");		//�θ����� �������� 3��, ���� �ٽ� ���� 3�� �� 6��
		//a();		��� ġ�� �ڽ��� ��� �ҷ�.. ����LOOP...�ϴٰ� �޸𸮰� ������ ������ ��.
					//���ȣ��			�θ� �θ��� ������ super.a();
	}

	@Override
	void b() {
		System.out.println("�� �ҹ��� b");
	}

	@Override
	void c() {
		System.out.println("�� �ҹ��� c");
	}
	
}
public class OverrideTest {
	public static void main(String[] args) {
		Child c = new Child();
		c.a();		//a�� �θ� �ڽĲ� �Ѵ� �ִµ�, ȣ���� �ڽĲ��� ȣ����.
		c.b();		//override(������)�� ���ִϱ� �����Ѱ�... ����ȭ
		c.c();
		// ȣ���ϸ� ������ �θ� �θ��� �Ǵµ�... �Ȱ��� �̸����� �ٽ� �������???
		// �θ� �θ��� ����, ���Ӱ� �ۼ��� �޼��带 ȣ������!(�׷��� �θ� ���ô��ϰ� �ִ� - ����ȭ)
	}
}
