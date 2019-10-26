package animais;

public class Mamifero extends Animal{
	
	public Mamifero(int age,float tamanho, String som,String cor_pelo) {
		super.idade(age);
		super.som(som);
		super.tamanho(tamanho);
		super.cor = cor_pelo;
	}
	
	public void Atributos() {
		System.out.println("Este Animal tem pelos");
		System.out.println("Esse animal e um Mamifero");
		super.Atributos();
		
	}

}
