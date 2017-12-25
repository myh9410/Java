package operatorex;

import javax.swing.JOptionPane;

/*
 	최단산쉬 관리삼대
	  	  	 관계 연산자 : <	>	<=	>=	==	!=
	  	  	 
	  	  	 10 < 5
	  	  	 	less than			jsp						html
	  	  	 						lt						&lt;
	  	  	 	 
	  	  	 10 > 5
	  	  	 	greater than		
	  	  	 						gt						&gt;
	  	  	 						
	 - 관계연산자 - "자문자답" 
	 	  	 10 < 5 "10은 5보다 작은가?"	"T/F" -> boolean
	 	  	 								false
	  	  	 						
	  	  	 						
	 

 */
public class Op5 {
	
	public static void main(String[] args) {
		int num = 10;
		int num2 = 20;
		System.out.println(num < num2);
		System.out.println(num <= num2);
		System.out.println(num > num2);
		System.out.println(num >= num2);
		System.out.println(num == num2);
		System.out.println(num != num2);
		//논리형 값이 발생됩니다.
		boolean isBig = num<num2;
		System.out.println(isBig);
		
		
		
		
		
	}
}
