package aula04;

public class ExercicioAula04 {

	void tabuada(int x) {
		for (int i = 1; i < 11; i++) {
			System.out.println(i + "*" + x + "="+ i*x);
		}
	}
	
	public static void main(String[] args) {
		ExercicioAula04 ex = new ExercicioAula04();
		ex.tabuada(2);
	}
	
}
