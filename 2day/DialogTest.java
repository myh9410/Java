package dialogex;

import javax.swing.JOptionPane;

/*
  	��ȭ���� �θ��� -> ���ڿ��� �Է¹޴´�.
  		String sss = JOptionPane.showInputDialog();
  		
  	���� ���󼭴� ����, �Ǽ� ������ �Ľ��ؼ� �����;� �Ѵ�.
  	
  			int i = Integer.parseInt( sss );
  			double d = Double.parseDouble( sss );
  	
 */
public class DialogTest {
	
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("�̸� �Է�");
		String age = JOptionPane.showInputDialog("���� �Է�");
		String frAge = JOptionPane.showInputDialog("¦ ���� �Է�");
		
		int ageInt = Integer.parseInt(age);
		int frAgeInt = Integer.parseInt(frAge);
		int totAge = ageInt + frAgeInt;
		
		
		
		//���
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
		System.out.println("¦ ���� : "+frAge);
		System.out.println("�� : "+totAge);
		
	}
}
