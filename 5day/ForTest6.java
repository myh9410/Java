package forex;

import javax.swing.JOptionPane;

/*
	������ : 
	� ������ �ִ�.
	������ �ñ�� �Ϸ翡 1���� ���ڰ� �ٴ´�.
		money
	5�� �Ŀ��� 
		���� ?? ���� �ܾ� ???.... ��� �޼��� ���
	nDay�� �Ŀ���
		���� ?? ���� �ܾ� ???.... ��� �޼��� ���

*/
public class ForTest6 {
	public static void main(String[] args) {
		int money = Integer.parseInt(JOptionPane.showInputDialog("���ݾ� �Է�"));
		int nDay = Integer.parseInt(JOptionPane.showInputDialog("�Ⱓ �Է�"));
		int sum = money;
		for (int i =0; i<nDay; i++){
//		sum = sum + 1;		//1��
//		sum = sum + 1;		//2��
//		sum = sum + 1;		//3��
//		sum = sum + 1;		//4��
//		sum = sum + 1;		//5��
			sum+=1;
		}

		
		System.out.println("�ñ� �ݾ� : "+money+"��	"+nDay+"�� �� �ݾ� : " + sum + "��");
		
		
	}

}
