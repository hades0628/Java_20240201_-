package ex03;

public class Tv implements RemoteControl{
	
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
		System.out.println();
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
	} 
	
}
