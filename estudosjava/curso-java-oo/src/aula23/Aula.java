package aula23;

public class Aula {

	public static void main(String[] args) {

		teste01();

	}

	private static void teste01() {

		Funcionario f1 = new Funcionario() {

			@Override
			public double remuneracao() {
				// TODO Auto-generated method stub
				return 800 + 900;
			}
		};
		System.out.println(f1.remuneracao());
		System.out.println("------------------------");

		Funcionario f2 = () -> {
			return 800 + 900;
		};
		f2.imprime();

	}

}
