package principal;

import animais.Animal_Voador;
import animais.Mamifero;

public class Morcego {
	private Animal_Voador voa;
	private Mamifero morcego;
	
	public Morcego(int age,float tamanho,String cor_pena,
			 float voo){
		morcego = new Mamifero(age,tamanho,"farfalho",cor_pena);
		voa = new Animal_Voador(voo);	
	}
	
	public void getAtributos() {
		System.out.println("Animal : Morcego " );
		this.morcego.Atributos();
		this.voa.Atributos();
		
	}
	
	
}
