package stringex;
/*
	String

		-�޼��� ã�ƾ���

				�� ������ Ư�� ��ȣ(����)�� �߶� �� �ִ�!
				���ڿ� �и� - split("�и��� ����")
 */
public class StringTest6 {
	
	public static void main(String[] args) {
		int sum=0; 
		int toInt = 0;
		String scores = "10,20,30,40,50,61";
		//�� �����͸� ���ϱ� ����, ","�� �и��ؾ߰ڴ�.
		// {"10","20","30", ......}
		
		//[0],[1],[2] ... �� ���ڿ����� �迭����
		// �ϳ��� ��������! ������ ������ ������ ���ؼ� ���������� �Ľ��ؾ߰ڴ�.
		// �� �Ŀ� ������ �����͸� �����ϸ� �ȴ�.!!!
		String[] scr = scores.split(",");
		for (int i=0;i<scr.length;i++){			//scr.length�� scores�� split�� ���ڿ��迭 scr�� ����!!!
			toInt = Integer.parseInt(scr[i]);	//.trim() ������ ���� �� ������ �����ش�.... 10, 20�̶�� �ع�����
												// ,�� �����ϸ� ������ ���Ƽ� �Ľ��� ���ϴ°� ��������.
			sum += toInt;
		}
		System.out.println(sum);
		System.out.printf("%.1f\n", (double)sum/scr.length);
	}
}
