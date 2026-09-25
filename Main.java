
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Birinci eded");
        int a=sc.nextInt();

        System.out.print("Ikinci eded");
        int b = sc.nextInt();

        System.out.print("Cem:" + (a + b));
        System.out.print("Ferq:" + (a - b));
        System.out.print("Hasil:" + (a * b));
        System.out.print("Bolme:" + (double) a / b);
        System.out.print("Qaliq:" + (a % b));
    }
}
