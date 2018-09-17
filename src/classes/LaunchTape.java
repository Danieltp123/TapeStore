package classes;

public class LaunchTape extends Tape implements PriceTapes {

	public LaunchTape(String title) {
		super(title, LAUNCH_PRICE);
	}

	@Override
	public Double getFineAmount(int days) {
		return days * LAUNCH_FINE_RATE;
	}

	@Override
	public int generateDotz(int days) {
		
		int dotz = 1;
		
		if (days > 1) {
			dotz++;
		}
		
		return dotz;
		
	}

}
