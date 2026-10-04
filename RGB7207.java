import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long n = sc.nextLong();
        long sum = 0;
        for (long i = 0; i < n; i++) {
            sum += a;
        }
        System.out.println(sum);
    }
}
