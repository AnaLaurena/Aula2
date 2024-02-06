package Aula_2;

public class Cachorro {
	private String nome;
	private String raca;
	private int idade;
	private String cor;
	
	public String getnome() {
		return nome;
	}
	
	public String getRaca() {
		return raca;
	}
	
	public String getCor() {
		return cor;
	}
	
	public int getidade() {
		return idade;
	}
	
	public void setnome (String nome) {
		this.nome =  nome;
	}
	
	public void setraca (String  raca) {
		this.raca =  raca;
	}
	
	public void setidade (int idade) {
		this.idade =  idade;
	}
	
	public void setcor (String cor) {
		this.cor =  cor;
	}
	
	
	
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
