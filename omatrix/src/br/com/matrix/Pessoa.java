package br.com.matrix;

public class Pessoa {
	
	public String nome;
	public String genero;
	
	public String aprensentar() {
		return this.nome;
	}
	
	public void conhecer(String nome, String genero) {
		if(genero == "masculino")
			System.out.println("Muito prazer, senhor " +nome+ ".");
		else if(genero == "feminino")
			System.out.println("Muito prazer, senhora "+nome+ ".");
		else
			System.out.println("Perd�o, n�o consigo saber quem � vo��.");
	}

}
