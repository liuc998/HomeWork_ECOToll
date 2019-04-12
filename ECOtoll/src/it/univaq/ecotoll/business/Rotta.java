package it.univaq.ecotoll.business;
import java.util.*;


import it.univaq.ecotoll.entità.Casello;
import it.univaq.ecotoll.interfacce.*;


public class Rotta {
	private Casello in;
	private Casello out;
	
	
	public Rotta(Casello in, Casello out) {
		this.in = in;
		this.out = out;
		
	}


	public Casello getIn() {
		return in;
	}


	public void setIn(Casello in) {
		this.in = in;
	}


	public Casello getOut() {
		return out;
	}


	public void setOut(Casello out) {
		this.out = out;
	}
	
	public Map<Autostrada, Integer> trovaAutostrade(){
		Map<Autostrada, Integer> rotta = new HashMap<>();
		return rotta;
	}
}
