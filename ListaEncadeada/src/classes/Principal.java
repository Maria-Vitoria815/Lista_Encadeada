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
	      
	        System.out.println("===== Lista Original =====");
	        l.imprimir();  // Imprime todos os elementos da lista
	        
	        l.adiconarPorPosicao(3, "Novo Usuário");
	        System.out.println("===== Após Adicionar na Posição 3 =====");
	        l.imprimir();  // Imprime a lista após adicionar um elemento na posição 3
	        
	        System.out.println("===== Remover Início =====");
	        l.removerInicio();
	        l.imprimir();  // Imprime a lista após remover o primeiro elemento

	        System.out.println("===== Remover Final =====");
	        l.removerDoFinal();
	        l.imprimir();  // Imprime a lista após remover o último elemento

	        System.out.println("===== Remover por Posição 3 =====");
	        l.removerPorPosicao(3);
	        l.imprimir();  // Imprime a lista após remover o elemento na posição 800

	       
	    }
	 
}
