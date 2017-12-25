package polymorphismex;
/*
	다형성
		polymorphism
		
		
		
 */

class Car{
	void run(){
		System.out.println("달린다.");
	}
}
class PatrolCar extends Car{

	@Override
	void run() {		//ru ctrl spacebar --> override
		System.out.println("도둑잡으러 달린다.");
	}
}
class FireEngine extends Car{

	@Override
	void run() {
		System.out.println("불끄러 달린다");
	}
}
class Ambulance extends Car{

	@Override
	void run() {
		System.out.println("응급환자 싣고 달린다.");
	}
}

public class PolymorphismTest {
	public static void main(String[] args) {
		//다형성 : 부모 = 자식
		
		Car car = null;		//ctrl t 누르면 hierarchy(부모 자식) 보임
		//car.run();
		
		car = new Ambulance();
		car.run();		//부모(car)가 run 메서드를 부름..... 부모(Car)의 run과 자식(Ambulance)의 run이 있음
						//car = new Ambulance()에서 인스턴스가 자식(Ambulance)이므로 자식에서 찾음.
		
						//은닉화 되어있는 car.run을 찾아야하나... Ambulance.run을 찾아야 하나...
						//c++에서는 car.run을 찾음 Java는 Ambulance에 있는 명시적으로 보이는 run을 찾음.
		car = new PatrolCar();
		car.run();
		car = new FireEngine();
		car.run();
	}
}
