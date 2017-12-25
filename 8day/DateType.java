package constructorex;

public class DateType {
	
	private int year;
	private int month;
	private int date;
	public DateType() {
		//특정 데이터로 초기화 시켜!
		year=2017; month=2;  date=20;
	}
	DateType(int y, int m, int d){
		year=y; month=m; date=d;
	}
	
	void setDate(int year, int month, int day){
		this.year=year;	this.month=month; this.date=day;
	}
	void printDate(){
		System.out.println(year+"년 "+month+"월 "+date+"일 ");
	}
	
	public static void main(String[] args) {
		
		DateType now = new DateType();
		
		now.printDate();  //오늘 날짜가 출력된다!!!
		
		now.setDate(1967, 8, 13);
		now.printDate();
		
		DateType yesterday=new DateType(2017, 2, 19);
		yesterday.printDate();
		

	}

}
