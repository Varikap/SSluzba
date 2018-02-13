package model;

import java.util.ArrayList;

public class Nastavnik extends Osoba {
	private String zvanje;
	private ArrayList<Predmet> predmeti;
	
	public Nastavnik(int id, String ime, String prezime, String grad, String zvanje) {
		super(id, ime, prezime, grad);
		this.zvanje = zvanje;
	}

	public void addPredmet(Predmet p) {
		predmeti.add(p);
	}
	
	public void deletePredmet (Predmet p) {
		if (predmeti.contains(p))
			predmeti.remove(p);
	}
	
	public Predmet getPredmetById (int id) {
		for (Predmet predmet : predmeti)
		{
			if (predmet.getId() == id)
				return predmet;
		}
		return null;
	}
	public ArrayList<Predmet> getPredmeti() {
		return predmeti;
	}

	public String getZvanje() {
		return zvanje;
	}

	public void setZvanje(String zvanje) {
		this.zvanje = zvanje;
	}

}
