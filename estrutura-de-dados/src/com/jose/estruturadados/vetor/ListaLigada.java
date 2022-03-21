package com.jose.estruturadados.vetor;

public class ListaLigada {

	private Celula primeira = null;
	private Celula ultimo = null;
	private int totalElemento = 0;

	public void adicionaNoFinal(Object elemento) {

		if (this.totalElemento == 0) {
			adicionaNoComeco(elemento);
		} else {
			Celula nova = new Celula(elemento, null);
			this.ultimo.setProximo(nova);
			this.ultimo = nova;

			this.totalElemento++;
		}
	}

	public void adicionaNoComeco(Object elemento) {
		Celula nova = new Celula(elemento, primeira);
		this.primeira = nova;

		if (this.totalElemento == 0) {
			this.ultimo = this.primeira;
		}

		this.totalElemento++;

	}

	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalElemento;
	}

	private Celula pegaCelula(int posicao) {

		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("posição inexistente");
		}

		Celula atual = primeira;
		for (int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
			
		}

		return atual;

	}

	public void adiciona(int posicao, Object elemento) {
		if (posicao == 0) {
			adicionaNoComeco(elemento);
		} else if (posicao == this.totalElemento) {

			adicionaNoFinal(elemento);

		} else {

			Celula anterior = this.pegaCelula(posicao - 1);
			Celula nova = new Celula(elemento, anterior.getProximo());
			anterior.setProximo(nova);

			this.totalElemento++;

		}

	}

	public Object pega(int posicao) {
		return this.pegaCelula(posicao).getElemento();
	}

	public void removeNoComeco() {
		if (this.totalElemento == 0) {
			throw new IllegalArgumentException("Lista vazia");

		}

		this.primeira = this.primeira.getProximo();
		this.totalElemento--;

		if (this.totalElemento == 0) {
			this.ultimo = null;
		}

	}

	public void remove() {
		if (this.totalElemento == 0) {
			throw new IllegalArgumentException("Lista vazia");

		}

		Celula anterior = null;
		for (int i = 0; i < totalElemento -1; i++) {
			anterior = ultimo;
		}
		

		this.totalElemento--;
	}

	public int tamanhoLista() {

		return this.totalElemento;
	}

	public boolean contem(Object elemento) {
		Celula existe = primeira;
		if(elemento == primeira.getElemento()) {
			return true;
		}else {
		for (int i = 0; i < totalElemento -1; i++) {
			existe = existe.getProximo();
			if(elemento == existe.getElemento()) {
				return true;
			}
		}
		}
		return false;
	}

	@Override

	public String toString() {
		if (this.totalElemento == 0) {
			return "[]";
		}
		Celula atual = primeira;

		StringBuilder builder = new StringBuilder("[");

		for (int i = 0; i < totalElemento; i++) {
			builder.append(atual.getElemento());
			builder.append(",");

			atual = atual.getProximo();
		}

		builder.append("]");

		return builder.toString();
	}
}
