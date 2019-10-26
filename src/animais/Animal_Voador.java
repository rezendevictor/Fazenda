package animais;

public class Animal_Voador extends Animal implements Voador {
	
	private boolean voa = true;
	private float altura_voo;
	
	public Animal_Voador(float altura_voo) {
		this.altura_voo = altura_voo;	
	}

	
	public boolean get_voa() {
		return voa;
	}
	
	public void altura_voa(float altura_voo) {
			this.altura_voo = altura_voo;
	}

	public float getAltura_voo() {
			return altura_voo;
		}
	
	public void Atributos() {
		System.out.println("Este Animal voa.");
		System.out.println("Altura Voo : " + this.getAltura_voo());
		
	}
	
	
	
}
