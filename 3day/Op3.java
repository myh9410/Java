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
public class Op3 {
	
	public static void main(String[] args) {
		//시간	:	초를 입력하면 시분초로 환산하는 프로그램!
		//408초	-> 408/60	:	6.......48
		//		   408%60	:	48
		int second = Integer.parseInt(JOptionPane.showInputDialog("초를 입력하세요(정수만 입력"));
		String strMin = second/60 + "분";
		String strSec = second%60 + "초";
		
		
		System.out.print(second+" : "+strMin + strSec);
		//System.out.print(second/60+"분");
		//System.out.println(second%60+"초");

	}
}
