package com.jose.estruturadados.vetor;

public class Vetor2 {

	private String[] elementos;

	private int tamanho;

	public Vetor2(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	public void adiciona(String elemento, int index) throws Exception {

		if (index < this.elementos.length) {
			this.elementos[index] = elemento;
			tamanho++;
		} else {
			throw new Exception("Vetor já está cheio ou index passado é maior que tamanho do vetor, não é possível adicionar mais elementos");
		}

	}

	public String listar() {
		String elemento = null;
		for (int i = 0; i < elementos.length; i++) {
			System.out.println(elemento = elementos[i]);

		}
		return elemento;
	}

	public void remove(String elemento) {
		for (int i = 0; i < elementos.length; i++) {

			if (elemento == elementos[i]) {

				System.out.println(" remove " + elemento);
				this.elementos[i] = null;
			}

			this.tamanho--;

		}
	}
}