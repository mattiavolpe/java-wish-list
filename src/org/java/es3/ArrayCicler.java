package org.java.es3;

public class ArrayCicler {	
	private int[] array = null;
	private int counter = 0;
	
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
