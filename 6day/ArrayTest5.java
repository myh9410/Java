package arrayex;

import javax.swing.JOptionPane;

/*
	배열 : 이중 배열
		   다중 배열
		   
		   -배열이 층층이 쌓인다!!!
		   
	몇개있니? 	* 	1차원 배열	   
		[]				[]			<--- 2차원 배열
		
		  [][][] : 3차원배열
		  [][][][] : 4차원배열
								..... 최대 256차원 배열까지 가능.
											->안쓰는 이유		1. 관리가 어려워서
																2. 메모리 낭비가 심해질 수 있음
																
		  [][][] : 3차원 배열까지 주로 사용
		  면행렬
		  
		  new int[3][4] : 3행 4열
		  new int[3][4][2] : 3면 4행 2열 배열
		  new int[3][4][2][5] : 3의 4면 2행 5열 배열
		  
	1. 다차원 배열 만들기
		  2차원 배열 : 1차원 배열이 모여 있는 것!
		  		층(=행)		호(=열)
		  	
		1층	:	0행			0열			1열			2열
		2층	:	1행			0열			1열			2열
		3층	:	2행			0열			1열			2열
		4층	:	3행			0열			1열			2열
		
		
				4개행		각 행은		3개 열(칸)씩 되어 있어~!
	
zoomit		
 */

public class ArrayTest5 {
	
	public static void main(String[] args) {
		
		int ar0[] = {10, 20, 30};	//{10,20,30}에 대한 주소값을 ar0가 가지고 있음.
		int ar1[] = {11, 21, 31};
		int ar2[] = {12, 22, 32};
		int ar3[] = {13, 23, 33};
		
		//4개층에 3개씩 칸이 만들어져 있다.
		//	arr
		
		
		//2차원 배열 : 4개 층 	(각 층마다) 3개 칸씩 구성되어 있다.
		
		// 명시적 : arr = new int[4][3];
		
		int [][] arr = {
				{10, 20, 30},
				{11, 21, 31},
				{12, 22, 32},
				{13, 23, 33}
		};
		for (int i=0;i<4;i++){
			for (int j=0;j<3;j++)
				System.out.println("arr["+ i + "][" + j + "]" + " = " + arr[i][j]);
		}
		
//		System.out.println(arr.length + "개 요소");
//		System.out.println("첫번째 요소 : " + arr[0]);
//		System.out.println("첫번째 요소(층) 중에 첫번째 칸: " + arr[0][0]);
//		System.out.println("첫번째 요소(층) 중에 두번째 칸 : " + arr[0][1]);
//		System.out.println("첫번째 요소(층) 중에 세번째 칸 : " + arr[0][2]);
		
		
//		System.out.println("두번째 요소 : " + arr[1]);
//		System.out.println("두번째 요소(층) 중에 첫번째 칸: " + arr[1][0]);
//		System.out.println("두번째 요소(층) 중에 두번째 칸 : " + arr[1][1]);
//		System.out.println("두번째 요소(층) 중에 세번째 칸 : " + arr[1][2]);
		
		
//		System.out.println("세번째 요소 : " + arr[2]);
//		System.out.println("세번째 요소(층) 중에 첫번째 칸: " + arr[2][0]);
//		System.out.println("세번째 요소(층) 중에 두번째 칸 : " + arr[2][1]);
//		System.out.println("세번째 요소(층) 중에 세번째 칸 : " + arr[2][2]);
		
		
//		System.out.println("네번째 요소 : " + arr[3]);
//		System.out.println("네번째 요소(층) 중에 첫번째 칸: " + arr[3][0]);
//		System.out.println("네번째 요소(층) 중에 두번째 칸 : " + arr[3][1]);
//		System.out.println("네번째 요소(층) 중에 세번째 칸 : " + arr[3][2]);
		
		
		
		
		
		
		
		
		
		
	}

}
