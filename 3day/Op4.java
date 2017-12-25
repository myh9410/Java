package operatorex;

import javax.swing.JOptionPane;

/*
 	최단산쉬 관리삼대
	  	  쉬프트 연산자 : <<	>>	>>>
		 				  좌	우	우3
		 				  
		 				  
		 대상체 << 칸수 : 대상체를 bit로 만든 후, bit 밀어내기 칸수
		 
		 10	<< 2
		 		0000	1010
		 						<<2칸
		 	00	0010	10__	2칸이 비게 된다.
		 						좌 쉬프트는 빈칸에 0을 채워 넣는다.
		 ======================
		 		0010	1000	10<<2     ->     40
		 		
		 		
-------------------------------------------------------------------------------------
		 >> 우 쉬프트
		 80 >> 2			80 /	2의 2승
		 80 >> 3			80 /	2의 3승
		 80 >> 4			80 /	2의 4승
		 
		 
		 0 	 0 0 1	1 0 1 0		
		 						>> 2칸			1.sign bit는 밀리지 않고 두번재 비트부터 밀자!(부호 유지 속성)
		 0 	 _ _ 0	0 1 1 0		1 0 <- 버려짐	2. 빈칸이 발생되면 그자리엔 sign bit의 값으로 채운다.
	===============================
		 0	 0 0 0  0 1 1 0


 */
public class Op4 {
	
	public static void main(String[] args) {
		byte val = 1;
		System.out.println(val<<1);	//2
		System.out.println(val<<2);	//4
		System.out.println(val<<3);	//8
		System.out.println(val<<4);	//16
		System.out.println(val<<5);	//32
		System.out.println(val<<6);	//64
		System.out.println(val<<8);	//-128이 안나옴!!! int형이라서..
///////////////////////////////////////////////////////////////////////////
		System.out.println("========================================");
		System.out.println((byte)(val<<1));	//2
		System.out.println((byte)(val<<2));	//4
		System.out.println((byte)(val<<3));	//8
		System.out.println((byte)(val<<4));	//16
		System.out.println((byte)(val<<5));	//32
		System.out.println((byte)(val<<6));	//64
		System.out.println((byte)(val<<7));	//-128
		
		//공식		num << 칸수		: num * 2^칸수 승
		//			 10 << 3		: 10 * (2의 3승)
		
		
		
		
		System.out.println("우 쉬프트");
		//			80>>3			:	80	/	(2의 3승)
		System.out.println(0b01011010);
		System.out.println(0b01011010>>1);
		System.out.println(0b01011010>>2);
		System.out.println(0b01011010>>3);
		System.out.println(0b01011010>>4);	//0b = 2진수임을 나타냄
		
		System.out.println(0x1234); 	    //0x = 16진수임을 나타냄
		System.out.println(0x234); 	   		//0  = 8진수임을 나타냄
		
		// >>> 3개짜리 : 빈칸에 무조건 0을 채우자!
		// >> 2개짜리(sign bit를 복사해서 채우자)
		

		
	}
}
