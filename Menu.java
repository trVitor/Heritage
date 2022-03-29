package Menu;

import Confeitaria.BoloAbacaxi;
import Confeitaria.BoloChoconinho;
import Confeitaria.BoloFlorestaNegra;
import Confeitaria.BoloPrestigio;
import Confeitaria.Bolos;

public class Menu {

	public static void main(String[] args) {
	 
		BoloAbacaxi abacaxi = new BoloAbacaxi();
	    BoloFlorestaNegra florestanegra = new BoloFlorestaNegra();
	    BoloPrestigio prestigio = new BoloPrestigio();
	    BoloChoconinho choconinho = new BoloChoconinho();
		
	    abacaxi.setNome("Bolo de Abacaxi :");
	    abacaxi.setPreco(50.99f);
	    abacaxi.setTipo("SOBREMESA!");
	    System.out.println(abacaxi.getNome());
		System.out.println("PREÇO: " + abacaxi.getPreco());
	    System.out.println("TIPO : " + abacaxi.getTipo());
		abacaxi.SobreoBolo();
	    System.out.println("RECEITA: " );
	    abacaxi.Receita();
	    
	    System.out.println("---------------------------------------------------------------------" );

	    
	    florestanegra.setNome("Bolo Floresta Negra:");
	    florestanegra.setPreco(69.99f);
	    florestanegra.setTipo("SOBREMESA!");
	    System.out.println(florestanegra.getNome());
		System.out.println("PREÇO: " + florestanegra.getPreco());
	    System.out.println("TIPO: " + florestanegra.getTipo());
		florestanegra.SobreoBolo();
	    System.out.println("RECEITA: " );
	    florestanegra.Receita();

	    System.out.println("---------------------------------------------------------------------" );

	    
	    prestigio.setNome("Bolo de Prestigio:");
	    prestigio.setPreco(60.99f);
	    prestigio.setTipo("SOBREMESA!");
	    System.out.println(prestigio.getNome());
		System.out.println("PREÇO: " + prestigio.getPreco());
	    System.out.println("TIPO: " + prestigio.getTipo());	  
		prestigio.SobreoBolo();
	    System.out.println("RECEITA: " );
	    prestigio.Receita();

	    System.out.println("---------------------------------------------------------------------" );

	    
	    choconinho.setNome("Bolo de Choconinho:");
	    choconinho.setPreco(65.99f);
	    choconinho.setTipo("SOBREMESA!");
	    System.out.println(choconinho.getNome());
		System.out.println("PREÇO: " + choconinho.getPreco());
	    System.out.println("TIPO: " + choconinho.getTipo());
		choconinho.SobreoBolo();
	    System.out.println("RECEITA: ");
	    choconinho.Receita();

	    
	}

}
