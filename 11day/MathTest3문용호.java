package mathex;
/*
	�ζ� 1~45����, 6���� ���ڸ� �����´�.
	#1. �ߺ�����
	#2. �������� �ʿ�
 */	
public class MathTest3����ȣ {
	static void distinct(int [] lotto){							//distinct = �ߺ� ����
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1);
		}
		
	}
	static void sort(int [] lotto){								//sort = descending, ascending
		/*
			int year = 2;
			int month = 2017;
			
			int temp;
			temp = year;
			year = month;
			month = temp;
			
		 */
		
		//�������� �����ؼ� ������� - �˰���(����, ����, �̺� ....)����<����<�̺�
		for (int i = 0; i < lotto.length; i++){
			System.out.println(lotto[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		
		int [] lotto = new int[6];
		
		distinct(lotto);
		
		sort(lotto);
		
		
		
		
		
		
		
	}
}
