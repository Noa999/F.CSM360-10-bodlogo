import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 2 && n <= 4) {
            System.out.println("Spring");
        } else if (n >= 5 && n <= 7) {
            System.out.println("Summer");
        } else if (n >= 8 && n <= 10) {
            System.out.println("Autumn");
        } else {
            System.out.println("Winter");
        }
    }
}
