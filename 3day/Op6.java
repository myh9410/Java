package operatorex;

import javax.swing.JOptionPane;

/*
 	최단산쉬 관리삼대
	  	  	   논리 연산자 : (true : 1 / false : 0)
	종류		&		|		^		&&		||
					비트논리		/	 관계논리	
					
					10&2			관계식 && 관계식 || 관계식
					10|3
					10^5
--------------------------------------------------------------------------------			
		[진리표]	
							논리곱and	논리합or	배타논리합(XOR)
		A		B				&			|				^							
		0		0				0			0				0
		0		1				0			1				1
		1		0				0			1				1
		1		1				1			1				0
--------------------------------------------------------------------------------

				
	*12 & 6					12			0000	1100
	*12 | 6					 6			0000	0110
	*12 ^ 6			------------------------------------
							 &			0000	0100		 4
							 |			0000	1110		14
							 ^			0000	1010		10		
							 
*관계 논리 연산자
					(10 > 5) && (40 <= 3) || (60>7)   = 1
						t			f			t	 
						1	*		0	  +		1
							 0			  +		1
							 			1 : true
							 
							 
 */
public class Op6 {
	
	public static void main(String[] args) {
		System.out.println(12&6);
		System.out.println(12|6);
		System.out.println(12^6);
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("정수 입력"));
		// num이 음수니? true | false가 나옴
		System.out.println("num이 음수니?" + (num<0));
		
		// num이 짝수니? true| false가 나옴
		System.out.println("num이 짝수니?" + (num%2==0));
		
		//음수 짝수니?
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("정수 입력"));
		System.out.println("num2가 음수, 짝수니?" + ((num2<0)&&(num2%2==0)));
		
		
		
	}
}
