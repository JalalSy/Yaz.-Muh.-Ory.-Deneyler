import java.util.*;
public class Main {
    public static void main(String[] args){
        //Kelimenin Tersine Çeviren Kod
        Scanner in = new Scanner(System.in);
        System.out.print("\nKelime Giriniz: ");
        String word = in.nextLine();
        word = word.trim();
        String result = "";
        char[] ch=word.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            result += ch[i];
        }
        System.out.println("Kelimenin Tersi: "+result.trim());
    }
}