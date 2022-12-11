import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //Harf, rakam ve boşluk sayısını hesaplayan java kodunu yazınız
        Scanner in = new Scanner(System.in);//yeni bir tarayıcı atama.
        System.out.println("Cümle Giriniz");//kullanıcıdan bir cümle girmesini istiyoruz.
        String test = in.nextLine();//bir stringe yeni girilen cümleyi atayın.
        count(test);//karakterleri sayacak fonksiyonu çağırıyoruz.

    }
    public static void count(String x){
        char[] ch = x.toCharArray();//string bir karakter dizisine bölün.
        //cümledeki harf, sayı, boşluk ve diğer sayılar için int değişkenlerini oluşturun.
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;
        //girilen dizgedeki karakter sayısı kadar döngü yapan bir for döngüsü oluşturun.
        for(int i = 0; i < x.length(); i++){
            //isletter(harf mi), isdigit(rakam mı) ve isspacechar(boşluk mu) fonksiyonlarını kullanın ve bunları oluşturulan int değişkenlerine atayın.
            if(Character.isLetter(ch[i])){
                letter ++ ;
            }
            else if(Character.isDigit(ch[i])){
                num ++ ;
            }
            else if(Character.isSpaceChar(ch[i])){
                space ++ ;
            }
            else{
                other ++;
            }
        }
        //onları yazdır,
        System.out.println("Girdiğiniz Cümle: " + x);
        System.out.println("Harf Sayısı: " + letter);
        System.out.println("Mesafe Sayısı: " + space);
        System.out.println("Numara Sayısı: " + num);
        System.out.println("Diğer: " + other);
    }
}