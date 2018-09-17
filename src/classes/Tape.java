package classes;

public abstract class Tape {
	
	private String title;
	private Double price;
	
	public Tape(String title, Double price) {
		super();
		this.title = title;
		this.price = price;
	}

	public abstract Double getFineAmount(int days);
	
	public abstract int generateDotz(int days);

	public String getTitle() {
		return title;
	}

	public Double getPrice() {
		return price;
	}

}
