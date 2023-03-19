package escola;

public class pessoa implements IPessoa{
	public String nome;
	public String sobrenome;
	public int idade;
	public String cpf;
	
	pessoa(String nome, String sobrenome, int idade, String cpf) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.cpf = cpf;
	}
	
	
	public String saudacao() {
		return String.format("ola, meu nome e %s %s", this.nome, this.sobrenome);
		
	}
}


