package stringex;
/*
	String

		-�޼��� ã�ƾ���

				�� ������ Ư�� ��ȣ(����)�� �߶� �� �ִ�!
				���ڿ� �и� - split("�и��� ����")
 */
public class StringTest5 {
	
	public static void main(String[] args) {
		String name = "lee sun shin";
		
		String[] ar = name.split(" ");
		for (int i=0; i<ar.length; i++){
			System.out.println(ar[i]);
		}
	}
}
