package staticex;
class Student{
	
	private static int stBun = 0;
	
	int bun;	String name;	int kor;	int eng;
	
	//���� ������ ó��.. .�޼����� �̸��� �Ȱ���  Ŭ������
	//�� �� �ִ�.
	//ȣ���Ҷ� ���� �򰥸� �ٵ�..?  ���,  �ڿ� �Ű���������
	//�� �ٸ���.... �׷��� � �޼��尡 ȣ�� ���� ������
	//�����ϴ�.
	
	//�޼����� �̸��� ������ �� �մ�. : �����ε�!
	//"�޼����� �̸��� ������� �Ű������� ��Ÿ���� �� �ٸ��� ���� ���"
	public Student(String name, int kor){
		stBun++;
		bun = stBun;
		this.name=name;   this.kor=kor;
		eng = -1;
	}
	public Student(String name, double  kor){
		stBun++;
		bun = stBun;
		this.name=name;   this.kor=(int)kor;		eng = -1;
	}
	
	public Student(String name, int kor, int eng) {
		super();
		stBun++;
		bun=stBun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	public Student(int bun, String name, int kor, int eng) {
		this.bun = bun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	
	void printInfo(){
		System.out.println(bun+" "+name+" "+kor+" "+eng);
	}
}
public class StudentInfo {

	public static void main(String[] args) {
		Student st1 = new Student("ȫ1", 10, 20);
		Student st2 = new Student("ȫ2", 10, 20);
		Student st3 = new Student("ȫ3", 10, 20);
		Student st4 = new Student("ȫ4", 10, 20);
		
		
		Student st5 = new Student("ȫ4", 10);
		
		
		

	}

}





