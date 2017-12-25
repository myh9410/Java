package studentMain;

import javax.swing.JOptionPane;

import daoex.StudentDAO;
public class StudnetMain {
	
	static int menu(){
		String menu ="** 번동 중학교 성적 관리 프로그램 **\n";
		menu += "1.학생 정보 출력\n";
		menu += "2.학생 정보 입력\n";
		menu += "3.학생 정보 삭제\n";
		menu += "4.학생 정보 수정\n";
		menu += "5.프로그램 종료\n";
		
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}
	
	public static void main(String[] args) {
		
		int bun = 0;	//bun에 menu에서 입력받은 번호 저장
		StudentDAO dao = new StudentDAO();
		while ((bun = menu())	!= 5){
			switch(bun){
			case 1: dao.print(); break;//출력시 ArrayList의 내용 보여주고 데이터 저장.
			case 2: dao.insert(); break;
			case 3: dao.delete(); break;
			case 4: dao.update(); break;
			}
		}
		JOptionPane.showMessageDialog(null, "수고하셨습니다");
	}

	
	
}
