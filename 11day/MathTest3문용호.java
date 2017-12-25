package mathex;
/*
	로또 1~45번중, 6개의 숫자를 꺼내온다.
	#1. 중복배제
	#2. 오름차순 필요
 */	
public class MathTest3문용호 {
	static void distinct(int [] lotto){							//distinct = 중복 배제
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1);
		}
		
	}
	static void sort(int [] lotto){								//sort = descending, ascending
		/*
			int year = 2;
			int month = 2017;
			
			int temp;
			temp = year;
			year = month;
			month = temp;
			
		 */
		
		//오름차순 정렬해서 출력하자 - 알고리즘(버블, 선택, 이분 ....)버블<선택<이분
		for (int i = 0; i < lotto.length; i++){
			System.out.println(lotto[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		
		int [] lotto = new int[6];
		
		distinct(lotto);
		
		sort(lotto);
		
		
		
		
		
		
		
	}
}
