package arrayex;

import javax.swing.JOptionPane;

/*
	�迭 : ���� �迭
		   ���� �迭
		   
		   -�迭�� ������ ���δ�!!!
		   
	��ִ�? 	* 	1���� �迭	   
		[]				[]			<--- 2���� �迭
		
		  [][][] : 3�����迭
		  [][][][] : 4�����迭
								..... �ִ� 256���� �迭���� ����.
											->�Ⱦ��� ����		1. ������ �������
																2. �޸� ���� ������ �� ����
																
		  [][][] : 3���� �迭���� �ַ� ���
		  �����
		  
		  new int[3][4] : 3�� 4��
		  new int[3][4][2] : 3�� 4�� 2�� �迭
		  new int[3][4][2][5] : 3�� 4�� 2�� 5�� �迭
		  
	1. ������ �迭 �����
		  2���� �迭 : 1���� �迭�� �� �ִ� ��!
		  		��(=��)		ȣ(=��)
		  	
		1��	:	0��			0��			1��			2��
		2��	:	1��			0��			1��			2��
		3��	:	2��			0��			1��			2��
		4��	:	3��			0��			1��			2��
		
		
				4����		�� ����		3�� ��(ĭ)�� �Ǿ� �־�~!
	
zoomit		
 */

public class ArrayTest5_1 {
	
	public static void main(String[] args) {
		
		int ar0[] = {10, 20, 30};	//{10,20,30}�� ���� �ּҰ��� ar0�� ������ ����.
		int ar1[] = {11, 21, 31};
		int ar2[] = {12, 22, 32};
		int ar3[] = {13, 23, 33};
		
		//4������ 3���� ĭ�� ������� �ִ�.
		//	arr
		
		
		//2���� �迭 : 4�� �� 	(�� ������) 3�� ĭ�� �����Ǿ� �ִ�.
		
		// ������ : arr = new int[4][3];
		
		int [][] arr = {
				{10, 20, 30},
				{11, 21, 31},
				{12, 22, 32},
				{13, 23, 33}
		};
		
		//int rowHap = 0;	//���� ��		���⿡ ����� �Ҹ�
		for (int i=0;i<4;i++){
			
			int rowHap = 0;	//���� ��	���⿡ ����� ����
			
			for (int j=0;j<3;j++){
				System.out.println(i+"��° ���(��) �߿� "+j+"��° ĭ: " + arr[i][j]);
				rowHap += arr[i][j];
			}
			System.out.println("�� �� : " + rowHap);
			System.out.println("-----------------------------");
		}
//		System.out.println(arr.length + "�� ���");
//		System.out.println("ù��° ��� : " + arr[0]);
//		System.out.println("ù��° ���(��) �߿� ù��° ĭ: " + arr[0][0]);
//		System.out.println("ù��° ���(��) �߿� �ι�° ĭ : " + arr[0][1]);
//		System.out.println("ù��° ���(��) �߿� ����° ĭ : " + arr[0][2]);
		
		
//		System.out.println("�ι�° ��� : " + arr[1]);
//		System.out.println("�ι�° ���(��) �߿� ù��° ĭ: " + arr[1][0]);
//		System.out.println("�ι�° ���(��) �߿� �ι�° ĭ : " + arr[1][1]);
//		System.out.println("�ι�° ���(��) �߿� ����° ĭ : " + arr[1][2]);
		
		
//		System.out.println("����° ��� : " + arr[2]);
//		System.out.println("����° ���(��) �߿� ù��° ĭ: " + arr[2][0]);
//		System.out.println("����° ���(��) �߿� �ι�° ĭ : " + arr[2][1]);
//		System.out.println("����° ���(��) �߿� ����° ĭ : " + arr[2][2]);
		
		
//		System.out.println("�׹�° ��� : " + arr[3]);
//		System.out.println("�׹�° ���(��) �߿� ù��° ĭ: " + arr[3][0]);
//		System.out.println("�׹�° ���(��) �߿� �ι�° ĭ : " + arr[3][1]);
//		System.out.println("�׹�° ���(��) �߿� ����° ĭ : " + arr[3][2]);
		
		
		
		
		
		
		
		
		
		
	}

}