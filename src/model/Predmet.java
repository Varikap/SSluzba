package model;

public class Predmet {
	private String id;
	private String naziv;

	// lista studenata koja polaze
	// lista nastavnika koja predaje
	// lista ispitnih prijava
	public Predmet(String id, String naziv) {
		super();
		this.id = id;
		this.naziv = naziv;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

}
