import java.util.Arrays;

public class Z02_Gravity {
	public static void main(String[] args) {
		int[] box = {7,4,2,0,0,6,0,7,0};
		int [][] map = new int[8][9];
		
//1 => 2차원 배열 박스1,빈칸0, 회전, 중력, 낙차(최대값)
		//1차원 배열을 2차원 배열로 전환
		for (int c = 0; c < box.length; c++) {//열			
			for (int r = map.length-1; r >= 0; r--) {//행
				if (box[c] <= 0) {
					break;
				}
				map[r][c] = 1;
				box[c]--;
			}
		}
//	회전		
		int[][] room = new int[9][8];
		for (int i = 0; i < room.length; i++) {//9
			for (int j = 0; j < room[i].length; j++) {//8
				room[i][j] = map[map.length-1-j][i];
			}
		}
//	중력발생 => 박스를 아래쪽(바닥으로 옮기기) - 제일 아래부터 내림
//	아래쪽 박스부터 떨어뜨리자 : 현재칸이 박스이고, 아래칸이 비어있으면, 값을 바꿈
//	제일 아랫줄은 신경 안써도 됨 = room.length-2
		int max = 0;
		for (int r = room.length-2; r >=0; r--) {
			for (int c = 0; c < room[r].length; c++) {
				int cnt = 0;	//낙차를 count
				for (int i = 0; r+1+i < room.length; i++) {//바닥에 닿을 때 까지 or 박스에 닿을 때 까지
					if (room[r+i][c] == 1 && room[r+i+1][c] == 0) {	//내릴 수 있는 상황 : 나는 상자, 아래는 빈칸
						room[r+i][c] = 0;
						room[r+i+1][c] = 1;
						cnt++;
					}
				}
				if (max < cnt) {
					max = cnt;
				}
				//System.out.print(cnt + " ");
			}
			//System.out.println();
		}
		
		
//결과 출력 - 배열을 for문으로 돌면서 출력하는 대신 할 수 있는 방법
		//System.out.println(Arrays.toString(box));	//1차원 배열의 원소를 문자열로 표시
		//System.out.println(Arrays.toString(map));	//2차원 배열은 문자열로 표시X - 주소가 저장되므로 주소값을 기반으로 한 해시코드값을 표시해줌
		for (int i = 0; i < room.length; i++) {
			System.out.println(Arrays.toString(room[i]));			
		}//for문 사용하면 2차원 배열 출력됨
		System.out.println("최대 낙차:"+max);
	}//eom
}//eoc
