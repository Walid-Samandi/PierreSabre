package histoire;

import personnages.Commerçant;
import personnages.Humain;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {

	public static void main(String[] args) {

		Commerçant marco = new Commerçant("Marco", 15);
		System.out.println(marco);
		marco.direBonjour();
		
		Yakuza yaku = new Yakuza("Yaku Le Noir","whisky",30,"Warsong");
		System.out.println(yaku);
		yaku.direBonjour();
		yaku.extorquer(marco);
		System.out.println(yaku);
		System.out.println(marco);
		
		Ronin roro = new Ronin("Roro","shochu",60);
		System.out.println(roro);
		roro.donner(marco);
		System.out.println(marco);
		
		roro.provoquer(yaku);
		System.out.println(yaku);
		System.out.println(roro);
	}
}
