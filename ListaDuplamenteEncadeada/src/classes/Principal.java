package classes;

public class Principal {
	
	public static void main(String[] args) {
		
		Lista l = new Lista();
		
		    l.adicionarNoInicio("Rodrigo Santoro");
	      
	        System.out.println("===== Listagem =====");
	        l.imprimir();
	        
	        
	        l.adicionarNoInicio("Maria Vitória");
			l.adicionarNoInicio("Nivea Maria Flor");
			l.adicionarNoInicio("Nicollas Vinicius");
			l.adicionarNoInicio("Mariane Melo");
	      
	        System.out.println("\n\n");
	        System.out.println("===== Lista Atualizada =====");
	        l.imprimir(); 
	        
	     
	        
	        l.adicionarNoFim("Emily Louise");
	        
	        System.out.println("\n\n");
	        System.out.println("===== Lista Atualizada =====");
	        l.imprimir();



			l.removerDoInicio();
	        
	        System.out.println("\n\n");
	        System.out.println("===== Lista Atualizada =====");
	        l.imprimir();



			//l.removerDoFinal();
	        
	       // System.out.println("\n\n");
	       // System.out.println("===== Lista Atualizada =====");
	       // l.imprimir();
	        
	        
		   l.adicionarPorPosicao(3, "Cayo Gabriel");
	        
		   System.out.println("\n\n");
		   System.out.println("===== Lista Atualizada =====");
		   l.imprimir();
	        


		   l.removerPorPosicao(4);
	        
		   System.out.println("\n\n");
		   System.out.println("===== Lista Atualizada =====");
		   l.imprimir();
	        
	}

}
