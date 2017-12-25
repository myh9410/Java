package hashsetex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Lottoset2문용호 {
	public static void main(String[] args) {
		
		
		HashSet<Integer> set = new HashSet<>();
		while(set.size()<6){
			int ran = (int)(Math.random()*45+1);
			set.add(ran);							//겹치는게 있다면 6개가 다 안나옴.
		}
		System.out.println("set계열 : "+set);
		
		
		//#1. 중복된 번호가 몇번인가?
		//		만약 add() 했을 때 false가 되면 !걸어서 true로 한 다음
		//		ArrayList에 추가해 놓으면 된다.
		//#2. 총 몇회 반복했니?
		
		//컬렉션 -> 인터페이스 	컬렉션s -> 클래스
		
		//순서 -> 정렬!	Collection"s" 클래"스"
		//Collections.메서드()
		
		ArrayList<Integer> list = new ArrayList<>(set);
		Collections.sort(list);	//()안에 set넣으면 에러	//0223 MathTest예제 확인하기.... 중복 정렬..
		//The method sort(List<T>) in the type Collections is not applicable for the arguments (HashSet<Integer>)
/*		
		//객체지향 언어의 다형성
			Collection(인터페이스) 자식-> List & Set	--형변환을 통한 List와 Set을 Collection으로 바꾸기 가능.
			Set -> get(0),get(1) 등이 안된다..
		
*/		
	}
}
