package stringex;
/*
	String
		-생성자
		-문자열구조
		-메서드 찾아쓰기
		-과제
 */
public class StringTest {
	public static void main(String[] args) {
		String str = "lee sun shin";
		String str2 = "lee sun shin";
		
		System.out.println("== 비교시(문자열 상수) : ");
		if(str==str2){
			System.out.println("같아요~");
		}else{
			System.out.println("달라요~");
		}
		
		String str3 = new String("lee sun shin");
		String str4 = new String("lee sun shin");
		
		System.out.println("== 비교시(생성자) : ");
		if(str3==str4){
			System.out.println("같아요");
		}else{
			System.out.println("달라요");
		}
		
		/*	==		:	 hashCode비교
			equals  :	 원래는 hashCode 비교인데... 얼마든지 재정의를 통해서 원하는 값 비교로 바꿀 수 있다.
		
			문자열의 equals는 무조건 내용을 비교하게끔 재정의 되어 있으니까.
								문자열 비교는 equals를 쓰자!!
		*/
		System.out.println("equals 비교시(생성자) : ");
		if(str3.equals(str4)){
			System.out.println("같아요");
		}else{
			System.out.println("달라요");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
