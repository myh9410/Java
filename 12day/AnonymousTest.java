package anonymous;
/*		-���-�̶�� ��Ȳ �Ͽ� ������ ����!!
	������ ����!! �Ϲ�Ŭ����, �߻�, �������̽�
					(�ɼ�)		(�ʼ�)
 */
class Parent{
	void play(){
		System.out.println("���");
	}
}
class Child extends Parent{
	@Override
	void play(){
		System.out.println("����");
	}
	void play(int hourLimit){	//�����ε�(����,�ߺ�) ����
		System.out.println(hourLimit+"�ð� ���ȸ� �����Ѵ�!");
	}
}
public class AnonymousTest {
	public static void main(String[] args) {
		new Parent().play();
		Parent p = new Child();
		p.play();		//Parent�� p�� play�� ȣ��������, �ν��Ͻ��� Child�̹Ƿ� Child.play()�� ������ ����.
		//������ �ϱ� ���ؼ� �� Child�� ������ �ߴ�?	-	�����Ű��! ������ Ŭ����
		Parent p2 = new Parent(){
			@Override
			void play() {
				System.out.println("����");
			}
			
		};
		//p2�� �����ǵ� �޼��常  ����!!	���� �ƿ� ��������ص� �����ϴ�!
		p2.play();
	}
}
