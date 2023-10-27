package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int réputation;

	public Yakuza(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}

	private void extorquer(Commerçant victime) {
		parler("Tiens, tiens, ne serait-ce ps un faible marchant qui passe par là ?");
		victime.seFaireExtorquer();
		gagnerArgent(victime.getArgent());
	}
}
