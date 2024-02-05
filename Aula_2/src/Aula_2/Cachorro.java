package Aula_2;

public class Cachorro {
	public String nome;
	public String raca;
	public int idade;
	public String cor;
	
	public void latir () {
		System.out.println("O cachorro: " + nome + "latiu");
	}
	
	public void GetCachorro() {
		System.out.println(
				"Nome: " + nome + 
				"\nRaça:" + raca +
				"\nIdade: " + idade + 
				"\nCor: " + cor
				);
		
	}

}
