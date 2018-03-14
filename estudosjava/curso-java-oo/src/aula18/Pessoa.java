package aula18;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

	private String nome;
	private String sobrenome;
	private LocalDate dtNascimento;
	
	//Metodo que retorna uma instancia da classe interna
	public CalculaIdade getIdade() {
		return new Idade();
	}
	
	//Classes Aninhadas
	//Classe INTERNA Regular não Extatica, Uma Classe q só vai ser utilizada para Pessoa
	private class Idade implements CalculaIdade{

		@Override
		public int getAnos() {
			// TODO Auto-generated method stub
			Period p  = Period.between(dtNascimento, LocalDate.now());
			return p.getYears();
		}

		@Override
		public int getMeses() {
			// TODO Auto-generated method stub
			Period p  = Period.between(dtNascimento, LocalDate.now());
			return p.getMonths();
		}

		@Override
		public int getDias() {
			// TODO Auto-generated method stub
			Period p  = Period.between(dtNascimento, LocalDate.now());
			return p.getDays();
		}
		
		
		
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public LocalDate getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(LocalDate dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	
	
	
	
}
