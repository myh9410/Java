package modifierex;

public class ReportMain {

	public static void main(String[] args) {
		ReportCard hak1 = new ReportCard();
		//hak1.bun = 1;		hak1.name = "ȫ�浿";
		hak1.setScore(1, "����ȣ", 10, 20, 30);
		
		//hak1.kor + hak1.eng + hak1.math;
		System.out.println("1�� �л� ���� : " + hak1.getTotal());
		
		
		ReportCard hak2 = new ReportCard();
		hak2.setScore(1, "������", 11, 21, 31);
		System.out.println("1�� �л� ���� : " + hak2.getTotal());
		
		//hak3 ������ ���µ�... ������ �Ϸ翡 �Ѱ���...
		ReportCard hak3 = new ReportCard();
		//hak3.bun = 3;	//>>�߸����̰� �ʿ��ϴ�!
						//	(�޼���, �����͸� ����)
		//hak3.����(3);
		//hak3.set����(3);
		hak3.setBun(3);
		
		hak3.setName("�̼���");
		hak3.setKor(310);
		hak3.setEng(321);
		hak3.setMath(320);	//��Ÿ�� ���ٸ�?	--> ������ �� �ִ� ������ �������ִ� access modifier
	}

}
