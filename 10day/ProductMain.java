package productex;

class Product{
	String brand;
	int price;
	public Product(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	void productInfo(){
		System.out.println(brand +"("+price+"원)");	//부모가 가지고 있으니까 자식도 쓸 수 있지.
	}
}
class TV extends Product{		//alt shift s  c .......	부모의 생성자 가져옴
	public TV(String brand, int price) {
		super(brand, price);
	}
	@Override
	void productInfo() {
		System.out.print("TV 입니다.");
		super.productInfo();
	}
}
class LcdTV extends TV{

	public LcdTV(String brand, int price) {
		super(brand, price);
	}
	@Override
	void productInfo() {
		System.out.print("LCD");
		super.productInfo();
	}
}

class RadioTV extends Product{
	public RadioTV(String brand, int price) {
		super(brand, price);
	}
}

class Notebook extends Product{
	public Notebook(String brand, int price) {
		super(brand, price);
	}
}

public class ProductMain {
	public static void main(String[] args) {
		TV lg = new TV("엘지",500);
				
		RadioTV lgR = new RadioTV("엘지라디오",50);
		
		Notebook lgN = new Notebook("엘지노트북",150);
		
		Product p = null;
		
		//다형성
		p = lg;
		p = lgR;
		p = lgN;
		
		//다형적 대입	=> 여러 종류(타입)의 상품을 하나로 묶음 배송 할 수 있게 됐다.
		Product [] cart = {lg, lgR, lgN};
		
		Product[]ar = new Product[3];
		//다형성.... 똑같은 기능을 수행하라고 시켰지만(.productInfo()) 결과값은 전부 다름.
		ar[0] = new Notebook("lg", 150);
		ar[0].productInfo();
		
				
		ar[1] = new RadioTV("아이리버", 50);
		ar[1].productInfo();
		
		
		ar[2] = new TV("삼성",200);
		ar[2].productInfo();
		
		
		p = new LcdTV("아남",300);
		p.productInfo();
		
		
		
		
	}
}
