package classes;

public class Lista {
	
	private Celula cabeca;
	private Celula cauda;
	private int totalDeElementos;
	
	
	//método adicionar no início
	public void adicionarNoInicio(String nome) {
		
		if(this.totalDeElementos==0) {
			
			Celula nova = new Celula(nome);
			this.cabeca = nova;
			this.cauda = nova;
			
		}else {
			
			Celula nova = new Celula(this.cabeca, nome);
			this.cabeca.setAnterior(nova);
			this.cabeca = nova;
		}
		
		this.totalDeElementos++;
	}
	
	
	//método adicionar no fim
	
	public void adicionarNoFim(String nome) {

	    if (this.totalDeElementos == 0) {
        //adicionarNoInicio(nome); //pode apenas chamar o método aqui se quiser
	        Celula nova = new Celula(nome);
	        this.cabeca = nova;
	        this.cauda = nova;
	        
	    } else {
	        
	        Celula nova = new Celula(nome);
	        this.cauda.setProxima(nova);
	        this.cauda = nova;
	    }
	    
	    this.totalDeElementos++;
	}
	
	
	//método imprimir
	
	public void imprimir() {
		
		Celula aux = this.cabeca;
		for(int cont=0;cont<this.totalDeElementos;cont++) {
			System.out.println(aux.getElemento());
			aux = aux.proxima;
	
		}


}
	
	
	

	
	//remover do final
	
	public void removerDoFinal() {
	    if (this.totalDeElementos == 0) {
	        System.out.println("A lista está vazia!");
	    } else if (this.totalDeElementos == 1) {
	        this.cabeca = null;
	        this.cauda = null;
	        this.totalDeElementos = 0;
	    } else {
	        this.cauda = this.cauda.getAnterior();
	        this.cauda.setProxima(null);
	        this.totalDeElementos--;
	    }
	}

	
	//adicionar por posição
	
	public void adicionarPorPosicao(int posicao, String nome) {
	    if (posicao == 0) {
	        adicionarNoInicio(nome);
	    } else if (posicao == this.totalDeElementos) {
	        adicionarNoFim(nome);
	    } else if (posicao > 0 && posicao < this.totalDeElementos) {
	        Celula atual = this.cabeca;
	        for (int i = 0; i < posicao - 1; i++) {
	            atual = atual.getProxima();
	        }
	        Celula nova = new Celula(atual.getProxima(), nome);
	        atual.getProxima().setAnterior(nova);
	        atual.setProxima(nova);
	        this.totalDeElementos++;
	    } else {
	        System.out.println("Posição inválida!");
	    }
	}
	
//	remover por posição

	public void removerPorPosicao(int posicao) {
	    if (posicao == 0) {
	        removerDoInicio();
	    } else if (posicao == this.totalDeElementos - 1) {
	        removerDoFinal();
	    } else if (posicao > 0 && posicao < this.totalDeElementos) {
	        Celula atual = this.cabeca;
	        for (int i = 0; i < posicao; i++) {
	            atual = atual.getProxima();
	        }
	        atual.getAnterior().setProxima(atual.getProxima());
	        atual.getProxima().setAnterior(atual.getAnterior());
	        this.totalDeElementos--;
	    } else {
	        System.out.println("Posição inválida!");
	    }
	}

	
	
	
	
	
}
