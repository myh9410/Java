package stringex;
/*
	String
		-������
		-���ڿ�����
		-�޼��� ã�ƾ���
		-����
 */
public class StringTest {
	public static void main(String[] args) {
		String str = "lee sun shin";
		String str2 = "lee sun shin";
		
		System.out.println("== �񱳽�(���ڿ� ���) : ");
		if(str==str2){
			System.out.println("���ƿ�~");
		}else{
			System.out.println("�޶��~");
		}
		
		String str3 = new String("lee sun shin");
		String str4 = new String("lee sun shin");
		
		System.out.println("== �񱳽�(������) : ");
		if(str3==str4){
			System.out.println("���ƿ�");
		}else{
			System.out.println("�޶��");
		}
		
		/*	==		:	 hashCode��
			equals  :	 ������ hashCode ���ε�... �󸶵��� �����Ǹ� ���ؼ� ���ϴ� �� �񱳷� �ٲ� �� �ִ�.
		
			���ڿ��� equals�� ������ ������ ���ϰԲ� ������ �Ǿ� �����ϱ�.
								���ڿ� �񱳴� equals�� ����!!
		*/
		System.out.println("equals �񱳽�(������) : ");
		if(str3.equals(str4)){
			System.out.println("���ƿ�");
		}else{
			System.out.println("�޶��");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
