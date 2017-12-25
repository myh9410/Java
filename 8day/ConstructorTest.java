package constructorex;
/*
	constructor : 생성자(클래스의 인스턴스를 생성할 때 사용하는 메서드)
	
	new Scanner();			() : 생성자 메서드를 부르는 연산자!!
								 (새롭게 그 클래스의 인스턴스를 만들겠다.)
	new Car();
	
	new School();
	
	생성자 규칙
	1. 클래스는 항상 "기본(default) 생성자"를 갖고 있다.
		기본 생성자 : 매개변수가 없는 생성자!!
			new 클래스();	()안에 아무것도 없다! "기본생성자"를 호출하고 있다!
			
		굳이 생성자를 만들지 않고도 클래스를 인스턴스로 만들 수 있다.
				-> 자동으로 컴파일러가 생성자를 만들고 호출해 준대~
				
		"기본생성자는 자동으로 컴파일러가 만들어주고 호출해준다"

	2. 근데!!! 생성자를 한 클래스에 여러개 만들 수 있다(오버로딩)
		생성자를 직접 만들어 쓰게 되면.... 컴파일러는 기본 생성자를 없앤다.
		기본 생성자를 자동으로 만들어 주지 않기 때문에....
		직접 기본 생성자를 만들어 써야한다.
=========================================================================
 	생성자 만들기
 	1. 생성자의 목적 : 인스턴스를 만들어주는 것(기본 생성자 담당)
 	2.				   인스턴스를 만들 때 초기값도 넣어준다(인수 있는 생성자)
 	
 	3. private 멤버에 대해서 setter가 값을 넣었는데....
 		이제는 생성자로도 데이터를 넣을 수 있게 되었다.
 	   인스턴스를 만들 때부터 값을 넣을 수 있다.(초기값)
 	   
 	   int num;		num = new int;	
 	   
 	   num = 10;	num.setNum(10);
 	   num = 20;	num.setNum(20);
 	   ----------------------------
 	   int num = 10;		num = new int(10)	//생성자에 초기값이 들어있다.
							num.setNum(1000);
							num.setNum(11);
							
	4. 생성자
	
	   메서드 기본형에서
	   #1. return 타입이 없다
	   #2. 메서드 이름은 클래스 이름을 그대로 쓴다.
	   #3. 필요에 따라 매개변수가 없는것(기본 생성자) ~ 매개변수가 있는 생성자
	   		를 여러개 만들 수 있다.(오버로딩)
	   		
	   
	   class Member{
	   		//생성자를 만들어 보자!
	   		void 메서드()
	   		Member(){	//return타입 없으니까 void 제거
	   					//메서드 이름은 클래스 이름을 그대로 쓰므로 Member()
	   					//매개변수가 없으므로 기본 생성자 : 컴파일러가 알아서 기본 생성자를 만들어 주므로 
	   					// 기본 생성자를 없애도 상관없다.
	   					//결과 : class Member{}
	   		}
	   }
	   
	   
	    class Membership{
	   		private String name;
	   		private int age;
	   		private int weight;
	   		
	   		//기본 생성자를 사용할 거라면... 직접 만들어 줘야한다.
	   		// 왜? 인수 3개짜리 생성자가 있으니까!!!
	   		Membership(){}
	   		
	   		//생성자 매개변수 3개짜리 만들기
	   		Membership(String n, int a, int w){
	   			name = n;
	   			age = a;
	   			weight = w;		//라고 만드는 순간! 컴파일러가 기본 생성자를 안만들어주므로 Membership();가 에러뜸
	   		}
	   }
		
		class A{
			void main(){
			Membership mem1 = new Membership();	//class Membership에서 자동으로 기본 생성자를 만들어 줬으므로
												// 호출할 수 있음
			mem1.비즈니스("홍",12,15);		// <- 대입
			
			//생성자를 사용하면, 한줄로 넣을 수 있다. <-- 초기화!
			Membership mem2 = new Membership("이",18 13);//class Membership에서 생성자를 따로 만들어 줘야 함.
			
			}
		}
	
 */
class School{
	private String name;
	public School() {
	
	}
	School(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
public class ConstructorTest {
	
	public static void main(String[] args) {
		//대치 중학교
		School sc = new School();
		sc.setName("대치 중학교");
		System.out.println(sc.getName());
		
		School high = new School("상문 고등학교");
		System.out.println(high.getName());

	}

}
