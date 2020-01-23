import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			int checker = 0;
			String bit = sc.next();
			String cur = bit.replaceAll("1", "0");
			for (int j = 0; j < bit.length(); j++) {
				if (j==0 && !(bit.substring(j,j+1).equals(cur.substring(j,j+1)))) {
					checker+=1;
				}
				if (j!=0 && (checker%2 == 0)) {
					if (bit.substring(j,j+1).equals(cur.substring(j,j+1))) {
					} else {
						checker+=1;
					}	
				}else if (j!=0 && (checker%2 ==1)) {
					if (bit.substring(j,j+1).equals(cur.substring(j,j+1))) {
						checker+=1;
					} else {
					}
				}
			}
			System.out.println("#"+i+" "+checker);
		}
	}//eom
}//eoc
