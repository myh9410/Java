package exceptionex;

import java.io.IOException;
import java.util.Scanner;

/*
	finally
	
	Ư�� �޼���(close() ó��)��
	�ݵ�� try - catch�� ���ؼ��� ����� �� �ִ� ��찡 �ִ�.
	�׷� �޼��带 checked exception �̶�� �Ѵ�.
 */
public class ExceptionTest6 {

	public static void main(String[] args) {
		
		for (int i=1; i<11; i++){
			System.out.println("2017�� 2�� 22�� 36��"+i+"��");
			
			//Thread.sleep(1000);		//1000 ms	=	1��	//Unhandled exception type InterruptedException����
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
