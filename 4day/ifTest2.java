package ifex;

import javax.swing.JOptionPane;

/*
	�Է� - ó�� - ��� ����.

	if(���ǽ�=>����� : ����T/F){
	
	}
	
	if(����){			//���� "��"�̶��.... ��������
							   "����"�̶��..  if���� ��������.
	
	
	}
	
	
	
 */
public class ifTest2 {
	
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("���� �Է�"));
		
		//���� �Էµ� ���� ������.. �� ���� �ι�� ���� ��
		//����� �ƴϸ� �׳� �� ���� �״�� ����ϸ� �ȴ�.
		int result = 0;
		if(num>0){
			result = num*2;		//num=num*2
		}				// ������ ������ �ѹ����̶�� { , }�� ��� �������.
		//������� ��������!
		if(num<0){
			result = num*num;
			
		}
		System.out.println("ó�� �Է°� : "+ num + "\n��� ��� : " + num);
	}

}
