package aula06;

public class ClassA {

	private String privado;
	protected String protegido;
	public String publico;
	
	String pacote;
	
	
	public static void main(String[] args) {
		
		ClassA a = new ClassA(); 
		
		a.pacote = "pacote a";
		a.protegido = "protegido a";
		a.publico = "publico a";
		a.privado = "privado a";
		
		
		
	}
	
}
