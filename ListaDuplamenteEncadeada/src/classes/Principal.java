package classes;

public class Principal {
	
	public static void main(String[] args) {
		
		Lista l = new Lista();
		
		    l.adicionarNoInicio("TesteInicio");
	      
	        System.out.println("===== Lista Original =====");
	        l.imprimir();  // Imprime todos os elementos da lista
	        
	        
	        l.adicionarNoInicio("Satoru Gojo");
	      
	        System.out.println("\n\n");
	        System.out.println("===== Lista Atualizada =====");
	        l.imprimir(); 
	        
	     
	        
	        l.adicionarNoFim("TesteFim");
	        
	        System.out.println("\n\n");
	        System.out.println("===== Lista Atualizada =====");
	        l.imprimir();
	        
	        
	        
	        
	}

}
