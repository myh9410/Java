import java.util.Scanner;

public class Solution2 {
	public static int knapsack(int L,int[] K,int[] S,int N) {
		int[][] dp = new int[L+1][N+1];
		for (int i = 0; i <= N; i++) {
			for (int j = 0; j <= L; j++) {
				if (i==0 && j==0) {
					dp[i][j] =0;
				} else if (K[i-1] <= j){
					dp[i][j] = Math.max(S[i-1]+dp[i-1][j-K[i-1]], dp[i-1][j]);
					//i번째 보석을 위해 i번째 보석만큼의 무게를 비웠을 때의 최적값에
					//i번째 보석의 가격을 더한 값
				} else {
					dp[i][j] = dp[i-1][j];
					//i번째 보석이 배낭의 무게 한도보다 무거우면 넣을 수 없으므로
					//i번째 보석을 뺀 i-1개의 보석들을 가지고 구한 전 단계의 최적값을 그대로 가져온다
				}
			}
		}
		return dp[N][L];
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int T = sc.nextInt();
		for (int testCase = 0; testCase < T; testCase++) {
			int N = sc.nextInt();
			int L = sc.nextInt();
			int [] K = new int[N];
			int [] S = new int[N];
			for (int i = 0; i < N; i++) {
				S[i] = sc.nextInt();	//맛에대한 점수
				K[i] = sc.nextInt();	//맛에대한 칼로리
			}
			knapsack(L, K, S, N);
		}
	}
}
