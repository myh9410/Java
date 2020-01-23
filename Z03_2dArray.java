import java.util.Arrays;

public class Z03_2dArray {
	public static void main(String[] args) {
		int [] dx = {0,0,1,-1};
		int [] dy = {1,-1,0,0};
		int x =0;
		int y =0;
		int [][] arr = new int [6][6];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i==0 || j == 0 || i == arr.length-1 || j == arr.length-1) {
					arr[i][j] = 0;
				}else {
					arr[i][j] = i+j;					
				}
			}
		}
		for (int i = 0; i < 4; i++) {
			x = x+dx[i];
			y = y+dy[i];
		}
		
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));			
		}
	}
}
