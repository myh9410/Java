import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class acmicpc_2667 {
	public static void main(String[] args) throws Exception {
		//배열 생성 및 값 할당
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt((br.readLine()));
		int [][] map = new int [N+2][N+2];
		int [][] visited = new int [N+2][N+2];
		int danji = 0;
		for (int i=1; i<N+1; i++) {
			String temp = br.readLine();
			for (int j=1; j<N+1; j++) {
				map[i][j] = temp.charAt(j-1)-'0';
			}
		}
		//배열 탐색
		int count = 0; int [] co = new int [N*N];
		for (int i = 1; i < map.length; i++) {
			for (int j = 1; j < map.length; j++) {
				if (map[i][j] == 1) {
					System.out.printf("%d %d\t",i,j);
					map[i][j] = 0;
					if (map[i-1][j] == 0 && map[i+1][j] == 0 && map[i][j-1] == 0 && map[i][j+1] == 0) {
						danji+=1;
						co[count] = count;
						count = 0;
						System.out.println();
						for (int l = 0; l < map.length; l++) {
							System.out.println(Arrays.toString(map[l]));
						}		
					} else if (map[i][j-1] == 1) {
						System.out.println("j-1");
						j-=2;
						count++;
					} else if (map[i][j+1] == 1) {
						System.out.println("j+1");
						count++;
					} else if (map[i-1][j] == 1) {
						System.out.println("i-1");
						i--;
						j--;
						count++;
					} else if (map[i+1][j] == 1) {
						System.out.println("i+1");
						i++;
						j--;
						count++;
					}
				}
			}
		}
//		System.out.println(danji);
//		for (int i = 0; i < co.length; i++) {
//			if (co[i] > 0) {
//				System.out.println(co[i]);
//			}
//		}
		//출력
//		System.out.println();
//		for (int i = 0; i < map.length; i++) {
//			System.out.println(Arrays.toString(map[i]));
//		}		
	}//eom
}//eoc
