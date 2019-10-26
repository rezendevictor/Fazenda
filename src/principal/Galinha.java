package principal;
import animais.Aves;


public class Galinha {
	private Aves galinha;
	
	public Galinha(int age,float tamanho,String cor_pena){
		galinha = new Aves(age,tamanho,"grasnido",cor_pena);	
	}
	
	public void getAtributos() {
		System.out.println("Animal : Galinha");
		this.galinha.Atributos();
	}

}

