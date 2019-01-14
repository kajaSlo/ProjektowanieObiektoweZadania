
public class PolewaCzekoladowa extends TortDecorator{

	private int polewa = 2;
	public PolewaCzekoladowa() {}

	@Override
	public int cena() {
		return this.polewa;
	}
}
