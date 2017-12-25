package polymorphismex;
/*
	������
		polymorphism
		
		
		
 */

class Car{
	void run(){
		System.out.println("�޸���.");
	}
}
class PatrolCar extends Car{

	@Override
	void run() {		//ru ctrl spacebar --> override
		System.out.println("���������� �޸���.");
	}
}
class FireEngine extends Car{

	@Override
	void run() {
		System.out.println("�Ҳ��� �޸���");
	}
}
class Ambulance extends Car{

	@Override
	void run() {
		System.out.println("����ȯ�� �ư� �޸���.");
	}
}

public class PolymorphismTest {
	public static void main(String[] args) {
		//������ : �θ� = �ڽ�
		
		Car car = null;		//ctrl t ������ hierarchy(�θ� �ڽ�) ����
		//car.run();
		
		car = new Ambulance();
		car.run();		//�θ�(car)�� run �޼��带 �θ�..... �θ�(Car)�� run�� �ڽ�(Ambulance)�� run�� ����
						//car = new Ambulance()���� �ν��Ͻ��� �ڽ�(Ambulance)�̹Ƿ� �ڽĿ��� ã��.
		
						//����ȭ �Ǿ��ִ� car.run�� ã�ƾ��ϳ�... Ambulance.run�� ã�ƾ� �ϳ�...
						//c++������ car.run�� ã�� Java�� Ambulance�� �ִ� ��������� ���̴� run�� ã��.
		car = new PatrolCar();
		car.run();
		car = new FireEngine();
		car.run();
	}
}
