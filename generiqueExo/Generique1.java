package generiqueExo;
public class Generique1 {

    public static class Paire <T> {
        private T first;
        private T second;

        public Paire(T first, T second) {
            this.first = first;
            this.second = second;
        }
        //getter
        public T getFirst() {
            return first;
        }
        public T getSecond() {
            return second;
        }
        //set fisrt
        public void setFirst(T first) {
            this.first = first;
        }
        //set second
        public void setSecond(T second) {
            this.second = second;
        }

        //to string
        public String toString() {
            return first + " " + second;
        }
    }

    public static void main(String[] args) {
        Paire<String> paire = new Paire<>("Alice", "Bob");
        System.out.println(paire);
    }
    
}
