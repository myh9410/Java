package whileex;
/*
	반복문 (loop)	-	for		while		do while
	
	
	
	//갯수가 있을 때 제어하면 편하다.
	for(초;조;증감){}	//어디서부터 몇번 할까?
						
		
	
	//무한 반복 만들 때 편하다!
	while(조건식){}		//반복할 거니? 말거니?
	
	
 */
public class WhileTest {
	public static void main(String[] args) {
		int i=0;
		while(i<5){
			System.out.println(i+1+". ㅎㅇ");
			i++;
		}
		System.out.println("/////////////////////////////////////////");
		
		for (i=0;i<5;i++){
			System.out.println(i+1+". ㅎㅇ");
			
		i=0;	//재사용을 위해 초기화를 하자.
		while(i<5)
			System.out.println(++i+". ㅎㅇ");		
			
		}
	}

}
