package interfaceex;

import javax.swing.JOptionPane;

public class PlayerMain {

	static void operator(Playable mc) {
		//mc�� �� �� �ִ� Ÿ����? Mp3�� VideoPlayer��!	�� Ÿ���� üũ�ϴ� �����ڰ� �ִ�.
		//	--> instanceof ������...	��ü instanceof Ÿ��
		String type = "";
		if (mc instanceof Mp3){
			type = "***mp3***";
		}else if (mc instanceof VideoPlayer){
			type = "***VideoPlayer***";
		}
		String menu = type+ "����\n1.��� 2.�Ͻ� ���� 3.����";
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
		//����3
		//Mp3	VideoPlayer
		Mp3 mp3 = new Mp3();
		String menu = "1. mp3   2. ������ �÷��̾�  3.���� ����";
		while(true){
			int bun = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			if (bun==3) break;
			
			switch(bun){
			case 1:	operator(mp3);break;
			case 2: operator(new VideoPlayer()); break;
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	
}
