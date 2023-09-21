package org.java.es1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<WishListEntry> wishList = new ArrayList<>();
		
		String answer = "";
		do {
			System.out.print("Enter the gift: ");
			answer = sc.nextLine();
			
			if (answer.equals("")) break;
			
			System.out.print("Enter the person you want to buy the gift for: ");
			String person = sc.nextLine();
			
			wishList.add(new WishListEntry(answer, person));
			
			System.out.println("\nWishlist length: " + wishList.size() + "\n");
		} while (!answer.equals(""));
		
		System.out.println("--------------------");
		
		sc.close();
		
		System.out.println("\nWishlist resume:");
		
		for (WishListEntry entry : wishList) {
			System.out.println(entry);
		}
	}
}
