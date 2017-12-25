package extendsex;

class Emp{
	String name;
	String address;
	public Emp(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	void printEmpInfo(){
		System.out.println("이름 : "+name);
		System.out.println("주소 : "+address);			
	}
	
	
}

class Regular extends Emp{
	int month;		//근무 개월 수
	int salary;		//급여
	public Regular(String name, String address, int month, int salary) {
		super(name, address);
		this.month = month;
		this.salary = salary;
	}
	private int getSalaryMonthly(){
		return month*salary;
	}
	public void printReg(){
		//System.out.println("이름 : "+name);
		//System.out.println("주소 : "+address);		//이름 주소 부모한테서 출력받기
		super.printEmpInfo();  		//super.으로 부모에 있는 생성자 불러옴.
									//super.도 this.처럼 생략 가능
									//메서드가 겹치면 this.이나 super.으로 무엇을 불러올지 명확히 해줌.
		System.out.println("급여("+month+"개월) : "+ +getSalaryMonthly()+"원");
	}
}

class PartTime extends Emp{
	int hour;
	int hourMoney;		//몇 일동안 몇 시간?? 일했지
	public PartTime(String name, String address, int hour, int hourMoney) {
		super(name, address);
		this.hour = hour;
		this.hourMoney = hourMoney;
	}
	private int getSalaryEmp(){
		return hour*hourMoney;
	}
	public void printEmpMoney(){
		//System.out.println("이름 : "+name);
		//System.out.println("주소 : "+address);			//이름 주소 부모한테서 출력받기
		super.printEmpInfo();
		System.out.println("급여("+hour+"시간) :" + getSalaryEmp()+"원");
	}
}
public class EmpMain {
	
	public static void main(String[] args) {
		Regular hgd = new Regular("홍길동", "서울시 강남구 역삼동", 12, 1000000);
		hgd.printReg();
		PartTime kkc = new PartTime("강감찬", "경기도 안양시", 6, 6500);
		kkc.printEmpMoney();
	}

}
