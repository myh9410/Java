package scannerex;

import java.util.Scanner;

/*
	Scanner 여러가지 유형으로 입력받기
	
	*문자열 입력받기
		1. 단어 입력받기 - next()	  : 공백(엔터)이 나오면 그 전까지만 읽어온다.
		2. 문장 입력받기 - nextLine() : 엔터값까지 싹 읽어온다.
 */
public class ScannerTest3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//한글 입력받을 때는 입력 위치에
		//마우스로 클릭을 한 뒤 입력하자!
		
		System.out.print("주소 : ");	//서울시 서초구 서초동
		String name = sc.next();
		System.out.println("주소 : "+name);
		System.out.println(sc.next());
		System.out.println(sc.next());
		
	}

}
