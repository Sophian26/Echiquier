package launcher;

import game.Game;

public class Executeur {
	public static void main(String[] args) {
		Game g = new Game("Joueur blanc", "Joueur noir");
		g.lancer();
	}
}
