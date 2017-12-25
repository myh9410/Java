package stringex;
/*
	String

		-메서드 찾아쓰기

				한 문장을 특정 기호(문자)로 잘라낼 수 있다!
				문자열 분리 - split("분리할 문자")
 */
public class StringTest6 {
	
	public static void main(String[] args) {
		int sum=0; 
		int toInt = 0;
		String scores = "10,20,30,40,50,61";
		//각 데이터를 구하기 위해, ","로 분리해야겠다.
		// {"10","20","30", ......}
		
		//[0],[1],[2] ... 각 문자열들을 배열에서
		// 하나씩 꺼내오자! 꺼내올 때마다 연산을 위해서 정수형으로 파싱해야겠다.
		// 그 후에 정수형 데이터를 누적하면 된다.!!!
		String[] scr = scores.split(",");
		for (int i=0;i<scr.length;i++){			//scr.length는 scores를 split한 문자열배열 scr의 갯수!!!
			toInt = Integer.parseInt(scr[i]);	//.trim() 공백이 있을 때 공백을 없애준다.... 10, 20이라고 해버리고
												// ,만 제거하면 공백이 남아서 파싱을 못하는걸 방지해줌.
			sum += toInt;
		}
		System.out.println(sum);
		System.out.printf("%.1f\n", (double)sum/scr.length);
	}
}
