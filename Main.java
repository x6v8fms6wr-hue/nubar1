import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci ədəd: ");
        int a = sc.nextInt();

        System.out.print("İkinci ədəd: ");
        int b = sc.nextInt();

        System.out.println("Cəm: " + (a + b));
        System.out.println("Fərq: " + (a - b));
        System.out.println("Hasil: " + (a * b));
        System.out.println("Bölmə: " + (double) a / b);
        System.out.println("Qalıq: " + (a % b));
    }
}