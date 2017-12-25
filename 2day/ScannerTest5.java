package scannerex;

import java.util.Scanner;

/*
	Scanner 여러가지 유형으로 입력받기
	
	*문자열 입력받기
		문장 입력받기 - nextLine() : 엔터값까지 싹 읽어온다.
		※nextLine의 주의할 점
	버퍼 : 키보드에서 입력한 값의 임시 저장소
		데이터를 입력해야 하는데 입력하지 못하는 상황이 발생하면:
			버퍼의 엔터값때문에 문제가 발생한 것!
※결과값	
	나이 : 12
	나이 : 12살		12치고 엔터키 눌러서 nextLine이 버퍼에서 엔터키를 찾아서 가져옴.
	주소 : 주소 : 	
		
		
 */
public class ScannerTest5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//한글 입력받을 때는 입력 위치에
		//마우스로 클릭을 한 뒤 입력하자!

		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.println("나이 : "+age+"살");
		
		sc.nextLine();
		System.out.print("주소 : ");
		String address = sc.nextLine();
		System.out.println("주소 : "+address);

		
		
	}

}
