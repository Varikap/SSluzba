package model;

public class Student extends Osoba {
	private String index;
	// predmeti koje pohadja
	// ispitne prijave
	// napraviti metodu uz pomoc koje samo student moze da kreira prijavu

	public Student(int id, String index, String ime, String prezime, String grad) {
		super(id, ime, prezime, grad);
		this.index = index;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

}
