package nintendo.test;

import nintendo.model.Boutique;
import nintendo.model.Client;
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
		Boutique b1 = new Boutique("Leclerc", "Rue de la Paix");		
		Boutique b2 = new Boutique("Micromania", "Japon");
		Jeu j1 = new Jeu("Breath Of The Wild", c1, b1);
		Jeu j2 = new Jeu("God of War : Ragnarork", c2, b2);
		Jeu j3 = new Jeu("Red Dead Redemption 2", c3, b1);
		Jeu j4 = new Jeu("Hollow Knight", c1, b1);
		Jeu j5 = new Jeu("Halo Infinite", c4, b2);
		Client client1 = new Client("Samus", "Aran");
		Client client2 = new Client("Link", "Femboy");
		
		client1.ajouterAchat(j1);
		client1.ajouterAchat(j3);
		client1.ajouterAchat(j5);
		client2.ajouterAchat(j2);
		client2.ajouterAchat(j4);

		Boutique boutique = new Boutique("Micromania", "1 rue de la banque, 75000 Paris");
	}

}
