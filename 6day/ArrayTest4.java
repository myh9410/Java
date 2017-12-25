package arrayex;

import javax.swing.JOptionPane;

/*
	배열 : length라는 변수
	
		배열.length => 해당 배열의 갯수를 알려준다.
		
	명시적 방법 : 데이터 없을 때 주로 사용
	암시적 방법 : 데이터 갖고 처음부터 초기화 해서 사용할 때	
		
		
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
		System.out.printf("총점 : %d	평균 : %.1f\n",sum, sum/(double)ar.length);
		
		
	}

}
