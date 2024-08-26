package classes;
//import java.util.Random;
//import java.util.Scanner;


public class Principal {

	 public static void main(String[] args) {
	        Lista l = new Lista();
	    //    Scanner in = new Scanner(System.in);
	    //     Random g = new Random();
	        
	        
	        l.adicionarComeco("Ana");
	        l.adicionarComeco("Bruno");
	        l.adicionarComeco("Carlos");
	        l.adicionarComeco("Daniela");
	      
	        System.out.println("===== Listagem =====");
	        l.imprimir();
	        
	        l.adiconarPorPosicao(3, "Novo Usuário");
	        System.out.println("===== Após Adicionar na Posição 3 =====");
	        l.imprimir(); 
	        
	        System.out.println("===== Remover Início =====");
	        l.removerInicio();
	        l.imprimir();  

	        System.out.println("===== Remover Final =====");
	        l.removerDoFinal();
	        l.imprimir(); 

	        System.out.println("===== Após Remover da Posição 3 =====");
	        l.removerPorPosicao(3);
	        l.imprimir();  

	       
	    }
	 
}
