import java.util.Arrays;

/**
 *	델타 사용하기 
 */
public class Z04_연습문제1 {
	public static void main(String[] args) {
		int [][] a = new int[5][5];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = i*5+j;
			}
		}
		
		//출력
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
		System.out.println();
		
/*
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				//a[i][j]칸에 상하좌우 차이의 절댓값을 합하자
//				int sum = 0;
				if (i-1 >= 0) {// a[i][j], a[i-1][j] 상
					int diff = Math.abs(a[i][j] - a[i-1][j]);
					sum+=diff;
				}
				if (i+1 < a.length) {// 하
					int diff = Math.abs(a[i][j] - a[i+1][j]);
					sum+=diff;
				}
				if (j-1 >= 0) {// 좌
					int diff = Math.abs(a[i][j] - a[i][j-1]);
					sum+=diff;
				}
				if (j+1 < a.length) {// 우
					int diff = Math.abs(a[i][j] - a[i][j+1]);
					sum+=diff;
				}
				위의 if반복문들을 델타를 사용해서 간략화할 수 잇음
//				System.out.printf("%2d ",sum);
			}
//			System.out.println();
		}
		System.out.println(sum);
 */
//코드는 짧아지지만, 위에보다 비효율적(시간 증가)
		System.out.println("--------------------델타 이용----------------------");
		int [] dr = {-1,1,0,0};
		int [] dc = {0,0,-1,1};
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
//				int total = 0;
				for (int k = 0; k < dc.length; k++) {
					if (i+dr[k] < 0 || i+dr[k]>=a.length || j+dc[k] < 0 || j+dc[k] >=a[i].length) {
						continue;
					}
					int diff = Math.abs(a[i+dr[k]][j+dc[k]] - a[i][j]);
					total+=diff;
				}
//				System.out.printf("%2d ", total);
			}
//			System.out.println();
		}
		System.out.println(total);
/*필터링 방법
 * 010
 * 111
 * 010 모양의 3x3 이차원배열을 이용하여 각 위치에 맞는 원소들끼리 곱해주는 방법도 있음
 * 
 * 주변 전부 0으로 처리해서 6x6으로 만들어주고 [1,1]부터 값을 넣어주면 if문으로 index out of range 조건 안물어봐도 됨.
 * 시간 감소, 메모리 증가
 * 
 * if떡칠 + 테두리가 제일 빠른듯
 */

	}
}
