package interfaceex;

public class VideoPlayer implements Playable {

	@Override
	public void play() {
		System.out.println("동영상 작동");

	}

	@Override
	public void stop() {
		System.out.println("동영상 멈춤");

	}

	@Override
	public void pause() {
		System.out.println("동영상 일시정지");

	}

}
