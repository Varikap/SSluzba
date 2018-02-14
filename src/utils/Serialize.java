package utils;

import java.util.ArrayList;
import model.*;
import java.io.*;

public class Serialize {
	private static final String sp = System.getProperty("file.separator");
	private static String fpStudenti = "." + sp + "data" + "studenti.dat";
	private static String fpNastavnici = "." + sp + "data" + "nastavnici.dat";
	private static String fpPredmeti = "." + sp + "data" + "predmeti.dat";
	private static String fpRok = "." + sp + "data" + "rokovi.dat";
	private static String fpPrijava = "." + sp + "data" + "prijave.dat";

	public static void snimiStudente(ArrayList<Student> studenti) {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File(fpStudenti)))) {
			out.writeObject(studenti);
			out.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<Student> ucitajStudente() {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File(fpStudenti)))) {
			@SuppressWarnings("unchecked")
			ArrayList<Student> studenti = (ArrayList<Student>) in.readObject();
			return studenti;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void snimiNastavnike(ArrayList<Nastavnik> nastavnici) {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File(fpNastavnici)))) {
			out.writeObject(nastavnici);
			out.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<Nastavnik> ucitajNastavnike() {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File(fpNastavnici)))) {
			@SuppressWarnings("unchecked")
			ArrayList<Nastavnik> nastavnici = (ArrayList<Nastavnik>) in.readObject();
			return nastavnici;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void snimiPredmete(ArrayList<Predmet> predmeti) {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File(fpPredmeti)))) {
			out.writeObject(predmeti);
			out.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<Predmet> ucitajPredmete() {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File(fpPredmeti)))) {
			@SuppressWarnings("unchecked")
			ArrayList<Predmet> predmeti = (ArrayList<Predmet>) in.readObject();
			return predmeti;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void snimiIspitnePrijave(ArrayList<IspitnaPrijava> prijave) {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File(fpPrijava)))) {
			out.writeObject(prijave);
			out.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<IspitnaPrijava> ucitajIspitnePrijave() {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File(fpPrijava)))) {
			@SuppressWarnings("unchecked")
			ArrayList<IspitnaPrijava> prijave = (ArrayList<IspitnaPrijava>) in.readObject();
			return prijave;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void snimiIspitniRok(ArrayList<IspitniRok> rokovi) {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File(fpRok)))) {
			out.writeObject(rokovi);
			out.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<IspitniRok> ucitajIspitneRokove() {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File(fpRok)))) {
			@SuppressWarnings("unchecked")
			ArrayList<IspitniRok> rokovi = (ArrayList<IspitniRok>) in.readObject();
			return rokovi;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
