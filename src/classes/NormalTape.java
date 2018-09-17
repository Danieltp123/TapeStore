package classes;

public class NormalTape extends Tape implements PriceTapes {

	public NormalTape(String title) {
		super(title, NORMAL_PRICE);
	}

	@Override
	public Double getFineAmount(int days) {
		
		double subtotal = 0;
		
		if (days > 2) {
			subtotal += ((days - 2) * FINE_RATE);
		}
		
		return subtotal;
		
	}

	@Override
	public int generateDotz(int days) {
		return 1;
	}

}

