package escola;

public class MyClass {
	public static void main(String[] args) {
		
		aluno manuel = new aluno("manuel", "neto", 26, "9999999", "p1", "a");
		professor jonas = new professor("manuel", "neto", 26, "9999999", "algoritimo", 20);
		
		System.out.println(manuel.serie);
		System.out.println(manuel.turma);
		System.out.println(manuel.saudacao());
		System.out.println(jonas.disciplina);
		System.out.println(jonas.horas);
		System.out.println(jonas.saudacao());
	}
}
