package revisions;
// exo 153 Classe générique	à plusieurs
// paramètres	de	type
// Écrire	 une	 classe	 générique	 TripletH	 semblable	 à	 celle	 de	 l’exercice	 précédent,
// mais	 permettant	 cette	 fois	 de	 manipuler	 des	 triplets	 d’objets	 pouvant	 être	 chacun
// d’un	type	différent.	Écrire	un	petit	programme	utilisant	cette	classe	générique	pour
// instancier	quelques	objets	et	exploiter	les	méthodes	existantes.

public class TripletH<T, U, V> {
    private T first;
    private U second;
    private V third;

    public TripletH(T first, U second, V third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public V getThird() {
        return third;
    }

    public void setThird(V third) {
        this.third = third;
    }

    @Override
    public String toString() {
        return "TripletH{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }

    public static void main(String[] args) {
        // Instantiation de quelques objets TripletH
        TripletH<String, Integer, Boolean> triplet1 = new TripletH<>("Hello", 123, true);
        TripletH<Double, String, Character> triplet2 = new TripletH<>(45.67, "World", 'A');

        // Affichage des triplets
        System.out.println(triplet1);
        System.out.println(triplet2);

        // Utilisation des méthodes existantes
        System.out.println("First element of triplet1: " + triplet1.getFirst());
        triplet1.setFirst("Hi");
        System.out.println("Updated first element of triplet1: " + triplet1.getFirst());

        System.out.println("Second element of triplet2: " + triplet2.getSecond());
        triplet2.setSecond("Java");
        System.out.println("Updated second element of triplet2: " + triplet2.getSecond());

        System.out.println("Third element of triplet1: " + triplet1.getThird());
        triplet1.setThird(false);
        System.out.println("Updated third element of triplet1: " + triplet1.getThird());
    }
}
