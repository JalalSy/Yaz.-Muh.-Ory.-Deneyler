import java.util.*;
public class Main {
    //konsolda metin rengini değiştirmek için renkleri belirtiyoruz
    public static final String kirmizi = "\u001B[31m";
    public static final String yesil = "\u001B[32m";

    public static void main(String[] args)
    {
        //3 sayı alır ve sırayla her birinin bir öncekinden büyük olup olmadığını kontrol eden java kodu yaziniz
        Scanner in = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz: ");
        int x = in.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        int y = in.nextInt();
        System.out.print("Üçüncü Sayıyı Giriniz: ");
        int z = in.nextInt();
        if (control(x, y, z,true)) {
        System.out.print("Sonuç: " + yesil + "Doğru");}
        else {
        System.out.print("Sonuç: "+ kirmizi + "Yanlış" + " 2. yada 3. numara öncekilerden daha küçüktür");}
        System.out.print("\n");
    }

    public static boolean control(int p, int q, int r, boolean xyz)
    {
        //kontrol etme işlemi
        if(xyz){
            return (q > p && r > q);}
            return xyz;
    }
}
