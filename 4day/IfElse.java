package ifelseex;

import javax.swing.JOptionPane;

/*
	if(논리값)
		실행문;
	else
		실행문;

	if(논리값){
		//논리값이 참일때 실행 영역
	
	} else {
		//논리값이 거짓일때 실행 영역
	
	}
-----------------------------------------------
**양자 택일문!**
*
	if(true){
	
		A		// 수행하고 나서 "자동"으로 전체 영역 밖으로 빠져나감.
	
	} else {
	
		B
	
	}

 */
public class IfElse {

	public static void main(String[] args) {
		// num이라는 정수가 한자리 양수니? 두배
		//			그렇지 않으면	   	   제곱

		int num = Integer.parseInt(JOptionPane.showInputDialog("정수 입력"));
		
//		int result = 0;
//		if(0 < num && num < 10){
//			result = num*2;		
//		}			
//		
//		if(num < 0 || num>9 ){
//			result = num*num;
//			
//		}
		int result = 0;
		if(0 < num && num < 10){
			result = num*2;		
		} else {
			result = num*num;
		}
		System.out.println("처음 입력값 : "+ num + "\n계산 결과 : " + num);
			
		if(num%3 == 0){						
			System.out.println(num + "은 3의 배수이다.");
		}else{
			System.out.println(num + "은 3의 배수가 아니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
