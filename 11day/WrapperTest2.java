package wrapperex;
/*
	wrapper : 포장하다
	
		객체형(기본데이터)	...기본데이터를 객체형으로 포장...	<--->	포장 해체
													  boxing			un-boxing
				int						Integer			포장도 하지만.. 정수와 관련된 메서드도 갖고 있다.
				float					Float
				double					Double
				char					Character
				boolean					Boolean
				byte					Byte
 */
public class WrapperTest2 {
	
	public static void main(String[] args) {
		
		//10 -> 해쉬코드가 없는 기본형 -> 해쉬코드가 있는 객체형으로 바꾸고 싶다
		Integer iObj = 10;	//생성자가 없다.
							
		//해체
		int toInt = iObj;	//매서드 없이 해체하고 있다.
		
		//10.1
			//포장
		Double dObj = 10.1;
			//해체
		double toDouble = dObj;	//객체를 기본형에 막 넣네~~ doubleValue()가 생략되어 있다.
	}
}