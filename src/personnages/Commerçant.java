package personnages;

public class Commerçant extends Humain {

	public Commerçant(String nom, int argent) {
		super(nom, "thé", argent);
	}

	public int seFaireExtorquer() {
		perdreArgent(getArgent());
		parler("J'ai tout perdu ! Le monde est trop injuste...");
		return getArgent();
	}

	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent + " sous ! Je te remercie généreux donateur !");
	}

	public static void main(String[] args) {
		Commerçant marco = new Commerçant("Marco", 20);
		System.out.println(marco);
		marco.direBonjour();
		marco.seFaireExtorquer();
		System.out.println(marco);
		marco.recevoir(15);
		marco.boire();
		System.out.println(marco);
	}

}
