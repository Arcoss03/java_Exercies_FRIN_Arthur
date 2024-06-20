

import java.util.ArrayList;

class TestEleve {

  public static class Eleve {
    private String nom;
    private ArrayList<Integer> listeNotes = new ArrayList<>();
    private double moyenne;
    
    public Eleve(String nom) {
	this.nom = nom;
    }
    
    public double getMoyenne() {
	return moyenne;
    }
    
    public String getNom() {
	return nom;
    }

    public ArrayList<Integer> getListeNotes() {
	return new ArrayList<>(listeNotes);
    }

    /* Une note inferieure a 0 sera considere comme egale a 0 ;
       une note superieure a 20 sera considere comme egale a 20 */
    public static Integer normalizeNote(Integer note) {
        if (note < 0) return 0;
        if (note > 20) return 20;
        return note;
    }
    
    public void ajouterNote(int note) {
	int nbNotes = this.listeNotes.size();
	this.moyenne = (this.moyenne * nbNotes + note) / (nbNotes + 1);
	listeNotes.add(note);
    }
    
    public String toString() {
	return nom + " (" + (int)(100 * moyenne)/100.0 + ")";
    }

    // Compare two Eleve objects by their moyenne
    
  }




  public static void main(String[] arg) {
		Eleve eleve = new Eleve(arg[0]);
		for (int i = 1; i < arg.length; i++) {		
			eleve.ajouterNote(Eleve.normalizeNote(Integer.parseInt(arg[i])));
			System.out.println("Moyenne de " + eleve.getNom() +
					" : " + eleve.getMoyenne());
		}
		System.out.println(eleve);
  }
}
