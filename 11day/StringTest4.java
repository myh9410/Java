package stringex;
/*
	String

		-메서드 찾아쓰기

				특정 문자열을 추출해내자!
 */
public class StringTest4 {
	
	public static void main(String[] args) {
		String name = "lee sun shin";
		
		//name에서 lee를 추출하자!
		
		String lastName = "";
		String irum = "";	//sun shin
		irum = name.substring(name.indexOf(" ")+1);
		System.out.println(irum);
		lastName = name.substring(0,name.indexOf(" "));	//3-0 3글자 가져옴.	beginindex는 포함, endindex는 제외
		System.out.println(lastName);
		//substring(beginindex, endindex)
		//substring(beginindex)
	}
}
