package hashsetex;

import java.util.ArrayList;
import java.util.HashSet;

public class Lottoset {
	public static void main(String[] args) {
	//	1~45 난수 6개 -> list
	//				  -> set
		
		ArrayList<Integer> listLotto = new ArrayList<>();
		HashSet<Integer> set = new HashSet<>();
		for (int i=0;i<6;i++){
			//난수를 한번만 발생시키자!
			int ran = (int)(Math.random()*45+1);	//한번만 발생시킨 난수를 set과 list에 똑같이 넣어준다.
			listLotto.add(ran);						//6개가 나옴
			set.add(ran);							//겹치는게 있다면 6개가 다 안나옴.
		}
		System.out.println("list계열 : "+listLotto);
		System.out.println("set계열 : "+set);
	}
}
