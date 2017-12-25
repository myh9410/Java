package extendsex;
class Date{
	//public Date() {}		//Clock 오류 나서 기본 생성자를 ctrl spacebar를 통해서 만듬.
	private int year, month, day;

	public Date(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}
}
class Clock extends Date{	//기본 생성자가 없어
	Clock(){				//1.기본 생성자를 만든다	2. super(-1,-1,-1)을 넣어서 기존에 있는 
							//							생성자를 계속 사용하겠다.(년,월,일이 -1이 될 일은 없으니...)
		super(-1,-1,-1);
	}
}
class Time extends Date{
	// Date.year, Date.month, Date.day
	int hour, min, sec;
	public Time(int year, int month, int day, int hour, int min, int sec) {
		super(year, month, day);
		//부모걸 먼저 초기화 하고 자식이 다음 순서!		//super : 부모의...		부모 거 초기화	생성자 만들어줌
		//부모 거 먼저 초기화 안할 시 오류
		//Implicit super constructor Date() is undefined. Must explicitly invoke another constructor
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	void printTime(){
		//System.out.println(year+"년"+month+"월"+day+"일"+hour+":"+min+":"+sec); //private으로 막혔음 -> getter만들어준다.
		System.out.println(getYear()+"년"+getMonth()+"월"+getDay()+"일"+hour+":"+min+":"+sec);
	}
}
public class InitializeTest {
	public static void main(String[] args) {
		Time dateAndTime = new Time(2017, 2, 21, 1, 26, 30);
		dateAndTime.printTime();
	}
}
