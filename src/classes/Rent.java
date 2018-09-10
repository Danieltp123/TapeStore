package classes;

public class Rent {

	private Tape tape;
	private int rentedDays;
	
	public Rent(Tape tape, int rentedDays) {
		this.tape = tape;
		this.rentedDays = rentedDays;
	}

	public Tape getTape() {
		return tape;
	}

	public int getRentedDays() {
		return rentedDays;
	}
	
}
