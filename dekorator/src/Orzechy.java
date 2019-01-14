
public class Orzechy extends TortDecorator{

	private int orzechy = 6;
	
	Tort mt;
	private int cenaT = 6;

	Orzechy(Tort mt){
		this.mt = mt;
	}

	@Override
	public int cena() {

		return mt.cena() + orzechy;
	}

}
