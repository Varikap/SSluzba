package model;

public class IspitnaPrijava {
	private int teorija;
	private int zadaci;

	public IspitnaPrijava(int teorija, int zadaci) {
		super();
		this.teorija = teorija;
		this.zadaci = zadaci;
	}

	public int getTeorija() {
		return teorija;
	}

	public void setTeorija(int teorija) {
		this.teorija = teorija;
	}

	public int getZadaci() {
		return zadaci;
	}

	public void setZadaci(int zadaci) {
		this.zadaci = zadaci;
	}
}
