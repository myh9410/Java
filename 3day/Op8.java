package operatorex;

import javax.swing.JOptionPane;

/*
 	최단산쉬 관리삼대
	  	 		   대입 연산자
	  	 		   
	1.	단순 대입
		int num = 20;
		num = 3.5;
		num = int(3.5);
		
		double d = 3;
	
	2. 복학 대입
	
	int x = 0;
	
	x += 10;		더한 후, 대입
					x = x + 10;
	x *= 5;			곱한 후, 대입
					x = x * 5;
	x /= 3;			나눈 후, 대입
	
	x<<= 4;			쉬프트 시킨 후, 대입
 */
public class Op8 {
	
	public static void main(String[] args) {
		int num = 5;
		
		num+=3;		//num ->5	5+3을 대입받는다 num = 8
		
		num+=4;		//num ->8  +4한 후, 다시 num에 넣는다. num = 12
		
		num+=5;		//num = num+5	num = 12+5 = 17
		
		System.out.println(num);
		
		
		/*
		 	8 += 3; ->>불가능
		 	왼쪽에 반드시 변수가 있어야 함.
		 
		 */
		
		
	}
}
