package arrayex;
/*
	배열 만들기 / 초기화 / 일괄처리
 */
public class ArrayTest {
	
	public static void main(String[] args) {
		//철수가 시험을 봤다
		// 점수 : 45,46,47,48 4과목!!!
		//배열에 담자! -> 총점/평균 구하기가 쉬워진다.
			//1.명시적 만들기 : 배열 만들기 -> 각 방을 부르기, 데이터 대입
		int [] ar = new int[4];
		ar[0] = 45;
		ar[1] = 46;
		ar[2] = 47;
		ar[3] = 48;
		
		int sum =0;
		
//		sum += ar[0];
//		sum += ar[1];
//		sum += ar[2];
//		sum += ar[3];
		for (int i = 0; i<4; i++){
			System.out.println(ar[i]+"점");
			sum += ar[i];
		}
		System.out.println("명시적 방법 >> 총합 : " + sum + "점");
		System.out.println("/////////////////////////////////");
			//2.암시적 만들기
		int [] ar2 = {45,46,47,48};
		int sum2 = 0;
		
		for (int i = 0; i<4; i++){
			System.out.println(ar2[i] + "점");
			sum2 += ar2[i];
		}
		System.out.println("암시적 방법 >> 총합 : " + sum2 + "점");
		System.out.println("/////////////////////////////////");
			//3. 명시적 + 암시적 만들기
		ar = new int[]{40,41,42,43};
		int sum3 = 0;
		
		for (int i = 0; i<4; i++){
			System.out.println(ar[i] + "점");
			sum3 += ar[i];
		}
		System.out.println("명시적 + 암시적 방법 >> 총합 : " + sum3 + "점");
		System.out.println("/////////////////////////////////");
		
	}

}
