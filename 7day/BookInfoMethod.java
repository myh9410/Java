package classex;
/*
	��Ű�� - ����
	�ڹټҽ��� Ŭ������ ������� ��, �� ��Ű���� ��� �и��ȴ�.
		(���� ������ ����.)
	�׷��� ������ ������ Ŭ������ ������ٰ� �ؼ� ������ Ŭ������ �������� �ʰ�...
	�� ������ ��� ���̰� �ȴ�. ���� ���� Ŭ���� �̸��� ������
	������ �ȴ�.





	�̸�	����	����	������
 */


//������ �𵨸�!
class BookInfo2{
	String title;
	String writer;
	String price;
	int page;
	
	//�޼��� �����
	void printBookInfo(){
		//�޼���� ��ü���� �������� ����Ѵ�.
		//�׷��� Ư���� ��ü�� �θ� �� ����!
		//������ ��� ��ü�� ����� �� �ִ� ������ �ʿ��ϴ�.
		//�� ������ this.���� �θ��� �ȴ�.
		//�� this. �� ��� �޼��忡 ��� �ֱ� ������...
		//�翬�� �����ϹǷ�, �����ؼ� �� �Ⱦ���.
		//System.out.println("���� : "+ this.title);
		//System.out.println("���� : "+ title);
		//this.		"�� �޼��带 �θ��� �ִ� ��ü��"
		
		
		System.out.printf("%s\n%s\t%s\t%d��\n",this.title,this.writer,this.price,this.page);
		System.out.println("=====================================================================");
	}
}


public class BookInfoMethod {
	public static void main(String[] args) {
		//��ü �����
		BookInfo2 bSam = new BookInfo2();
		BookInfo2 bHarry = new BookInfo2();
		BookInfo2 bDal = new BookInfo2();
		//��ü ����
		bSam.title = "�ﱹ��";
		bSam.writer = "������";
		bSam.price = "5000��";
		bSam.page = 562;
		
		
		bHarry.title = "�ظ�����";
		bHarry.writer = "�Ѹ�";
		bHarry.price = "6000��";
		bHarry.page = 376;
		
		
		bDal.title = "�޺�������";
		bDal.writer = "���ּ�";
		bDal.price = "9000��";
		bDal.page = 270;
		
		//��� 3��
		bSam.printBookInfo();
		bHarry.printBookInfo();
		bDal.printBookInfo();
	}

}
