package aula19;

public class MyClass {

	private int a;
	private static int valor = 1000;
	
	public MyClass(int a) {
		this.a = a;
	}
	
	public MyStaticClass getMyStaticClass() {
		return new MyStaticClass(a);
	}
	//Classe interna extatica
	private static class MyStaticClass{
		
		private int valor;
		
		public MyStaticClass(int valor) {
			this.valor = valor;
		}
		
		public void imprime() {
			System.out.println(valor);	
		}
		
		public static void main(String[] args) {
			
			int a = MyClass.valor;
			
			MyStaticClass m = new MyClass.MyStaticClass(1200);
			m.imprime();
			
			MyClass mc = new MyClass(999);
			mc.getMyStaticClass().imprime();
			
		}
		
	}
	
}
