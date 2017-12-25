package extendsex;
class Date{
	//public Date() {}		//Clock ���� ���� �⺻ �����ڸ� ctrl spacebar�� ���ؼ� ����.
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
class Clock extends Date{	//�⺻ �����ڰ� ����
	Clock(){				//1.�⺻ �����ڸ� �����	2. super(-1,-1,-1)�� �־ ������ �ִ� 
							//							�����ڸ� ��� ����ϰڴ�.(��,��,���� -1�� �� ���� ������...)
		super(-1,-1,-1);
	}
}
class Time extends Date{
	// Date.year, Date.month, Date.day
	int hour, min, sec;
	public Time(int year, int month, int day, int hour, int min, int sec) {
		super(year, month, day);
		//�θ�� ���� �ʱ�ȭ �ϰ� �ڽ��� ���� ����!		//super : �θ���...		�θ� �� �ʱ�ȭ	������ �������
		//�θ� �� ���� �ʱ�ȭ ���� �� ����
		//Implicit super constructor Date() is undefined. Must explicitly invoke another constructor
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	void printTime(){
		//System.out.println(year+"��"+month+"��"+day+"��"+hour+":"+min+":"+sec); //private���� ������ -> getter������ش�.
		System.out.println(getYear()+"��"+getMonth()+"��"+getDay()+"��"+hour+":"+min+":"+sec);
	}
}
public class InitializeTest {
	public static void main(String[] args) {
		Time dateAndTime = new Time(2017, 2, 21, 1, 26, 30);
		dateAndTime.printTime();
	}
}
