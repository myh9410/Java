package exceptionex;

import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

/*
	throws : ������	���ܸ� ó���ؼ� �����!	"������ ����"
	
	void method() throws ���ܻ���{
	
	}
	
 */
class MyException {
	static char read() throws IOException{
		return JOptionPane.showInputDialog("�����Է�").charAt(0);
	}
}
public class ExceptionTest7 {

	public static void main(String[] args) {
		
		char ch = ' ';	//���ڿ� �ʱ�ȭ : ' ' ���ڿ�...
		try {
			ch = MyException.read();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		System.out.println(ch);
		
	}
}
