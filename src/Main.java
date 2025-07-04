public class Main {
    public static void main(String[] args) {
        System.out.println("factorial(2): " + factorial(2));
    }

    public static int factorial(int n){
        if (n == 0){
            return 1;
        } else if (n < 0) {
            throw new IllegalArgumentException("Negative number");
        } else {
            return n * factorial(n - 1);
        }
    }
}