package stringbufferex;
/*
	���ڿ� �����ϴ� Ŭ���� (StringBuffer == StringBuilder ���� ���� Ŭ����)
								������			�Ź���		�� ����!
								
	String�� ����� ���ڿ��� �����ϱ� ������ ���ڿ��� �����Ͱ� �ٲ��� �ʰ�
			���ο� ���ڿ��� ����� ����.
	StringBuffer�� ���ڿ��� heap�� �������� ���� �����̱� ������...
			���ڿ� �����, �ڱ� �ڽſ��� ���ڿ��� �����ϰ� �ȴ�.
			�޸𸮰� ȿ�������� ���ȴ�.
 */
public class StringBufferTest {
	
	public static void main(String[] args) {
		String name = "lee";
		
		StringBuffer sbName = new StringBuffer("lee");
		
		name +="�屺";
		System.out.println("String : "+name);
		//sbName +="�屺";		//����!!! �ݵ�� �޼���� ó���Ѵ�!
		sbName.append("�屺");
		System.out.println("��Ʈ������ : "+sbName);
		//String�� �����Ǿ� �־ �ŷڵ��� ����.
		//StringBuffer�� �ŷڵ��� ������ �������� �پ.
		
		
		//sbName�� Ȯ���ؼ� �������� �������ɷ� ���ڴ�.
		System.out.println(sbName.toString());	//StringBuffer ->String���� ������Ų��!
		
	}

}
