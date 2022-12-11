import java.util.*;
public class Main {
    public static void main(String[] args){
        //girilen sayıdan önceki asal sayıları bulur
        Scanner in = new Scanner(System.in);
        System.out.print("\nSayı Giriniz: ");
        int j = in.nextInt();
        for (int i = 1; i <= j; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}