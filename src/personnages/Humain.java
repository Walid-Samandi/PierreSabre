package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	
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
	
	public void parler(String texte) {
    	System.out.println(prendreParole() + "« " + texte + "»");
    }
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+ nom +" et j'aime boire du "+ boisson + ".");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de "+ boisson +"! GLOUPS !");
	}
	public void gagnerArgent(int gain) {
		argent=argent + gain;
	}
	public void perdreArgent(int perte) {
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
	
	@Override
	public String toString() {
		return "Humain [nom=" + nom + ", argent=" + argent + ", boisson=" + boisson +"]";}
	
    public static void main(String[] args) {
		Humain prof=new Humain("Prof","kombucha",54);
		System.out.println(prof);
		prof.direBonjour();
		prof.acheter("un kombucha", 12);
		prof.boire();
		prof.acheter("du papier", 2);
		prof.acheter("un kimono",50);
		System.out.println(prof);
		
	}
    
}
