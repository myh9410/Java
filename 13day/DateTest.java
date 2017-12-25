package dateex;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
	날짜와 시간에 관련된 두개의 클래스
	
			Date클래스		 				Calendar클래스
			  구버전							신버전
		   간단하게 출력			시간과 날짜 항목이 아주 자세하다.
		   			<----------------------------
		   			---------------------------->
		   날짜 세팅이 어렵다.
(deprecated : 반대,사용하지 말것.)			전부 Calendar를 사용할 것
											static 메서드로 만든다.(하나만 만들어 쓴다.)
												- 싱글턴 패턴
			
			
			
			
 */
public class DateTest {
	
	public static void main(String[] args) {
		Date d = new Date();	//간단하게 출력
		System.out.println(d);
		//날짜 형식을 지정시켜 놓고.. 형식에 d를 대입시켜서 출력할 거다!
		//패턴 문자!!
		//y : year	M : Month d : day	h : hour m : min s : sec
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		//시간을 삽입하자 : format(시간)
		String today = sdf.format(d);
		//String today = sdf2.format(d);
		//String today = sdf3.format(d);
		System.out.println(today);
	}
}
