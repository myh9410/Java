package studentMain;

import javax.swing.JOptionPane;

import daoex.StudentDAO;
public class StudnetMain {
	
	static int menu(){
		String menu ="** ���� ���б� ���� ���� ���α׷� **\n";
		menu += "1.�л� ���� ���\n";
		menu += "2.�л� ���� �Է�\n";
		menu += "3.�л� ���� ����\n";
		menu += "4.�л� ���� ����\n";
		menu += "5.���α׷� ����\n";
		
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}
	
	public static void main(String[] args) {
		
		int bun = 0;	//bun�� menu���� �Է¹��� ��ȣ ����
		StudentDAO dao = new StudentDAO();
		while ((bun = menu())	!= 5){
			switch(bun){
			case 1: dao.print(); break;//��½� ArrayList�� ���� �����ְ� ������ ����.
			case 2: dao.insert(); break;
			case 3: dao.delete(); break;
			case 4: dao.update(); break;
			}
		}
		JOptionPane.showMessageDialog(null, "�����ϼ̽��ϴ�");
	}

	
	
}
