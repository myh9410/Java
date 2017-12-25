package exceptionex;

import java.io.IOException;
import java.util.Scanner;

/*
	finally
	
	Ư�� �޼���(close() ó��)��
	�ݵ�� try - catch�� ���ؼ��� ����� �� �ִ� ��찡 �ִ�.
	�׷� �޼��带 checked exception �̶�� �Ѵ�.
 */
public class ExceptionTest5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("���� �Է� : "); int num2 = sc.nextInt();
			System.out.println(10/num2);
		}catch(Exception e){
			System.out.println("���� �߻�!");
			
		}finally{
			System.out.println("�� ���� �ݵ�� ����Ǵ� ����!");
			//try{if (sc != null) sc.close();} catch(Exception e){}		
			sc.close(); //�������� ����.
		}
	}
}
