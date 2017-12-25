package exceptionex;

import javax.swing.JOptionPane;

public class ExceptionTest {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("정수1입력"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("정수2입력"));
		
//		if (num2 !=0){
//			System.out.println(num/num2);
		try{
			System.out.println(num/num2);
			System.out.println("나눗셈 바로 밑에 있는 소스에요~");
		}catch(ArithmeticException e){
			//System.out.println(e.getMessage());
			//e.printStackTrace();
			System.out.println("0으로 나누지 마! 0으로 나눈 에러를 처리했음!!!");
		}
		System.out.println("그 다음 소스를 이어간다.");	//
	}

}
