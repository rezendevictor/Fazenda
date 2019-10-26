package principal;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;



public class CriacaoFazenda{
	
	private Scanner in = new Scanner(System.in);
	private Random rand = new Random();
	private ArrayList <Galinha> galinheiro = new ArrayList<Galinha>();
	private ArrayList <Morcego> morcegada  = new ArrayList<Morcego>();
	private ArrayList <Pato> patos = new ArrayList<Pato>();
	private ArrayList <Vaca> curral  = new ArrayList<Vaca>();
	
	public void criacao() {
		int t = 0;
		boolean  adiciona = true;
		while(adiciona) {
			int age = 0;
			float tam = 0;
			String cor = "branco";
			float voo = 0;
			
			System.out.printf("Escolha qual animal deseja adicionar: \n"
					+ "1 - Pato \n"
					+ "2 - Morcego \n"
					+ "3 - Galinha \n"
					+ "4 - Vaca \n"
					+ "5 - para sair\n");
			t = in.nextInt();
			
			if(t>=1 || t <=5) {
				System.out.println("Digite a idade do animal:");
				age = in.nextInt();
				System.out.println("Digite o tamanho do animal em metros:");
				tam = in.nextFloat();
				System.out.println("Digite a cor do animal:");
				cor = in.next();
				
				if(t<=2){
					System.out.println("Digite a altura de voo do animal:");
					voo = in.nextFloat();
					}
				}
			adiciona = menu(t,age,tam,cor,voo);

		}
	}
	
	
	public void auto() {
		ArrayList <String> cores = new ArrayList<String>();
		cores.add("preto");
		cores.add("Branco");
		cores.add("Cinza");
		
		int animal = 0;
		for(int i = 0;i<20;i++ ) {
			animal = 1+  rand.nextInt(4);
			menu(animal,1 + rand.nextInt(15), rand.nextFloat()*(1+rand.nextInt(10)),
					cores.get(rand.nextInt(3)),rand.nextFloat());
			
		}
		System.out.println("Fazenda criada com sucesso!");
		
	}
	

	
	private boolean menu(int t,int age,float tam,String cor,float voo) {
		switch(t) {
		case 1:
			Pato patoTemp = new Pato(age,tam,cor, voo);
			this.patos.add(patoTemp);
			break;
		case 2:
			Morcego morcegoTemp = new Morcego(age,tam,cor, voo);
			this.morcegada.add(morcegoTemp);
			break;
		case 3: 
			Galinha galinhaTemp = new Galinha(age,tam,cor);
			this.galinheiro.add(galinhaTemp);
			break;
		case 4: 
			Vaca vacaTemp= new Vaca(age,tam,cor);
			this.curral.add(vacaTemp);
			break;
		case 5:

			return false;
		
		default:
			System.out.println("Voce digitou um numero invalido");

		}
		
		System.out.println("Animal Adicionado com sucesso.");
		return true;
	}
	
	
	public void show_fazenda() {
		for(Pato a : this.patos) {
			a.getAtributos();
			System.out.println("");
		}
		System.out.println("---------------------------------------------------------------------------------------------------");
		for(Morcego a :this.morcegada) {
			a.getAtributos();
			System.out.println("");
		}
		System.out.println("---------------------------------------------------------------------------------------------------");
		for(Galinha a: this.galinheiro) {
			a.getAtributos();
			System.out.println("");
		}
		System.out.println("---------------------------------------------------------------------------------------------------");
		for(Vaca a : this.curral ) {
			a.getAtributos();
			System.out.println("");
		}
	}
	

}
