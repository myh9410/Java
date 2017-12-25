package staticex;
class Student{
	
	private static int stBun = 0;
	
	int bun;	String name;	int kor;	int eng;
	
	//지금 생성자 처럼.. .메서드의 이름이 똑같이  클래스에
	//올 수 있다.
	//호출할때 무지 헷갈릴 텐데..?  대신,  뒤에 매개변수들이
	//다 다르다.... 그래서 어떤 메서드가 호출 될지 구분이
	//가능하다.
	
	//메서드의 이름을 절약할 수 잇다. : 오버로딩!
	//"메서드의 이름이 같은대신 매개변수의 스타일을 다 다르게 만든 경우"
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
		Student st1 = new Student("홍1", 10, 20);
		Student st2 = new Student("홍2", 10, 20);
		Student st3 = new Student("홍3", 10, 20);
		Student st4 = new Student("홍4", 10, 20);
		
		
		Student st5 = new Student("홍4", 10);
		
		
		

	}

}





