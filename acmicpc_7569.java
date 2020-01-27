import java.util.Arrays;
import java.util.Scanner;

public class acmicpc_7569 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] dx = {-1,1,0,0,0,0};
		int [] dy = {0,0,-1,1,0,0};
		int [] dz = {0,0,0,0,-1,1};
		//3차원 배열 생성
		int M = sc.nextInt();	//열 갯수		5
		int N = sc.nextInt();	//행 갯수		3
		int H = sc.nextInt();	//높이		2
		int [][][] box = new int[H][N][M];
		int count = 0;
		for (int i = 0; i < box.length; i++) {					//높이 : 2
			for (int j = 0; j < box[i].length; j++) {			//행    : 3
				for (int k = 0; k < box[i][j].length; k++) {	//열    : 5
					box[i][j][k] = sc.nextInt();
				}
			}
		}
		for (int i = 0; i < H; i++) {					//높이
			for (int j = 0; j < N; j++) {			//행
				for (int k = 0; k < M; k++) {	//열		0,1,4
					for (int l = 0; l < dx.length; l++) {		
						if (i+dx[l] < 0 || i+dx[l] >= H || j+dy[l] < 0 || j+dy[l] >= N || k+dz[l] < 0 || k+dz[l] >= M) {
							continue;
						}
						if (box[i][j][k] == 1 && box[i+dx[l]][j+dy[l]][k+dz[l]] == 0) {
							box[i+dx[l]][j+dy[l]][k+dz[l]] = 1;
							count+=1;
						}
					}
				}
			}
		}
		//System.out.println(count);
		//출력해보기
		for (int i = 0; i < box.length; i++) {					//높이 : 2
			for (int j = 0; j < box[i].length; j++) {			//행    : 3
				for (int k = 0; k < box[i][j].length; k++) {	//열    : 5
					System.out.print(box[i][j][k]);				
				}
				System.out.println();
			}
			System.out.println();
		}
	}//eom
}//eoc
