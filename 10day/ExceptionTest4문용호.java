package exceptionex;

import javax.swing.JOptionPane;

public class ExceptionTest4문용호 {

	//계속 0이 입력되더라도... 결국엔 나눗셈 결과를 볼 수 있도록 만들어보자!
	//try catch 문장을 무한반복시키기!
	public static void main(String[] args) {
		int num = 0; 
		int num2 = 0;
		try {
			
			num = Integer.parseInt(JOptionPane.showInputDialog("정수1입력"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("정수2입력"));
			System.out.println(num / num2);

		} catch (ArithmeticException e) {
			System.out.println("두번째 인자에 0이 들어왔음 0이 아닌 수 입력바람!");
			num2 = Integer.parseInt(JOptionPane.showInputDialog("정수2입력"));
			System.out.println(num / num2);
			
		} catch (Exception e) {		

		}
		System.out.println("그 다음 소스를 이어간다.");
	}

}
