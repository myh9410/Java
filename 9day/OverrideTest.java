package overrideex;
/*
	override : 기각하다 - 무시하다!
 */
class Parent{					//대문자 A,B,C 가 마음에 들지 않아서 소문자 a,b,c로 받고 싶을때
	void a(){
		System.out.println("A");
	}
	void b(){
		System.out.println("B");
	}
	void c(){
		System.out.println("C");
	}
}
class Child extends Parent{

	@Override		//alt shift s v		 a,b,c ctrl spacebar enter 로 부를 수 있음
	void a() {	
		System.out.println("나 소문자 a");		//부모한테 물려받은 3개, 내가 다시 만든 3개 총 6개
		//a();		라고 치면 자신을 계속 불러.. 무한LOOP...하다가 메모리가 꽉차면 오류가 뜸.
					//재귀호출			부모꺼 부르고 싶으면 super.a();
	}

	@Override
	void b() {
		System.out.println("나 소문자 b");
	}

	@Override
	void c() {
		System.out.println("나 소문자 c");
	}
	
}
public class OverrideTest {
	public static void main(String[] args) {
		Child c = new Child();
		c.a();		//a는 부모꺼 자식꺼 둘다 있는데, 호출은 자식꺼를 호출함.
		c.b();		//override(재정의)를 해주니까 무시한거... 은닉화
		c.c();
		// 호출하면 원래는 부모꺼 부르면 되는데... 똑같은 이름으로 다시 만들었네???
		// 부모꺼 부르지 말고, 새롭게 작성한 메서드를 호출하자!(그래서 부모껀 무시당하고 있다 - 은닉화)
	}
}
