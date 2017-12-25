package modifierex;

import javax.swing.JOptionPane;

class Car{
	//red, green, blue
	//�¼� �� : 2, 5, 7 �ν�
	//���� 1500~ 5000
	//��� 2010~2017
	//�ν��Ͻ� ������ �ڵ� �ʱ�ȭ �ȴ�. (���������� �ʱ�ȭ�� �ʿ��ϴ�)
	//private => ���ܳ��� : information hiding ���� ����
	private String bodyColor;
	private int seat;
	private int price;
	private int year;
	
//setter���� ������		setter, set property

	public void setBodyColor(String bodyColor) {
		if (bodyColor.equals("red") || bodyColor.equals("green") || bodyColor.equals("blue")){
			this.bodyColor = bodyColor;
		}else{
			bodyColor = "������ �����ϴ�.";
		}
	}
	public void setSeat(int seat) {
		if (seat ==2 || seat == 5 || seat == 7){
			this.seat = seat;
		}else{
			System.out.println("�ٽ� �Է��ϼ���");
		}
	}
	public void setPrice(int price) {
		if (1500<=price && price <= 5000){
			this.price = price;
		}else{
			System.out.println("���ݴ밡 �̻��ؿ�!(1500~5000������!!)");
		}
	}
	public void setYear(int year) {
		if (2010<=year && year <= 2017){
			this.year = year;
		}else{
			System.out.println("2010��ĺ��� 2017��ı����� �־��");
		}
	}
//getter�����
	/*
			����Ÿ��	�޼���(){
			
				return �ν��Ͻ� ����;
			}
			
			����Ÿ��	get����(){
				return �ν��Ͻ� ����;
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
	//����(����Ͻ�) �޼���
	public void confirmOrder(){
		System.out.println("***�ֹ� ���� �Դϴ�***");
		System.out.println("���� : "+bodyColor);
		System.out.println("���� : "+price+"��("+seat+"�ν�)");
		System.out.println("��� : "+year+"�⵵ ����");
		
	}
/*	public void setOrder(){
		String b = JOptionPane.showInputDialog("������ �Է����ּ���(red, green, blue)");
		int s = Integer.parseInt(JOptionPane.showInputDialog("�� �ν��� ���Ͻʴϱ�?(2,5,7�ν�)"));
		int p = Integer.parseInt(JOptionPane.showInputDialog("��� ���ݴ븦 ���Ͻʴϱ�?(1500~5000)"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("����� �Է����ּ���(2010~2017)"));
		bodyColor = b;
		seat = s; price = p; year = y;
	}*/
	//����(����Ͻ�) �޼���
	public void setOrder(String color, int seat, int price, int year){
		//if (color.equals("red") || color.equals("blue")	<<�̰� �����ϴ� �޼��带 �θ���!
		//�޼��� -> �ٸ� �޼��带 ȣ���� �� �ִ�!
		//this.�޼���(); <<this ���� ����
		setBodyColor(color);
		setPrice(price);
		setSeat(seat);
		setYear(year);
	}

}
public class CarOrder {
	
	public static void main(String[] args) {
		//�ֹ� �����ϱ�!
		Car cus1 = new Car();
		cus1.setBodyColor("red");
		cus1.setSeat(5);
		cus1.setPrice(2000);
		cus1.setYear(2005);
		
		cus1.confirmOrder();
		//getter �޼��� : ������ �ܺο��� �� �� �ֵ��� ����� �޼���!
		//System.out.println("���� : " + cus1.price +"��");//private�̹Ƿ� �� �� ����
		
		
		Car myOrder = new Car();
		myOrder.setOrder("red", 7, 5000, 2017);
		myOrder.confirmOrder();
	}
}
