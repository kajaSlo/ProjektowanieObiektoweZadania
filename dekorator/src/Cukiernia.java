
public class Cukiernia {

	public static void main(String[] args) {

		Tort malyTort = new MalyTort(23);
		malyTort = new Orzechy(malyTort);
		
		System.out.println(malyTort.cena());
	}

}
