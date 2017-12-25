package equalsex;
/*
	A == B			주로 기본형, 가끔 문자열("=="못씀)을 비교하기도 한다.
											-->equals() 써야함.
	
	
	A.equals(B) 	주로 객체를 비교, 문자열비교 할 때 사용!
	
	
 */
class Data{
	int value;
	public Data(int value) {
		this.value = value;
	}
	@Override
	public boolean equals(Object obj) {
								//obj는 아무나 다 대입받을 수 있다.
								//그러나 항상 Data로 형변환 할 수 있는 건 아니다.
								//오로지 obj에 Data타입의 객체가 왔을 때만.. Data로 형변환 할 수 있다.
								//그래서 형변환 전에 Data타입인지 물어볼 필요가 있다.
								//Data타입이 아니면... value를 물어볼 필요없이 무조건 false다!
								//instanceof 연산자! 	객체가 갖고 있는 타입을 체크할 때 사용하는 연산자!
		if (obj instanceof Data){
			return this.value	==	((Data)obj).value;	//object를 형변환 시켜서 명시적으로 되도록 함...
		}
		return false;
	}
}
public class EqualsTest {
	public static void main(String[] args) {
		Data d1 = new Data(3344);
		Data d2 = new Data(3344);
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println("해쉬코드 == 해쉬코드 : " + (d1 == d2));	//해쉬코드를 비교
		//equals 재정의 전에는 hashCode비교로 서로 false가 나왔는데...
		//equals를 재정의 했더니 value를 비교시켜줘서 true가 나오게 됐다!!
		System.out.println("equals 비교 : " + d1.equals(d2));	//해쉬코드를 비교
		System.out.println("==비교 : " + (d1.value == d2.value));
		//equals로 값을 비교하고 싶으면 override해버림
	}
}
