package innerex;
/*
	���� Ŭ����
		class A{
		}
		
		class B{
			A obj;	//���ο� obj�� ����  A�� �޼��带 ����� �� �ִ�.
					//"���Ե� ��ü"
			void m(){
				obj.�޼���();
			}
		}
		
		#1. �ν��Ͻ�(�ؾ� ��� �ϴ�) Ŭ����
		class B{		<= outer Ŭ����
			class A{	<= inner Ŭ������ �ȴ�.  "�ν��Ͻ� ���� Ŭ����"
			
			}
		}
		
		#2. 
		class B{
			void use(){
				class A{}	<= ���� ���� Ŭ����
			}
		}
		#3.
		class B{
			class A{}
			static class C{}  <= static ���� Ŭ����
		}

		#4. �͸� Ŭ����
		class B{
		
		
		}
		new B(){};		{}  ->  ����, body   "�͸� Ŭ����"
		
 */

/*
 		#1. �ν��Ͻ� ���� Ŭ����
 */
class Outer{
	
	//���ο� �־  �׳�  �ҹ��ڷ� Ŭ���� �̸��� ����ߴ�.
	class inner{		//���� Ŭ������  �׻� �ܺ�Ŭ����.����Ŭ���� �� ����ϰ� �ȴ�.
						//Outer.inner 
	}
	class inner2{}		//Outer.inner2		�׳� inner2  ����ϸ� ������!
	class inner3{}		//Outer.inner3
}
class Outer2{
	class inner{}			//Outer2.inner  �����ϱ� ���ؼ� ����Ѵ�.
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