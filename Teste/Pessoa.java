package Modulo1;

public class Pessoa {
	public String nome;
	public String numero;
	public int idade;

	public Pessoa(String nome, String numero, int idade) {
		this.nome = nome;
		this.idade = idade;
		this.numero = numero;
	}

	public Pessoa() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {

		this.idade = idade;
	}

}
