package stringex;
/*
	String

		-문자열 사용하기
		
		-메서드 찾아쓰기
		-과제
 */
public class StringTest2 {
	
	public static void main(String[] args) {
		//문자열 초기화!
		String str = null; //모든 참조형들(클래스)은 모두 null 값을 이용!
		String str2 = "";  //String 클래스만 "" 빈 문자열로 초기화가 가능!
		
		//초기화 빈 문자열로 하는게 유리하다.
		//str에	1~10까지 차례로 누적!
		//str2에	1~10까지 차례로 누적!
		for (int i=1;i<11;i++){
			str+=i;
			str2+=i;
		}
		
		System.out.println("null 초기화 시 : "+str);	//null12345678910
		System.out.println("\"\" 초기화 시 : "+str2);	//12345678910
		
		
		byte [] b = {48,49,50};		//48은 '0'의 고유 코드값!
		System.out.println((char)b[0]);
		System.out.println((char)b[1]);
		System.out.println((char)b[2]);

		b = new byte[]{65,66,67};
		System.out.println((char)b[0]);		//65에 해당하는 문자 'A'가 나옴.
		System.out.println((char)b[1]);
		System.out.println((char)b[2]);

		b = new byte[]{97,98,99};
		System.out.println((char)b[0]);		//65에 해당하는 문자 'a'가 나옴.
		System.out.println((char)b[1]);
		System.out.println((char)b[2]);
		
		System.out.println((int)'ㄱ');	//유니코드(java) - 2byte
		System.out.println((int)'ㄲ');	//아스키코드(C) - 1byte
		System.out.println((int)'ㄳ');
		System.out.println((int)'ㄴ');
		System.out.println((int)'안');
		
		//코드를 문자열로 읽도록 바꿔줌.
		String toStr = new String(b);
		System.out.println(toStr);
		
		
		char [] ch = {'h','e','l','l','o'};

		toStr = new String(ch);
		System.out.println(toStr);
		for(int i=0;i<toStr.length();i++){
			System.out.print(toStr.charAt(i)+"	");
		}
		
		
		
	}
}
