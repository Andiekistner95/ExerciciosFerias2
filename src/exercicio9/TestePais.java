package exercicio9;

public class TestePais {
	
	public static void main(String[] args) {
		
		Pais pais1 = new Pais("Brasil", "Bras�lia", 300000d);
		Pais pais2 = new Pais("Argentina", "Buenos Aires", 200000d);
		
		
		pais1.getFronteira().add("Argentina");
		pais1.getFronteira().add("Chile");
		pais1.getFronteira().add("Paraguai");
		
		if ( pais1.verificaPaisIgual(pais2) == true ){
			System.out.println("S�o o mesmo pa�s");
		}else{
			System.out.println("Pa�ses diferentes");
		}
		
		System.out.println(pais1.getFronteira().toString());
	}

}
