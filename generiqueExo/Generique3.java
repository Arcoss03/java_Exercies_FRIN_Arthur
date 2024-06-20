package generiqueExo;

public class Generique3 {
    public static class Triplet<T> {
        private T first;
        private T second;
        private T third;

        public Triplet(T first, T second, T third) {
            this.first = first;
            this.second = second;
            this.third = third;
        }

        // getter
        public T getFirst() {
            return first;
        }

        public T getSecond() {
            return second;
        }

        public T getThird() {
            return third;
        }

        // set fisrt
        public void setFirst(T first) {
            this.first = first;
        }

        // set second
        public void setSecond(T second) {
            this.second = second;
        }

        public void setThird(T third) {
            this.third = third;
        }

        public String toString() {
            return first + " " + second + " " + third;
        }
    }

    // main
    public static void main(String[] args) {
        Triplet<String> triplet = new Triplet<>("Alice", "Bob", "Charlie");
        System.out.println(triplet);
    }

}
