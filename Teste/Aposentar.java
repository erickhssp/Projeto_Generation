package Modulo1;

public class Aposentar extends Pessoa {
	public String rg;
	public String cpf;

	public Aposentar(String nome, String numero, int idade, String rg, String cpf) {
		super(nome, numero, idade);
		this.cpf = cpf;
		this.rg = rg;
	}

	public void imprimirinfo() {
		System.out.println("Voce se chama " + this.getNome());
		System.out.println("Voce tem " + this.getIdade() + " anos");
		System.out.println("Seu numero de telefone é " + this.getNumero());
		System.out.println("Seu RG é " + this.rg);
		System.out.println("Seu CPF é " + this.cpf);
	}

	public void verificar() {
		int a;
		System.out.println(" ");
		System.out.println("Voce tem " + this.getIdade() + " anos");
		if (this.getIdade() >= 65) {
			System.out.println("Ok, voce ja tem idade para se aposentar");
		} else {
			a = 65 - this.getIdade();
			System.out.println("Voce ainda nao tem idade para se aposentar");
			System.out.println("Ainda falta " + a + " anos para voce se aposentar");

		}
	}

}
