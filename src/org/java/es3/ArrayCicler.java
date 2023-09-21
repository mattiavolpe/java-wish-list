package org.java.es3;

public class ArrayCicler {	
	private int[] array = null;
	private int counter = 0;
	
	public ArrayCicler() {
		array = new int[0];
	}
	
	public ArrayCicler(int[] array) {
		this.array = array;
	}
	
	public int getElementoSuccessivo() {
		return array[counter++];
	}
	
	public boolean hasAncoraElementi() {
		return counter < array.length;
	}
	
	public void addElemento(int number) {
		int[] tempArray = array;
		array = new int[array.length + 1];
		for (int i = 0; i < tempArray.length; i++) {
			array[i] = tempArray[i];
		}
		array[array.length - 1] = number;
	}
}
