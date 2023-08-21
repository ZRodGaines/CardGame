package week6proj;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//change the cards list from a list of Strings to a list of Cards, fix what will
//need fixing, finish Draw method, having it draw a card from the cards array


public class Deck {
	List<Card> cards = new ArrayList<Card>();
	String[] cardVals = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
	String[] cardSuits = {"Of Diamonds", " Of Clubs", "Of Hearts","Of Spades"};
	
	
	public int random2(int max) {
		Random inter = new Random();
		int number;
		number = inter.nextInt(max);
		return number;
	}
	
	public String toCardVal(Card card) {
		String returnS = "";
		returnS += cardVals[card.value];
		returnS += " ";
		returnS += card.name;
		return returnS;
	}
	
	public void reName() {
		for (int i = 0; i <= cards.size() - 1; i++) {
			cards.get(i).name = toCardVal(cards.get(i));
		}
	}
	
	public void shuffle() {
		List<Card> toBeShuffled = new ArrayList<Card>();
		int goingToShuffle = 0;
		for (int i = 0; i <= cards.size() - 1; i++) {
			toBeShuffled.add(cards.get(i));
		}
		
		cards.clear();
		goingToShuffle = toBeShuffled.size();
		for (int i = 0; i <= goingToShuffle - 1; i++) {
			int tempint = 0;
			tempint = random2(toBeShuffled.size());
			cards.add(toBeShuffled.get(tempint));
			toBeShuffled.remove(tempint);

		}
		reName();
	}
	public Card draw() {
		Card cardToReturn = cards.get(0);
		 cards.remove(0);
		 return cardToReturn;
		 
	}
	public void fillDeck() {
		
		for (int i = 0; i <= 3; i++) {
			for (int ii = 0; ii <=12; ii++) {
				Card newcard = new Card(ii, cardSuits[i]);
				cards.add(newcard);
			}
		}
	}
	Deck() {
		fillDeck();
	}
}
