package equalsex;
/*
	equals를 재정의 해서 비교하자!
 */
class Member{
	String id;
	int jumin;
	public Member(String id, int j) {
		super();	//Object클래스를 상징한다.
		this.id = id;
		this.jumin = jumin;
	}
	//equals를 재정의해서 주민번호를 비교시키자!
}

public class EqualsTest2문용호 {
	
	public static void main(String[] args) {
		Member mem1 = new Member("dog", 960223);
		Member mem2 = new Member("cat", 960223);
		if (mem1.equals(mem2)){
			System.out.println("같은 사람(주민번호 동일)이라 가입 불가!!!");
		}else{
			System.out.println("다른 사람이에요.. 가입 가능해요~~");
		}
		
	}
}
