package histoire;

import personnages.Commer�ant;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP5 {

	public static void main(String[] args) {
		Commer�ant marco = new Commer�ant("Marco", 15);
		Commer�ant chonin = new Commer�ant("Chonin", 40);
		Commer�ant kumi = new Commer�ant("Kumi", 10);
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
