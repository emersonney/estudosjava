package aula08;

public class Pessoa {

	private String nome;
	private String sobrenome;
	private int idade;
	private char sexo;
	
	public Pessoa() {
		super();
	}

	public Pessoa(String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public Pessoa(String nome, String sobrenome, int idade, char sexo) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	
	
}
