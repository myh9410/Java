package objectex;

import java.util.Date;

/*
	Object 클래스
		toString() 메서드 : ???
 */
class Some /*extends Object*/{
	//인스턴스마다 데이터 보관한다.
	String name;
	int age;
	
	public Some(String name, int age) {
		this.name = name;
		this.age = age;
	}

//	@Override
//	public String toString() {
//		return this.name+",	"+age+"살";
//	}
	
}
public class ToStringTest {
	public static void main(String[] args) {
		Some some = new Some("홍",30);
		Some some2 = new Some("홍2",30);
		Some some3 = new Some("홍3",30);
		String str = some.toString();
		System.out.println(some.toString());
		//출력값 : objectex.Some@15db9742 //objectex라는 패키지 안에 Some이라는 클래스에(@ : ~에) 주소값(해쉬코드)
		System.out.println(some); //굳이 .toString()을 쓰지 않아도
								//부모로부터 물려받은 메서드가 자동으로 실행된다.
		System.out.println(some2);
		System.out.println(some3);
		
		///////////////////////////////////////////////////////////////////////////////
		System.out.println(some.getClass());
		System.out.println(some.getClass().getName());
		System.out.println(some.getClass().getSimpleName());
		//Date라는 클래스의 풀 네임 : java.util.Date
		//java.util.Date d = new java.util.Date();
		Date d = new Date();
		
		System.out.println(some.hashCode());//hashcode가 10진수임
		
		int toDecimal = some.hashCode();
		
		//정수를 16진수로 바꾸기 위해서
		String tohex = Integer.toHexString(toDecimal);
		System.out.println(toDecimal+"의 16진수 값 : "+tohex);
		
		
		System.out.println("내가 만든 toString 모양 : " + some.getClass().getName()+"@"+tohex);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
