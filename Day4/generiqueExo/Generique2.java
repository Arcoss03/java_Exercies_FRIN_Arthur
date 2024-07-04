package Day4.generiqueExo;
public class Generique2 {

    public static class Paire <T1, T2 > {
        private T1 first;
        private T2 second;

        public Paire(T1 first, T2 second) {
            this.first = first;
            this.second = second;
        }
        //getter
        public T1 getFirst() {
            return first;
        }
        public T2 getSecond() {
            return second;
        }
        //set fisrt
        public void setFirst(T1 first) {
            this.first = first;
        }
        //set second
        public void setSecond(T2 second) {
            this.second = second;
        }

        public String toString() {
            return first + " " + second;
        }
    }

    public static void main(String[] args) {
        Paire<String, Integer> paire = new Paire<>("Alice", 25);
        System.out.println(paire);
    }
    
}
