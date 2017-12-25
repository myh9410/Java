package listex;

import java.util.Enumeration;
import java.util.Vector;

/*
	Vector		ArrayList
	������		�Ź���
																							 �ε���
	   add(��ü)		<<������ ���� ���� �� add()���  										0
	   add(��ü)		<<������ ���� ���� �� add()���											1
	   add(��ü)		<<������ ���� ���� �� add()��� ������ ���� ������ index ����			2
	   add(��ü)		<<������ ���� ���� �� add()���											3
	   add(��ü)		<<������ ���� ���� �� add()���											4
	   
	   	
	   	get(0)	-> ó���� �־��� ��ü�� �� �� �ִ�.
	   	get(1)	-> �ι�° �־��� ��ü�� �� �� �ִ�.
	   	get(3)
	   	
	   	size() : ���� �÷��ǿ� �ִ� ������ ������ �� �� �ִ�.
	   	
	   	for(int i=0)
	   		get(i) ����
	
		Vector<E> : <E> - ���ʸ�
							E �κп� Ŭ������ �ִµ�
							  �ϳ��� Ŭ������ ������ ������
							  ������ �� Ÿ�Ը� ���� �Ѵ�.
							���ʸ��� ������ �� �ִ�.(object�� ����)
													 ��� �����Ͱ� �� �� �� �ִ�...(������)
		ArrayLost<String>	-	���ڿ��� �� �� ����.
							
 */
public class VectorTest3 {
	public static void main(String[] args) {
		//10, 20, 30, 40
		Vector<Integer> vec = new Vector<>();
		
		//�����̸� �� ������(���)�� ����! :  add(���)
		vec.add(10);
		vec.add(20);
		vec.add(30);
		vec.add(40);
		
		//� �ִ�?
		System.out.println(vec.size()+"��");
		
		
		//�ѹ� ����?
		System.out.println(vec);
		
		//�ϳ��� ���� ����?
		System.out.println(vec.get(0));
		System.out.println(vec.get(1));
		System.out.println(vec.get(2));
		System.out.println(vec.get(3));
		
		//������ ����?
		int tot=0;
		for(int i=0;i<vec.size();i++)
			tot+=vec.get(i);
		System.out.println(tot);
		
		//#2.������ ����?
		tot = 0;
		for(int score : vec)
			tot += score;
		System.out.println(tot);
		
		
		System.out.println("==========================================================");
		//for��, forEach
		//Enumeration �������̽� : ������! (�� �ִ� �����͸� ��~ ������, ���ĳ�!)
		//  ������ ��ü�� �ϳ� ���� ������ �ִ� �÷����� �ϳ��� ������!
		// # ��� : �÷����� �������� �־�!
		//			elements()
		// # �˻� : ��� �������� ���� Ȯ���� ����!  �� �ִ�? ->true | false
		//			hasMoreElements()
		// # ���� : true��? ������
		//			nextElement()
		Enumeration<Integer> en = vec.elements();
		tot =0;
		while(en.hasMoreElements()){
			int tmp = en.nextElement();
//			System.out.println(en.nextElement());	//10�����				30�����			������ 60 �����
//			tot += en.nextElement();				//20�� tot�� ������		40�� tot�� ������	��°� : 10,30,60
			System.out.println(tmp);
			tot += tmp;
		}
		System.out.println(tot);
			
	}
}
