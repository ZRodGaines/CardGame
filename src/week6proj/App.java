package week6proj;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Player player1 = new Player("player1");
		Player player2 = new Player("player2");
		deck.shuffle();
		
		
		for (int i = 1; i <= 52; i++) {
			if (i % 2 == 0) {
				player2.Draw(deck);
			}
			else {
				player1.Draw(deck);
			}
		}
		
		for (int i = 1; i<= 26; i++) {
			Card p1turn = null;
			Card p2turn = null;
			p1turn = player1.flip();
			p1turn.describe();
			
			p2turn = player2.flip();
			p2turn.describe();
				

			
			if (p1turn.value > p2turn.value) {
				player1.incrimentScore();
				System.out.println("Turn:" + i + " " + player1.name);
			}
			else {
				player2.incrimentScore();
				System.out.println("Turn:" + i + " " + player2.name);
			}
			System.out.println(player1.name + ":" + player1.score);
			System.out.println(player2.name + ":" + player2.score);
			
			
		}
		if (player1.score > player2.score) {
			System.out.println(player1.name + " Wins!");
		}
		if (player1.score == player2.score) {
			System.out.println("Draw");
		}
		if (player2.score > player1.score) {
			System.out.println(player2.name + " Wins!");
	}

}
}
