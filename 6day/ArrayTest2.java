package arrayex;

import javax.swing.JOptionPane;

/*
	배열 : 데이터 처리
	
	철수가 6개 과목을 본다.
	각 점수를 입력받은 후
	총점/평균을 구해보자!
 */
public class ArrayTest2 {
	
	public static void main(String[] args) {
		int [] arr = new int[6];
		int sum = 0;
		for (int i=0; i<6; i++){
			arr[i] = Integer.parseInt(JOptionPane.showInputDialog(i+1+"번 과목"));
		}
//		arr[0] = Integer.parseInt(JOptionPane.showInputDialog("정수1 입력"));
//		arr[1] = Integer.parseInt(JOptionPane.showInputDialog("정수2 입력"));
//		arr[2] = Integer.parseInt(JOptionPane.showInputDialog("정수3 입력"));
//		arr[3] = Integer.parseInt(JOptionPane.showInputDialog("정수4 입력"));
//		arr[4] = Integer.parseInt(JOptionPane.showInputDialog("정수5 입력"));
//		arr[5] = Integer.parseInt(JOptionPane.showInputDialog("정수6 입력"));
		
		for (int i=0;i<6;i++){
			System.out.println(i+1+". "+arr[i]+"점");
			sum += arr[i];
		}
		System.out.println("총점 : " +sum+"점");
		System.out.printf("평균 : %.1f\n",sum/(double)6.0);
		
		
		
		
	}

}
