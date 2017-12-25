package hashsetex;

import java.util.ArrayList;
import java.util.HashSet;

/*
	ArrayList : 연달아 줄지어 있다. (번호, 중복허용)
	HashSet : 섞여 있다. (번호 없음, 중복 불허)
 */
public class HashSetTest {
	public static void main(String[] args) {
		int [] ar = {10,20,30,40,50,20,30,40};
		
		//ar에서 모든 데이터를 모아 놓고 싶다!
		
		//10~마지막	40까지 다 모아 놓겠다.		==>>ArrayList사용
		ArrayList<Integer> list = new ArrayList<>();
		HashSet<Integer> set = new HashSet<>();
		
		
		
		
		for (int tmp : ar){
			//tmp 값을 똑같이 넣는데... set계열은 이미 데이터 존재하면 빼버린다...add할때 false가 되버린다.
			list.add(tmp);
			set.add(tmp);
			System.out.println("list add 결과 : "+list.add(tmp));
			System.out.println("set add 결과 : "+set.add(tmp));
		}
		System.out.println("list 계열 : "+list);			//순서대로... 크레파스 통 속 크레파스
		System.out.println("list 계열 : "+list.size()+"개");
		
		
		
		
		//ar에서 겹치는 것 빼고, 순순하게 중복 배제된 값만 더하고 싶다!
		//				10,20,30,40,50	(20,30,40은 겹쳐있다.)
		System.out.println("set 계열 : "+set);				//집합... 순서 상관 없이 모여있음. 필통 속 크레파스
		System.out.println("set 계열 : "+set.size()+"개");
	}
	
}
