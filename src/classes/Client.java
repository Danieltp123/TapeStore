package classes;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	private String name;
	private List<Rent> leasedTapes = new ArrayList<Rent>();
	
	public Client(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void addRent(Tape tape, int days) {
		Rent rent = new Rent(tape, days);
		this.leasedTapes.add(rent);
	}
	
	public String extract() {
		
        final String endLine = System.getProperty("line.separator");
        String result = "Registro de Alugueis de " + getName() + endLine;
        
        double amount = 0.0;
        
        int dotz = 0;
        
        for (Rent rent : leasedTapes) {

            double currentValue = rent.getSubtotal();
            dotz += rent.getDotz();

            result += "\t" + rent.getTape().getTitle() + "\t" + currentValue + endLine;
            amount += currentValue;
            
        }
        
        result += "Valor total devido: " + amount + endLine;
        result += "Voce acumulou " + dotz + " pontos de alugador frequente";
        
        return result;
    }

}
