
public class Z03_순열 {
	public static void main(String[] args) {
//	0 1 2 			3개의 원소를 순열로 출력하기
//  4 7 9 이런식으로 출력해야된다면? > 배열을 하나 만들자
		int[] arr = {4,7,9};
		//중복순열
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j)
					continue; // 가장 가까운 반복문의 다음차수로 넘어가기
//				for (int k = 0; k < 3; k++) {
//					if (j == k || i == k) continue;	k대신 3-i-j할수도 있음
//				System.out.println(i + "," + j + "," + (3 - i - j));
				System.out.println(arr[i] + "," + arr[j] + "," + arr[(3 - i - j)]);
//				}
			}
		}
		//int형 이하의 타입(byte,short,char,int)은 이항연산시 int형으로 자동형변환 된다.
		
		
	}
}
//for문 반복 vs 재귀함수
//   빠름            느림		<< 같은 구조에서는 반복문이 더 빠르다
// 재귀함수를 사용하는 경우 - for문의 갯수를 미리 정할 수 없을 때, 동적으로 for문의 갯수가 주어질 때
// for문을 n개 작성해야하는 경우