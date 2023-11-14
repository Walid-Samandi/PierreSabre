package personnages;

public class Ronin extends Humain {
	private int Honneur=1;

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}

	public void donner(Commer�ant beneficiaire) {
		int argentDonner = getArgent() /10;
		parler(beneficiaire.getNom()+" prend ces "+ argentDonner +" sous.");
		perdreArgent(argentDonner);
		beneficiaire.recevoir(argentDonner);
	}
	
	public void provoquer(Yakuza adversaire) {
		int force = Honneur + Honneur; 
		parler("Je t'ai retrouv� vermine, tu vas payer pour ce que tu as fais � ce pauvre marchand !");
		if (force > adversaire.getR�putation()){
			parler("Je t'ai eu petit Yakuza ! ");
			adversaire.perdre();
			gagnerArgent(adversaire.getArgent());
			Honneur = Honneur + 1;
			}
		else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup");
			adversaire.gagner(getArgent());
			Honneur = Honneur - 1;
			perdreArgent(getArgent());
			
		}
	}

}
