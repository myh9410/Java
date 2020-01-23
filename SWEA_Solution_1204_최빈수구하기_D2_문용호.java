import java.util.Arrays;
import java.util.Scanner;

public class SWEA_Solution_1204_최빈수구하기_D2_문용호 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int testCase = 1; testCase <= T; testCase++) {
			int testNo = sc.nextInt();
			int [] scoreSet = new int [1000];
			int [] score = new int [101];
			for (int i = 0; i < 1000; i++) {
				int s = sc.nextInt();
				scoreSet[i] = s; 
				score[s]++;
			}
			int max = 0;
			int ans = 0;
			for (int i = 0; i < score.length; i++) {
				if (max <= score[i]) {
					max = score[i];
					ans = i;
				}
			}
			System.out.println(Arrays.toString(score));
			System.out.println("#"+testCase+" "+ans);
		}
	}
}
