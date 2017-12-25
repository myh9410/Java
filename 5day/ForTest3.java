package forex;

import javax.swing.JOptionPane;

/*
	이중for문 : for문 안에 for문이 존재.
	
	학교
		1반		2반		3반
		 1번	 1번	 1번
	 	 2번	 2번	 2번
		 3번	 3번	 3번
		 4번	 4번	 4번
	
	
	
*/
public class ForTest3 {
	public static void main(String[] args) {
		// for(int i=1; i<4; i++){
		// System.out.println("----"+i+"반"+"----");
		//// System.out.println(" "+1+"번----");
		//// System.out.println(" "+2+"번----");
		//// System.out.println(" "+3+"번----");
		//// System.out.println(" "+4+"번----");
		// for(int j = 1; j<5; j++){
		// System.out.println(" "+j+"번----");
		// }
		// }

		// 반 갯수도 모르고(입력받기)
		// 각 반의 인원 수는 10명이다.
		// #1.
		int classnum = Integer.parseInt(JOptionPane.showInputDialog("반의 갯수를 입력해라."));
		int cnt = 0;
		if (classnum != 0) {
			for (int i = 0; i < classnum; i++) {
				System.out.println("----" + (i + 1) + "반" + "----");

				for (int j = 0; j < 10; j++) {
					System.out.println("	" + j + "번----");
					cnt++;
				}
				System.out.println("================================");
			}
			System.out.println("입력된 반 갯수 : " + classnum + "개 반");
			System.out.println("전교 학생수(반*10명) : " + cnt + "명");
		}

		// #2. 10명씩 출력

	}

}
