package players;

import java.io.Serializable;

public class Oponentes implements Serializable {
	private String nome;
	private int idade;
	private String cidade;
	
	public Oponentes() {
		
	}

	public Oponentes(String nome, int idade, String cidade) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cidade = cidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "nome=" + nome + ", idade=" + idade + ", cidade=" + cidade;
	}
	
	

	
	

}
