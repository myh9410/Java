package interfaceex;

public class VideoPlayer implements Playable {

	@Override
	public void play() {
		System.out.println("������ �۵�");

	}

	@Override
	public void stop() {
		System.out.println("������ ����");

	}

	@Override
	public void pause() {
		System.out.println("������ �Ͻ�����");

	}

}
