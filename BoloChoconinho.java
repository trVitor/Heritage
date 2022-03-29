package Confeitaria;

public class BoloChoconinho extends Bolos{
	
    public BoloChoconinho() {
    	 }
    
    @Override
	public void SobreoBolo() {
		System.out.println("\nBolo de Choconinho, consiste em um bolo com recheio de brigadeiro e \ncobertura de leite Ninho trufado.\n");		
	}
	
    @Override
	public void Receita() {
    	
	    System.out.println("2 colheres de leite ninho,\r\n"
	    		+ "3 colheres de cocolate,\r\n"
	    		+ "20 ml de água,\r\n"
	    		+ "1 pitada de açúcar,\r\n"
	    		+ "Confete ou barra de chocolate a gosto." );

		
 	}

	
}
