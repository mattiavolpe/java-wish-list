package org.java.es1;

public class WishListEntry {
	private String gift;
	private String person;
	
	public WishListEntry(String gift, String person) {
		setGift(gift);
		setPerson(person);
	}
	
	private void setGift(String gift) {
		this.gift = gift;
	}
	
	public String getGift() {
		return gift;
	}
	
	private void setPerson(String person) {
		this.person = person;
	}
	
	public String getPerson() {
		return person;
	}
	
	@Override
	public String toString() {
		return "Gift: " + getGift() + " --> " + "Person: " + getPerson();
	}
}
