package org.java.es2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String word = "";
		
		do {
			System.out.print("Enter the word: ");
			word = sc.nextLine();
		} while (word.equals(""));
		
		sc.close();
		
		Map<Character, Integer> charactersCounterMap = new HashMap<>();
		
		for (int x = 0; x < word.length(); x++) {
			char currentChar = word.toLowerCase().charAt(x);
			
			if (charactersCounterMap.containsKey(currentChar)) {
				charactersCounterMap.put(currentChar, charactersCounterMap.get(currentChar) + 1);
			} else {
				charactersCounterMap.put(currentChar, 1);
			}
		}
		
		for (Character key : charactersCounterMap.keySet()) {
			Integer value = charactersCounterMap.get(key);
			System.out.println(key + " --> " + value);
		}
	}
}
