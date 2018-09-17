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
		return this.tape.getPrice() + this.tape.getFineAmount(this.days);
	}
	
	public int getDotz() {
		return this.tape.generateDotz(this.days);
	}
	
}
