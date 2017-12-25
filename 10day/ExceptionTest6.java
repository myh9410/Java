package exceptionex;

import java.io.IOException;
import java.util.Scanner;

/*
	finally
	
	특정 메서드(close() 처럼)는
	반드시 try - catch를 통해서만 사용할 수 있는 경우가 있다.
	그런 메서드를 checked exception 이라고 한다.
 */
public class ExceptionTest6 {

	public static void main(String[] args) {
		
		for (int i=1; i<11; i++){
			System.out.println("2017년 2월 22일 36분"+i+"초");
			
			//Thread.sleep(1000);		//1000 ms	=	1초	//Unhandled exception type InterruptedException에러
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
