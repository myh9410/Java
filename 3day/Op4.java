package operatorex;

import javax.swing.JOptionPane;

/*
 	�ִܻ꽬 �������
	  	  ����Ʈ ������ : <<	>>	>>>
		 				  ��	��	��3
		 				  
		 				  
		 ���ü << ĭ�� : ���ü�� bit�� ���� ��, bit �о�� ĭ��
		 
		 10	<< 2
		 		0000	1010
		 						<<2ĭ
		 	00	0010	10__	2ĭ�� ��� �ȴ�.
		 						�� ����Ʈ�� ��ĭ�� 0�� ä�� �ִ´�.
		 ======================
		 		0010	1000	10<<2     ->     40
		 		
		 		
-------------------------------------------------------------------------------------
		 >> �� ����Ʈ
		 80 >> 2			80 /	2�� 2��
		 80 >> 3			80 /	2�� 3��
		 80 >> 4			80 /	2�� 4��
		 
		 
		 0 	 0 0 1	1 0 1 0		
		 						>> 2ĭ			1.sign bit�� �и��� �ʰ� �ι��� ��Ʈ���� ����!(��ȣ ���� �Ӽ�)
		 0 	 _ _ 0	0 1 1 0		1 0 <- ������	2. ��ĭ�� �߻��Ǹ� ���ڸ��� sign bit�� ������ ä���.
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
		System.out.println(val<<8);	//-128�� �ȳ���!!! int���̶�..
///////////////////////////////////////////////////////////////////////////
		System.out.println("========================================");
		System.out.println((byte)(val<<1));	//2
		System.out.println((byte)(val<<2));	//4
		System.out.println((byte)(val<<3));	//8
		System.out.println((byte)(val<<4));	//16
		System.out.println((byte)(val<<5));	//32
		System.out.println((byte)(val<<6));	//64
		System.out.println((byte)(val<<7));	//-128
		
		//����		num << ĭ��		: num * 2^ĭ�� ��
		//			 10 << 3		: 10 * (2�� 3��)
		
		
		
		
		System.out.println("�� ����Ʈ");
		//			80>>3			:	80	/	(2�� 3��)
		System.out.println(0b01011010);
		System.out.println(0b01011010>>1);
		System.out.println(0b01011010>>2);
		System.out.println(0b01011010>>3);
		System.out.println(0b01011010>>4);	//0b = 2�������� ��Ÿ��
		
		System.out.println(0x1234); 	    //0x = 16�������� ��Ÿ��
		System.out.println(0x234); 	   		//0  = 8�������� ��Ÿ��
		
		// >>> 3��¥�� : ��ĭ�� ������ 0�� ä����!
		// >> 2��¥��(sign bit�� �����ؼ� ä����)
		

		
	}
}
