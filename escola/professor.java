package escola;

class professor extends pessoa {
	public String disciplina;
	public int horas;
	
	professor(String nome, String sobrenome, int idade, String cpf, String disciplina, int horas){
		super(nome, sobrenome, idade, cpf);
		this.disciplina = disciplina;
		this.horas = horas;
	}
	
	public String saudacao() {
		return String.format("ola meu nome e %s %s e sou professor de %s", this.nome, this.sobrenome, this.disciplina);
	}
}
