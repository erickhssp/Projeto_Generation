package Modulo1;

public class teste_modulo {
	public static void main(String[] args) {
		Funcionario ff = new Funcionario("Lucas", "(11)40028922", 19, "000.123.456-78", 10, 056, 10000);
		System.out.println("Começou o Programa");
		System.out.println();
		System.out.println("-------------------Classe Funcionario----------------------");
		ff.imprimir();
		ff.calculo();

		Aposentar apo = new Aposentar("Neymar", "(11)40028922", 28, "12345678910", "111.222.333-44");
		System.out.println();
		System.out.println();
		System.out.println("-------------------Classe Aposenta----------------------");
		System.out.println();
		apo.imprimirinfo();
		apo.verificar();
	}
}
