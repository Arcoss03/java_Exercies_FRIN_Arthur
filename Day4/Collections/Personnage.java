package Day4.Collections;

public class Personnage {
    private String nom;
        private String prenom;
        private int age;
        
        public Personnage(String nom, String prenom, int age) {
            this.nom = nom;
            this.prenom = prenom;
            this.age = age;
        }
        public String getNom() {
            return nom;
        }
        public String getPrenom() {
            return prenom;
        }
        public int getAge() {
            return age;
        }
        public void setNom(String nom) {
            this.nom = nom;
        }
        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String toString() {
            return nom + " " + prenom + " " + age;
        }
    
}
