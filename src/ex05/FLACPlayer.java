package ex05;

public class FLACPlayer implements MediaPlayer{
	
	private String fileName;
	private double runTime;
	private double fileSize;
	public static int state;
	
	

	@Override
	public void pause() {
		state = 0;
		System.out.println("일시정지");
	}

	@Override
	public void stop() {
		state = -1;
		System.out.println("처음부터 재생");
	}

	@Override
	public void loadFile(String file) {
		System.out.println(file + "파일이 정상적으로 로드 되었습니다.");
	}

	@Override
	public void play() {
		state = 1;
		System.out.println("FLAC 파일 재생중...");
	}

	
	
}
