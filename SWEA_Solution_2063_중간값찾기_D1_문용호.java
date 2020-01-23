import java.util.Arrays;
import java.util.Scanner;

public class SWEA_Solution_2063_중간값찾기_D1_문용호 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] arrInt = new int [N];
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = sc.nextInt();
		}
		Arrays.sort(arrInt);
		System.out.println(arrInt[arrInt.length/2]);
        sc.close();
	}
}
