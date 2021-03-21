package com.algaworks.financeiro.model;

import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("FinanceiroPU");

		System.out.println("Deu certo");

	}

}
