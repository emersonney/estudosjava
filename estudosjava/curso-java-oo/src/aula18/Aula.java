package aula18;

import java.time.LocalDate;

import javax.swing.plaf.synth.SynthStyle;

public class Aula {

	
	
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.setNome("Ana");
		p.setSobrenome("Pinheiro");
		p.setDtNascimento(LocalDate.of(1981, 9, 15));
		
		System.out.printf("%s %s possui %d anos, %d meses e %d dias.",
				p.getNome(),
				p.getSobrenome(),
				p.getIdade().getAnos(),
				p.getIdade().getMeses(),
				p.getIdade().getDias()
				);
	}
	
}
