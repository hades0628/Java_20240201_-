package ex05;

import java.util.Scanner;

public class MeidaController {

	public static void main(String[] args) {
		
		MediaPlayer mp;
		mp = new FLACPlayer();
		
		Scanner s = new Scanner(System.in);
		System.out.println("1 : 플레이 , 0 : 일시정지 , -1 : 중지 ==>");
		
		
		while(FLACPlayer.state != -1) {
			switch(s.nextInt()) {
			case 1:
				mp.play();
				break;
			case 0:
				mp.pause();
				break;
			case -1:
				mp.stop();
				break;
			}
		}
		
		
		
//		mp = new MP3Player();
//		
//		mp.play();
//		
//		
//		mp.loadFile("파테코");
//
//		mp = new WAVPlayer();
//		
//		mp.play();
//		mp.pause();
//		
//		mp = new FLACPlayer();
//		
//		mp.play();
//		mp.stop();

	}

}
