package stringex;
/*
	String

		-�޼��� ã�ƾ���

				Ư�� ���ڿ��� �����س���!
 */
public class StringTest4 {
	
	public static void main(String[] args) {
		String name = "lee sun shin";
		
		//name���� lee�� ��������!
		
		String lastName = "";
		String irum = "";	//sun shin
		irum = name.substring(name.indexOf(" ")+1);
		System.out.println(irum);
		lastName = name.substring(0,name.indexOf(" "));	//3-0 3���� ������.	beginindex�� ����, endindex�� ����
		System.out.println(lastName);
		//substring(beginindex, endindex)
		//substring(beginindex)
	}
}
