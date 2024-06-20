import java.util.ArrayList;
import java.util.Scanner;

public class ExoEleveSuite {

    public static class Eleve implements Comparable<Eleve> {
        private final String nom;
        private final ArrayList<Integer> notes;

        @SuppressWarnings("unused")
        private Eleve() {
            nom = "";
            notes = new ArrayList<>();
        }

        Eleve(String name) {
            nom = name;
            notes = new ArrayList<>();
        }

        // Getter pour le nom de l'eleve
        public String getNom() {
            return nom;
        }

        // Getter pour les notes de l'eleve
        public ArrayList<Integer> getListNotes() {
            return notes;
        }

        // Getter pour la moyenne de l'eleve
        public double getMoyenne() {
            return notes.stream().mapToInt(Integer::intValue).average().orElse(0);
        }

        // Ajouter une note a l'eleve
        public void ajouterNote(int note) {
            notes.add(note);
        }

        // Normaliser la note entre 0 et 20
        public int normaliseNote(int note) {
            if (note < 0) {
                return 0;
            }
            if (note > 20) {
                return 20;
            }
            return note;
        }

        // Methode compareTo pour comparer les moyennes de deux eleves
        @Override
        public int compareTo(Eleve autre) {
            return Double.compare(this.getMoyenne(), autre.getMoyenne());
        }

        @Override
        public String toString() {
            return nom + " (" + getMoyenne() + ")";
        }
    }

    @SuppressWarnings("resource")
    public static String getUserInput(String message) {
        System.out.print(message);
        return new Scanner(System.in).next();
    }

    @SuppressWarnings("resource")
    public static int getUserIntInput(String message) {
        System.out.print(message);
        return new Scanner(System.in).nextInt();
    }

    public static void main(String[] args) {
        ArrayList<Eleve> eleves = new ArrayList<>();
        int choix;

        do {
            System.out.println("1. Saisir un élève");
            System.out.println("2. Saisir des notes pour un élève");
            System.out.println("3. Afficher la moyenne d'un élève");
            System.out.println("4. Comparer deux élèves");
            System.out.println("5. Quitter");
            choix = getUserIntInput("Votre choix: ");

            switch (choix) {
                case 1:
                    while (true) {
                        String nom = getUserInput("Nom de l'élève (ou 'stop' pour arrêter): ");
                        if (nom.equalsIgnoreCase("stop"))
                            break;
                        eleves.add(new Eleve(nom));
                    }
                    break;
                case 2:
                    while (true) {
                        String nomEleve = getUserInput("Nom de l'élève: ");
                        if (nomEleve.equalsIgnoreCase("stop"))
                            break;
                        Eleve eleve = eleves.stream().filter(e -> e.getNom().equals(nomEleve)).findFirst().orElse(null);
                        if (eleve == null) {
                            System.out.println("L'élève n'existe pas");
                            continue;
                        }
                        while (true) {
                            var result = getUserInput("Note (ou 'stop' pour arrêter): ");
                            if (result.equalsIgnoreCase("stop"))
                                break;
                            int note;
                            try {
                                note = Integer.parseInt(result);
                            } catch (NumberFormatException e) {
                                System.out.println("Entrée invalide, veuillez entrer une note numérique.");
                                continue;
                            }
                            if (note < 0 || note > 20) {
                                System.out.println("La note doit être comprise entre 0 et 20");
                                continue;
                            }
                            eleve.ajouterNote(eleve.normaliseNote(note));
                        }
                    }
                    break;
                case 3:
                    String nomEleve3 = getUserInput("Nom de l'élève: ");
                    Eleve eleve3 = eleves.stream().filter(e -> e.getNom().equals(nomEleve3)).findFirst().orElse(null);
                    if (eleve3 == null) {
                        System.out.println("L'élève n'existe pas");
                    } else {
                        System.out.println("Moyenne de " + eleve3.getNom() + " : " + eleve3.getMoyenne());
                    }
                    break;
                case 4:
                    String nomEleve1 = getUserInput("Nom de l'élève 1: ");
                    Eleve eleve1 = eleves.stream().filter(e -> e.getNom().equals(nomEleve1)).findFirst().orElse(null);
                    if (eleve1 == null) {
                        System.out.println("L'élève n'existe pas");
                        break;
                    }
                    String nomEleve2 = getUserInput("Nom de l'élève 2: ");
                    Eleve eleve2 = eleves.stream().filter(e -> e.getNom().equals(nomEleve2)).findFirst().orElse(null);
                    if (eleve2 == null) {
                        System.out.println("L'élève n'existe pas");
                        break;
                    }
                    int result = eleve1.compareTo(eleve2);
                    if (result > 0) {
                        System.out.println(eleve1.getNom() + " a une moyenne plus grande que " + eleve2.getNom());
                    } else if (result < 0) {
                        System.out.println(eleve2.getNom() + " a une moyenne plus grande que " + eleve1.getNom());
                    } else {
                        System.out.println(eleve1.getNom() + " et " + eleve2.getNom() + " ont la même moyenne");
                    }
                    break;
                case 5:
                    System.out.println("Au revoir");
                    break;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
                    break;
            }
        } while (choix != 5);
    }
}
