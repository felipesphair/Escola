package escola;

public class aluno extends pessoa {
	public String serie;
	public String turma;
	
	aluno(String nome, String sobrenome, int idade, String cpf, String serie, String turma){
		super(nome, sobrenome, idade, cpf);
		this.serie = serie;
		this.turma = turma;
	}
	
	public String saudacao() {
		return String.format("ola meu nome e %s %s e estou na %s serie %s", this.nome, this.sobrenome, this.serie, this.turma);
	}
}
