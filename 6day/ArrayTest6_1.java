package arrayex;

import javax.swing.JOptionPane;

/*
	�� �ݿ� �л��� 4���ִ�.
	������ ������ ����.	(3����)
	
	�� �л��� ������ �Է¹ް� ���(���� / ���)�غ���!

 */

public class ArrayTest6_1 {

	public static void main(String[] args) {
		// �л� �Է¹ް�, 3���� ����(0~100) �Է¹ޱ�
		// ���� for������ �迭 �ҷ����� int [][] arr = new int[i][j];
		int [][] arr = new int[4][3];
/*		
		arr[0][0] = Integer.parseInt(JOptionPane.showInputDialog("1�� �л� 1�� ���� ���� �Է�"));
		arr[0][1] = Integer.parseInt(JOptionPane.showInputDialog("1�� �л� 2�� ���� ���� �Է�"));
		arr[0][2] = Integer.parseInt(JOptionPane.showInputDialog("1�� �л� 3�� ���� ���� �Է�"));

		arr[1][0] = Integer.parseInt(JOptionPane.showInputDialog("2�� �л� 1�� ���� ���� �Է�"));
		arr[1][1] = Integer.parseInt(JOptionPane.showInputDialog("2�� �л� 2�� ���� ���� �Է�"));
		arr[1][2] = Integer.parseInt(JOptionPane.showInputDialog("2�� �л� 3�� ���� ���� �Է�"));
		
		arr[2][0] = Integer.parseInt(JOptionPane.showInputDialog("3�� �л� 1�� ���� ���� �Է�"));
		arr[2][1] = Integer.parseInt(JOptionPane.showInputDialog("3�� �л� 2�� ���� ���� �Է�"));
		arr[2][2] = Integer.parseInt(JOptionPane.showInputDialog("3�� �л� 3�� ���� ���� �Է�"));
		
		arr[3][0] = Integer.parseInt(JOptionPane.showInputDialog("4�� �л� 1�� ���� ���� �Է�"));
		arr[3][1] = Integer.parseInt(JOptionPane.showInputDialog("4�� �л� 2�� ���� ���� �Է�"));
		arr[3][2] = Integer.parseInt(JOptionPane.showInputDialog("4�� �л� 3�� ���� ���� �Է�"));
*/
		int hakSum[] = new int [4];	//4�� ������ �����ϴ� ����Ҹ� ����� ����!
		for (int i=0; i<4; i++){
			for (int j=0; j<arr[i].length; j++){	//j : �л����� �����ȣ
				arr[i][j] =  Integer.parseInt(JOptionPane.showInputDialog(i+1+"�� �л� "+(j+1)+"�� ���� ���� �Է�"));
				hakSum[i] += arr[i][j];
				//���
				
			}
		}
		System.out.println("====����ϱ�====");
		System.out.println("����\t����\t����\t����");
		for(int i=0; i<arr.length;i++){//�л�����
			for(int j=0; j<arr[i].length; j++){//�� ��������
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println(hakSum[i]);
		}
		
		
		
	}

}
