package histoire;

import personnages.Commerçant;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP5 {

	public static void main(String[] args) {
		Commerçant marco = new Commerçant("Marco", 15);
		Commerçant chonin = new Commerçant("Chonin", 40);
		Commerçant kumi = new Commerçant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir","whisky",30,"Warsong");
		Ronin roro = new Ronin("Roro","shochu",60);
		
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(roro);
		
		marco.listerConnaissance();
		chonin.listerConnaissance();
		kumi.listerConnaissance();
		yaku.listerConnaissance();
		roro.listerConnaissance();
	}
}
