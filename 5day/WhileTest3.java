package whileex;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
	while + switch		주문!
		-ATM기
				1. 현금 인출
				2. 잔액 조회
				3. 계좌 이체
				4. 현금 서비스
				5. 종료
		홍길동 1234,	5000원!		계좌번호 000-00-000		
				
		
 */
public class WhileTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = "홍길동";
		int balance = 5000;
		int pw = 1234;
		
		while (true) {
			// #메뉴 및 번호 선택.
			String menu = "====kbhb 은행====\n";
			menu += "1.현금인출\n";
			menu += "2.잔액 조회\n";
			menu += "3.계좌 이체\n";
			menu += "4.현금 서비스\n";
			menu += "5.종료\n";
			System.out.println(menu + "번호를 선택하세요 : ");
			int bun = sc.nextInt();
			// #탈출 조건
			if (bun == 5)
				break;

			// 1~4까지 세부 임무를 수행!
			/*
			 * 1. 현금 인출 2. 잔액 조회 3. 계좌 이체 4. 현금 서비스 5. 종료 홍길동 1234, 5000원! 계좌번호
			 * 000-00-000
			 */
			switch (bun) {
			case 1:
				//비번 오류시 체크할 횟수
				int checkPw = 3;
				
				// 비번 체크
				while (true) {
					System.out.println("1.현금인출***");
					System.out.print("비밀번호를 누르세요 : ");
					int userPw = sc.nextInt();
					if (userPw != 1234) {
						checkPw--;
						System.out.println("비번 오류 : " + checkPw + "회 남았습니다.");
						if (checkPw == 0)
							break;
					} else {
						break;// 비번 체크가 끝났으면 밖으로 나가자!

					}
				} // end 비번 체크
				if (checkPw == 0) {
					System.out.println("계정 잠금 가까운 은행에 가세요.");
				} else {
					checkPw = 3;
					//#금액 인출 부분
					while (true) {
						System.out.println("홍길동" + "님 현재 잔액 : " + 5000 + "원");
						System.out.println("**인출할 금액 (종료 : 0): ");
						int withdraw = sc.nextInt();
						if (balance < withdraw) {
							System.out.println("잔액 범위를 초과했습니다.");
						} else if (withdraw == 0) {
							break; // 인출하기 빠져나감.
						}else {
							balance -=withdraw;
							System.out.println(withdraw + "원 인출 합니다. 현재 금액 : "
																+balance+"원");
						}//end if
					}//end while(금액 인출)
				}//end if 비번 체크 후!
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;

			}
		}

		System.out.println("안녕히 가십시오.");

	}
}
