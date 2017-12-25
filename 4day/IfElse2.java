package ifelseex;

import javax.swing.JOptionPane;

/*		다중 if else문	
 	다중 택일 : 메뉴판 구성
 	
 	if(논리값){
 	
 	} else if(논리값){
 		
 	{ else if(논리값){

 	{ else if(논리값){
 	
 	{ else if(논리값){
 	
 	{ else if(논리값){
 	
 	{ else if(논리값){
 	
 	
 	
 	} else {	//위에 맞는 값이 하나도 없을 때 수행한다.
 	
 	}
 
 
 
  */
public class IfElse2 {

	public static void main(String[] args) {
		//#1. 알파벳이 대문자? 소문자? 판별해보기
		char alphabet = JOptionPane.showInputDialog("알파벳을 입력해주세요.").charAt(0);
		
		//alphabet에 입력된 내용이 대문자가 아니라면... 전부 소문자로 취급한다. - 오류
		//다중 if else문으로 처리하면 쉽다!
		
//		if ('A'<= alphabet && alphabet <= 'Z'){
//			System.out.println("알파벳이 대문자입니다.");
//		}else{
//			System.out.println("알파벳이 소문자입니다.");
//		}
		if ('A'<= alphabet && alphabet <= 'Z'){
			System.out.println("대문자입니다.");
		}else if ('a'<= alphabet && alphabet <= 'z'){
			System.out.println("소문자입니다.");
		}else if ('0'<= alphabet && alphabet <= '9'){
			System.out.println("숫자입니다.");
		}
		
	}//end main
}//end class
