package it.univaq.ecotoll.business;
import java.util.*;

import it.univaq.ecotoll.entità.Casello;
import it.univaq.ecotoll.entità.Veicolo;
import it.univaq.ecotoll.interfacce.Autostrada;

public class AutostradaR implements Autostrada{
	
	
	private List<Autostrada> autostradeAdiacenti;
	private List<Casello> caselli;
	private int tariffa;
	
	
	
	public AutostradaR(List<Casello> caselli, List<Autostrada> autostradeAdiacenti, int tariffa) {
		super();
		this.caselli = caselli;
		this.tariffa = tariffa;
		this.autostradeAdiacenti = autostradeAdiacenti;
		
		
	}
	
	public AutostradaR() {
		this.caselli = new ArrayList<>();
		this.autostradeAdiacenti = new ArrayList<>();
		this.tariffa = 0;
		
		
	}

	@Override
	public int calcoloPedaggio(Casello entrata, Casello uscita, String category) {
		//calcolo pedaggio
		int pedaggio; 
		int pos1 = entrata.getPosizione();
		int pos2 = uscita.getPosizione();
		int lunghezzaTratta = Math.abs(pos2 - pos1);
		
		
		
		 		
		
		
		return 0;
	}
	
	
	public int getTariffa() {
		return this.tariffa;
	}

	public List<Autostrada> getAutostradeAdiacenti() {
		return autostradeAdiacenti;
	}

	public void setAutostradeAdiacenti(List<Autostrada> autostradeAdiacenti) {
		this.autostradeAdiacenti = autostradeAdiacenti;
	}

	public List<Casello> getCaselli() {
		return caselli;
	}

	public void setCaselli(List<Casello> caselli) {
		this.caselli = caselli;
	}

	public void setTariffa(int tariffa) {
		this.tariffa = tariffa;
	}

}
