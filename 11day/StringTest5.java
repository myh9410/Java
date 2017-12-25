package stringex;
/*
	String

		-메서드 찾아쓰기

				한 문장을 특정 기호(문자)로 잘라낼 수 있다!
				문자열 분리 - split("분리할 문자")
 */
public class StringTest5 {
	
	public static void main(String[] args) {
		String name = "lee sun shin";
		
		String[] ar = name.split(" ");
		for (int i=0; i<ar.length; i++){
			System.out.println(ar[i]);
		}
	}
}
