package interfaceex;

import javax.swing.JOptionPane;

public class PlayerMain {

	static void operator(Playable mc) {
		//mc에 올 수 있는 타입은? Mp3나 VideoPlayer다!	그 타입을 체크하는 연산자가 있다.
		//	--> instanceof 연산자...	객체 instanceof 타입
		String type = "";
		if (mc instanceof Mp3){
			type = "***mp3***";
		}else if (mc instanceof VideoPlayer){
			type = "***VideoPlayer***";
		}
		String menu = type+ "선택\n1.재생 2.일시 정지 3.종료";
		while(true){
			int bun = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch(bun){
			case 1 : mc.play(); break;
			case 2 : mc.pause(); break;
			case 3 : mc.stop(); break;
			}
			if (bun==3) break;
		}
	}

	public static void main(String[] args) {
		//조립3
		//Mp3	VideoPlayer
		Mp3 mp3 = new Mp3();
		String menu = "1. mp3   2. 동영상 플레이어  3.선택 종료";
		while(true){
			int bun = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			if (bun==3) break;
			
			switch(bun){
			case 1:	operator(mp3);break;
			case 2: operator(new VideoPlayer()); break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
	
	
}
