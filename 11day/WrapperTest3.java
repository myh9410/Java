package wrapperex;
/*
	wrapper : �ڵ� ����, �ڵ� ��ü

 */
public class WrapperTest3 {
				//�Ű����� 4�� �ִ�.
	static void printData(int num, double data, String str, boolean bool){
		
	}
	static void printData(Object [] obj){
		//���� Ÿ���� �����ִ� ���ϱ�.. ����.. �����ϴ�.
		for(int i=0;i<obj.length;i++){
			
			//�� ��Ҹ��� � Ÿ������ üũ�ؾ��ϴ� ���ŷο��� �ִ�.
			if(obj[i] instanceof Boolean){
				
			}else if(obj[i] instanceof String){
				
			}else if(obj[i] instanceof Integer){
				
			}
		}
	}
	public static void main(String[] args) {
		
		//�پ��� �����͸� ������ ���� �ִ�.
		// �޼��忡 ��������!
		// 10, 5.6	"�ȳ�" true
		
		printData(10, 5.6, "�ȳ�", true);
		
		//���׵��� �ϳ��� ������ �����ϱ� ���ϰڴ�.
		//�迭�� ������ ����?		�Ұ���
		//double [] ar = {10, 5.6, "�ȳ�", true};
		
		Integer i = new Integer(10);
		Double d = new Double(5.6);
		String s = new String("�ȳ�");
		Boolean b = new Boolean(true);
		
		Object [] ar = {i, d, s, b};
		
		printData(ar);
	}
}