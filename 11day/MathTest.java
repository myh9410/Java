package mathex;
/*
	Math.random() : 무작위(난수)
		난수 발생 메서드	:	rand() 0~32767중에서 하나 갖고온다! (C언어)
 								0.0 ~ 1.0							(JAVA)
//Math.			abs(absolute) - 절댓값구하기
 
 
 		(int)(Math.random()*총갯수+시작값)
 */	
public class MathTest {
	
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println((int)(Math.random()*10+0));	//0~9까지 10개
		}
		System.out.println(Math.random()*100+0);	//0~99까지 100개
	}
}
