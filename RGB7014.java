import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long m = sc.nextLong();
        long s = sc.nextLong();
        System.out.println(h * 3600 + m * 60 + s);
    }
}
