
package com.jose.estruturadados.vetor.teste;

import com.jose.estruturadados.vetor.Celula;
import com.jose.estruturadados.vetor.ListaLigada;

public class TestaListaLIgada {

	public static void main(String[] args) {

		ListaLigada lista = new ListaLigada();

//		lista.removeNoComeco();
//		System.out.println(lista);
        
		System.out.println(lista);
		lista.adicionaNoComeco("Pedro");
		System.out.println(lista);
		lista.adicionaNoComeco(5);
		System.out.println(lista);
		lista.adicionaNoComeco("João");
		System.out.println(lista);
		lista.adicionaNoComeco("Carlos");
		System.out.println(lista);

		lista.adicionaNoFinal("Mauro");
		System.out.println(lista);

		lista.adiciona(3, "Guilherme");
		System.out.println(lista);
		
		

		Object x = lista.pega(5);
		System.out.println(x);

		System.out.println("existe");
		boolean existe = lista.contem("Pedro");
		System.out.println(existe);
		System.out.println("existe");
		System.out.println(lista.tamanhoLista());

		lista.removeNoComeco();
		System.out.println(lista);

		lista.removeNoComeco();
		System.out.println(lista);

		lista.remove();
		System.out.println(lista);
        String objeto = null;
		Celula celula = new Celula(objeto,  null);
		
		System.out.println(celula.getElemento());
		celula.getProximo();
		System.out.println(celula.getProximo());
		
		
	}

}
