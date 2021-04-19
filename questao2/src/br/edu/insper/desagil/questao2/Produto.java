package br.edu.insper.desagil.questao2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Produto {
	private String nome;
	private double preco;

	public Produto(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
				
	}
	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}
}

