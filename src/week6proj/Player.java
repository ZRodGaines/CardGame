package week6proj;

import java.util.ArrayList;
import java.util.List;

public class Player {
	List<Card> hand = new ArrayList<Card>();
	public int score;
	public String name;
	
	public Player(String name) {
		this.score = 0;
		this.name = name;
	}
	
	
	public void describe() {
		System.out.println("Player: " + name + " Has a score of " + score);
		for (Card card : hand) {
			card.describe();
		}
		
	}
	public Card flip() {
		Card cardToReturn = hand.get(0);
		 hand.remove(0);
		 return cardToReturn;
		 
	}
	public void Draw(Deck deck) {
		hand.add(deck.draw());
	}
	public void incrimentScore() {
		score ++;
	}
}
