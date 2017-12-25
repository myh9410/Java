package forex;

import javax.swing.JOptionPane;

/*
	누적식 : 
	어떤 은행이 있다.
	예금을 맡기면 하루에 1원씩 이자가 붙는다.
		money
	5일 후에는 
		원금 ?? 현재 잔액 ???.... 라는 메세지 출력
	nDay일 후에는
		원금 ?? 현재 잔액 ???.... 라는 메세지 출력

*/
public class ForTest6 {
	public static void main(String[] args) {
		int money = Integer.parseInt(JOptionPane.showInputDialog("예금액 입력"));
		int nDay = Integer.parseInt(JOptionPane.showInputDialog("기간 입력"));
		int sum = money;
		for (int i =0; i<nDay; i++){
//		sum = sum + 1;		//1일
//		sum = sum + 1;		//2일
//		sum = sum + 1;		//3일
//		sum = sum + 1;		//4일
//		sum = sum + 1;		//5일
			sum+=1;
		}

		
		System.out.println("맡긴 금액 : "+money+"원	"+nDay+"일 후 금액 : " + sum + "원");
		
		
	}

}
