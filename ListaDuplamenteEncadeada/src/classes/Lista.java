package classes;

public class Lista {
	
	private Celula cabeca;
	private Celula cauda;
	private int totalDeElementos;
	
	
	
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
	
	
	
	
	public void adicionarNoFim(String nome) {

	    if (this.totalDeElementos == 0) {
        adicionarNoInicio(nome);
	       // Celula nova = new Celula(nome);
	      //  this.cabeca = nova;
	       // this.cauda = nova;
	        
	    } else {
	        
	        Celula nova = new Celula(nome);
	        this.cauda.setProxima(nova);
	        this.cauda = nova;
	    }
	    
	    this.totalDeElementos++;
	}
	
	
	
	
	public void imprimir() {
		
		Celula aux = this.cabeca;
		for(int cont=0;cont<this.totalDeElementos;cont++) {
			System.out.println(aux.getElemento());
			aux = aux.proxima;
	
		}


}
	
	
	
		public void removerDoInicio() {
			if (this.totalDeElementos == 0) {
				System.out.println("A lista está vazia.");
				return;
			}
		
			// lembrete vivih: caso a lista só tenha 1 elemento
			if (this.totalDeElementos == 1) {
				this.cabeca = null;
				this.cauda = null;
			} else {
				this.cabeca = this.cabeca.getProxima();
				this.cabeca.setAnterior(null);
			}
		
			this.totalDeElementos--;
		}
		



	
	public void removerDoFinal() {
		if (this.totalDeElementos == 0) {
			System.out.println("A lista está vazia.");
			return;
		}
	
	
		if (this.totalDeElementos == 1) {
			this.cabeca = null;
			this.cauda = null;
		} else {
			this.cauda = this.cauda.getAnterior();
			this.cauda.setProxima(null);
		}
	
		this.totalDeElementos--;
	}
	

	

	
	public void adicionarPorPosicao(int posicao, String nome) {
		if (posicao < 0) {
			System.out.println("Posição inválida.");
			return;
		}
	
		if (posicao == 0) {
			adicionarNoInicio(nome);
		} else if (posicao >= this.totalDeElementos) {
			adicionarNoFim(nome);
		} else {
			Celula atual = this.cabeca;
			for (int i = 0; i < posicao - 1; i++) {
				atual = atual.getProxima();
			}
	
			Celula nova = new Celula(atual.getProxima(), nome);
			atual.setProxima(nova);
			nova.getProxima().setAnterior(nova);
	
			this.totalDeElementos++;
		}
	}
	
	


public void removerPorPosicao(int posicao) {
    if (posicao < 0 || posicao >= this.totalDeElementos) {
        System.out.println("Posição inválida.");
        return;
    }

    if (posicao == 0) {
        removerDoInicio();
    } else if (posicao == this.totalDeElementos - 1) {
        removerDoFinal();
    } else {
        Celula atual = this.cabeca;
        for (int i = 0; i < posicao - 1; i++) {
            atual = atual.getProxima();
        }

        Celula proxima = atual.getProxima().getProxima();
        atual.setProxima(proxima);
        proxima.setAnterior(atual);

        this.totalDeElementos--;
    }
}

	
	
	
	
	
}
