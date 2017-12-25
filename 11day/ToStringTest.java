package objectex;

import java.util.Date;

/*
	Object Ŭ����
		toString() �޼��� : ???
 */
class Some /*extends Object*/{
	//�ν��Ͻ����� ������ �����Ѵ�.
	String name;
	int age;
	
	public Some(String name, int age) {
		this.name = name;
		this.age = age;
	}

//	@Override
//	public String toString() {
//		return this.name+",	"+age+"��";
//	}
	
}
public class ToStringTest {
	public static void main(String[] args) {
		Some some = new Some("ȫ",30);
		Some some2 = new Some("ȫ2",30);
		Some some3 = new Some("ȫ3",30);
		String str = some.toString();
		System.out.println(some.toString());
		//��°� : objectex.Some@15db9742 //objectex��� ��Ű�� �ȿ� Some�̶�� Ŭ������(@ : ~��) �ּҰ�(�ؽ��ڵ�)
		System.out.println(some); //���� .toString()�� ���� �ʾƵ�
								//�θ�κ��� �������� �޼��尡 �ڵ����� ����ȴ�.
		System.out.println(some2);
		System.out.println(some3);
		
		///////////////////////////////////////////////////////////////////////////////
		System.out.println(some.getClass());
		System.out.println(some.getClass().getName());
		System.out.println(some.getClass().getSimpleName());
		//Date��� Ŭ������ Ǯ ���� : java.util.Date
		//java.util.Date d = new java.util.Date();
		Date d = new Date();
		
		System.out.println(some.hashCode());//hashcode�� 10������
		
		int toDecimal = some.hashCode();
		
		//������ 16������ �ٲٱ� ���ؼ�
		String tohex = Integer.toHexString(toDecimal);
		System.out.println(toDecimal+"�� 16���� �� : "+tohex);
		
		
		System.out.println("���� ���� toString ��� : " + some.getClass().getName()+"@"+tohex);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
