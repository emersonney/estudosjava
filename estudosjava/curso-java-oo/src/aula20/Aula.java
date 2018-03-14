package aula20;

public class Aula {

	//Classes Anonima  de Argumento e Classe Anonima Comum
	
	public static void main(String[] args) {
		
		Calculo c = new Calculo();
		System.out.println("Soma = " + c.somar(10, 5));
		System.out.println("Multiplição = " + c.multiplicar(5, 10));
		
		Aula a = new Aula(); 
		System.out.println("MySoma = " + a.mySoma(8, 5)) ;
		
		a.imprime(new Executa() {

			@Override
			public void executar() {
				// TODO Auto-generated method stub
				
				Calculo c = new Calculo();
				System.out.println("Soma = " + c.somar(55, 5));
				System.out.println("Multiplição = " + c.multiplicar(55, 10));
	
			}		
			
		});
		
	}
	
	void imprime(Executa executa) {
		executa.executar();	
	}
	
	
	int mySoma(int z, int y) {
		
		Adicao adicao = new Adicao() {

			@Override
			public int somar(int a, int b) {
				// TODO Auto-generated method stub
				return b + a;
			}
			
		};
		
		return adicao.somar(z, y); 
		
	}
	
}
