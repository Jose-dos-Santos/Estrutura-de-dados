package com.jose.estruturadados.vetor.teste;

import com.jose.estruturadados.vetor.Vetor2;

public class Aula {

	public static void main(String[] args) throws Exception {
		
		Vetor2 vetor = new Vetor2(5);
		
		try {
		
		vetor.adiciona("Fruta",0);
		vetor.adiciona("Ma��",1);
		vetor.adiciona("Mel�ncia",2);
		vetor.adiciona("Pera",3);
		vetor.adiciona("Abacate",5);
		//vetor.adiciona("jaca");
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		vetor.listar();
		vetor.remove("Ma��");
		vetor.listar();
	    //vetor.adiciona("Banana");
		System.out.println("");
		System.out.println("");
		
		vetor.listar();
		System.out.println("");
		System.out.println("");
		try {
			
			
			vetor.adiciona("Ma��",1);
			
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		vetor.listar();
	}

}
