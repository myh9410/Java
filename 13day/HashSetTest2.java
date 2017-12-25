package hashsetex;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest2 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("이순신");
		set.add("김김김");
		set.add("이이이");
		set.add("박박박");
		set.add("문문문");
		set.add("한한한");
		
		//elements() : 열거자	Enumeration
		//Enumeration en = set.elements();
		//while(en.hasMoreElements()){	 //등록
		//		en.nextElements()		 //검사
		//}								 //추출
		//반복자
		Iterator <String> iter = set.iterator();	//Iterator "등록"
		while(iter.hasNext()){
			String tmp = iter.next();
			System.out.println(tmp);	//순서가 섞여있다... set계열의 특징.
		}
		
		set.add("문문문");
		iter = set.iterator();	//반복자를 다시 등록해서 처음으로 보낸 다음 하나씩 꺼내와야한다.
		while(iter.hasNext()){
			String tmp = iter.next();	//.next() -> 한번만 꺼내오자!
			System.out.println(tmp);	//순서가 섞여있다... set계열의 특징.
		}
			
		
		
		
		
		
		
	}

}
