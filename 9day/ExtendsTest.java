package extendsex;
/*
			  물려주는쪽			  물려받는쪽
				부모					 자식
				parent					 Child
				super****					 sub
			상위, 기초, 조상		하위, 파생, 자손(심화)
	직계만 물려받는다....
 */

class Parent{
	private int money = 5000;	//private걸면 Parent, Child 다 못씀
								//자식 카테고리에 있지만 접근은 못한다.
	int don = 1000;
	public Parent(){
		
	}
	public Parent(int money, int don) {
		super();
		this.money = money;
		this.don = don;
	}
}
class Child extends Parent{		//private은 상속이 되긴하나, 접근이 안됨.
								//private과 생성자는 접근 안됨.
	
}

public class ExtendsTest {
	
	public static void main(String[] args) {
		//System.out.println("부모 : "+new Parent().money);
		
		//System.out.println("자식 : "+new Child().money);
		
		System.out.println();
	}
}
