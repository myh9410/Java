package interfaceex;

public class Mp3 implements Playable {

	@Override
	public void play() {
		System.out.println("mp3 �۵�");

	}

	@Override
	public void stop() {
		System.out.println("mp3 ����");

	}

	@Override
	public void pause() {
		System.out.println("mp3 �Ͻ�����");

	}

}
