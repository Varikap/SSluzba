package model;

import java.util.ArrayList;

public class Student extends Osoba {
	private String index;
	private IspitnaPrijava ispitnaPrijava;
	private ArrayList<Predmet> predmeti;


	public Student(int id, String index, String ime, String prezime, String grad) {
		super(id, ime, prezime, grad);
		this.index = index;
	}

	public void addPredmet(Predmet p) {
		predmeti.add(p);
	}
	
	public void deletePredmete() {
		predmeti = new ArrayList<Predmet>();
	}
	public void deletePredmet(Predmet p) {
		if (predmeti.contains(p))
			predmeti.remove(p);
	}
	public ArrayList<Predmet> getPredmeti() {
		return predmeti;
	}
	
	public Predmet getPredmetById (int id) {
		for (Predmet p : this.predmeti)
		{
			if (p.getId() == id)
				return p;
		}
		return null;
	}
	
	public IspitnaPrijava getIspitnaPrijava () {
		return ispitnaPrijava;
	}
	
	
	public void setispitnaPrijava(IspitnaPrijava prijava) {
		
		ispitnaPrijava = prijava;
	}

	public String getIndex() {
		return index;
	}
	
	public void setIndex(String index) {
		this.index = index;
	}
}
