package equalsex;
/*
	equals�� ������ �ؼ� ������!
 */
class Member{
	String id;
	int jumin;
	public Member(String id, int j) {
		super();	//ObjectŬ������ ��¡�Ѵ�.
		this.id = id;
		this.jumin = jumin;
	}
	//equals�� �������ؼ� �ֹι�ȣ�� �񱳽�Ű��!
}

public class EqualsTest2����ȣ {
	
	public static void main(String[] args) {
		Member mem1 = new Member("dog", 960223);
		Member mem2 = new Member("cat", 960223);
		if (mem1.equals(mem2)){
			System.out.println("���� ���(�ֹι�ȣ ����)�̶� ���� �Ұ�!!!");
		}else{
			System.out.println("�ٸ� ����̿���.. ���� �����ؿ�~~");
		}
		
	}
}
