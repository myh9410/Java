package arrayex;

import javax.swing.JOptionPane;

/*
	한 반에 학생이 4명있다.
	국영수 시험을 본다.	(3과목)
	
	각 학생별 점수를 입력받고 출력해보자!

 */

public class ArrayTest6 {

	public static void main(String[] args) {
		int [][] arr = new int[4][3];
/*				
				arr.length		arr[0].length
				4개(명)			각 3과목씩
				arr[0] <= {국, 영, 수} 1번학생
				
								arr[1].length
	arr배열		arr[1] <= {국, 영, 수} 2번학생
	
								arr[2].length
				arr[2] <= {국, 영, 수} 3번학생
				arr[3] <= {국, 영, 수} 4번학생
		
*/		
		int []cs = new int[3];
		int []ms = new int[3];
		int []ys = new int[3];
		int []js = new int[3];
				
/*		int [][] myClass = {cs, ms, ys, js};
		int [] myClass []= {cs, ms, ys, js};
		int myClass [][]= {cs, ms, ys, js};           다 사용 가능   */
		int [][] myClass = {cs, ms, ys, js};
		
		
		
	}

}
