package forex;

import javax.swing.JOptionPane;

/*
	����for�� : for�� �ȿ� for���� ����.
	
	�б�
		1��		2��		3��
		 1��	 1��	 1��
	 	 2��	 2��	 2��
		 3��	 3��	 3��
		 4��	 4��	 4��
	
	
	
*/
public class ForTest3 {
	public static void main(String[] args) {
		// for(int i=1; i<4; i++){
		// System.out.println("----"+i+"��"+"----");
		//// System.out.println(" "+1+"��----");
		//// System.out.println(" "+2+"��----");
		//// System.out.println(" "+3+"��----");
		//// System.out.println(" "+4+"��----");
		// for(int j = 1; j<5; j++){
		// System.out.println(" "+j+"��----");
		// }
		// }

		// �� ������ �𸣰�(�Է¹ޱ�)
		// �� ���� �ο� ���� 10���̴�.
		// #1.
		int classnum = Integer.parseInt(JOptionPane.showInputDialog("���� ������ �Է��ض�."));
		int cnt = 0;
		if (classnum != 0) {
			for (int i = 0; i < classnum; i++) {
				System.out.println("----" + (i + 1) + "��" + "----");

				for (int j = 0; j < 10; j++) {
					System.out.println("	" + j + "��----");
					cnt++;
				}
				System.out.println("================================");
			}
			System.out.println("�Էµ� �� ���� : " + classnum + "�� ��");
			System.out.println("���� �л���(��*10��) : " + cnt + "��");
		}

		// #2. 10�� ���

	}

}
