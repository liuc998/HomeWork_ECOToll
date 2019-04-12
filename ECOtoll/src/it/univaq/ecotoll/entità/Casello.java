package it.univaq.ecotoll.entità;
import it.univaq.ecotoll.interfacce.Autostrada;

public class Casello {
	private String nome;
	private Short posizione;
	private Autostrada belongTo;

	public Casello() {
		this.nome = "nome casello";
		this.posizione = 0;
		this.belongTo = null;
	}
	
	public Casello (String nome, int posizione, Autostrada belongTo) {
			this.nome = nome;
			this.posizione = (short) posizione;
			this.belongTo = belongTo;
			
	
}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Short getPosizione() {
		return posizione;
	}

	public void setPosizione(String posizione) {
		this.posizione = posizione;
	}

	public Autostrada getBelongTo() {
		return belongTo;
	}

	public void setBelongTo(Autostrada belongTo) {
		this.belongTo = belongTo;
	}
}
