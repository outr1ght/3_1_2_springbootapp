public class Main {
    public static int printOddNumbers(int[] arr){

    }

    public static void main(String[] args) {
        printOddNumbers();

    }

    private static void printOddNumbers(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length & i % 2 == 0){
                System.out.println(arr[i]);
            }
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + ", ");
            }

        }
    }
}