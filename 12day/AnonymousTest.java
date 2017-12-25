package anonymous;
/*		-상속-이라는 상황 하에 재정의 가능!!
	재정의 패턴!! 일반클래스, 추상, 인터페이스
					(옵션)		(필수)
 */
class Parent{
	void play(){
		System.out.println("장기");
	}
}
class Child extends Parent{
	@Override
	void play(){
		System.out.println("게임");
	}
	void play(int hourLimit){	//오버로딩(과적,중복) 관계
		System.out.println(hourLimit+"시간 동안만 게임한다!");
	}
}
public class AnonymousTest {
	public static void main(String[] args) {
		new Parent().play();
		Parent p = new Child();
		p.play();		//Parent의 p가 play를 호출하지만, 인스턴스가 Child이므로 Child.play()인 게임이 나옴.
		//게임을 하기 위해서 꼭 Child를 만들어야 했니?	-	기생시키자! 재정의 클래스
		Parent p2 = new Parent(){
			@Override
			void play() {
				System.out.println("낚시");
			}
			
		};
		//p2는 재정의된 메서드만  본다!!	장기는 아예 사라졌다해도 무방하다!
		p2.play();
	}
}
