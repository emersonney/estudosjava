package aula14;

public class WMV implements PlayerVideos {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Play...");	
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stop...");		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("Pause...");		
	}

	@Override
	public void volume(int volume) {
		// TODO Auto-generated method stub
		System.out.println("Volume: " + volume);	
	}

	@Override
	public void taxaDeQuadros() {
		// TODO Auto-generated method stub
		System.out.println("24 quadros por segundo");		
	}

	@Override
	public void taxaDeBits() {
		// TODO Auto-generated method stub
		System.out.println("128 Bits");		
	}

	@Override
	public void nomeArquivo(String arquivo) {
		// TODO Auto-generated method stub
		System.out.println("Arquivo: " + arquivo);
	}

	
	
}
