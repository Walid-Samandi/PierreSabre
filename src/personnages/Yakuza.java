package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int r�putation;

	public Yakuza(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}

	private void extorquer(Commer�ant victime) {
		parler("Tiens, tiens, ne serait-ce ps un faible marchant qui passe par l� ?");
		victime.seFaireExtorquer();
		gagnerArgent(victime.getArgent());
	}
}
