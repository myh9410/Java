package anonymous;
abstract class Car{		//abstract��� Ű����� �̿ϼ����� �˷���...
	abstract void run();
}
//���� Ŭ������ ���� �����ǵ� �ϰ�,, �ٸ� �޼��嵵 �پ��ϰ� ����Ѵ�.
//������ ����������... ���������� ������ �� �ִ�.
public class CarMain {
	public static void main(String[] args) {
		//Car car = new Car();	//Car()����	-	�̿ϼ��̱� ������ �ν��Ͻ�ȭ(��üȭ)��ų �� ����
		Car car = null;
		
		//�͸�Ŭ���� - ��ü��� �ִ�. �ٷ� ���� �������� �����ϰ� �޼��带 ����� �� �ִ�.
		//�ٵ� �ٸ����� ����Ϸ��� �ٽ� �����ǰ� �Ź� �ʿ��ϴ�
		car = new Car(){
			//������
			@Override
			void run() {
				System.out.println("���������� ���ϴ�.");
			}
		};
	}
}
