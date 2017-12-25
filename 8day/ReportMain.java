package modifierex;

public class ReportMain {

	public static void main(String[] args) {
		ReportCard hak1 = new ReportCard();
		//hak1.bun = 1;		hak1.name = "홍길동";
		hak1.setScore(1, "문용호", 10, 20, 30);
		
		//hak1.kor + hak1.eng + hak1.math;
		System.out.println("1번 학생 총점 : " + hak1.getTotal());
		
		
		ReportCard hak2 = new ReportCard();
		hak2.setScore(1, "가나다", 11, 21, 31);
		System.out.println("1번 학생 총점 : " + hak2.getTotal());
		
		//hak3 시험을 보는데... 띄엄띄엄 하루에 한과목씩...
		ReportCard hak3 = new ReportCard();
		//hak3.bun = 3;	//>>중매쟁이가 필요하다!
						//	(메서드, 데이터를 연결)
		//hak3.세팅(3);
		//hak3.set변수(3);
		hak3.setBun(3);
		
		hak3.setName("이순신");
		hak3.setKor(310);
		hak3.setEng(321);
		hak3.setMath(320);	//오타가 난다면?	--> 접근할 수 있는 수준을 지정해주는 access modifier
	}

}
