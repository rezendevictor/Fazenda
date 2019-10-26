package animais;

public class Aves extends Animal{
	
	public Aves(int age,float tamanho, String som,String cor_pena) {
		super.idade(age);
		super.som(som);
		super.tamanho(tamanho);
		super.cor = cor_pena;
	}

	public boolean ovo() {
		return true;
	}
	
	public void Atributos() {
		System.out.println("Este Animal tem penas");
		super.Atributos();
		
	}

	
}
