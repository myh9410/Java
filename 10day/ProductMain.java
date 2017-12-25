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
		System.out.println(brand +"("+price+"��)");	//�θ� ������ �����ϱ� �ڽĵ� �� �� ����.
	}
}
class TV extends Product{		//alt shift s  c .......	�θ��� ������ ������
	public TV(String brand, int price) {
		super(brand, price);
	}
	@Override
	void productInfo() {
		System.out.print("TV �Դϴ�.");
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
		TV lg = new TV("����",500);
				
		RadioTV lgR = new RadioTV("��������",50);
		
		Notebook lgN = new Notebook("������Ʈ��",150);
		
		Product p = null;
		
		//������
		p = lg;
		p = lgR;
		p = lgN;
		
		//������ ����	=> ���� ����(Ÿ��)�� ��ǰ�� �ϳ��� ���� ��� �� �� �ְ� �ƴ�.
		Product [] cart = {lg, lgR, lgN};
		
		Product[]ar = new Product[3];
		//������.... �Ȱ��� ����� �����϶�� ��������(.productInfo()) ������� ���� �ٸ�.
		ar[0] = new Notebook("lg", 150);
		ar[0].productInfo();
		
				
		ar[1] = new RadioTV("���̸���", 50);
		ar[1].productInfo();
		
		
		ar[2] = new TV("�Ｚ",200);
		ar[2].productInfo();
		
		
		p = new LcdTV("�Ƴ�",300);
		p.productInfo();
		
		
		
		
	}
}
