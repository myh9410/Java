package stringex;
/*
	String

		-���ڿ� ����ϱ�
		
		-�޼��� ã�ƾ���
		-����
 */
public class StringTest2 {
	
	public static void main(String[] args) {
		//���ڿ� �ʱ�ȭ!
		String str = null; //��� ��������(Ŭ����)�� ��� null ���� �̿�!
		String str2 = "";  //String Ŭ������ "" �� ���ڿ��� �ʱ�ȭ�� ����!
		
		//�ʱ�ȭ �� ���ڿ��� �ϴ°� �����ϴ�.
		//str��	1~10���� ���ʷ� ����!
		//str2��	1~10���� ���ʷ� ����!
		for (int i=1;i<11;i++){
			str+=i;
			str2+=i;
		}
		
		System.out.println("null �ʱ�ȭ �� : "+str);	//null12345678910
		System.out.println("\"\" �ʱ�ȭ �� : "+str2);	//12345678910
		
		
		byte [] b = {48,49,50};		//48�� '0'�� ���� �ڵ尪!
		System.out.println((char)b[0]);
		System.out.println((char)b[1]);
		System.out.println((char)b[2]);

		b = new byte[]{65,66,67};
		System.out.println((char)b[0]);		//65�� �ش��ϴ� ���� 'A'�� ����.
		System.out.println((char)b[1]);
		System.out.println((char)b[2]);

		b = new byte[]{97,98,99};
		System.out.println((char)b[0]);		//65�� �ش��ϴ� ���� 'a'�� ����.
		System.out.println((char)b[1]);
		System.out.println((char)b[2]);
		
		System.out.println((int)'��');	//�����ڵ�(java) - 2byte
		System.out.println((int)'��');	//�ƽ�Ű�ڵ�(C) - 1byte
		System.out.println((int)'��');
		System.out.println((int)'��');
		System.out.println((int)'��');
		
		//�ڵ带 ���ڿ��� �е��� �ٲ���.
		String toStr = new String(b);
		System.out.println(toStr);
		
		
		char [] ch = {'h','e','l','l','o'};

		toStr = new String(ch);
		System.out.println(toStr);
		for(int i=0;i<toStr.length();i++){
			System.out.print(toStr.charAt(i)+"	");
		}
		
		
		
	}
}
