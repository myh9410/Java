package operatorex;

import javax.swing.JOptionPane;

/*
 	�ִܻ꽬 �������
	  	  	   �� ������ : (true : 1 / false : 0)
	����		&		|		^		&&		||
					��Ʈ��		/	 �����	
					
					10&2			����� && ����� || �����
					10|3
					10^5
--------------------------------------------------------------------------------			
		[����ǥ]	
							����and	����or	��Ÿ����(XOR)
		A		B				&			|				^							
		0		0				0			0				0
		0		1				0			1				1
		1		0				0			1				1
		1		1				1			1				0
--------------------------------------------------------------------------------

				
	*12 & 6					12			0000	1100
	*12 | 6					 6			0000	0110
	*12 ^ 6			------------------------------------
							 &			0000	0100		 4
							 |			0000	1110		14
							 ^			0000	1010		10		
							 
*���� �� ������
					(10 > 5) && (40 <= 3) || (60>7)   = 1
						t			f			t	 
						1	*		0	  +		1
							 0			  +		1
							 			1 : true
							 
							 
 */
public class Op6 {
	
	public static void main(String[] args) {
		System.out.println(12&6);
		System.out.println(12|6);
		System.out.println(12^6);
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("���� �Է�"));
		// num�� ������? true | false�� ����
		System.out.println("num�� ������?" + (num<0));
		
		// num�� ¦����? true| false�� ����
		System.out.println("num�� ¦����?" + (num%2==0));
		
		//���� ¦����?
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("���� �Է�"));
		System.out.println("num2�� ����, ¦����?" + ((num2<0)&&(num2%2==0)));
		
		
		
	}
}
