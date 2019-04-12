package it.univaq.ecotoll.interfacce;

import it.univaq.ecotoll.entità.Casello;
import it.univaq.ecotoll.entità.Veicolo;

public interface Autostrada {
	
	//IL METODO CALCOLA IL PEDAGGIO PER QUESTA AUTOSTRADA 

	public int calcoloPedaggio(Casello begin, Casello end, String category );
	
}
