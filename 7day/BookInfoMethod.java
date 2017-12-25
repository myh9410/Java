package classex;
/*
	패키지 - 폴더
	자바소스에 클래스를 만들었을 때, 한 패키지에 모두 분리된다.
		(같은 폴더에 담긴다.)
	그래서 페이지 단위로 클래스를 만들었다고 해서 별도로 클래스를 관리하지 않고...
	한 폴더에 모두 모이게 된다. 따라서 같은 클래스 이름이 있으면
	에러가 된다.





	이름	저자	가격	페이지
 */


//데이터 모델링!
class BookInfo2{
	String title;
	String writer;
	String price;
	int page;
	
	//메서드 만들기
	void printBookInfo(){
		//메서드는 객체들이 공동으로 사용한다.
		//그래서 특정한 객체만 부를 수 없다!
		//언제든 모든 객체를 대신할 수 있는 변수가 필요하다.
		//그 변수를 this.으로 부르면 된다.
		//이 this. 은 모든 메서드에 들어 있기 때문에...
		//당연히 존재하므로, 생략해서 잘 안쓴다.
		//System.out.println("제목 : "+ this.title);
		//System.out.println("제목 : "+ title);
		//this.		"이 메서드를 부르고 있는 객체의"
		
		
		System.out.printf("%s\n%s\t%s\t%d쪽\n",this.title,this.writer,this.price,this.page);
		System.out.println("=====================================================================");
	}
}


public class BookInfoMethod {
	public static void main(String[] args) {
		//객체 만들기
		BookInfo2 bSam = new BookInfo2();
		BookInfo2 bHarry = new BookInfo2();
		BookInfo2 bDal = new BookInfo2();
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
		bSam.printBookInfo();
		bHarry.printBookInfo();
		bDal.printBookInfo();
	}

}
