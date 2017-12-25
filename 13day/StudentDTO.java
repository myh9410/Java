package modelex;

//�л��� ������ �ϳ��� ���� ���� Ŭ���� ��!
public class StudentDTO {
	String name;
	int kor;
	int eng;
	int math;
	//������
	public StudentDTO(String name, int kor, int eng, int math) {	//�л� ����
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
	int getTot(){	//���� 
		return kor+eng+math;
	}
	String getAvg(){	//���
		return String.format("%.1f", getTot()/3.0);
	}
	//����Ͻ� �޼���
	@Override
	public String toString() {//toString�� �ؽ��ڵ带 ���ִϱ� �����Ǹ� ���ؼ� ���ϴ� ������ ���� �� �ֵ��� ��.
		return name+"\t"
			+kor+"\t"
			+eng+"\t"
			+math+"\t"
			+getTot()+"\t"
			+getAvg()+"\t";
	}
	
}
