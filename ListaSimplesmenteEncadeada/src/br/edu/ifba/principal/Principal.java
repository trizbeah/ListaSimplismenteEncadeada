package br.edu.ifba.principal;

import br.edu.ifba.lista.Lista;

public class Principal {
	
	public static void main(String[] args) {
		
		Lista l = new Lista();
		l.adicionarNoComeco("Bia");
		l.adicionarNoComeco("Murilo");
		l.adicionarNoComeco("Luana");
		l.adicionarNoComeco("J�lia");

		l.listar();
		
	}

}
