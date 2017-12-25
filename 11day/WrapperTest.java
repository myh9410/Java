package wrapperex;
/*
	wrapper : 자동 포장, 자동 해체
	
		객체형(기본데이터)	...기본데이터를 객체형으로 포장...	<--->	포장 해체
													  boxing			un-boxing
				int						Integer			포장도 하지만.. 정수와 관련된 메서드도 갖고 있다.
				float					Float
				double					Double
				char					Character
				boolean					Boolean
				byte					Byte
 */
public class WrapperTest {
	
	public static void main(String[] args) {
		
		//10 -> 해쉬코드가 없는 기본형 -> 해쉬코드가 있는 객체형으로 바꾸고 싶다
		Integer iObj = new Integer(10);		//포장하다 boxing
		
		//해체
		int toInt = iObj.intValue();
		
		//10.1
			//포장
		Double dObj = new Double(10.1);
			//해체
		double toDouble = dObj.doubleValue();
		//true
			//포장
		Boolean bObj = new Boolean(true);
			//해체
		boolean toBoolean = bObj.booleanValue();
		//10.1F
			//포장
		Float fObj = new Float(10.1F);
			//해체
		float tofloat = fObj.floatValue();
		//Long, short, byte (x) -> int로 사용한다.
		Long l = new Long(10L);
		Long toLong = l.longValue();
		System.out.println();
		
		
	}
	
}
