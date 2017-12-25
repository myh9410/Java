package listex;

import java.util.Enumeration;
import java.util.Vector;

/*
	Vector		ArrayList
	구버전		신버전
																							 인덱스
	   add(객체)		<<데이터 집어 넣을 때 add()사용  										0
	   add(객체)		<<데이터 집어 넣을 때 add()사용											1
	   add(객체)		<<데이터 집어 넣을 때 add()사용 데이터 넣을 때마다 index 생성			2
	   add(객체)		<<데이터 집어 넣을 때 add()사용											3
	   add(객체)		<<데이터 집어 넣을 때 add()사용											4
	   
	   	
	   	get(0)	-> 처음에 넣었던 객체를 볼 수 있다.
	   	get(1)	-> 두번째 넣었던 객체를 볼 수 있다.
	   	get(3)
	   	
	   	size() : 현재 컬렉션에 있는 데이터 갯수를 볼 수 있다.
	   	
	   	for(int i=0)
	   		get(i) 가능
	
		Vector<E> : <E> - 제너릭
							E 부분에 클래스를 넣는데
							  하나의 클래스를 지정해 놓으면
							  무조건 그 타입만 들어가야 한다.
							제너릭을 생략할 수 있다.(object로 간주)
													 모든 데이터가 다 들어갈 수 있다...(다형성)
		ArrayLost<String>	-	문자열만 들어갈 수 있음.
							
 */
public class VectorTest3 {
	public static void main(String[] args) {
		//10, 20, 30, 40
		Vector<Integer> vec = new Vector<>();
		
		//가방이름 에 데이터(요소)를 넣자! :  add(요소)
		vec.add(10);
		vec.add(20);
		vec.add(30);
		vec.add(40);
		
		//몇개 있니?
		System.out.println(vec.size()+"개");
		
		
		//한번 볼까?
		System.out.println(vec);
		
		//하나씩 꺼내 볼까?
		System.out.println(vec.get(0));
		System.out.println(vec.get(1));
		System.out.println(vec.get(2));
		System.out.println(vec.get(3));
		
		//누적해 볼까?
		int tot=0;
		for(int i=0;i<vec.size();i++)
			tot+=vec.get(i);
		System.out.println(tot);
		
		//#2.누적해 볼까?
		tot = 0;
		for(int score : vec)
			tot += score;
		System.out.println(tot);
		
		
		System.out.println("==========================================================");
		//for문, forEach
		//Enumeration 인터페이스 : 열거자! (모여 있는 데이터를 쭉~ 열거해, 펼쳐놔!)
		//  열거자 객체를 하나 만들어서 펼쳐져 있는 컬렉션을 하나씩 꺼내와!
		// # 등록 : 컬렉션을 열거형에 넣어!
		//			elements()
		// # 검사 : 계속 가져올지 말지 확인해 보자!  또 있니? ->true | false
		//			hasMoreElements()
		// # 추출 : true야? 꺼내와
		//			nextElement()
		Enumeration<Integer> en = vec.elements();
		tot =0;
		while(en.hasMoreElements()){
			int tmp = en.nextElement();
//			System.out.println(en.nextElement());	//10출력해				30출력해			누적값 60 출력해
//			tot += en.nextElement();				//20을 tot에 누적해		40을 tot에 누적해	출력값 : 10,30,60
			System.out.println(tmp);
			tot += tmp;
		}
		System.out.println(tot);
			
	}
}
