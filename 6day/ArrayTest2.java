package arrayex;

import javax.swing.JOptionPane;

/*
	�迭 : ������ ó��
	
	ö���� 6�� ������ ����.
	�� ������ �Է¹��� ��
	����/����� ���غ���!
 */
public class ArrayTest2 {
	
	public static void main(String[] args) {
		int [] arr = new int[6];
		int sum = 0;
		for (int i=0; i<6; i++){
			arr[i] = Integer.parseInt(JOptionPane.showInputDialog(i+1+"�� ����"));
		}
//		arr[0] = Integer.parseInt(JOptionPane.showInputDialog("����1 �Է�"));
//		arr[1] = Integer.parseInt(JOptionPane.showInputDialog("����2 �Է�"));
//		arr[2] = Integer.parseInt(JOptionPane.showInputDialog("����3 �Է�"));
//		arr[3] = Integer.parseInt(JOptionPane.showInputDialog("����4 �Է�"));
//		arr[4] = Integer.parseInt(JOptionPane.showInputDialog("����5 �Է�"));
//		arr[5] = Integer.parseInt(JOptionPane.showInputDialog("����6 �Է�"));
		
		for (int i=0;i<6;i++){
			System.out.println(i+1+". "+arr[i]+"��");
			sum += arr[i];
		}
		System.out.println("���� : " +sum+"��");
		System.out.printf("��� : %.1f\n",sum/(double)6.0);
		
		
		
		
	}

}
