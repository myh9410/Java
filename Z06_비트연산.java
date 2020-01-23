/**
 * 
 * 연산자 : 단항, 이항, 삼항, 대입연산자
 * 비트연산자 - 이항연산에 포함되는 연산자 << >> || && | & ^
 * 
 */
public class Z06_비트연산 {
	public static void main(String[] args) {
		int a = 123;	//10진수
		System.out.println(a);//10진수
		//다른 진법의 값으로 출력
		//a = 0b110111;	//2진수 0b or 0B
		System.out.println(Integer.toBinaryString(a));	//2
		System.out.println(Integer.toOctalString(a));	//8
		System.out.println(Integer.toHexString(a));	 	//16
		System.out.println(Integer.toString(a, 3));		//그외 진법은 toString에서 진법표시
		/*
		a = 0110111;	//8진수 0
		System.out.println(a);
		a = 0x110111;	//16진수 0x or 0X
		System.out.println(a);
		*/
		int b = 0b1100;	//12
		int c = 0b1001;	//9
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(c));
		System.out.println(Integer.toBinaryString(b&c) + " = b&c");
		System.out.println(Integer.toBinaryString(b|c) + " = b|c");
		System.out.println(Integer.toBinaryString(1<<0)+" = 1<<0");
		System.out.println(Integer.toBinaryString(1<<1)+" = 1<<1");
		System.out.println(Integer.toBinaryString(1<<2)+" = 1<<2");
		System.out.println(Integer.toBinaryString(1<<3)+" = 1<<3");
		
		//비트마스킹 : 원하는 비트의 값만 뽑아내기
		System.out.println("비트마스킹");
		int n = 0b10011011;
		System.out.println((n & 0b1) == 0 ? 0:1);
		System.out.println((n & 0b10) == 0 ? 0:1);
		System.out.println((n & 0b100) == 0 ? 0:1);
		System.out.println((n & 0b1000) == 0 ? 0:1);
		System.out.println((n & 0b10000) == 0 ? 0:1);
		//위의 과정을 반복문으로 출력
		System.out.println("반복문으로 출력 (쉬프트 연산자 활용)");
		for (int i = 0; i < 8; i++) {
			System.out.print((n & 1<<i) == 0 ? 0:1);
		}
		System.out.println();
		
		//멱집합 출력하기 (비트연산자 이용)
		System.out.println("멱집합 출력하기 (비트연산자 이용)");
		int[] z = {-7,-3,-2,5,8};
		//Math.pow(2, z.length) pow처리하는데에 시간이 너무 오래걸림 
		//위의 방식 대신 비트연산자를 활용한다.
		for (int i = 0; i < (1<<z.length); i++) {//0~31
			//i & 0b1			//가장 낮은 자리수 1의 자리를 비트마스킹하자
			if ((i &0b1) != 0) System.out.print(z[0]+",");
			//i & 0b10			//2의 자리를 비트마스킹하자
			if ((i &0b10) != 0) System.out.print(z[1]+",");
			if ((i &0b100) != 0) System.out.print(z[2]+",");
			if ((i &0b1000) != 0) System.out.print(z[3]+",");
			if ((i &0b10000) != 0) System.out.print(z[4]+",");
			System.out.println();
		}
		
		
		
	}//eom
}//eoc
























