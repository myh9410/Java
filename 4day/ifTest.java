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
public class ifTest {
	
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("���� �Է�"));
		
		//���� �Էµ� ���� ������.. �� ���� �ι�� ���� ��
		//����� �ƴϸ� �׳� �� ���� �״�� ����ϸ� �ȴ�.
		
		if(num>0){
			num*=2;		//num=num*2
		}				// ������ ������ �ѹ����̶�� { , }�� ��� �������.
		System.out.println("��� : " + num);
		
	}

}
