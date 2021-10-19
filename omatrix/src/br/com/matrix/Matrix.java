package br.com.matrix;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa homem = new Pessoa();
		Pessoa mulher = new Pessoa();
		
		homem.nome = "Joãozinho";
		homem.genero = "masculino";
		
		mulher.nome = "Mariazinha";
		mulher.genero = "feminino";
		
		System.out.println("Olá, meu nome é "+homem.aprensentar()+ ".");
		mulher.conhecer(homem.aprensentar(), homem.genero);
		System.out.println("Eu sou a " +mulher.aprensentar()+ ".");
		homem.conhecer(mulher.aprensentar(), mulher.genero);
		
		
		

	}

}
