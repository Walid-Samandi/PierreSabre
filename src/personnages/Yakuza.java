package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int réputation=0;

	public Yakuza(String nom, String boisson, int argent,String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}

	public int getRéputation() {
		return réputation;
	}
	public void extorquer(Commerçant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchant qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à ta vie donne moi ta bourse ! ");
		int tmp=victime.getArgent();
		gagnerArgent(victime.getArgent());
		victime.seFaireExtorquer();
		parler("J'ai piqué les "+ tmp +" sous de Marco, ce qui me fait "+ getArgent() +" sous dans ma poche. Hi ! Hi !");
		réputation+=1;
	}
	
	public void perdre() {
		int tmp=getArgent();
		perdreArgent(getArgent());
		réputation = réputation - 1;
		parler("J'ai perdu mon duel et mes "+ tmp + " sous, snif... J'ai déshonoré le clan "+ clan);
	}
	
	public void gagner(int gain) {
		réputation = réputation + 1;
		gagnerArgent(gain);
		parler("Ce ronin pensait vraiment battre "+ getNom() +" du clan "+ clan +" ? Je l'ai dépouillé de ses "+ gain +" sous.");
	}
}
