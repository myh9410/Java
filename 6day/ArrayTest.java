package arrayex;
/*
	�迭 ����� / �ʱ�ȭ / �ϰ�ó��
 */
public class ArrayTest {
	
	public static void main(String[] args) {
		//ö���� ������ �ô�
		// ���� : 45,46,47,48 4����!!!
		//�迭�� ����! -> ����/��� ���ϱⰡ ��������.
			//1.����� ����� : �迭 ����� -> �� ���� �θ���, ������ ����
		int [] ar = new int[4];
		ar[0] = 45;
		ar[1] = 46;
		ar[2] = 47;
		ar[3] = 48;
		
		int sum =0;
		
//		sum += ar[0];
//		sum += ar[1];
//		sum += ar[2];
//		sum += ar[3];
		for (int i = 0; i<4; i++){
			System.out.println(ar[i]+"��");
			sum += ar[i];
		}
		System.out.println("����� ��� >> ���� : " + sum + "��");
		System.out.println("/////////////////////////////////");
			//2.�Ͻ��� �����
		int [] ar2 = {45,46,47,48};
		int sum2 = 0;
		
		for (int i = 0; i<4; i++){
			System.out.println(ar2[i] + "��");
			sum2 += ar2[i];
		}
		System.out.println("�Ͻ��� ��� >> ���� : " + sum2 + "��");
		System.out.println("/////////////////////////////////");
			//3. ����� + �Ͻ��� �����
		ar = new int[]{40,41,42,43};
		int sum3 = 0;
		
		for (int i = 0; i<4; i++){
			System.out.println(ar[i] + "��");
			sum3 += ar[i];
		}
		System.out.println("����� + �Ͻ��� ��� >> ���� : " + sum3 + "��");
		System.out.println("/////////////////////////////////");
		
	}

}
