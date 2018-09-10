package Classes;

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
	
	public void addRent(Rent rent) {
		this.leasedTapes.add(rent);
	}
	
	public String extract() {
		
        final String endLine = System.getProperty("line.separator");
        String result = "Registro de Alugueis de " + getName() + endLine;
        
        double amount = 0.0;
        
        int pointsOfHirer = 0;
        
        for (Rent rent : leasedTapes) {

            double currentValue = 0.0;
            
            switch (rent.getTape().getIdPrice()) {
            
				case normal:
					
					currentValue += 2;
					
					if (rent.getRentedDays() > 2) {
						currentValue += ((rent.getRentedDays() - 2) * 1.5);
					}
					
				break;
					
				case launch:
					
					currentValue += (rent.getRentedDays() * 3);
					
				break;
					
				case childlike:
					
					currentValue += 1.5;
					
					if (rent.getRentedDays() > 3) {
						currentValue += ((rent.getRentedDays() - 3) * 1.5);
					}
					
				break;
				
			}
            
            pointsOfHirer++;
            
            if (rent.getTape().getIdPrice() == Tape.Type.launch && rent.getRentedDays() > 1) {
				pointsOfHirer++;
			}
            
            result += "\t" + rent.getTape().getTitle() + "\t" + currentValue + endLine;
           
            amount += currentValue;


        }
        
        result += "Valor total devido: " + amount + endLine;
        result += "Voce acumulou " + pointsOfHirer + " pontos de alugador frequente";
        
        return result;
    }

}
