package hashsetex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Lottoset2����ȣ {
	public static void main(String[] args) {
		
		
		HashSet<Integer> set = new HashSet<>();
		while(set.size()<6){
			int ran = (int)(Math.random()*45+1);
			set.add(ran);							//��ġ�°� �ִٸ� 6���� �� �ȳ���.
		}
		System.out.println("set�迭 : "+set);
		
		
		//#1. �ߺ��� ��ȣ�� ����ΰ�?
		//		���� add() ���� �� false�� �Ǹ� !�ɾ true�� �� ����
		//		ArrayList�� �߰��� ������ �ȴ�.
		//#2. �� ��ȸ �ݺ��ߴ�?
		
		//�÷��� -> �������̽� 	�÷���s -> Ŭ����
		
		//���� -> ����!	Collection"s" Ŭ��"��"
		//Collections.�޼���()
		
		ArrayList<Integer> list = new ArrayList<>(set);
		Collections.sort(list);	//()�ȿ� set������ ����	//0223 MathTest���� Ȯ���ϱ�.... �ߺ� ����..
		//The method sort(List<T>) in the type Collections is not applicable for the arguments (HashSet<Integer>)
/*		
		//��ü���� ����� ������
			Collection(�������̽�) �ڽ�-> List & Set	--����ȯ�� ���� List�� Set�� Collection���� �ٲٱ� ����.
			Set -> get(0),get(1) ���� �ȵȴ�..
		
*/		
	}
}
