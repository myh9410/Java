package hashsetex;

import java.util.ArrayList;
import java.util.HashSet;

public class Lottoset {
	public static void main(String[] args) {
	//	1~45 ���� 6�� -> list
	//				  -> set
		
		ArrayList<Integer> listLotto = new ArrayList<>();
		HashSet<Integer> set = new HashSet<>();
		for (int i=0;i<6;i++){
			//������ �ѹ��� �߻���Ű��!
			int ran = (int)(Math.random()*45+1);	//�ѹ��� �߻���Ų ������ set�� list�� �Ȱ��� �־��ش�.
			listLotto.add(ran);						//6���� ����
			set.add(ran);							//��ġ�°� �ִٸ� 6���� �� �ȳ���.
		}
		System.out.println("list�迭 : "+listLotto);
		System.out.println("set�迭 : "+set);
	}
}
