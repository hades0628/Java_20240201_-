package ex03;

public class Audio implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("스피커를 켭니다.");
	}

	@Override
	public void turnOff() {
	}

	@Override
	public void setVolume(int volume) {
	}
	
	

}
