package innerex;
/*
	내부 클래스를 왜 써야 하지?
		:	외부 데이터(변수, 메서드)를 내부에서 같이 공유할 수 있다.
 */
class Outer4{
	private static int number = 54321;
	int getNumbers(){
		return number;
	}
	class otherInner{
		int num = number;					//편리...내부에서 같이 공유할 수 있다..
	}
}
class Other{
	//int num = Outer4.number;	//공유해야될 것
	int num = new Outer4().getNumbers();	//복잡... private을 가져오기위해 Outer4에 있는 getter를 가져옴...
}
public class InstanceInner2 {

}
