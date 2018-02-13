package model;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class IspitniRok {
	private int id;
	private String naziv;
	private Date pocetak;
	private Date kraj;
//	spisak ispitnih prijava

	private SimpleDateFormat sd = new SimpleDateFormat("DD-MM-YYYY");
	public IspitniRok(int id, String naziv, String pocetak, String kraj) {
		super();
		this.id = id;
		this.naziv = naziv;
		try {
			this.pocetak = sd.parse(pocetak);
			this.kraj = sd.parse(kraj);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Date getPocetak() {
		return pocetak;
	}

	public void setPocetak(String pocetak) {
		try {
			this.pocetak = sd.parse(pocetak);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public Date getKraj() {
		return kraj;
	}

	public void setKraj(String kraj) {
		try {
			this.kraj = sd.parse(kraj);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
