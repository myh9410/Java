package hashsetex;

import java.util.ArrayList;
import java.util.HashSet;

/*
	ArrayList : ���޾� ������ �ִ�. (��ȣ, �ߺ����)
	HashSet : ���� �ִ�. (��ȣ ����, �ߺ� ����)
 */
public class HashSetTest {
	public static void main(String[] args) {
		int [] ar = {10,20,30,40,50,20,30,40};
		
		//ar���� ��� �����͸� ��� ���� �ʹ�!
		
		//10~������	40���� �� ��� ���ڴ�.		==>>ArrayList���
		ArrayList<Integer> list = new ArrayList<>();
		HashSet<Integer> set = new HashSet<>();
		
		
		
		
		for (int tmp : ar){
			//tmp ���� �Ȱ��� �ִµ�... set�迭�� �̹� ������ �����ϸ� ��������...add�Ҷ� false�� �ǹ�����.
			list.add(tmp);
			set.add(tmp);
			System.out.println("list add ��� : "+list.add(tmp));
			System.out.println("set add ��� : "+set.add(tmp));
		}
		System.out.println("list �迭 : "+list);			//�������... ũ���Ľ� �� �� ũ���Ľ�
		System.out.println("list �迭 : "+list.size()+"��");
		
		
		
		
		//ar���� ��ġ�� �� ����, �����ϰ� �ߺ� ������ ���� ���ϰ� �ʹ�!
		//				10,20,30,40,50	(20,30,40�� �����ִ�.)
		System.out.println("set �迭 : "+set);				//����... ���� ��� ���� ������. ���� �� ũ���Ľ�
		System.out.println("set �迭 : "+set.size()+"��");
	}
	
}
