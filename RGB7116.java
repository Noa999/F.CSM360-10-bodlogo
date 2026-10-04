import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 5) {
            System.out.println("Onts");
        } else if (n == 4) {
            System.out.println("Sain");
        } else if (n == 3) {
            System.out.println("Dund");
        } else {
            System.out.println("Muu");
        }
    }
}
