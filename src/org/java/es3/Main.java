package org.java.es3;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] myArray = new int[10];
		
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = rnd.nextInt(101);
		}
		
		ArrayCicler myArrayCiclerWithArray = new ArrayCicler(myArray);
		
		while (myArrayCiclerWithArray.hasAncoraElementi()) {
			System.out.println(myArrayCiclerWithArray.getElementoSuccessivo());
		}
		
		System.out.println("\nNo more elements to show");
		
//		---------- BONUS BELOW ----------
		
		System.out.println("\n\n\nBONUS BELOW\n");
		
		ArrayCicler myArrayCicler = new ArrayCicler();
		
		myArrayCicler.addElemento(rnd.nextInt(101));
		myArrayCicler.addElemento(rnd.nextInt(101));
		myArrayCicler.addElemento(rnd.nextInt(101));
		myArrayCicler.addElemento(rnd.nextInt(101));
		myArrayCicler.addElemento(rnd.nextInt(101));
		
		while (myArrayCicler.hasAncoraElementi()) {
			System.out.println(myArrayCicler.getElementoSuccessivo());
		}
		
		System.out.println("\nNo more elements to show");
	}
}
