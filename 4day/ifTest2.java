package ifex;

import javax.swing.JOptionPane;

/*
	입력 - 처리 - 출력 순서.

	if(조건식=>관계식 : 논리값T/F){
	
	}
	
	if(논리값){			//만약 "참"이라면.... 수행하자
							   "거짓"이라면..  if문을 빠져나감.
	
	
	}
	
	
	
 */
public class ifTest2 {
	
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("정수 입력"));
		
		//만약 입력된 수가 양수라면.. 그 수를 두배로 만들 것
		//양수가 아니면 그냥 그 수를 그대로 출력하면 된다.
		int result = 0;
		if(num>0){
			result = num*2;		//num=num*2
		}				// 실행할 문장이 한문장이라면 { , }가 없어도 상관없음.
		//음수라면 제곱하자!
		if(num<0){
			result = num*num;
			
		}
		System.out.println("처음 입력값 : "+ num + "\n계산 결과 : " + num);
	}

}
