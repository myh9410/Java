package modifierex;

public class ReportCard {
	private int bun;
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public void setBun(int bun){
		this.bun = bun;	//this : 이 메서드를 부른 객체의
						//					(해시코드)	
		//매개변수와 인스턴스 변수가 겹칠때,
		//this.을 붙여줌
		
	}
	public void setName(String name){
		this.name = name;
	}
	public void setKor(int kor){
		//점수가 0에서 100사이일시에만 둘이 만나게 해준다.
		if (0<= kor && kor <=100)
			this.kor = kor;
		else
			System.out.println("국어 점수 이상!");
		//다시 입력시킬 수도 있다!!!
	}
	public void setEng(int eng) {
		if (0<= eng && eng <=100)
			this.eng = eng;
		else
			System.out.println("영어 점수 이상!");
	}
	public void setMath(int math) {
		if (0<= math && math <=100)
			this.math = math;
		else
			System.out.println("수학 점수 이상!");
	}
	//alt + shift + s, r누르면 Generate Getters and Setters나옴.
	//Select Setters누르면 만들지 않았던 나머지 setter
	//setMath와 setEng이 만들어짐.

	//편의 메서드 = 비지니스 메서드(편의를 위해)
	public void setScore(int b, String na, int k, int e, int m){
				//()안의 변수를 매개변수(파라미터) 라고 한다
				//class와 hak.setScore를 연결해주는 교두보역할
		bun = b; name = na; kor = k; eng = e; math = m;

	}
	//객체.총점을 가져다주는 메서드()
	public int getTotal(){
		return kor + eng + math;
	}
	
	
	
	
}
