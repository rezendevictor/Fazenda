package principal;
import animais.Animal_Voador;
import animais.Aves;


public class Pato {
	private Animal_Voador voa;
	private Aves pato;
	
	public Pato(int age,float tamanho,String cor_pena,
			 float voo){
		pato = new Aves(age,tamanho,"grasnido",cor_pena);
		voa = new Animal_Voador(voo);	
	}
	
	public void getAtributos() {
		System.out.println("Animal : Pato " );
		this.pato.Atributos();
		this.voa.Atributos();
		
	}

}

