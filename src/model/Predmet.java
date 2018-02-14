package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Predmet implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String naziv;
	private ArrayList<Student> studenti;
	private ArrayList<Nastavnik> nastavnici;
	private ArrayList<IspitnaPrijava> prijave;
	
	
	public Predmet(int id, String naziv) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.studenti = new ArrayList<Student>();
		this.nastavnici = new ArrayList<Nastavnik>();
		this.prijave = new ArrayList<IspitnaPrijava>();
	}

	public void addStudent (Student s)  {
		studenti.add(s);
	}
	
	public void deleteStudent(Student student) {
		if (studenti.contains(student))
			studenti.remove(student);
	}
	
	public ArrayList<Student> getStudente() {
		return studenti;
	}
	
	public Student getStudentById(int id) {
		for (Student student : studenti)
		{
			if (student.getId() == id)
				return student;
		}
		return null;
	}
	public void addNastavnik (Nastavnik n)  {
		nastavnici.add(n);
	}
	
	public void deleteNastavnik(Nastavnik nastavnik) {
		if (nastavnici.contains(nastavnik))
			nastavnici.remove(nastavnik);
	}
	
	public ArrayList<Nastavnik> getNastavnike() {
		return nastavnici;
	}
	
	public Nastavnik getNastavnikById(int id) {
		for (Nastavnik nastavnik : nastavnici)
		{
			if (nastavnik.getId() == id)
				return nastavnik;
		}
		return null;
	}
	
	public void addPrijava (IspitnaPrijava n)  {
		prijave.add(n);
	}
	
	public void deletePrijava(IspitnaPrijava prijava) {
		if (prijave.contains(prijava))
			prijave.remove(prijava);
	}
	
	public ArrayList<IspitnaPrijava> getPrijave() {
		return prijave;
	}
	
	public IspitnaPrijava getIspitnaPrijavaById(int id) {
		for (IspitnaPrijava prijava : prijave)
		{
			if (prijava.getId() == id)
				return prijava;
		}
		return null;
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

}
