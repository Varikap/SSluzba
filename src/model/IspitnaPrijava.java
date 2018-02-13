package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IspitnaPrijava {
	private int id;
	private int teorija;
	private int zadaci;
	private Date datumPrijave;

	private SimpleDateFormat sd = new SimpleDateFormat("DD-MM-YYYY");

	public IspitnaPrijava(int teorija, int zadaci, String datumPrijave) {
		super();
		this.teorija = teorija;
		this.zadaci = zadaci;
		try {
			this.datumPrijave = sd.parse(datumPrijave);
		} catch (ParseException e) {
			e.printStackTrace();
		}
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setZadaci(int zadaci) {
		this.zadaci = zadaci;
	}

	public Date getDatumPrijave() {
		return datumPrijave;
	}

	public void setDatumPrijave(String datumPrijave) {
		try {
			this.datumPrijave = sd.parse(datumPrijave);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}