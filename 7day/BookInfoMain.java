package classex;
/*
	�̸�	����	����	������
 */


//������ �𵨸�!
class BookInfo{
	String title;
	String writer;
	String price;
	int page;		//BookInfo��� Ŭ���� �ȿ� 
						//print�϶�� �޼��带 �߰���Ű�� ��¹��� ������ ���� �ʿ� X
	
}
public class BookInfoMain {
	public static void main(String[] args) {
		//��ü �����
		BookInfo bSam = new BookInfo();
		BookInfo bHarry = new BookInfo();
		BookInfo bDal = new BookInfo();
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
		System.out.printf("%s\n%s\t%s\t%d��\n",bSam.title,bSam.writer,bSam.price,bSam.page);
		System.out.println("=====================================================================");
		System.out.printf("%s\n%s\t%s\t%d��\n",bHarry.title,bHarry.writer,bHarry.price,bHarry.page);
		System.out.println("=====================================================================");
		System.out.printf("%s\n%s\t%s\t%d��\n",bDal.title,bDal.writer,bDal.price,bDal.page);
		System.out.println("=====================================================================");
	}

}
