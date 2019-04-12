package it.univaq.ecotoll.business;

import java.util.*;

import it.univaq.ecotoll.entità.Casello;
import it.univaq.ecotoll.entità.Veicolo;


public class ECOtoll {
	
	public static void main (String[]args) {
		
		 Veicolo v1 = new Veicolo("PUNTO", "FIAT", 2012, "AX293AX", 2, 1000, 120, null);
		 Veicolo v2 = new Veicolo("S511HD","SETRA", 2015,"FE208EF", 2, 4000, 350, null);
		 Veicolo v3 = new Veicolo("R440", "SCANIA", 2012, "AM093KX", 3, 2500, 150, null);
		 Veicolo v4 = new Veicolo("R540", "SCANIA", 2015, "AM056KX", 4, 3500, 170, null);
		 Veicolo v5 = new Veicolo("R640", "SCANIA", 2016, "AC654JX", 5, 4000, 220, null);
		
		 
		 AutostradaR A24 = new AutostradaR(null, null, 1);
		
		 
		 Casello c1 = new Casello("L'Aquila Ovest",57, A24 );
		 Casello c2 = new Casello("Assergi", 42, A24);
		 Casello [] array = {c1,c2};
		 A24.setCaselli(new ArrayList<Casello>(Arrays.asList(array)));
		 
		 Pedaggio.pedaggioTotale(c2,c1,v1);
		 Pedaggio.pedaggioTotale(c2,c1,v2);
		 Pedaggio.pedaggioTotale(c2,c1,v3);
		 Pedaggio.pedaggioTotale(c2,c1,v4);
		 Pedaggio.pedaggioTotale(c2,c1,v5);
		 
	
	
	}

}
