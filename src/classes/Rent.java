package classes;

public class Rent {

	private Tape tape;
	private int days;
	
	public Rent(Tape tape, int days) {
		this.tape = tape;
		this.days = days;
	}

	public Tape getTape() {
		return tape;
	}

	public int getDays() {
		return days;
	}
	
	public double getSubtotal() {
		
		float subtotal = 0;

		switch (this.tape.getIdPrice()) {

		case normal:
			
			subtotal += 2;
			if (this.days > 2) {
				subtotal += ((this.days - 2) * 1.5);
			}
			
			break;
			
		case launch:
			subtotal += (this.days * 3);
			break;
			
		case childlike:
			
			subtotal += 1.5;
			if (this.days > 3) {
				subtotal += ((this.days - 3) * 1.5);
			}
			
			break;
			
		}

		return subtotal;
	}
	
	public int getDotz() {
		
		int dotz = 1;
		
		if (this.tape.getIdPrice() == Tape.Type.launch && this.days > 1) {
			dotz++;
		}
		
		return dotz;
	}
	
}
