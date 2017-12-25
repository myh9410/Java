package innerex;
/*
	내부 클래스
		class A{
		}
		
		class B{
			A obj;	//내부에 obj를 통해  A의 메서드를 사용할 수 있다.
					//"포함된 객체"
			void m(){
				obj.메서드();
			}
		}
		
		#1. 인스턴스(해야 사용 하는) 클래스
		class B{		<= outer 클래스
			class A{	<= inner 클래스가 된다.  "인스턴스 내부 클래스"
			
			}
		}
		
		#2. 
		class B{
			void use(){
				class A{}	<= 로컬 내부 클래스
			}
		}
		#3.
		class B{
			class A{}
			static class C{}  <= static 내부 클래스
		}

		#4. 익명 클래스
		class B{
		
		
		}
		new B(){};		{}  ->  영역, body   "익명 클래스"
		
 */

/*
 		#1. 인스턴스 내부 클래스
 */
class Outer{
	
	//내부에 있어서  그냥  소문자로 클래스 이름을 사용했다.
	class inner{		//내부 클래스는  항상 외부클래스.내부클래스 로 사용하게 된다.
						//Outer.inner 
	}
	class inner2{}		//Outer.inner2		그냥 inner2  라고하면 에러다!
	class inner3{}		//Outer.inner3
}
class Outer2{
	class inner{}			//Outer2.inner  구분하기 위해서 사용한다.
	class inner2{}
}

class Outer3{
	
	int age=10;
	void m(){}
	
	class inner{
		int innerAge=20;
	}
}

public class InstanceInner {

	public static void main(String[] args) {
		Outer3 ob= new Outer3();
		System.out.println(ob.age);
		ob.m();
		
		
		Outer3.inner inn = ob.new inner(); 
		
		System.out.println(inn.innerAge);

	}

}