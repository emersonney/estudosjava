package aula18;

public class Exercicio {

	private class MyInnerClass{
		public void hello() {
			System.out.println("Olá, eu sou classe interna regual.");
		}
	}
	
	public static void main(String[] args) {
		
		
		//Criar uma intancia da classe interna fora da classe interna, na class externa
		MyInnerClass mic = new Exercicio().new MyInnerClass();
		mic.hello();
		
	}
	
}
