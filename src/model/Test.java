package model;


public class Test {

	public static void main(String[] args) {
		Student s = new Student(10,"sf","nikola","popadic","trsac");
		System.out.print(s.getIndex());
		System.out.println(s.getIme());
		IspitniRok i = new IspitniRok(10, "dsadas", "21-01-1011", "21-02-1023");
		System.out.println(i.getKraj());
	}

}
