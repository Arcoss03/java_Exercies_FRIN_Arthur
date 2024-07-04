package Day3;
import java.util.ArrayList;

public class ExoEleve {

    public static class Eleve {
        private final String nom;
        private final ArrayList<Integer> notes;

        @SuppressWarnings("unused")
        private Eleve() {
            nom = "";
            notes = new ArrayList<Integer>();
        }

        Eleve(String name) {
            nom = name;
            notes = new ArrayList<Integer>();
        }

        // methode public pour un getter pour le nom de l'eleve
        public String getNom() {
            return nom;
        }

        // methode public pour un getter pour les notes de l'eleve
        public ArrayList<Integer> getListNotes() {
            return notes;
        }

        // methode public pour un getter pour la moyenne de l'eleve
        public double getMoyenne() {
            return getListNotes().stream().mapToInt(Integer::intValue).average().orElse(0);
        }

        // methode public pour ajouter une note a l'eleve
        public void ajouterNote(int note) {
            notes.add(note);
        }

        public int normaliseNote(int note) {
            if (note < 0) {
                return 0;
            }
            if (note > 20) {
                return 20;
            }
            return note;
        }
        

        public void ajouterNote2(int note) {
            if (note < 0) {
                notes.add(0);
            } else if (note > 20){
                notes.add(20);
            } else {
                notes.add(note);
            }

            notes.add(note);
        }

        // methode qui retourne la valeur d'un eleve
        public String toString() {
            return nom + "(" + getMoyenne() + ")";
        }
    }

    public static void main(String[] args) {
        Eleve eleve = new Eleve("Alice");
        eleve.ajouterNote(eleve.normaliseNote(15));
        eleve.ajouterNote(eleve.normaliseNote(-1));
        eleve.ajouterNote(eleve.normaliseNote(23));
        eleve.ajouterNote(eleve.normaliseNote(5));
        eleve.ajouterNote(eleve.normaliseNote(19));
        System.out.println(eleve);
    }


}
