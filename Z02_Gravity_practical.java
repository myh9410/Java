
public class Z02_Gravity_practical {
	public static void main(String[] args) {
		int[] box = {7,4,2,0,0,6,0,7,0};
		// 같은 줄에서 가장 많이 떨어질 수 있는 박스는 꼭대기의 박스
		// 떨어지는 낙차는 나보다 오른쪽에 있는 박스들의 나보다 작은 숫자의 갯수
		int max = 0;
		for (int i = 0; i < box.length; i++) {
			int cnt =0;
			for (int j = i+1; j < box.length; j++) {
				if (box[i] > box[j]) {
					cnt ++;
				}
			}
			System.out.print(cnt + " ");
			if (max < cnt) max = cnt;
		}
		System.out.println();
		System.out.println("최대낙차 : "+max);
	}
}
