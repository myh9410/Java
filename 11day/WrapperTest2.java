package wrapperex;
/*
	wrapper : �����ϴ�
	
		��ü��(�⺻������)	...�⺻�����͸� ��ü������ ����...	<--->	���� ��ü
													  boxing			un-boxing
				int						Integer			���嵵 ������.. ������ ���õ� �޼��嵵 ���� �ִ�.
				float					Float
				double					Double
				char					Character
				boolean					Boolean
				byte					Byte
 */
public class WrapperTest2 {
	
	public static void main(String[] args) {
		
		//10 -> �ؽ��ڵ尡 ���� �⺻�� -> �ؽ��ڵ尡 �ִ� ��ü������ �ٲٰ� �ʹ�
		Integer iObj = 10;	//�����ڰ� ����.
							
		//��ü
		int toInt = iObj;	//�ż��� ���� ��ü�ϰ� �ִ�.
		
		//10.1
			//����
		Double dObj = 10.1;
			//��ü
		double toDouble = dObj;	//��ü�� �⺻���� �� �ֳ�~~ doubleValue()�� �����Ǿ� �ִ�.
	}
}