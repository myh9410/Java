package listex;
/*
	forEach : �÷��ǿ��� ����ϴ� for��
	
	�÷��� : �����Ͱ� ���ִ�...
		�迭~List,Set,Map���� ����Ѵ�.
	
	for(�ӽú��� : �÷���){
	
	}
	�ӽú��� : Ÿ�� �������� �� �÷��ǿ��� �ϳ��� ���� �� �� ���� 
				�� �����͸� �����ϴ� �뵵��	������ ������ �Ѵ�.
 */
public class VectorTest {
	public static void main(String[] args) {
		
		int [] ar = {10,20,30,40,50};	//ar�� �÷��� �ڸ���
		int tot = 0;
		//���� for��, "forEach", ������ loop ....
		for(int temp : ar){		//temp���� 10,20,30,40,50�� ���ʷ� ����
			System.out.println(temp);
			tot +=temp;
		}
		System.out.println(tot);
		
		String [] name = {"ȫ�浿","�̼���", "������"};
		for (String temp : name){
			System.out.println(temp);
		}
		
		
		
		
	}
}
