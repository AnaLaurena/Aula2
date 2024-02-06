package Aula_2;

public class Celular {
	public String modelo;
	public int Ano;
	public String Cor;
	public String Cameras;
	public String Marca;
	public String Linha;
	
	public void Rapido () {
		System.out.println("O Celular: " + modelo + "Rapido");
	}
	
	public void GetCelular() {
		System.out.println(
				"Modelo: " + modelo + 
				"\n Ano:" + Ano +
				"\n Marca: " + Marca + 
				"\n Cor: " + Cor +
				"\n linha:" + Linha +
				"\n TipoCamera:" + Cameras
				
				);
		
	}

}
	
	


