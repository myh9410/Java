package ifelseex;

import javax.swing.JOptionPane;

/*	
  */
public class IfElse3����ȣ {

	public static void main(String[] args) {
		String menu = "1.¥��� 2.«�� 3.�ߵ����� 4.�δ��";
		int bunho = Integer.parseInt(JOptionPane.showInputDialog(menu));
		//���� bunho 1~4�� �ȵ��Դٸ� -> "�ȳ��� ������"
		//					 ���Դٸ� -> � �޴����� �Ǵ�����! ���� if ~ else��!!
		if (!(1 <= bunho && bunho <= 4)){
			System.out.println("�ȳ��� ������.");
		}else if(bunho == 1){
			//System.out.println("1.¥���.... �߰��ֹ� 1.�����   2.���   3.��¥��");
			//���θ޴� �����
			//��ȭ���ڿ��� ��� �����
			String jjaMenu = "1.¥���.... \n�߰��ֹ� 1.�����   2.���   3.��¥��";
			int bunho2 = Integer.parseInt(JOptionPane.showInputDialog(jjaMenu));// bunho2�� �������� ���� ������ �� �������� ��밡��.
			
			String msg = "";
			if(bunho2 == 1){
				msg = "����� �ֹ��� 1000���� �߰��˴ϴ�.";
			}else if(bunho2 == 2){
				msg = "��� ������ 2�κ� �̻� �ֹ��� �˴ϴ�.";
			}else if(bunho2 == 3){
				msg = "����� �ֹ��� 1000���� �߰��˴ϴ�.";
			}
			System.out.println(msg);
			
		}else if(bunho == 2){
			System.out.println("2.«��.... �߰��ֹ� 1.�����   2.����");
		}else if(bunho == 3){
			System.out.println("3.�ߵ�����(5000��/��).... �߰��ֹ� 1.���κ�?");
		}else if(bunho == 4){
			System.out.println("4.�δ��(6000��/��).... �߰��ֹ� 1.�ܻ縮(2000��)	 2.���縮(1000��)	  3.��¥��");
		}
		
	}//end main
}//end class
