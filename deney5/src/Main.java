import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        //Saniyeyi saat:dakika:saniye'ye çevirir
        Scanner in = new Scanner(System.in);
        System.out.print("Saniye Sayıyı Giriniz: ");
        int seconds = in.nextInt();
        int S = seconds % 60;
        int H = seconds / 60;
        int M = H % 60;
        H = H / 60;
        System.out.print( H + ":" + M + ":" + S);
        System.out.print("\n");
    }
}