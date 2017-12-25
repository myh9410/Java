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
public class ifTest3 {
	
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("정수 입력"));
		
		//입력받은 정수 값이 한자리 양수인가?
		//int a, b, c, d;
		//a=b=c=d=0;
		//수학 : 0<num<10	--	관계연산자는 다항을 지원하지 않음
		//	0<num인가?	그리고	num<10인가?
		//	 true		  ||	 true 일때	---> t||f 이면 1로 계산하므로 &&를 써줘야한다.
		//	 true		  &&	 true 일때
		if(0<num && num<10){
			System.out.println(num + "은 한자리 양수이다.");
		}	
		
		//3의 배수니?
		if(num%3 == 0){						// %3==0
			System.out.println(num + "은 3의 배수이다.");
		}
		if(num%3 != 0){
			System.out.println(num + "은 3의 배수가 아니다.");
		}
		
		//6의 배수니?
		if(num%6 == 0){
			System.out.println(num + "은 6의 배수이다.");
		}
		if(num%6 !=0){
			System.out.println(num + "은 6의 배수가 아니다");
		}
			
		//짝수니?
		if(num%2 == 0){
			System.out.println(num + "은 짝수이다.");
		}
		if(num%2 !=0){
			System.out.println(num + "은 짝수가 아니다.");			
		}
	
		//한글자 입력받기!
		//대화상자	JOptionPane.showInputDialog(message) --> 문자열을 입력받고
		//				parseInt	---> int계열로 파싱함.
		double sight = Double.parseDouble(JOptionPane.showInputDialog("좌안 시력 입력"));
		char ch = "abcd".charAt(0);  //---> "문자열"에서 ()의 값의 위치에 있는 문자를 가져감. 0부터 시작.
									//abcd에서 0번째인 a를 가져와서 ch라는 변수안에 넣음.
		System.out.println(ch);
		
		//본인의 이름을 입력받고..
		//그중에 성만 가져오기
		
		//String name = JOptionPane.showInputDialog("이름을 입력해주세요.");
		//char sung = name.charAt(0);
		//System.out.println(name +"의 성은 : " + sung + "입니다.");
		
		//바로 받기도 가능
		char sung = JOptionPane.showInputDialog("이름을 입력해주세요.").charAt(0);
		System.out.println("성은 : " + sung + "입니다.");
	}

}
