package whileex;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
	while + switch		�ֹ�!
		-ATM��
				1. ���� ����
				2. �ܾ� ��ȸ
				3. ���� ��ü
				4. ���� ����
				5. ����
		ȫ�浿 1234,	5000��!		���¹�ȣ 000-00-000		
				
		
 */
public class WhileTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = "ȫ�浿";
		int balance = 5000;
		int pw = 1234;
		
		while (true) {
			// #�޴� �� ��ȣ ����.
			String menu = "====kbhb ����====\n";
			menu += "1.��������\n";
			menu += "2.�ܾ� ��ȸ\n";
			menu += "3.���� ��ü\n";
			menu += "4.���� ����\n";
			menu += "5.����\n";
			System.out.println(menu + "��ȣ�� �����ϼ��� : ");
			int bun = sc.nextInt();
			// #Ż�� ����
			if (bun == 5)
				break;

			// 1~4���� ���� �ӹ��� ����!
			/*
			 * 1. ���� ���� 2. �ܾ� ��ȸ 3. ���� ��ü 4. ���� ���� 5. ���� ȫ�浿 1234, 5000��! ���¹�ȣ
			 * 000-00-000
			 */
			switch (bun) {
			case 1:
				//��� ������ üũ�� Ƚ��
				int checkPw = 3;
				
				// ��� üũ
				while (true) {
					System.out.println("1.��������***");
					System.out.print("��й�ȣ�� �������� : ");
					int userPw = sc.nextInt();
					if (userPw != 1234) {
						checkPw--;
						System.out.println("��� ���� : " + checkPw + "ȸ ���ҽ��ϴ�.");
						if (checkPw == 0)
							break;
					} else {
						break;// ��� üũ�� �������� ������ ������!

					}
				} // end ��� üũ
				if (checkPw == 0) {
					System.out.println("���� ��� ����� ���࿡ ������.");
				} else {
					checkPw = 3;
					//#�ݾ� ���� �κ�
					while (true) {
						System.out.println("ȫ�浿" + "�� ���� �ܾ� : " + 5000 + "��");
						System.out.println("**������ �ݾ� (���� : 0): ");
						int withdraw = sc.nextInt();
						if (balance < withdraw) {
							System.out.println("�ܾ� ������ �ʰ��߽��ϴ�.");
						} else if (withdraw == 0) {
							break; // �����ϱ� ��������.
						}else {
							balance -=withdraw;
							System.out.println(withdraw + "�� ���� �մϴ�. ���� �ݾ� : "
																+balance+"��");
						}//end if
					}//end while(�ݾ� ����)
				}//end if ��� üũ ��!
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;

			}
		}

		System.out.println("�ȳ��� ���ʽÿ�.");

	}
}
