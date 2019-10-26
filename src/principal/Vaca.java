package principal;
import animais.Mamifero;


public class Vaca {
	private Mamifero vaca;
	
	public Vaca(int age,float tamanho,String cor_pelo) {
		this.vaca = new Mamifero(age,tamanho,
				"Mugido",cor_pelo);
	}
	
	public void getAtributos() {
		System.out.println("Animal : Vaca " );
		this.vaca.Atributos();
	}

}
