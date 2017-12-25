package equalsex;
/*
	A == B			�ַ� �⺻��, ���� ���ڿ�("=="����)�� ���ϱ⵵ �Ѵ�.
											-->equals() �����.
	
	
	A.equals(B) 	�ַ� ��ü�� ��, ���ڿ��� �� �� ���!
	
	
 */
class Data{
	int value;
	public Data(int value) {
		this.value = value;
	}
	@Override
	public boolean equals(Object obj) {
								//obj�� �ƹ��� �� ���Թ��� �� �ִ�.
								//�׷��� �׻� Data�� ����ȯ �� �� �ִ� �� �ƴϴ�.
								//������ obj�� DataŸ���� ��ü�� ���� ����.. Data�� ����ȯ �� �� �ִ�.
								//�׷��� ����ȯ ���� DataŸ������ ��� �ʿ䰡 �ִ�.
								//DataŸ���� �ƴϸ�... value�� ��� �ʿ���� ������ false��!
								//instanceof ������! 	��ü�� ���� �ִ� Ÿ���� üũ�� �� ����ϴ� ������!
		if (obj instanceof Data){
			return this.value	==	((Data)obj).value;	//object�� ����ȯ ���Ѽ� ��������� �ǵ��� ��...
		}
		return false;
	}
}
public class EqualsTest {
	public static void main(String[] args) {
		Data d1 = new Data(3344);
		Data d2 = new Data(3344);
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println("�ؽ��ڵ� == �ؽ��ڵ� : " + (d1 == d2));	//�ؽ��ڵ带 ��
		//equals ������ ������ hashCode�񱳷� ���� false�� ���Դµ�...
		//equals�� ������ �ߴ��� value�� �񱳽����༭ true�� ������ �ƴ�!!
		System.out.println("equals �� : " + d1.equals(d2));	//�ؽ��ڵ带 ��
		System.out.println("==�� : " + (d1.value == d2.value));
		//equals�� ���� ���ϰ� ������ override�ع���
	}
}
