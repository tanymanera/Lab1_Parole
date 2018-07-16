package it.polito.tdp.parole.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Parole {
    private List<String> parole;
		
	public Parole() {
		parole = new LinkedList<>();
	}
	
	public void addParola(String p) {
		parole.add(p);
	}
	
	public List<String> getElenco() {
		Collections.sort(parole);
		return parole;
	}
	
	public void reset() {
		parole.clear();
	}
	
	public void remove(String p) {
	    parole.remove(p);
	}

}
