package aula14;

public class Aula {

	private PlayerVideos video;
	void videos() {
		video = new WMV();
		video.play();
		video.pause();
		video.volume(6);
		video.taxaDeQuadros();
		video.nomeArquivo("video_aula.wmv");
		video.stop();
		
		System.out.println();
		
		video = new RMV();
		video.play();
		video.pause();
		video.volume(7);
		video.taxaDeQuadros();
		video.nomeArquivo("video_aula.rmv");
		video.stop();
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Aula().videos();
		
		/*
		MP3 mp3 = new MP3();
		mp3.play();
		mp3.pause();
		mp3.volume(5);
		mp3.taxaDeBits();
		mp3.stop();
		
		AVI avi = new AVI();
		avi.play();
		avi.pause();
		avi.volume(8);
		avi.taxaDeBits();
		avi.taxaDeQuadros();
		avi.stop();
		*/
		
	}

}
