package model;

import java.util.ArrayList;

public class Predmet {
	private int id;
	private String naziv;
	private ArrayList<Student> studenti;
	private ArrayList<Nastavnik> nastavnici;
	private ArrayList<IspitnaPrijava> prijave;
	
	
	public Predmet(int id, String naziv) {
		super();
		this.id = id;
		this.naziv = naziv;
	}

	public void addStudent (Student s)  {
		studenti.add(s);
	}
	
	public void deleteStudent(Student student) {
		for (Student s : studenti)
		{
			if (s.getId() == student.getId())
			{
				studenti.remove(s);
				return;
			}
		}
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
		for (Nastavnik n : nastavnici)
		{
			if (n.getId() == nastavnik.getId())
			{
				nastavnici.remove(n);
				return;
			}
		}
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
		for (IspitnaPrijava i : prijave)
		{
			if (i.getId() == prijava.getId())
			{
				prijave.remove(i);
				return;
			}
		}
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
