package aula16;

public class MyClass extends Aula {

	@Override
	void imprime() {
		System.out.println(Aula.nome + " " + new Aula().sobrenome);

		Aula.show();
		
		new Aula().imprime();
		
	
	}
	

	static void show() {
		System.out.println(Aula.nome + " " + new Aula().sobrenome);
	}

	static void show(int a) {
		System.out.println(Aula.nome + " " + new Aula().sobrenome);
	}
	
	
	
}
