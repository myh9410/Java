package classex;
/*
	이름	저자	가격	페이지
 */


//데이터 모델링!
class BookInfo{
	String title;
	String writer;
	String price;
	int page;		//BookInfo라는 클래스 안에 
						//print하라는 메서드를 추가시키면 출력문을 여러번 적을 필요 X
	
}
public class BookInfoMain {
	public static void main(String[] args) {
		//객체 만들기
		BookInfo bSam = new BookInfo();
		BookInfo bHarry = new BookInfo();
		BookInfo bDal = new BookInfo();
		//객체 대입
		bSam.title = "삼국지";
		bSam.writer = "나관중";
		bSam.price = "5000원";
		bSam.page = 562;
		
		
		bHarry.title = "해리포터";
		bHarry.writer = "롤링";
		bHarry.price = "6000원";
		bHarry.page = 376;
		
		
		bDal.title = "달빛조각사";
		bDal.writer = "나휘성";
		bDal.price = "9000원";
		bDal.page = 270;
		
		//출력 3권
		System.out.printf("%s\n%s\t%s\t%d쪽\n",bSam.title,bSam.writer,bSam.price,bSam.page);
		System.out.println("=====================================================================");
		System.out.printf("%s\n%s\t%s\t%d쪽\n",bHarry.title,bHarry.writer,bHarry.price,bHarry.page);
		System.out.println("=====================================================================");
		System.out.printf("%s\n%s\t%s\t%d쪽\n",bDal.title,bDal.writer,bDal.price,bDal.page);
		System.out.println("=====================================================================");
	}

}
