/**
 * Subset : 부분집합 
 * PowerSet(멱집합) : 어떤 집합의 모든 부분집합을 원소로 갖는 집합
 * 모든 부분집합을 구해라 -> PowerSet을 구해라
 * 방법 :
 * 		노가다 - 반복문
 * 		바이너리카운팅
 * 		재귀함수
 */
public class Z05_부분집합의합 {
	public static void main(String[] args) {
		int[] a = {-7,-3,-2,5,8};
		for (int i = 0; i < 2; i++) {
		//첫번째 원소를 사용할지 여부를 결정할 변수 i i가 0이면 사용X 1이면 사용O
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 2; k++) {
					for (int l = 0; l < 2; l++) {
						for (int m = 0; m < 2; m++) {
							int sum=0;
							if (i==1){System.out.print(a[0]+" "); sum+=a[0];}
							if (j==1){System.out.print(a[1]+" "); sum+=a[1];}
							if (k==1){System.out.print(a[2]+" "); sum+=a[2];}
							if (l==1){System.out.print(a[3]+" "); sum+=a[3];}
							if (m==1){System.out.print(a[4]+" "); sum+=a[4];}
							System.out.println("\t : 합"+sum);
						}
					}
				}
			}
		}
	}//eom
}//eoc
