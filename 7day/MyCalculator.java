package classex2;

import javax.swing.JOptionPane;

public class MyCalculator {

	int add(int a, int b){ return a+b;}
	
	int sub(int a, int b){ return a-b;}
	
	int mul(int a, int b){ return a*b;}
	
	int div(int a, int b){ return a/b;}
	
	//정수를 가져다 주는 메서드
	
	//static : 미리 만들어 놓는  "new 인스턴스 보다"
	//인스턴스 없이 클래스로 직접 부를 수 있다.
	//MyCalculator.getNumber();
	//클래스.메서드() 형태로 부른다.
	// 객체.메서드()로 부르지 않는다!!!
	static int getNum(){
		return Integer.parseInt(JOptionPane.showInputDialog("정수 입력"));
		
	}
	

}
