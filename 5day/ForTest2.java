package forex;
/*
	무한루프 : 끝없이 돈다.
	조건	1. 처음에는 참이다.
			2. false가 안된다.
*/
public class ForTest2 {
	public static void main(String[] args) {
		//for(int i = 0; i>=0; i+=4){
		//for문에서는 조건식이 없을 때 무조건 참이다.
		for(int i = 0; ; i+=4){
			System.out.println("보행 수 : " + (i+1));
			
			//i가 90이 되면 "탈출"해라
			if (i>=90){		//근사치   i>=90
				System.out.println(i+1+"걸음~");
				break;	//반드시 loop문이나 switch문과 함께 쓰여야 함.
						//loop문이나 switch문없이 무언가를 끝내고 싶다면 : return;사용
			}
		}
		
		//System.out.println("목적지에 도달!!!");
	}

}
