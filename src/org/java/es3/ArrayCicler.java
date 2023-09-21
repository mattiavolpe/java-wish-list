package org.java.es3;

public class ArrayCicler {
	private static int counter = 0;
	
	private int[] array = null;
	
	public ArrayCicler(int[] array) {
		this.array = array;
	}
	
	public int getElementoSuccessivo() {
		return array[counter++];
	}
	
	public boolean hasAncoraElementi() {
		return counter < array.length;
	}
}
