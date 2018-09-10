package main;

import classes.Client;
import classes.Rent;
import classes.Tape;

public class Main {

	public static void main(String[] args) {
		
		Client client = new Client("Allan");
		Tape tape1 = new Tape("tape1", Tape.Type.launch);
		Rent rent1 = new Rent(tape1, 2);
		client.addRent(rent1);
		
		Tape tape2 = new Tape("tape2", Tape.Type.childlike);
		Rent rent2 = new Rent(tape2, 2);
		client.addRent(rent2);
		
		Tape tape3 = new Tape("tape3", Tape.Type.normal);
		Rent rent3 = new Rent(tape3, 2);
		client.addRent(rent3);
		
		Tape tape4 = new Tape("tape4", Tape.Type.launch);
		Rent rent4 = new Rent(tape4, 2);
		client.addRent(rent4);
		
		System.out.println(client.extract());
		
	}
	
}
