package model;

public class Nastavnik extends Osoba {
	private String zvanje;
//	spisak predmeta koje predaje
	public Nastavnik(int id, String ime, String prezime, String grad, String zvanje) {
		super(id, ime, prezime, grad);
		this.zvanje = zvanje;
	}

	public String getZvanje() {
		return zvanje;
	}

	public void setZvanje(String zvanje) {
		this.zvanje = zvanje;
	}

}
