package br.edu.insper.desagil.questao2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Usuario {
	private String nome;
	private List<Video> videos;
	
	public Usuario(String nome) {
		super();
		this.nome = nome;
		this.videos = new ArrayList<>();
	}
	
	public String getNome(){
		return nome;
	}

	public void postaVideo(int id, Produto produto) {
		Video novo = new Video(id, this, produto);
		this.videos.add(novo);
	}
	
	public int totalAvaliacoes() {
		int mais = 0;
		
		for (Video video : this.videos) {
			mais += video.mediaAvaliacoes();
		}
		return mais;
	
	}
}
