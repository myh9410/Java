package hashMapex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
	Map ����
			A - B : ����Ǿ� �ִ�.
			
		
		put(A,B)	A : key		B : Value
	
 */
public class HashMapTest {
	
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("������", 10);	//"������" => Key
		map.put("������", 20);	
		map.put("������", 30);	
		map.put("������", 40);	
		map.put("�̼���", 40);	
		map.put("������", 50);	
		
		//������ get(Ű)
		int tot =0;
		int score = map.get("������");	//get �������� return����.
		tot+=score;
		int score2 = map.get("������");
		tot+=score2;
		int score3 = map.get("������");
		tot+=score3;
		int score4 = map.get("�̼���");
		tot+=score4;
		int score5 = map.get("������");
		tot+=score5;
		
		System.out.println("���� �ʱ��� : "+map);
		System.out.println("���� �ʱ��� : "+map.size()+"��");
		System.out.println(tot);
		
		//���� �ߺ�!
		map.put("�̼���", 80);
		System.out.println("�ߺ� ���� �� ���� : "+map);
		System.out.println("�� �ߺ� ���� �� ���� : "+map.size()+"��");
		
		// �Ȱ��� Key�� ������� �ʴ´�.(�ߺ���ü)  Key�� ������ ���� �ִ�.	=> map�� Ű�� HashSet�迭�� ������ �Ǿ� �ִ�!
		
		//map�� ������ �ݺ� ������ ��������!
		tot=0;
		//map���� Ű�� ������ �������� �� Ű�� Set�� ������
		Set<String> ks = map.keySet();
		System.out.println(ks);	//key���� ���־�
		Iterator<String> iter = ks.iterator();
		while (iter.hasNext()){
			String str = iter.next();
			int sc = map.get(str);	//<=value�� �����´�.
			tot+=sc;
			System.out.println(str+ " : "+sc+"��");
		}
		System.out.println("���� : "+tot+"��");
		//int ������ = 10;	=> map����
	}

}
