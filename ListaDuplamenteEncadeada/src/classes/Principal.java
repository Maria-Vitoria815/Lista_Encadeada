package classes;

public class Principal {
	
	public static void main(String[] args) {
		
		Lista l = new Lista();
		
		    l.adicionarNoInicio("Rodrigo Santoro");
	        System.out.println("===== Lista =====");
	        l.imprimir();
	        
	        
	        l.adicionarNoInicio("Maria Vitória");
			l.adicionarNoInicio("Nivea Maria Flor");
			l.adicionarNoInicio("Nicollas Vinicius");
			l.adicionarNoInicio("Mariane Melo");
	      
	        System.out.println("\n\n");
	        System.out.println("===== Lista após adicionar no início=====");
	        l.imprimir(); 
	        
	     
	        
	        l.adicionarNoFim("Emily Louise");
	        System.out.println("\n\n");
	        System.out.println("===== Lista após adicionar no fim =====");
	        l.imprimir();



			l.removerDoInicio();
	        System.out.println("\n\n");
	        System.out.println("===== Lista após remover do início =====");
	        l.imprimir();



			//l.removerDoFinal();
	       // System.out.println("\n\n");
	       // System.out.println("===== Lista após remover do final =====");
	       // l.imprimir();
	        
	        

		   l.adicionarPorPosicao(3, "Cayo Gabriel");
		   System.out.println("\n\n");
		   System.out.println("===== Lista após adicionar elemento na posição 3 =====");
		   l.imprimir();
	        


		   l.removerPorPosicao(4);
		   System.out.println("\n\n");
		   System.out.println("===== Lista após remover elemento da posição 4 =====");
		   l.imprimir();
	        
	}

}
