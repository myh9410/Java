package forex;
/*
	���ѷ��� : ������ ����.
	����	1. ó������ ���̴�.
			2. false�� �ȵȴ�.
*/
public class ForTest2 {
	public static void main(String[] args) {
		//for(int i = 0; i>=0; i+=4){
		//for�������� ���ǽ��� ���� �� ������ ���̴�.
		for(int i = 0; ; i+=4){
			System.out.println("���� �� : " + (i+1));
			
			//i�� 90�� �Ǹ� "Ż��"�ض�
			if (i>=90){		//�ٻ�ġ   i>=90
				System.out.println(i+1+"����~");
				break;	//�ݵ�� loop���̳� switch���� �Բ� ������ ��.
						//loop���̳� switch������ ���𰡸� ������ �ʹٸ� : return;���
			}
		}
		
		//System.out.println("�������� ����!!!");
	}

}
