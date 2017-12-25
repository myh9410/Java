package arrayex;

import javax.swing.JOptionPane;

/*
	한 반에 학생이 4명있다.
	국영수 시험을 본다.	(3과목)
	
	각 학생별 점수를 입력받고 출력(총점 / 평균)해보자!

 */

public class ArrayTest6_1 {

	public static void main(String[] args) {
		// 학생 입력받고, 3과목 점수(0~100) 입력받기
		// 이중 for문으로 배열 불러오고 int [][] arr = new int[i][j];
		int [][] arr = new int[4][3];
/*		
		arr[0][0] = Integer.parseInt(JOptionPane.showInputDialog("1번 학생 1번 과목 점수 입력"));
		arr[0][1] = Integer.parseInt(JOptionPane.showInputDialog("1번 학생 2번 과목 점수 입력"));
		arr[0][2] = Integer.parseInt(JOptionPane.showInputDialog("1번 학생 3번 과목 점수 입력"));

		arr[1][0] = Integer.parseInt(JOptionPane.showInputDialog("2번 학생 1번 과목 점수 입력"));
		arr[1][1] = Integer.parseInt(JOptionPane.showInputDialog("2번 학생 2번 과목 점수 입력"));
		arr[1][2] = Integer.parseInt(JOptionPane.showInputDialog("2번 학생 3번 과목 점수 입력"));
		
		arr[2][0] = Integer.parseInt(JOptionPane.showInputDialog("3번 학생 1번 과목 점수 입력"));
		arr[2][1] = Integer.parseInt(JOptionPane.showInputDialog("3번 학생 2번 과목 점수 입력"));
		arr[2][2] = Integer.parseInt(JOptionPane.showInputDialog("3번 학생 3번 과목 점수 입력"));
		
		arr[3][0] = Integer.parseInt(JOptionPane.showInputDialog("4번 학생 1번 과목 점수 입력"));
		arr[3][1] = Integer.parseInt(JOptionPane.showInputDialog("4번 학생 2번 과목 점수 입력"));
		arr[3][2] = Integer.parseInt(JOptionPane.showInputDialog("4번 학생 3번 과목 점수 입력"));
*/
		int hakSum[] = new int [4];	//4명 총점을 저장하는 저장소를 만들어 놓자!
		for (int i=0; i<4; i++){
			for (int j=0; j<arr[i].length; j++){	//j : 학생수별 과목번호
				arr[i][j] =  Integer.parseInt(JOptionPane.showInputDialog(i+1+"번 학생 "+(j+1)+"번 과목 점수 입력"));
				hakSum[i] += arr[i][j];
				//출력
				
			}
		}
		System.out.println("====출력하기====");
		System.out.println("국어\t영어\t수학\t총점");
		for(int i=0; i<arr.length;i++){//학생별로
			for(int j=0; j<arr[i].length; j++){//각 과목점수
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println(hakSum[i]);
		}
		
		
		
	}

}
