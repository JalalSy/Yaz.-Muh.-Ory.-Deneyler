import java.util.Scanner;
public class Main {
    public static void main(String args[])
    {
        //Ondalık sayıyı onaltılık sayıya dönüştürmek için Java kodu yaziniz
        int dec_num, rem;
        String hexdec_num="";

        //onaltılık sayı karakterleri belirliyoruz
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        Scanner in = new Scanner(System.in);
        System.out.print("Ondalık Sayı Giriniz: ");
        if (in.hasNextInt()){
            dec_num = in.nextInt();
            //dönüştürme yöntemi
            if (dec_num > 0){
                while(dec_num>0)
                {
                    //modu alıyoruz ve kalan, onaltılık sayıda hangi karakter olacağını gösterir, ve 16'ye bölüp devam ediyoruz
                    rem = dec_num%16;
                    hexdec_num = hex[rem] + hexdec_num;
                    dec_num = dec_num/16;
                }
                System.out.print("Onaltılık Karşılığı : "+hexdec_num+"\n");
            }
            else {
                System.out.println("Sıfırdan Büyük Sayı Giriniz");
            }
        }
        else {
            System.out.println("Sadece Sayı Girniz");
        }

    }
}
