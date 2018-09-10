package main;

import classes.Client;
import classes.Tape;

public class Main {

	public static void main(String[] args) {
		
		Client client = new Client("Allan");
		
		Tape tape1 = new Tape("tape1", Tape.Type.launch);
		client.addRent(tape1, 2);
		
		Tape tape2 = new Tape("tape2", Tape.Type.childlike);
		client.addRent(tape2, 2);
		
		Tape tape3 = new Tape("tape3", Tape.Type.normal);
		client.addRent(tape3, 2);
		
		Tape tape4 = new Tape("tape4", Tape.Type.launch);
		client.addRent(tape4, 2);
		
		System.out.println(client.extract());
		
	}
	
}
