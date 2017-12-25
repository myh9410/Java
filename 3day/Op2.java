package operatorex;

import javax.swing.JOptionPane;

/*
 	최단산쉬 관리삼대
	  단항 연산자(unary): 항이 한개.
		 +		-		!		~		()		++		--
		 
		 
		 
		 
 */
public class Op2 {
	
	public static void main(String[] args) {
		//1. + , - 연산 : 부호바꿈(유지) 연산자
		int num = -10;
		System.out.println(+num);	//(+1)*num 이 성립 : 부호 유지
		System.out.println(-num);	//(-1)*num 이 성립 : 부호 바꿈
		
		//2. ! 연산자	:	not (부정)	<--- 반대로 만들겠다.
		//			부정 <-->긍정    :    논리타입
		//	논리타입false<-->true
		//boolean : false에 !를 붙이면 true가 된다!
		boolean isFly = false;
		System.out.println("날 수 있니? : "+isFly);
		//isFly = true;
		//System.out.println("날 수 있니? : "+isFly);
		System.out.println("날 수 있니? : "+!isFly);	// !false = true
		
		boolean isPower = false;
		isPower = !isPower;
		System.out.println(isPower);
		
		//3. ~ 물결 연산자,tilde연산자(1의 보수 연산자)	:
		// 대상체를 bit로 만든 후에 1->0으로 0->1로 바꿔라!
		System.out.println(10);
		System.out.println(~10);	// -11
		
		System.out.println(100);
		System.out.println(~100);	//-101
		System.out.println(~1000);	//-1001
		System.out.println(~10000);	//-10001
									// ~대상체 : -(대상체+1)
		
		//System.out.println(~10);
		//10을 bit로 만들자		s	64	32	16	8	4	2	1	-	Label
		//						0	0	0	0	1	0	1	0
		//					~
		//					ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//						1	1	1	1	0	1	0	1
		//2의 보수법 : 해석해야하는 2진수가 음수일때, 2진수 계산법
		//	1.	오른쪽 -> 왼쪽 방향으로 내려적기
		//		@	@	@	@	@	@	@	1
		//	2.	최초의 1을 만나면 "그 다음"부터 1 -> 0, 0 -> 1로 바꾼다.(sign비트는 바꾸지 않음)
		//		1	0	0	0	1	0	1	1
		//	3.	Label로 해석
		//		-	0	0	0	8	0	2	1
		//	~01101010 보수법(tilde먼저 계산) -> 10010101 -> 01101011 -> 127
		
		//4. () 형변환 연산자
		System.out.println( (double) 5);//4byte -> 8byte
		System.out.println( (int) 5.1);//소수부를 버림! 정수부만 가져옴!
		System.out.println("----문자의 ASCII코드값 보기 (int)문자 ----");
		System.out.println((int) '0');	//문자에 대한 코드값 -> 정수가 나온다
		System.out.println((int) '1');
		System.out.println((int) '2');
		System.out.println((int) '3');
		System.out.println((int) '4');
		
		//byte, short, char 등은 자기네끼리 연산할 때 int로 바뀐다.
		System.out.println("////////////////////////////////");
		System.out.println((int)'a');	//97
		System.out.println('a'+1);		//98
		//최단산쉬 관리삼대
		System.out.println(	(char)	'a'+1	);	//98이라는 코드의 문자를 보여줘!
		System.out.println(	(char)	('a'+1)	);	//98이라는 코드의 문자를 보여줘!
		
		//++,	--	:	증감 연산자 : 변수 자체의 값이 바뀐다.
		// ++ : 1씩 증가 연산자
		// -- : 1씩 감소 연산자
		
		num = 0;// 누적!!!						//num = 0이므로 계속 1만 출력(누적 X)
		num++;	//num = num + 1;		System.out.println(num+1);
		
		num++;	//num = num + 1;		System.out.println(num+1);
		
		num++;	//		System.out.println(num+1);
		
		num++;	//		System.out.println(num+1);
		
		num++;	//		System.out.println(num+1);

		
		System.out.println(num);
		
		/*
		 	그런데... 연산자가 뒤에 있다!
		 	~num	-num	!num 
		 	
		 	num++	후위형
		 	++num	전위형		 
		 
		 */
		num=0;
		++num;	//전
		++num;	//전
		num++;	//후
		num++;	//후
		num++;	//후

		System.out.println("덧셈 증가 연산자 : " + num);
		
		--num;
		--num;
		num--;
		--num;
		num--;
		--num;
		
		System.out.println("뺄셈 증가 연산자 : " + num);
		
		//※다른 연산자하고 섞여 있을때
		//전위형, 후위형일 때 연산 순서가 달라진다.
		
		int result = 0;
		num = 0;
		
		//"전"위형	: 다른 연산자를 하기 "전"에 증/감 하자
		result = ++num;	//num을 1 증가시키고 result에 대입하자
		System.out.println("전위형 result : "+ result + "\tnum : " + num);
		num = 0;
		//"후"위형	: 다른 연산자를 한 "후"에 증/감 하자
		result = num++;	//num을 1 증가시키고 result에 대입하자
		System.out.println("후위형 result : "+ result + "\tnum : " + num);
		
		int jump = 0;
		System.out.println("(전)한번 눌렀다. 점프 횟수 : "+ ++jump);
		
		jump = 0;
		System.out.println("(후)한번 눌렀다. 점프 횟수 : "+ jump++); //0번이라 출력, ram에는 1로 저장.
		
		System.out.println("jump + 1 : "+(jump+1));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
