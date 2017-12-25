package exceptionex;

import java.io.IOException;
import java.util.Scanner;

/*
	finally
	
	특정 메서드(close() 처럼)는
	반드시 try - catch를 통해서만 사용할 수 있는 경우가 있다.
	그런 메서드를 checked exception 이라고 한다.
 */
public class ExceptionTest5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("정수 입력 : "); int num2 = sc.nextInt();
			System.out.println(10/num2);
		}catch(Exception e){
			System.out.println("에러 발생!");
			
		}finally{
			System.out.println("이 블럭은 반드시 실행되는 구역!");
			//try{if (sc != null) sc.close();} catch(Exception e){}		
			sc.close(); //마지막에 닫음.
		}
	}
}
