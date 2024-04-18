public class Exo12 {
    public static void main(String[] args) {
        // Initialisation des variables
        int a = 1;
        int b = 2;
        int c = 3;

        System.out.println("Avant permutation: a = " + a + ", b = " + b + ", c = " + c);

        // Permutation circulaire
        int temp = a;
        a = b;
        b = c;
        c = temp;

        System.out.println("Après permutation: a = " + a + ", b = " + b + ", c = " + c);
    }
}