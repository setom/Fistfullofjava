/*
 * TCSS 360
 * Easter Egg Assignment
 */

package main;

import Developers.*;

/**
 * This class is the driver for the Easter Egg assignment.
 * 
 * @author Jonah Howard, ...
 * @versoin 4 Feb 2016
 */
public class EasterEgg {
	
	/**
	 * Driver for the Easter Egg assignment. Runs the program.
	 * 
	 * @param theArgs Command line parameter... to be ignored
	 */
	public static void main(String... theArgs) {
		run();
	}
	
	/**
	 * Runs the program.
	 */
	private static void run() {
		System.out.println("We are Fist Full of Java\n\n");
		
		final Jonah j = new Jonah();
		final Matt m = new Matt();
		final Cody c = new Cody();
		final Francis f = new Francis();
		
		j.printJonah();
		m.printMatt();
		c.printCody();
		f.printFrancis();
	}
}
