package productex;

abstract class ProductItem{
	String type;	//tv?,	radio?	제품의 카테고리 물어봄
	String brand;
	int price;
	
	public ProductItem(String type, String brand, int price) {
		this.type = type;
		this.brand = brand;
		this.price = price;
	}
	void printInfo(){
		System.out.println(type+" : "+brand + "("+price+"원");
	}
	abstract void manual();
}

class Mp3 extends ProductItem{
	public Mp3(String type, String brand, int price) {
		super(type, brand, price);
	}

	@Override
	void manual() {
		System.out.println("MP3 제품 설명서");
	}
	
}
class Desk extends ProductItem{

	public Desk(String type, String brand, int price) {
		super(type, brand, price);
	}
	
	@Override
	void manual() {
		System.out.println("DESK");
		
	}	
}
class RadioTV2 extends ProductItem{

	public RadioTV2(String type, String brand, int price) {
		super(type, brand, price);
	}

	@Override
	void manual() {		
		System.out.println("라디오");
	}
	
}
class UseProduct{
	//오버로딩
	void useful(ProductItem item){
		item.manual();
	}
}

public class AbstractMain {
	public static void main(String[] args) {
		UseProduct use = new UseProduct();	//제품을 사용하기 위한 클래스!
		use.useful(new Mp3("mp3","아이리버",300));	//객체를 만들어야 인스턴스를 만들 수 있다.
		use.useful(new Desk("데스크탑","dell",1500));
		use.useful(new RadioTV2("라디오 TV","요성",1900));
	}
}
