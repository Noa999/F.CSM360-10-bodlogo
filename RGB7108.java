import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long product = 1;
        for (int i = 0; i < 3; i++) {
            long n = sc.nextLong();
            if (n % 2 != 0) {
                product *= n;
            }
        }
        System.out.println(product);
    }
}
