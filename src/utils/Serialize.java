package utils;

import java.util.ArrayList;
import model.*;
import java.io.*;
public class Serialize {
	private static final String sp = System.getProperty("file.separator");
	private static String fpStudenti = "."+sp+"data"+"studenti.dat";
	public static void snimiStudente(ArrayList<Student> studenti) {
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File(fpStudenti)))){
			out.writeObject(studenti);
			out.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static ArrayList<Student> ucitajStudente() {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File(fpStudenti))))
		{
			@SuppressWarnings("unchecked")
			ArrayList<Student> studenti =(ArrayList<Student>) in.readObject();
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
}
