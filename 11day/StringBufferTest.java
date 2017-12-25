package stringbufferex;
/*
	문자열 관리하는 클래스 (StringBuffer == StringBuilder 거의 같은 클래스)
								구버전			신버전		의 차이!
								
	String은 상수로 문자열을 관리하기 때문에 문자열의 데이터가 바뀌지 않고
			새로운 문자열을 만들어 낸다.
	StringBuffer는 문자열을 heap에 보관시켜 놓는 변수이기 때문에...
			문자열 변경시, 자기 자신에게 문자열을 변경하게 된다.
			메모리가 효율적으로 사용된다.
 */
public class StringBufferTest {
	
	public static void main(String[] args) {
		String name = "lee";
		
		StringBuffer sbName = new StringBuffer("lee");
		
		name +="장군";
		System.out.println("String : "+name);
		//sbName +="장군";		//에러!!! 반드시 메서드로 처리한다!
		sbName.append("장군");
		System.out.println("스트링버퍼 : "+sbName);
		//String은 고정되어 있어서 신뢰도가 높다.
		//StringBuffer는 신뢰도가 낮지만 가변성이 뛰어남.
		
		
		//sbName을 확정해서 누군가의 제목같은걸로 쓰겠다.
		System.out.println(sbName.toString());	//StringBuffer ->String으로 고정시킨다!
		
	}

}
