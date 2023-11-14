package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int r�putation=0;

	public Yakuza(String nom, String boisson, int argent,String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}

	public int getR�putation() {
		return r�putation;
	}
	public void extorquer(Commer�ant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchant qui passe par l� ?");
		parler(victime.getNom() + ", si tu tiens � ta vie donne moi ta bourse ! ");
		int tmp=victime.getArgent();
		gagnerArgent(victime.getArgent());
		victime.seFaireExtorquer();
		parler("J'ai piqu� les "+ tmp +" sous de Marco, ce qui me fait "+ getArgent() +" sous dans ma poche. Hi ! Hi !");
		r�putation+=1;
	}
	
	public void perdre() {
		int tmp=getArgent();
		perdreArgent(getArgent());
		r�putation = r�putation - 1;
		parler("J'ai perdu mon duel et mes "+ tmp + " sous, snif... J'ai d�shonor� le clan "+ clan);
	}
	
	public void gagner(int gain) {
		r�putation = r�putation + 1;
		gagnerArgent(gain);
		parler("Ce ronin pensait vraiment battre "+ getNom() +" du clan "+ clan +" ? Je l'ai d�pouill� de ses "+ gain +" sous.");
	}
}
