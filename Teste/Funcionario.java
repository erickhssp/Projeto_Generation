package Modulo1;

public class Funcionario extends Pessoa {
	public String cpf;
	public int comissao;
	public int codfunc;
	public float salarioTotal;
	public float salarioBase;

	public Funcionario(String nome, String numero, int idade, String cpf, int comissao, int codfunc,
			float salariobase) {
		super(nome, numero, idade);
		// TODO Auto-generated constructor stub
		this.cpf = cpf;
		this.codfunc = codfunc;
		this.comissao = comissao;
		this.salarioBase = salariobase;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getComissao() {
		return comissao;
	}

	public void setComissao(int comissao) {
		this.comissao = comissao;
	}

	public int getCodfunc() {
		return codfunc;
	}

	public void setCodfunc(int codfunc) {
		this.codfunc = codfunc;
	}

	public float getSalarioTotal() {
		return salarioTotal;
	}

	public void setSalarioTotal(float salarioTotal) {
		this.salarioTotal = salarioTotal;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public void calculo() {
		float a;
		a = (this.salarioBase * this.comissao) / 100;
		this.salarioTotal = this.salarioBase + a;
		float vetor[] = new float[1];
		vetor[0] = this.salarioTotal;
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Seu Salario Total é de: " + vetor[i]);
		}

	}

	public void imprimir() {
		System.out.println("Seu nome é " + this.getNome());
		System.out.println("Sua idade " + this.getIdade());
		System.out.println("Seu numero de telefone é " + this.getNumero());
		System.out.println("Seu codigo de funcionario é " + this.codfunc);
		System.out.println("Seu salario base é: " + this.salarioBase);
		System.out.println("A sua comissão é de: " + this.getComissao() + "% em cima do seu salarioBase");

	}

}
