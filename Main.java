import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Selsi dərəcəsini daxil edin: ");
        double c = sc.nextDouble();
        double f = c * 9.0 / 5 + 32;
        System.out.println("Fahrenheit: " + f);
    }
}