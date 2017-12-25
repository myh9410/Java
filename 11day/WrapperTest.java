package wrapperex;
/*
	wrapper : �ڵ� ����, �ڵ� ��ü
	
		��ü��(�⺻������)	...�⺻�����͸� ��ü������ ����...	<--->	���� ��ü
													  boxing			un-boxing
				int						Integer			���嵵 ������.. ������ ���õ� �޼��嵵 ���� �ִ�.
				float					Float
				double					Double
				char					Character
				boolean					Boolean
				byte					Byte
 */
public class WrapperTest {
	
	public static void main(String[] args) {
		
		//10 -> �ؽ��ڵ尡 ���� �⺻�� -> �ؽ��ڵ尡 �ִ� ��ü������ �ٲٰ� �ʹ�
		Integer iObj = new Integer(10);		//�����ϴ� boxing
		
		//��ü
		int toInt = iObj.intValue();
		
		//10.1
			//����
		Double dObj = new Double(10.1);
			//��ü
		double toDouble = dObj.doubleValue();
		//true
			//����
		Boolean bObj = new Boolean(true);
			//��ü
		boolean toBoolean = bObj.booleanValue();
		//10.1F
			//����
		Float fObj = new Float(10.1F);
			//��ü
		float tofloat = fObj.floatValue();
		//Long, short, byte (x) -> int�� ����Ѵ�.
		Long l = new Long(10L);
		Long toLong = l.longValue();
		System.out.println();
		
		
	}
	
}
