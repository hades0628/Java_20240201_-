package ex05;

public class WAVPlayer implements MediaPlayer{
	
	@Override
	public void pause() {
		System.out.println("일시정지");
	}

	@Override
	public void stop() {
		System.out.println("처음부터 재생");
	}

	@Override
	public void loadFile(String file) {
		System.out.println(file + "파일이 정상적으로 로드 되었습니다.");
	}

	@Override
	public void play() {
		System.out.println("WAC 파일 재생중...");
	}
	
	

}
