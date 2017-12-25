package modifierex;

import javax.swing.JOptionPane;

class Car{
	//red, green, blue
	//좌석 수 : 2, 5, 7 인승
	//가격 1500~ 5000
	//년식 2010~2017
	//인스턴스 변수는 자동 초기화 된다. (지역변수는 초기화가 필요하다)
	//private => 숨겨놓자 : information hiding 정보 은폐
	private String bodyColor;
	private int seat;
	private int price;
	private int year;
	
//setter들을 만들자		setter, set property

	public void setBodyColor(String bodyColor) {
		if (bodyColor.equals("red") || bodyColor.equals("green") || bodyColor.equals("blue")){
			this.bodyColor = bodyColor;
		}else{
			bodyColor = "색상이 없습니다.";
		}
	}
	public void setSeat(int seat) {
		if (seat ==2 || seat == 5 || seat == 7){
			this.seat = seat;
		}else{
			System.out.println("다시 입력하세요");
		}
	}
	public void setPrice(int price) {
		if (1500<=price && price <= 5000){
			this.price = price;
		}else{
			System.out.println("가격대가 이상해요!(1500~5000까지만!!)");
		}
	}
	public void setYear(int year) {
		if (2010<=year && year <= 2017){
			this.year = year;
		}else{
			System.out.println("2010년식부터 2017년식까지만 있어요");
		}
	}
//getter만들기
	/*
			리턴타입	메서드(){
			
				return 인스턴스 변수;
			}
			
			리턴타입	get변수(){
				return 인스턴스 변수;
			}
	 */	
	public String getBodyColor() {
		return bodyColor;
	}
	
	public int getSeat() {
		return seat;
	}
	public int getPrice() {
		return price;
	}
	
	public int getYear() {
		return year;
	}
/////////////////////////////////////////////////////////////////////////////////
	//편의(비즈니스) 메서드
	public void confirmOrder(){
		System.out.println("***주문 내역 입니다***");
		System.out.println("색상 : "+bodyColor);
		System.out.println("가격 : "+price+"원("+seat+"인승)");
		System.out.println("년식 : "+year+"년도 생산");
		
	}
/*	public void setOrder(){
		String b = JOptionPane.showInputDialog("색상을 입력해주세요(red, green, blue)");
		int s = Integer.parseInt(JOptionPane.showInputDialog("몇 인승을 원하십니까?(2,5,7인승)"));
		int p = Integer.parseInt(JOptionPane.showInputDialog("어느 가격대를 원하십니까?(1500~5000)"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("년식을 입력해주세요(2010~2017)"));
		bodyColor = b;
		seat = s; price = p; year = y;
	}*/
	//편의(비즈니스) 메서드
	public void setOrder(String color, int seat, int price, int year){
		//if (color.equals("red") || color.equals("blue")	<<이걸 수행하는 메서드를 부르자!
		//메서드 -> 다른 메서드를 호출할 수 있다!
		//this.메서드(); <<this 생략 가능
		setBodyColor(color);
		setPrice(price);
		setSeat(seat);
		setYear(year);
	}

}
public class CarOrder {
	
	public static void main(String[] args) {
		//주문 세팅하기!
		Car cus1 = new Car();
		cus1.setBodyColor("red");
		cus1.setSeat(5);
		cus1.setPrice(2000);
		cus1.setYear(2005);
		
		cus1.confirmOrder();
		//getter 메서드 : 변수를 외부에서 볼 수 있도록 만드는 메서드!
		//System.out.println("가격 : " + cus1.price +"원");//private이므로 볼 수 없음
		
		
		Car myOrder = new Car();
		myOrder.setOrder("red", 7, 5000, 2017);
		myOrder.confirmOrder();
	}
}
