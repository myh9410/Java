package scannerex;

import java.util.Scanner;

/*
	Scanner 여러가지 유형으로 입력받기
 */
public class ScannerTest2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//한글 입력받을 때는 입력 위치에
		//마우스로 클릭을 한 뒤 입력하자!
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.println("이름 : "+name);
		
	}

}
