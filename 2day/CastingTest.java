package castex;
/*
  �ڵ� ����ȯ
  1)byte short char�� ������ ���� int������ �ٲ��.
  
  
  */

public class CastingTest {
	
	public static void main(String[] args) {
		
		// 1) byte short char�� ������ ���� int������ �ٲ��.
		//		int���� ���� �������� �ӵ� ������ ���ؼ� �׳� int�� ����!
		//byte b = 128;
		byte b1 = 10;
		byte b2 = 1;	//short�� �Ȱ���.
		System.out.println(b1+b2);
		
		//byte result = b1+ b2; //��ġ�� 11�ε�....byte b1 �� b2�� ������. -> int�� �ٲ�
		int result = b1+ b2;
		System.out.println(result);
		
		
		// 2) ���� �ٸ� Ÿ�Գ��� ������ �� ū Ÿ������ ���� ����.
		
		System.out.println(10 / 3);   //������� 3���� ����.
		System.out.println(10 / 3.0); //������� 3.333...���� ����.
		
		//Ÿ�� ���� = 5 / 3.0;
		double var = 5 / 3.0;
		System.out.println(var);
		
		//printf( A  ,  B)
		//		���� ,������
		//		 %f  , var
		System.out.printf("%f\n",var); // �׻� �Ҽ��� 6�ڸ������� �������.
									   // �Ҽ��� ������ �ݿø�.
		//%f ���̿� .�ڸ����� ���ָ� ���ϴ� ��ŭ �ڸ����� ���´�.
		// ���ڸ� : %.1f
		// ���ڸ� : %.2f
		// ���ڸ� : %.4f
		// ���ڸ� : %.10f
		System.out.printf("�Ҽ��� : %.1f\n",var);
		System.out.printf("�Ҽ��� : %.2f\n",var);
		System.out.printf("�Ҽ��� : %.5f\n",var);
		

/*
 	���� ����ȯ
 */
		System.out.println("===============================================");
		System.out.println("���� ����ȯ");
		
		byte b3 = 5;
		byte b4 = 6;
		
		//byte bResult = b3 + b4; //�ڵ� ����ȯ�� ���ؼ� int�� �ٲ�
		//������ �켱 ����
		//��Ģ���� (+,-,*,/)���� ����ȯ�� �����Ѵ�.
		//byte bResult = (byte)b3 + b4; // b3�� ����Ʈ�� �ٲٰ� b4�� ��ħ ==> �ٽ� �ڵ� ����ȯ 
		byte bResult = (byte) (b3 + b4); // ������ �����ϰ� ���� ����ȯ���� ����Ʈ�� �ٲ���.
		
		
		
		
		
		
		
		
		
		
		
	}

}
