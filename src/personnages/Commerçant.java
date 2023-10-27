package personnages;

public class Commer�ant extends Humain {

	public Commer�ant(String nom, int argent) {
		super(nom, "th�", argent);
	}

	public int seFaireExtorquer() {
		perdreArgent(getArgent());
		parler("J'ai tout perdu ! Le monde est trop injuste...");
		return getArgent();
	}

	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent + " sous ! Je te remercie g�n�reux donateur !");
	}

	public static void main(String[] args) {
		Commer�ant marco = new Commer�ant("Marco", 20);
		System.out.println(marco);
		marco.direBonjour();
		marco.seFaireExtorquer();
		System.out.println(marco);
		marco.recevoir(15);
		marco.boire();
		System.out.println(marco);
	}

}
