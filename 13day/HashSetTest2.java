package hashsetex;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest2 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("�̼���");
		set.add("����");
		set.add("������");
		set.add("�ڹڹ�");
		set.add("������");
		set.add("������");
		
		//elements() : ������	Enumeration
		//Enumeration en = set.elements();
		//while(en.hasMoreElements()){	 //���
		//		en.nextElements()		 //�˻�
		//}								 //����
		//�ݺ���
		Iterator <String> iter = set.iterator();	//Iterator "���"
		while(iter.hasNext()){
			String tmp = iter.next();
			System.out.println(tmp);	//������ �����ִ�... set�迭�� Ư¡.
		}
		
		set.add("������");
		iter = set.iterator();	//�ݺ��ڸ� �ٽ� ����ؼ� ó������ ���� ���� �ϳ��� �����;��Ѵ�.
		while(iter.hasNext()){
			String tmp = iter.next();	//.next() -> �ѹ��� ��������!
			System.out.println(tmp);	//������ �����ִ�... set�迭�� Ư¡.
		}
			
		
		
		
		
		
		
	}

}
