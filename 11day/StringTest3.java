package stringex;
/*
	String

		-메서드 찾아쓰기

		-과제
 */
public class StringTest3 {
	
	public static void main(String[] args) {
		
		String name = "lee sun shin";
		//			   0123456789	<--charAt(번호)
		
		//"s"의 위치가 어디지?	4 or 8번이 나온다.	=>결과는 4가 나옴.
		//int 변수 = name.위치찾는 메서드("s");
		int idx = name.indexOf("s");
		System.out.println("s의 위치 : "+idx);
		
		idx = name.indexOf("S");
		System.out.println("S의 위치 : "+idx);
		
		idx = name.lastIndexOf("s");	//마지막!!!
		System.out.println("마지막 s의 위치 : "+idx);	//8번값이 나오게 하자!
		
		////////////////////////////////////////////////////////////////////////////
		//#1. name에 hi가 포함되어 있니?
		System.out.println("hi가 있니? " + (name.contains("hi")?"어 있어":"아니 없어"));
		//#2. name에 sun을 soon으로 바꿔보자!
		System.out.println("soon으로 변경 : "+name.replace("sun", "soon"));
			//name은 바뀌지 않는다.	"sun"은 name내에서 상수같이 딱 고정되어 있음.
		name = name.replace("sun", "soon");	//replace시킨걸 name에 대입시켜주면 sun -> soon으로 바뀜.
		System.out.println("변경 후 name" + name);
		//#3. name의 글자수는?
		System.out.println("글자 수 : "+name.length()+"개");
		//#4. name을 대문자로 바꿔보자!
		System.out.println("대문자로 : "+name.toUpperCase());

		
		
		
		
		
		
		
	}
}
