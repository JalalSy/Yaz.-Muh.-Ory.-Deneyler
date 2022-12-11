import java.util.Scanner;
public class Main {
    public static void main( String args[] )
    {
        //iki sayıyı karşılaştır ve sonucunu yazdır
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;

        System.out.print( "Birinci Numarayı Giriniz: " );
        number1 = input.nextInt();

        System.out.print( "İkinci Numarayı Giriniz: " );
        number2 = input.nextInt();

        if ( number1 == number2 )
            System.out.printf( "%d == %d\n", number1, number2 );
        if ( number1 != number2 )
            System.out.printf( "%d != %d\n", number1, number2 );
        if ( number1 <= number2 )
            System.out.printf( "%d <= %d\n", number1, number2 );
        if ( number1 >= number2 )
            System.out.printf( "%d >= %d\n", number1, number2 );
    }
}