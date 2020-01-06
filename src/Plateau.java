import java.util.ArrayList;

public class Plateau {
	public static Tuile[][] plateau;
	
	public Plateau() {
		plateau = new Tuile[8][8];
	}
	public static void initialiser(ArrayList<Joueur> listeJoueurs)
	{
		for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                plateau[i][j] = new Tuile();
            }
        }
		
		
		if(listeJoueurs.size() == 2)
		{
			plateau[0][1] = listeJoueurs.get(0).tortue;
			plateau[0][4] = listeJoueurs.get(0).tortue;
			plateau[6][3] = new Joyaux();
		}
		
	}
	
	public static void afficher() {
		for (int i = 0; i < 8; i++) {
			System.out.print("\n");
            for (int j = 0; j < 8; j++) {
            	if(plateau[i][j].type == "tortue")
            		System.out.print("t|");
            	if(plateau[i][j].type == "vide")
            		System.out.print(" |");
            	if(plateau[i][j].type == "joyau")
            		System.out.print("j|");
            }
        }
	}
}
