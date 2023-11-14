package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	protected int nbConnaissance;
	protected Humain[] memoire = new Humain[30];
	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}
	public String getBoisson() {
		return boisson;
	}
	public int getArgent() {
		return argent;
	}
	
	private String prendreParole() { 
    	return  "(" + nom + ")-"; 
    }
	
	protected void parler(String texte) {
    	System.out.println(prendreParole() + "« " + texte + "»");
    }
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+ nom +" et j'aime boire du "+ boisson + ".");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de "+ boisson +"! GLOUPS !");
	}
	protected void gagnerArgent(int gain) {
		argent=argent + gain;
	}
	protected void perdreArgent(int perte) {
		argent=argent - perte;
	}
	public void acheter(String bien, int prix) {
		if (prix<=argent) {
			parler("J'ai "+ argent +" sous en poche. Je vais pouvoir m'offrir "+ bien +" à "+ prix +" sous.");
			perdreArgent(prix);
		}
		else {
			parler("Je n'ai plus que "+ argent +" sous en poche. Je ne peux même pas m'offrir "+ bien +" à "+ prix +" sous.");
		}
	}
	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}
	
	private void memoriser(Humain humain) {
		memoire[nbConnaissance]=humain;
		nbConnaissance++;
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
		
	}
	
	public void listerConnaissance() {
		int id=0;
		System.out.println(getNom()+" Je connais beaucoup de monde dont: " );
		
		while(id<nbConnaissance) {
			System.out.println(memoire[id].getNom());
			id++;
		}
	}
	@Override
	public String toString() {
		return "Humain [nom=" + nom + ", argent=" + argent + ", boisson=" + boisson +"]";}
}
