package stringex;
/*
	String

		-�޼��� ã�ƾ���

		-����
 */
public class StringTest3 {
	
	public static void main(String[] args) {
		
		String name = "lee sun shin";
		//			   0123456789	<--charAt(��ȣ)
		
		//"s"�� ��ġ�� �����?	4 or 8���� ���´�.	=>����� 4�� ����.
		//int ���� = name.��ġã�� �޼���("s");
		int idx = name.indexOf("s");
		System.out.println("s�� ��ġ : "+idx);
		
		idx = name.indexOf("S");
		System.out.println("S�� ��ġ : "+idx);
		
		idx = name.lastIndexOf("s");	//������!!!
		System.out.println("������ s�� ��ġ : "+idx);	//8������ ������ ����!
		
		////////////////////////////////////////////////////////////////////////////
		//#1. name�� hi�� ���ԵǾ� �ִ�?
		System.out.println("hi�� �ִ�? " + (name.contains("hi")?"�� �־�":"�ƴ� ����"));
		//#2. name�� sun�� soon���� �ٲ㺸��!
		System.out.println("soon���� ���� : "+name.replace("sun", "soon"));
			//name�� �ٲ��� �ʴ´�.	"sun"�� name������ ������� �� �����Ǿ� ����.
		name = name.replace("sun", "soon");	//replace��Ų�� name�� ���Խ����ָ� sun -> soon���� �ٲ�.
		System.out.println("���� �� name" + name);
		//#3. name�� ���ڼ���?
		System.out.println("���� �� : "+name.length()+"��");
		//#4. name�� �빮�ڷ� �ٲ㺸��!
		System.out.println("�빮�ڷ� : "+name.toUpperCase());

		
		
		
		
		
		
		
	}
}
