package generiqueExo;

public class Generique4 {
    public static class Triplet <T1, T2, T3> {

        private T1 first;
        private T2 second;
        private T3 third;

        public Triplet(T1 first, T2 second, T3 third) {
            this.first = first;
            this.second = second;
            this.third = third;
        }

        //getter
        public T1 getFirst() {
            return first;
        }

        public T2 getSecond() {
            return second;
        }

        public T3 getThird() {
            return third;
        }

        //set fisrt
        public void setFirst(T1 first) {
            this.first = first;
        }

        //set second
        public void setSecond(T2 second) {
            this.second = second;
        }

        public void setThird(T3 third) {
            this.third = third;
        }

        public String toString() {
            return first + " " + second + " " + third;
        }
        // main
        public static void main(String[] args) {
            Triplet<String, Integer, Double> myTriplet = new Triplet<>("Alice", 25, 1.75);
            System.out.println(myTriplet);
        }

    }
}
