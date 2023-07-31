package day05_matematikselislemler_incriment;

import java.util.Scanner;

public class C02_RakamlarToplaminiBulma {

    public static void main(String[] args) {


        // Kullanıcıdan 3 basamaklı  bır sayı alıp sayının rakamlarını bulup yazdırın.

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Lütfen 3 basamakli bir sayi gırınız: ");
        int girilenSayi = scanner.nextInt();



      //  257%10=7
        int birlerBasamagi =0;
        int rakamlarToplami = 0;

        // ilk sayi için birler basamagını bulalaım

        birlerBasamagi = girilenSayi % 10 ;
        rakamlarToplami=  rakamlarToplami + birlerBasamagi ;

        // Bu satıra geldiğimizde girilen sayıyı 2 basamaklı hale donusturduk.

        birlerBasamagi = girilenSayi % 10 ;

        rakamlarToplami = rakamlarToplami + birlerBasamagi ;

        girilenSayi = girilenSayi /10 ;

        //buraya geldiğimizde artık sayımız tek basamaklıdır


        birlerBasamagi = girilenSayi % 10 ;

        rakamlarToplami = rakamlarToplami + birlerBasamagi ;

        girilenSayi = girilenSayi /10 ;

        System.out.println("rakamlar toplamı :" + rakamlarToplami);





    }
}

