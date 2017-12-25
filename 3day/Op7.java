package operatorex;

import javax.swing.JOptionPane;

/*
 	최단산쉬 관리삼대
	  	  	     삼항 연산자	"  ?  :  "
	  	  	     
	  	       op1		?	op2 	:		op3
	  	     논리값			참		:		거짓
	  	  (관계연산자)
	  	  
	  	  		참		?	"1"		:		"2"		==> "1"이 된다.
	  	  	  거짓		?	"1"		:		"2"		==> "2"가 된다.

	  둘 중에 하나를 선택하는 연산자 op1 	  참이면 op2가 된다.
											거짓이면 op3가 된다.
 */
public class Op7 {
	
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("정수 입력"));
		String str = num>3?"참":"거짓";
		
		System.out.println(str);
		
		//양수면 num2에 제곱	음수면 num2를 두배로 만들어서 출력
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("정수 입력"));
		//int result = num2>0	?	num2*num2	:	2*num2;		//양수 : num2>0
		// 제곱인지 음수인지 표현하고 싶다면
		String strRe = num2>0	?	"제곱 : "+ (num2*num2) : "두배 : " + (num2*2); 
		System.out.println(num2 + "의 결과값 : " + strRe);
		
		//점수가 60점 이상이면 합격 그렇지 않으면 불합격으로 표시하자!
		int score = 0;
		
		//pointX좌표가 음수라면 절대값으로 만들어서 변수 absX에 저장시킨 후 출력.
		int pointX = 0;
		
		
		
		
		
		
	}
}
