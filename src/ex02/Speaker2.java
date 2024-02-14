package ex02;

public class Speaker2 extends Speaker {

	public static void main(String[] args) {
		Speaker2 speaker = new Speaker2();

		speaker.powerOn();
		speaker.powerOff();
		speaker.soundUp();
		speaker.soundDown();
	}

	@Override
	public void powerOn() {
		System.out.println("전원 On");
	}

	@Override
	public void powerOff() {
		System.out.println("전원 Off");
	}

	@Override
	public void soundUp() {
		System.out.println("볼륨 Up");
	}

	@Override
	public void soundDown() {
		System.out.println("볼륨 Down");
	}
}
