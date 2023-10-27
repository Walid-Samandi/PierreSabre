package histoire;

import personnages.Commerçant;
import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombucha", 54);
		System.out.println(prof);
		prof.direBonjour();
		prof.acheter("un kombucha", 12);
		prof.boire();
		prof.acheter("du papier", 2);
		prof.acheter("un kimono", 50);
		System.out.println(prof);

		Commerçant marco = new Commerçant("Marco", 20);
		System.out.println(marco);
		marco.direBonjour();
		marco.seFaireExtorquer();
		System.out.println(marco);
		marco.recevoir(15);
		marco.boire();
		System.out.println(marco);
	}
}
