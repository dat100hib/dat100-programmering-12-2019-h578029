package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;

public class Blogg {

	// TODO: objektvariable 
	private Innlegg[] samling;
	private int antall = 0;
	

	public Blogg() {
		this(20);
	}

	public Blogg(int lengde) {
		samling = new Innlegg[lengde];
	}

	public int getAntall() {
		return antall;
	}
	
	public Innlegg[] getSamling() {
		return samling;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for(int i = 0; i < antall; i++)
			if(samling[i].erLik(innlegg))
					return i;
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		return finnInnlegg(innlegg) != -1;
	}

	public boolean ledigPlass() {
		return antall < samling.length && antall >= 0;

	}
	
	public boolean leggTil(Innlegg innlegg) {
		if (ledigPlass()) {
			samling[antall++] = innlegg;
			return true;
		}
		return false;
	}
	
	public String toString() {
		return String.format("%d\n%s", antall, concat());
	}

	private String concat() {
		String current = "";
		for(int i = 0; i < antall; i++)
			current+=samling[i];
		return current;
	}
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}