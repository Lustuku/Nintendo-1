package nintendo.test;

import nintendo.model.Console;
import nintendo.model.Jeu;

public class Test {

	public static void main(String[] args) {
		Console c1 = new Console("Switch");
		Console c2 = new Console("PS5");
		Console c3 = new Console("PS4");
		Console c4 = new Console("SerieX");
		Jeu j1 = new Jeu("Breath Of The Wild", c1);
		Jeu j2 = new Jeu("God of War : Ragnarork", c2);
		Jeu j3 = new Jeu("Red Dead Redemption 2", c3);
		Jeu j4 = new Jeu("Hollow Knight", c1);
		Jeu j5 = new Jeu("Halo Infinite", c4);
		

	}

}
