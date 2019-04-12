package it.univaq.ecotoll.entità;

public class Veicolo {
	private String modello;
	private String marca;
	private int anno;
	private String targa;
	private int assi;
	private int peso;
	private int altezza;
	private String category;
	
	public Veicolo(String modello, String marca, int anno, String targa, int assi, int peso, int altezza, String category ) {
		this.modello = modello;
		this.marca = marca;
		this.anno = anno;
		this.targa = targa;
		this.assi = assi;
		this.peso = peso;
		this.altezza = altezza;
		this.category = category;
		
		//CONTROLLO CATEGORIA VEICOLO
		if(category == null) {
		if(this.assi < 2 || this.assi == 2 && this.altezza <= 130) 
				this.category = "A";
		else if(this.assi == 2 && this.altezza > 130) 
				this.category = "B";
		else if(this.assi == 3) 
				this.category = "3";
		else if(this.assi == 4)
				this.category = "4";
				else if(this.assi >= 5)
					this.category = "5";
				}
			
			
		}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public int getAssi() {
		return assi;
	}

	public void setAssi(int assi) {
		this.assi = assi;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getAltezza() {
		return altezza;
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
		
		
	}
	
	

