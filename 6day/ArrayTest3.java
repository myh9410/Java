package arrayex;

import javax.swing.JOptionPane;

/*
	�迭 : ������ ó��
	
	nSub�� ���� ������ ����. ���� �� �Է¹޾ƾ� �Ѵ�.
	new int[nSub]
	#1. �ʼ������� ������
	#2. ��ü������ 6������ ���� �� ����.
	#3. ��ü���� ������
		String [] arSub = {"����", "����", "����", "ü��", "����", "�̼�"}	//�Ͻ��� �迭, StringŸ��
	#4. ����� ���ý�, ������� �Է��ؾ��Ѵ�.
		����� : 4����  ---> ������ü
				 5����  ---> ������ü��
				 
	#5. ���			 
			������ ������ - ǥ�÷� ��Ÿ��.
			����	��� (�Ҽ��� ���ڸ�)
			
	#6. ���
			����	����	����	ü��	����	�̼�	����	���
ö��(6)		00		00		00		00		00		00		00		00.0
����(4)		00		00		00		00		--		--		00		00.0
�μ�(3)		00		00		00		--		--		--		00		00.0
				 
				 
 */
//�Է� -> ó�� -> ���
//�迭�� �������ϴµ� 3~6���� üũ
// ���� new int[����]
//for -> ���� �Է�+����
// ����迭! [0] : ���� [1] : ���� ....

//���
//�迭�� ���� ������ �ݺ��� ���
//for - ǥ��!! ��ü 6-�Է°����
public class ArrayTest3 {
	
	public static void main(String[] args) {
		//����� üũ
		int nSub = 0;
		String msg = "����� �Է�";
		do{
			nSub = Integer.parseInt(JOptionPane.showInputDialog(msg));
		//if (nSub�� 3~6�� �ƴϸ� �ٽ� �޾ƶ�!)	-	���ѷ����� ������ ��� �߸� �Է��ص� ��� �ٽ� �Է��ϵ���
			msg = "3~6�� �־�� �մϴ�.";
			
		}while(!(3<=nSub && nSub<=6));
		//�迭 �����
		int [] ar = new int[nSub];
		int sum = 0;//����
		String [] arSub = {"����", "����", "����", "ü��", "����", "�̼�"};
		String [] strResult = {"����", "���"};
		for (int i=0; i<nSub; i++){
			ar[i] = Integer.parseInt(JOptionPane.showInputDialog(arSub[i]+"���� �Է�"));//������� �������� ����.
			sum += ar[i];//ó��
		}
		//����ϱ�
		for (int i=0; i<6; i++){
			System.out.print(arSub[i] + "\t");
			
		}
		for(int i=0; i<2; i++){
			System.out.print(strResult[i]+ "\t");
		}
		System.out.println();//���� ����
		//#2. ���񰹼���ŭ �������� ��������!
		for (int i=0; i<nSub; i++){
			System.out.print(ar[i]+"\t");
		}
		//#3. ���� ��ģ ���� - ǥ��
		for(int i=0; i<6-nSub;i++){
			System.out.println("-\t");
		}
		//#4. ���� ���
		System.out.println(sum + "\t");
		System.out.printf("%d\t%.1f\n",sum, (double)sum/nSub);
		
		System.out.println();
		//2���л�
		
		//3���л�
		
	}

}
