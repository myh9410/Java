package ifelseex;

import javax.swing.JOptionPane;

/*		���� if else��	
 	���� ���� : �޴��� ����
 	
 	if(����){
 	
 	} else if(����){
 		
 	{ else if(����){

 	{ else if(����){
 	
 	{ else if(����){
 	
 	{ else if(����){
 	
 	{ else if(����){
 	
 	
 	
 	} else {	//���� �´� ���� �ϳ��� ���� �� �����Ѵ�.
 	
 	}
 
 
 
  */
public class IfElse2 {

	public static void main(String[] args) {
		//#1. ���ĺ��� �빮��? �ҹ���? �Ǻ��غ���
		char alphabet = JOptionPane.showInputDialog("���ĺ��� �Է����ּ���.").charAt(0);
		
		//alphabet�� �Էµ� ������ �빮�ڰ� �ƴ϶��... ���� �ҹ��ڷ� ����Ѵ�. - ����
		//���� if else������ ó���ϸ� ����!
		
//		if ('A'<= alphabet && alphabet <= 'Z'){
//			System.out.println("���ĺ��� �빮���Դϴ�.");
//		}else{
//			System.out.println("���ĺ��� �ҹ����Դϴ�.");
//		}
		if ('A'<= alphabet && alphabet <= 'Z'){
			System.out.println("�빮���Դϴ�.");
		}else if ('a'<= alphabet && alphabet <= 'z'){
			System.out.println("�ҹ����Դϴ�.");
		}else if ('0'<= alphabet && alphabet <= '9'){
			System.out.println("�����Դϴ�.");
		}
		
	}//end main
}//end class
