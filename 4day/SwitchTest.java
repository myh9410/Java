package switchex;

import java.util.Scanner;

/*
	다중 분기
	다중 택일 == 다중 if else로 가능!	(break;	:	탈출해라)
									switch에서 탈출해라
									반복문에서 탈출해라

	switch(값value){				value : 연산, 변수, 상수, 메서드	(실수는 안된다)
	
	case 값:						label : 표시, 변수(x), 수식(x)
	case 값:								상수(정수, 문자, 문자열)	: 실수(x)
	case 값:
	case 값:
	
	
	}
 */
public class SwitchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~4까지 입력: ");
		int bun = sc.nextInt();
		
		switch(bun){
		case 1:
			System.out.println("1선택");
			System.out.println("1선택-one입니다.");
			break;
		case 2:
			System.out.println("2선택");
			System.out.println("2선택-two입니다.");
			break;
		case 3:
			System.out.println("3선택");
			System.out.println("3선택-three입니다.");
			break;
		case 4:
			System.out.println("4선택");
			System.out.println("4선택-four입니다.");
			break;
		default : //해당하는 case가 없음
			System.out.println("1~4까지만 입력해야 합니다.");
		
		
			
		}
		
	}

}
