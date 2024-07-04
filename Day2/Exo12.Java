public class Exo12 {
    public static void permutationCirculaire(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = arr[2];
        arr[2] = temp;
    }

    public static void printPermutation(int[] arr, String message) {
        System.out.println(message + ": a = " + arr[0] + ", b = " + arr[1] + ", c = " + arr[2]);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        printPermutation(arr, "Avant permutation");
        permutationCirculaire(arr);
        printPermutation(arr, "Après permutation");
    }
}