package day04_dataCatıng_wrapperClass;

import java.util.Scanner;

public class C04_CharCasting {
    public static void main(String[] args) {


        //kullanıcıdan bır char isteyin. gırılen chardan sonraki
        // üç karakterı yazdırın
        //ör ınput : a   output :b,c,d


        Scanner scanner = new Scanner(System.in) ;
        System.out.println("lutfen Ascii Tablosundan bir karakter Giriniz" );

        char girilenKrt= scanner.next().charAt(0);

        //scanner. nextChar metodu olamdıgından
       // önce .next() ile String olarak alıp sonra o Stringin ilk karakterini alalım

        System.out.println("Girilen Karakter:" +girilenKrt);

        System.out.println("Girilen Karakterden sonraki 3 karakter:"+
                (char) (girilenKrt+1) +","+(char)(girilenKrt+2) +","+(char)(girilenKrt+3));
    }
}
