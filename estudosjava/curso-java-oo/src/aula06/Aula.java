package aula06;

import aula05.ClassB;

public class Aula extends ClassB {
	
	public static void main(String[] args) {
	
		ClassA a = new ClassA(); 
		
		a.pacote = "pacote a";
		a.protegido = "protegido a";
		a.publico = "publico a";
		
		ClassB b = new ClassB();
		b.publico = "publica b";
		
		Aula aula = new Aula();
		aula.publico = "publico de b";
		aula.protegido = "protegio de b por herança";
		
		ClassD d = new ClassD();
		d.metodoD();
		
	}

}
