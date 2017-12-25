package castex;
/*
  자동 형변환
  1)byte short char가 연산할 때는 int형으로 바뀐다.
  
  
  */

public class CastingTest {
	
	public static void main(String[] args) {
		
		// 1) byte short char가 연산할 때는 int형으로 바뀐다.
		//		int보다 작은 정수형은 속도 유지를 위해서 그냥 int로 연산!
		//byte b = 128;
		byte b1 = 10;
		byte b2 = 1;	//short도 똑같음.
		System.out.println(b1+b2);
		
		//byte result = b1+ b2; //합치면 11인데....byte b1 과 b2가 연산함. -> int로 바뀜
		int result = b1+ b2;
		System.out.println(result);
		
		
		// 2) 서로 다른 타입끼리 연산할 때 큰 타입으로 값이 담긴다.
		
		System.out.println(10 / 3);   //결과값이 3으로 나옴.
		System.out.println(10 / 3.0); //결과값이 3.333...으로 나옴.
		
		//타입 변수 = 5 / 3.0;
		double var = 5 / 3.0;
		System.out.println(var);
		
		//printf( A  ,  B)
		//		서식 ,데이터
		//		 %f  , var
		System.out.printf("%f\n",var); // 항상 소수점 6자리까지만 출력해줌.
									   // 소수점 끝에서 반올림.
		//%f 사이에 .자릿값을 써주면 원하는 만큼 자릿값이 나온다.
		// 한자리 : %.1f
		// 두자리 : %.2f
		// 네자리 : %.4f
		// 열자리 : %.10f
		System.out.printf("소수부 : %.1f\n",var);
		System.out.printf("소수부 : %.2f\n",var);
		System.out.printf("소수부 : %.5f\n",var);
		

/*
 	강제 형변환
 */
		System.out.println("===============================================");
		System.out.println("강제 형변환");
		
		byte b3 = 5;
		byte b4 = 6;
		
		//byte bResult = b3 + b4; //자동 형변환에 의해서 int로 바뀜
		//연산자 우선 순위
		//사칙연산 (+,-,*,/)보다 형변환을 먼저한다.
		//byte bResult = (byte)b3 + b4; // b3을 바이트로 바꾸고 b4랑 합침 ==> 다시 자동 형변환 
		byte bResult = (byte) (b3 + b4); // 덧셈을 먼저하고 강제 형변환으로 바이트로 바꿔줌.
		
		
		
		
		
		
		
		
		
		
		
	}

}
