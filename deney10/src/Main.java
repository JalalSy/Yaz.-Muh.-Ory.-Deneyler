import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Bir n intle başlayan, n çiftse n'yi 2'ye bölen veya n tekse 3 ile çarpıp 1 toplayan program, n = 1 olana kadar işlemi tekrarlayan java kodunu yazınız
        System.out.println("n değerini girin: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n != 1) {
            if (n % 2 == 0) {
                System.out.print("N çift olduğu için 2'ye böleriz =" + n + " / 2 = ");
                n = n / 2;
                System.out.println(n);
            }
            else {
                System.out.print("N tekti, bu yüzden 3 ile çarparız, 1 ekleriz ve 2'ye böleriz = " + n + " x 3 + 1 / 2 = ");
                n = (3 * n + 1) / 2;
                System.out.println(n);
            }
        }
        System.out.println("\nn'nin Son Değeri = "+ n);
        in.close();
    }
}