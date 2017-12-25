package mathex;
/*
	(int)(Math.random()*총갯수+시작값)
 */	
public class MathTest2 {
	
	public static void main(String[] args) {
		String [] lucky = {
			"이성과의 멋진 데이트가 있어요~",	
			"돈을 많이 줍네요~",	
			"빨간색을 선택하세요",	
			"오늘은 왼쪽이 좋네요",	
			"맛있는 저녁식사가 기다립니다.",	
			"오랜 친구를 우연히 만납니다.",	
			"오늘 꼭 로또를 사세요 꼭이요!~!자동으로",	
			"색깔을 잘 모릅니다.",	
		};
		int ran = (int)(Math.random()*lucky.length+0);
		
		System.out.println(lucky[ran]);
	}
}
