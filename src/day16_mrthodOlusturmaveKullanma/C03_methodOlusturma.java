package day16_mrthodOlusturmaveKullanma;

import java.util.Scanner;

public class C03_methodOlusturma {

       // Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
        //Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip, isim bosluk soyisim seklinde bize donduren bir method olusturun
       // input : isim : Ali soyisim :YILMAZ.    output : Ali Yilmaz


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz"); // tek isim istiyoruz

        String isim= scanner.next();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim= scanner.next();

        System.out.println(isimDuzenleme(isim, soyisim));

        String duzenleIsim= isimDuzenleme(isim,soyisim);

    }

    public static String isimDuzenleme(String isim , String soyisim){
        isim=isim.substring(0,1).toUpperCase() +isim.substring(1).toLowerCase();
        soyisim=soyisim.substring(0 , 1).toUpperCase()+soyisim.substring(1).toLowerCase();

        String istenenFormattaIsimveSoyisim= isim+" "+soyisim;

        return istenenFormattaIsimveSoyisim;


    }

}
