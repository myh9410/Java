package constructorex;

public class DateType {
	
	private int year;
	private int month;
	private int date;
	public DateType() {
		//Ư�� �����ͷ� �ʱ�ȭ ����!
		year=2017; month=2;  date=20;
	}
	DateType(int y, int m, int d){
		year=y; month=m; date=d;
	}
	
	void setDate(int year, int month, int day){
		this.year=year;	this.month=month; this.date=day;
	}
	void printDate(){
		System.out.println(year+"�� "+month+"�� "+date+"�� ");
	}
	
	public static void main(String[] args) {
		
		DateType now = new DateType();
		
		now.printDate();  //���� ��¥�� ��µȴ�!!!
		
		now.setDate(1967, 8, 13);
		now.printDate();
		
		DateType yesterday=new DateType(2017, 2, 19);
		yesterday.printDate();
		

	}

}
