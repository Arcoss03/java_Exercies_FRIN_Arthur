package Collections;

public class Region {
    private String nom;
        private String pays;
        private int nbHabitants;
        public Region(String nom, String pays, int nbHabitants) {
            this.nom = nom;
            this.pays = pays;
            this.nbHabitants = nbHabitants;
        }
        public String getNom() {
            return nom;
        }
        public String getPays() {
            return pays;
        }
        public int getNbHabitants() {
            return nbHabitants;
        }
        public void setNom(String nom) {
            this.nom = nom;
        }
        public void setPays(String pays) {
            this.pays = pays;
        }
        public void setNbHabitants(int nbHabitants) {
            this.nbHabitants = nbHabitants;
        }
        public String toString() {
            return nom + " " + pays + " " + nbHabitants;
        }
}
