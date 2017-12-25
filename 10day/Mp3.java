package interfaceex;

public class Mp3 implements Playable {

	@Override
	public void play() {
		System.out.println("mp3 ÀÛµ¿");

	}

	@Override
	public void stop() {
		System.out.println("mp3 ¸ØÃã");

	}

	@Override
	public void pause() {
		System.out.println("mp3 ÀÏ½ÃÁ¤Áö");

	}

}
