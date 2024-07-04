package Day2;
public class ExoP134 {

    public static  class Personne {

        //les atributs
        final String nom;
        final int age;
        final int tailleCm;

        //les constructeurs
        Personne() {nom = ""; age = 18; tailleCm = 170;}
        Personne(final String nom, final int age, final int tailleCm) {this.nom = nom; this.age = age; this.tailleCm = tailleCm;}
        Personne(final Personne p) {nom = p.nom; age = p.age; tailleCm = p.tailleCm;}

        //les methodes
        //affiche les details de la personne

        public String toString() {
            return "Nom: " + nom + ", Age: " + age + ", Taille: " + tailleCm + "cm";
        }

    }

    public static final class Etudiant extends Personne {
        private final String filiere;
        private final int annee;

        Etudiant() {filiere = "Informatique"; annee = 1;}
        Etudiant(final String nom, final int age, final int tailleCm, final String filiere, final int annee) {
            super(nom, age, tailleCm);
            this.filiere = filiere;
            this.annee = annee;
        }
        Etudiant(final Personne p, final String filiere, final int annee) {
            super(p);
            this.filiere = filiere;
            this.annee = annee;
        }

        public String toString() {
            return super.toString() + ", Filiere: " + filiere + ", Annee: " + annee;
        }
        
    }

    public static void main(String[] args) {
        Personne p = new Personne("Alice", 25, 160);
        System.out.println(p.toString());
        Etudiant e = new Etudiant("Bob", 20, 180, "Mathematiques", 2);
        System.out.println(e.toString());
    }
    
}
