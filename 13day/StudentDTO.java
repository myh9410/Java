package modelex;

//학생의 정보를 하나로 묶기 위한 클래스 모델!
public class StudentDTO {
	String name;
	int kor;
	int eng;
	int math;
	//생성자
	public StudentDTO(String name, int kor, int eng, int math) {	//학생 정보
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	int getTot(){	//총점 
		return kor+eng+math;
	}
	String getAvg(){	//평균
		return String.format("%.1f", getTot()/3.0);
	}
	//비즈니스 메서드
	@Override
	public String toString() {//toString이 해쉬코드를 내주니까 재정의를 통해서 원하는 정보를 얻을 수 있도록 함.
		return name+"\t"
			+kor+"\t"
			+eng+"\t"
			+math+"\t"
			+getTot()+"\t"
			+getAvg()+"\t";
	}
	
}
