package exceptionex;

import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

/*
	throws : 조심해	예외를 처리해서 사용해!	"예외의 전파"
	
	void method() throws 예외사항{
	
	}
	
 */
class MyException {
	static char read() throws IOException{
		return JOptionPane.showInputDialog("문자입력").charAt(0);
	}
}
public class ExceptionTest7 {

	public static void main(String[] args) {
		
		char ch = ' ';	//문자열 초기화 : ' ' 빈문자열...
		try {
			ch = MyException.read();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		System.out.println(ch);
		
	}
}
