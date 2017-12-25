package productex;

abstract class ProductItem{
	String type;	//tv?,	radio?	��ǰ�� ī�װ� ���
	String brand;
	int price;
	
	public ProductItem(String type, String brand, int price) {
		this.type = type;
		this.brand = brand;
		this.price = price;
	}
	void printInfo(){
		System.out.println(type+" : "+brand + "("+price+"��");
	}
	abstract void manual();
}

class Mp3 extends ProductItem{
	public Mp3(String type, String brand, int price) {
		super(type, brand, price);
	}

	@Override
	void manual() {
		System.out.println("MP3 ��ǰ ����");
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
		System.out.println("����");
	}
	
}
class UseProduct{
	//�����ε�
	void useful(ProductItem item){
		item.manual();
	}
}

public class AbstractMain {
	public static void main(String[] args) {
		UseProduct use = new UseProduct();	//��ǰ�� ����ϱ� ���� Ŭ����!
		use.useful(new Mp3("mp3","���̸���",300));	//��ü�� ������ �ν��Ͻ��� ���� �� �ִ�.
		use.useful(new Desk("����ũž","dell",1500));
		use.useful(new RadioTV2("���� TV","�伺",1900));
	}
}
