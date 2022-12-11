import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //bir sayı alır ve rakamlarının toplamını verir
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        long n = input.nextLong();
        System.out.println("Rakamların toplamı: " + sumDigits(n));

    }

    public static int sumDigits(long n) {
        int top = 0;
        while (n != 0) {
            top += n % 10;
            n /= 10;
        }
        return top;
    }
}