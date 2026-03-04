package nintendo.test;

import java.time.LocalDate;

import nintendo.model.Boutique;
import nintendo.model.Console;
import nintendo.model.Jeu;

public class Test {

	public static void main(String[] args) {
		Console c1 = new Console("Switch", 300, LocalDate.parse("2016-01-01"));
		Console c2 = new Console("PS5", 500, LocalDate.parse("2019-01-01"));
		Console c3 = new Console("PS4", 400, LocalDate.parse("2015-01-01"));
		Console c4 = new Console("SerieX", 1000, LocalDate.parse("2022-01-01"));
		Jeu j1 = new Jeu("Breath Of The Wild", c1);
		Jeu j2 = new Jeu("God of War : Ragnarork", c2);
		Jeu j3 = new Jeu("Red Dead Redemption 2", c3);
		Jeu j4 = new Jeu("Hollow Knight", c1);
		Jeu j5 = new Jeu("Halo Infinite", c4);
		
		Boutique boutique = new Boutique("Micromania", "1 rue de la banque, 75000 Paris");
	}

}
