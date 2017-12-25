package anonymous;
abstract class Car{		//abstract라는 키워드는 미완성임을 알려줌...
	abstract void run();
}
//하위 클래스를 만들어서 재정의도 하고,, 다른 메서드도 다양하게 사용한다.
//절차는 복잡하지만... 여러군데서 공유할 수 있다.
public class CarMain {
	public static void main(String[] args) {
		//Car car = new Car();	//Car()에러	-	미완성이기 때문에 인스턴스화(실체화)시킬 수 없음
		Car car = null;
		
		//익명클래스 - 즉시성이 있다. 바로 여러 절차없이 간단하게 메서드를 사용할 수 있다.
		//근데 다른데서 사용하려면 다시 재정의가 매번 필요하다
		car = new Car(){
			//순찰차
			@Override
			void run() {
				System.out.println("도둑잡으러 갑니다.");
			}
		};
	}
}
