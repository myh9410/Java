package arrayex;

import javax.swing.JOptionPane;

/*
	�迭 : length��� ����
	
		�迭.length => �ش� �迭�� ������ �˷��ش�.
		
	����� ��� : ������ ���� �� �ַ� ���
	�Ͻ��� ��� : ������ ���� ó������ �ʱ�ȭ �ؼ� ����� ��	
		
		
 */

public class ArrayTest4 {
	
	public static void main(String[] args) {
		int [] arr = new int [30000];
		int [] ar = {1,23,53,435,19,38,490,3289,2,51,32,4};
		System.out.println(ar.length);
		int sum = 0;
		for (int i=0; i< ar.length; i++){
			sum += ar[i];
			System.out.println(ar[i]);
		}
		System.out.printf("���� : %d	��� : %.1f\n",sum, sum/(double)ar.length);
		
		
	}

}
