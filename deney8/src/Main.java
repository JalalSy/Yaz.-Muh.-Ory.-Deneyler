import java.util.Scanner;
public class Main {

    public static void main(String[] String) {
        //girilen herhangi bir karakterin ASCII kodunu veren kodu
        Scanner in = new Scanner(System.in);
        System.out.println("Bir Char Giriniz");
        int s = in.next().charAt(0);
        char chr = (char)s;
        System.out.println(chr +" ASCII\'nin Değeri"+":"+s);
    }
}