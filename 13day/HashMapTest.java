package hashMapex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
	Map 구조
			A - B : 연결되어 있다.
			
		
		put(A,B)	A : key		B : Value
	
 */
public class HashMapTest {
	
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("ㅎㄱㄷ", 10);	//"ㅎㄱㄷ" => Key
		map.put("ㅎㄱㄹ", 20);	
		map.put("ㅎㄱㅁ", 30);	
		map.put("강감찬", 40);	
		map.put("이순신", 40);	
		map.put("ㅎㄱㅅ", 50);	
		
		//꺼내기 get(키)
		int tot =0;
		int score = map.get("ㅎㄱㄷ");	//get 정수값을 return받음.
		tot+=score;
		int score2 = map.get("ㅎㄱㄹ");
		tot+=score2;
		int score3 = map.get("ㅎㄱㅁ");
		tot+=score3;
		int score4 = map.get("이순신");
		tot+=score4;
		int score5 = map.get("ㅎㄱㅅ");
		tot+=score5;
		
		System.out.println("현재 맵구조 : "+map);
		System.out.println("현재 맵구조 : "+map.size()+"개");
		System.out.println(tot);
		
		//값의 중복!
		map.put("이순신", 80);
		System.out.println("중복 이후 맵 구조 : "+map);
		System.out.println("값 중복 이후 맵 구조 : "+map.size()+"개");
		
		// 똑같은 Key는 허용하지 않는다.(중복배체)  Key는 순서가 섞여 있다.	=> map의 키는 HashSet계열의 구조로 되어 있다!
		
		//map의 구조를 반복 구조로 꺼내보자!
		tot=0;
		//map에서 키만 별도로 꺼내오자 그 키는 Set의 구조다
		Set<String> ks = map.keySet();
		System.out.println(ks);	//key값만 모여있어
		Iterator<String> iter = ks.iterator();
		while (iter.hasNext()){
			String str = iter.next();
			int sc = map.get(str);	//<=value를 꺼내온다.
			tot+=sc;
			System.out.println(str+ " : "+sc+"점");
		}
		System.out.println("총점 : "+tot+"점");
		//int ㅎㄱㄷ = 10;	=> map구조
	}

}
