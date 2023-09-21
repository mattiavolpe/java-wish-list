package org.java.es3;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] myArray = new int[10];
		
		for (int i = 0; i < 10; i++) {
			myArray[i] = rnd.nextInt(101);
		}
		
		ArrayCicler myArrayCicler = new ArrayCicler(myArray);
		
		for (int x = 0; x < myArray.length; x++) {
			System.out.println(myArrayCicler.getElementoSuccessivo());
			
			if (myArrayCicler.hasAncoraElementi())
				System.out.println(myArrayCicler.hasAncoraElementi() + "\n");
			else {
				System.out.println("No more elements to show");
				break;
			}
		}
	}
}
