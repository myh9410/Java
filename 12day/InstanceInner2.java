package innerex;
/*
	���� Ŭ������ �� ��� ����?
		:	�ܺ� ������(����, �޼���)�� ���ο��� ���� ������ �� �ִ�.
 */
class Outer4{
	private static int number = 54321;
	int getNumbers(){
		return number;
	}
	class otherInner{
		int num = number;					//��...���ο��� ���� ������ �� �ִ�..
	}
}
class Other{
	//int num = Outer4.number;	//�����ؾߵ� ��
	int num = new Outer4().getNumbers();	//����... private�� ������������ Outer4�� �ִ� getter�� ������...
}
public class InstanceInner2 {

}
