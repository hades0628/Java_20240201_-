package ex04;

public class MeidaController {

	public static void main(String[] args) {
		
		MediaPlayer mp;
		
		mp = new MP3Player();
		
		mp.play();

		mp = new WAVPlayer();
		
		mp.play();
		
		mp = new FLACPlayer();
		
		mp.play();

	}

}
