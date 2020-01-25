import java.util.Scanner;

public class acmicpc_2503 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int ans = 0;
		int hun = 0; int ten = 0; int one = 0; 
		int [] numbers = new int [tc];
		int [] strike = new int [tc];
		int [] ball = new int [tc];
		for (int i = 0; i < tc; i++) {
			numbers[i] = sc.nextInt();
			strike[i] = sc.nextInt();
			ball[i] = sc.nextInt();			
		}
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <=9; j++) {
				for (int k = 1; k <= 9; k++) {
					if (i==j | i==k | j==k) {
						continue;
					}
					boolean check = true;
					for (int l = 0; l < ball.length; l++) {
						int s = 0; int b = 0;
						hun = numbers[l]/100;
						ten = numbers[l]%100/10;
						one = numbers[l]%100%10;
						if (i == hun) s+=1;
						else if (i==ten || i==one) b+=1;
						if (j == ten) s+=1; 
						else if (j==hun || j==one) b+=1;
						if (k == one) s+=1;
						else if (k==ten || k==hun) b+=1;
						if (strike[l] != s || ball[l] != b) check = false;
					}
					if (check == true) ans+=1;
				}
			}
		}
		System.out.println(ans);
	}//eom
}//eoc
