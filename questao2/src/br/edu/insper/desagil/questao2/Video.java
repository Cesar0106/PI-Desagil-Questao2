package br.edu.insper.desagil.questao2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Video {
	private int id;
	private Usuario usuario;
	private Produto produto;
	private Map<String, Integer> avaliacoes;
	
	public Video(int id, Usuario usuario, Produto produto) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.produto = produto;
		this.avaliacoes = new HashMap<>();
		
	}
	public int getId() {
		return id;
	}
	
	public Produto getProduto() {
		return produto;
		
	}
	 public void adicionaAvaliacao(Usuario usuario, int aval) {
		 if (usuario.getNome() != this.usuario.getNome() && aval >= 1 && aval <= 5) {
			 avaliacoes.put(usuario.getNome(), aval); 
		 }
	 }
	 public int mediaAvaliacoes() {
		double n = 0.0;
		double mais = 0.0;
		
 		for (String nome : this.avaliacoes.keySet()) {
			mais += this.avaliacoes.get(nome);
			n += 1;
		}
 		double media = (mais/n);
 		
 		long arredonda = Math.round(media);
 		
 		return (int) arredonda;
		
	 }
}

