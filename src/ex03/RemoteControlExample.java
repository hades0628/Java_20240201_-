package ex03;

public class RemoteControlExample {
	
	static int count = 0;//정적변수

	public static void main(String[] args) {
		
		
		
		int sum = 0; //인스턴스변수
		
		RemoteControl rc;
		rc = new Audio();
		
		rc.turnOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
		

	}

}
