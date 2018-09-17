package main;

import classes.ChildlikeTape;
import classes.Client;
import classes.LaunchTape;
import classes.NormalTape;
import classes.Tape;

public class Main {

	public static void main(String[] args) {
		
		Client client = new Client("Allan");
		
		Tape tape1 = new LaunchTape("tape1");
		client.addRent(tape1, 5);
		
		Tape tape2 = new ChildlikeTape("tape2");
		client.addRent(tape2, 8);
		
		Tape tape3 = new NormalTape("tape3");
		client.addRent(tape3, 10);
		
		Tape tape4 = new LaunchTape("tape4");
		client.addRent(tape4, 1);
		
		System.out.println(client.extract());
		
	}
	
}
