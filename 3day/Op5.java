package operatorex;

import javax.swing.JOptionPane;

/*
 	�ִܻ꽬 �������
	  	  	 ���� ������ : <	>	<=	>=	==	!=
	  	  	 
	  	  	 10 < 5
	  	  	 	less than			jsp						html
	  	  	 						lt						&lt;
	  	  	 	 
	  	  	 10 > 5
	  	  	 	greater than		
	  	  	 						gt						&gt;
	  	  	 						
	 - ���迬���� - "�ڹ��ڴ�" 
	 	  	 10 < 5 "10�� 5���� ������?"	"T/F" -> boolean
	 	  	 								false
	  	  	 						
	  	  	 						
	 

 */
public class Op5 {
	
	public static void main(String[] args) {
		int num = 10;
		int num2 = 20;
		System.out.println(num < num2);
		System.out.println(num <= num2);
		System.out.println(num > num2);
		System.out.println(num >= num2);
		System.out.println(num == num2);
		System.out.println(num != num2);
		//���� ���� �߻��˴ϴ�.
		boolean isBig = num<num2;
		System.out.println(isBig);
		
		
		
		
		
	}
}
