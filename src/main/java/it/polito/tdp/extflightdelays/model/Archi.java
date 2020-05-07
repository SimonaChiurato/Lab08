package it.polito.tdp.extflightdelays.model;

public class Archi {
	private String id;
	private String idInverso;
	private Airport partenza;
	private Airport arrivo;
	private double media;
	private int numeroVoli;
	private int peso;
	
	
	public Archi(String id, String idInverso, Airport partenza, Airport arrivo, int peso, int numeroVoli) {
		super();
		this.id = id;
		this.idInverso = idInverso;
		this.partenza = partenza;
		this.arrivo = arrivo;
		this.peso = peso;
		this.numeroVoli=numeroVoli;
	}
	
	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public int getNumeroVoli() {
		return numeroVoli;
	}

	public void setNumeroVoli(int numeroVoli) {
		this.numeroVoli = numeroVoli;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdInverso() {
		return idInverso;
	}

	public void setIdInverso(String idInverso) {
		this.idInverso = idInverso;
	}

	public Airport getPartenza() {
		return partenza;
	}
	public void setPartenza(Airport partenza) {
		this.partenza = partenza;
	}
	public Airport getArrivo() {
		return arrivo;
	}
	public void setArrivo(Airport arrivo) {
		this.arrivo = arrivo;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void aggiornaMedia(double distanza, int numero) {
		this.media= ((this.media*this.numeroVoli)+(distanza*numero))/(this.numeroVoli+numero);
		this.numeroVoli+=numero;
	}
	


	
	
}
