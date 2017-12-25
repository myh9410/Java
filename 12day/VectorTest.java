package listex;
/*
	forEach : 컬렉션에서 사용하는 for문
	
	컬렉션 : 데이터가 모여있는...
		배열~List,Set,Map등이 사용한다.
	
	for(임시변수 : 컬렉션){
	
	}
	임시변수 : 타입 변수만들 때 컬렉션에서 하나씩 꺼내 올 때 마다 
				그 데이터를 저장하는 용도로	변수를 만들어야 한다.
 */
public class VectorTest {
	public static void main(String[] args) {
		
		int [] ar = {10,20,30,40,50};	//ar이 컬렉션 자리로
		int tot = 0;
		//빠른 for문, "forEach", 개선된 loop ....
		for(int temp : ar){		//temp에는 10,20,30,40,50이 차례로 들어옴
			System.out.println(temp);
			tot +=temp;
		}
		System.out.println(tot);
		
		String [] name = {"홍길동","이순신", "김유신"};
		for (String temp : name){
			System.out.println(temp);
		}
		
		
		
		
	}
}
