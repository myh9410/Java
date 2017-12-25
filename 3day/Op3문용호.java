package operatorex;

import javax.swing.JOptionPane;

/*
 	최단산쉬 관리삼대
	  	산술 연산자 : (5개 항목) 
		 *		/		%		+		-
		 	빠르다				 느리다

		% : 나머지(를 가져오는) 연산자
		/ : 몫(을 가져오는) 연산자
		
		7/2 : 3...................1
		7%2 : 1(몫은 버리고 나머지 값만)
		
		num % 2 ---->  0,1
		num % 4 ---->  0,1,2,3
		 5 % 4 --->	1
		 6 % 4 --->	2
		 7 % 4 --->	3
		 8 % 4 --->	0
		 9 % 4 --->	1
		 ...
		 
		 data%2 그 결과가 항상 0이라면.. data는 짝수
		 data%3 그 결과가 항상 0이라면.. data는 3의 배수
		 
 */
public class Op3문용호 {
	
	public static void main(String[] args) {
		//과제 1
		//시간	:	초를 입력하면 시분초로 환산하는 프로그램!
		//408초	-> 408/60	:	6.......48
		//		   408%60	:	48
		int second = Integer.parseInt(JOptionPane.showInputDialog("초를 입력하세요(정수만 입력"));
		int strMin = second/60;
		int strHour = strMin/60;
		int strRealMin = strMin - strHour*60;
		int strSec = second%60;
		
		System.out.print(second+" : "+strHour + "시간" + strRealMin + "분" + strSec + "초");
		//System.out.print(second/60+"분");
		//System.out.println(second%60+"초");
		System.out.println("================================================================");
		/* 과제 2
			은행원이 돈을 인출해 주려고 한다.
			이때 최소 화폐 매수를 계산해보자!
			
			ex) 58600원 --> 5만원권 : 
							 만원권 : 
						   오천원권 : 
						   	 천원권 : 
		 */
		int money = Integer.parseInt(JOptionPane.showInputDialog("얼마를 인출 할까요?(정수만 입력"));
		int won50000 = money/50000;
		int won10000 = (money - 50000*won50000)/10000;
		int won5000  = (money - 50000*won50000 - 10000*won10000)/5000;
		int won1000  = (money - 50000*won50000 - 10000*won10000 - 5000*won5000)/1000;
		int won500   = (money - 50000*won50000 - 10000*won10000 - 5000*won5000 - 1000*won1000)/500;
		int won100   = (money - 50000*won50000 - 10000*won10000 - 5000*won5000 - 1000*won1000 - 500*won500)/100;
		int won50   = (money - 50000*won50000 - 10000*won10000 - 5000*won5000 - 1000*won1000 - 500*won500 - 100*won100)/50;
		int won10   = (money - 50000*won50000 - 10000*won10000 - 5000*won5000 - 1000*won1000 - 500*won500 - 100*won100 -50*won50)/10;
		System.out.println(money + " : " );
		System.out.print("5만원권 : " + won50000 + "\n1만원권 : " + won10000 + "\n5천원권 : " + won5000 + "\n1천원권 : " + won1000+"\n500원 : " + won500 + "\n100원 : " + won100 + "\n50원 : " + won50 + "\n10원 : " + won10);
				
		
	}
}
