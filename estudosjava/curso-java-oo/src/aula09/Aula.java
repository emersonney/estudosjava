package aula09;

public class Aula {

	public enum Option { //objeto enum

		YES,NO //que contem uma lista de constantes
		
	}
	
	
	public static final String OURO = "ouro"; //Constante Global (Padrão é usar letras maiusculas)
	public static final String PAUS = "paus";
	public static final String ESPADAS = "espadas";
	public static final String COPAS = "copas";
	
	private static final int VALOR = 0;
	
	
	public static void main(String[] args) {
		
		TrueOrFalse t = TrueOrFalse.FALSE;
		System.out.println(t);
		System.out.println(t.getIndex());
		System.out.println(t.getDesc());

		
		for(TrueOrFalse t2 : TrueOrFalse.values()) {
			System.out.println(t2);
		}
		
		Carta carta = Carta.ESPADAS;
		
		switch (carta) {
		case OURO:
			System.out.println("Sua carta é de ouro");
			break;
		case PAUS:
			System.out.println("Sua carta é de paus");
			break;
		case ESPADAS:
			System.out.println("Sua carta é de espadas");
			break;
		case COPAS:
			System.out.println("Sua carta é de copas");
			break;
		default:
			System.out.println("Nenhum naipe está presente");
			break;
		}
		
		
		String naipe = Aula.PAUS;
		
		switch (naipe) {
		case Aula.OURO:
			System.out.println("Sua carta é de ouro");
			break;
		case Aula.PAUS:
			System.out.println("Sua carta é de paus");
			break;
		case Aula.ESPADAS:
			System.out.println("Sua carta é de espadas");
			break;
		case Aula.COPAS:
			System.out.println("Sua carta é de copas");
			break;
		default:
			System.out.println("Nenhum naipe está presente");
			break;
		}
		
		
		System.out.println(VALOR);
		
	}
			
}
