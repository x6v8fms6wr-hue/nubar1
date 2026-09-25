import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ədəd daxil edin: ");
        int n = sc.nextInt();
        if (n % 2 == 0) System.out.println(n + " cütdür.");
        else System.out.println(n + " təkdir.");
    }
}