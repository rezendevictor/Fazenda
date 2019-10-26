package animais;

public abstract class Animal {
	private int age;
	private float tam;
	private String som_emitido;
	protected String cor;
	
	public void idade(int age) {
		this.age = age;
	}
	
	public void tamanho(float tam) {
		this.tam = tam;
	}
	
	public void som(String som_emitido) {
		this.som_emitido = som_emitido;
	}
	
	public int getAge() {
		return age;
	}
	
	public float getTam() {
		return tam;
	}
	
	public String getSom() {
		return som_emitido;
	}
	
	public void Atributos() {
		System.out.println("Idade : " + this.getAge());
		System.out.println("Tamanho : " + this.getTam());
		System.out.println("Som : " + this.getSom());
		System.out.println("Cor : " + this.getCor());
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	

}
