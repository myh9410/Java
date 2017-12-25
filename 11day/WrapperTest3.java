package wrapperex;
/*
	wrapper : 자동 포장, 자동 해체

 */
public class WrapperTest3 {
				//매개변수 4개 있다.
	static void printData(int num, double data, String str, boolean bool){
		
	}
	static void printData(Object [] obj){
		//여러 타입이 묶여있다 보니까.. 연산.. 불편하다.
		for(int i=0;i<obj.length;i++){
			
			//매 요소마다 어떤 타입인지 체크해야하는 번거로움이 있다.
			if(obj[i] instanceof Boolean){
				
			}else if(obj[i] instanceof String){
				
			}else if(obj[i] instanceof Integer){
				
			}
		}
	}
	public static void main(String[] args) {
		
		//다양한 데이터를 누군가 갖고 있다.
		// 메서드에 보내보자!
		// 10, 5.6	"안녕" true
		
		printData(10, 5.6, "안녕", true);
		
		//쟤네들을 하나로 묶으면 관리하기 편하겠다.
		//배열을 선택해 볼까?		불가능
		//double [] ar = {10, 5.6, "안녕", true};
		
		Integer i = new Integer(10);
		Double d = new Double(5.6);
		String s = new String("안녕");
		Boolean b = new Boolean(true);
		
		Object [] ar = {i, d, s, b};
		
		printData(ar);
	}
}