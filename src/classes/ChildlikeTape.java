package classes;

public class ChildlikeTape extends Tape implements PriceTapes {

	public ChildlikeTape(String title) {
		super(title, CHILDLIKE_PRICE);
	}

	@Override
	public Double getFineAmount(int days) {
		
		double subtotal = 0;
		
		if (days > 3) {
			subtotal += ((days - 3) * FINE_RATE);
		}
		
		return subtotal;
	}

	@Override
	public int generateDotz(int days) {
		return 1;
	}
	
}
