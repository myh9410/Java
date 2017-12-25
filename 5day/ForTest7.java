package forex;

import javax.swing.JOptionPane;

/*
	누적식 : 
	어떤 은행이 있다.
	예금을 맡기면 
	첫째날에는 1원	둘재날에는 2원	..... 100일 후에는 100원 씩 이자가 붙는다.
	
	100원을 맡겼을 때 10일 후에는 얼마가 될까?
	money원 맡겼을 때	nDay후에는 얼마일까?
*/
public class ForTest7 {
	public static void main(String[] args) {
		int money = 100;
		int nDay = 10;
		int sum = money;
		int day=1;
		for (int i=0;i<11;i++){
			//sum=sum+ day++;		//후위형으로 하려면 int day = 1으로 설정..
			//sum=sum+ ++day;		//전위형으로 하려면 int day = 0으로 설정..
			sum += i;
			
		}
		
	}

}
