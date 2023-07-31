package day13_stringManipulationVe;

import java.util.Scanner;

public class C05_repeat {
    public static void main(String[] args) {

       /* Soru 1 : Kullanicidan bir cumle alin
        - cumlede ev geciyorsa, "home home sweet home" yazdirin
                - cumlede is geciyorsa, "calismak guzeldir"
                - ikisini de iceriyorsa "Hem ev lazim hem is"
                - hicbirini icermiyorsa "cok calisman lazim" yazdirin
                */




        System.out.println("Lütfen bir cümle girin: ");
        Scanner scanner= new Scanner(System.in);
        String cumle = scanner.nextLine().toLowerCase();

        if (cumle.contains("ev") && cumle.contains("is")) {
            System.out.println("Hem ev lazim hem is");
        } else if (cumle.contains("ev")) {
            System.out.println("home home sweet home");
        } else if (cumle.contains("is")) {
            System.out.println("calismak guzeldir");
        } else {
            System.out.println("cok calisman lazim");
        }




       // Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        //        input1 : “15.30 €” , input2 : “11.40 €”
       // output : 26.70 €



        String sayi1 ="15.30 €";
        String sayi2 ="11.40 €";

        sayi1=sayi1.replaceAll("€","");

        sayi1=sayi1.replaceAll(" ","");

        sayi2=sayi2.replaceAll("€","");

        sayi2=sayi2.replaceAll(" ","");

        System.out.println(Float.parseFloat(sayi1)+Float.parseFloat(sayi2) +"0"+" €");


        //Soru 3 : Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
                //sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
            //    input : java1 ogRe2@nMek3 #ne +Gu=zel
       // output : Java ogrenmek ne guzel.

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz :");
        String metin = scanner.nextLine();
        metin=  metin.replaceAll("\\d","");
        metin=  metin.replaceAll(" ","_");
        metin=  metin.replaceAll("\\W","");
        metin=  metin.toLowerCase();
        metin = metin.replaceAll("_"," ");
        metin = metin.substring(0,1).toUpperCase() + metin.substring(1);
        System.out.println(metin);




        /*Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
        duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
        basariyla kaydedildi" yazdirin
                - ilk harf kucuk harf olmali
        - son karakter rakam olmali
                - sifre bosluk icermemeli
        - uzunlugu en az 10 karakter olmali



        Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
                - ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
        yazdirin
                - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
        harflerle yazdirin.
        Soru 6 : Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
        :) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
                yazdirin.

        */
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz");
        String metin1 = scanner.nextLine();
        int metin1Lenght = metin1.length();
        if (metin1Lenght%2==0){
            metin1= metin1.substring(0,metin1Lenght/2)+":)"+ metin.substring(2);
            System.out.println(metin);
        } else {
            metin1 = metin1.substring(0,metin1Lenght/2)+":("+metin.substring(metin1Lenght/2+1);
            System.out.println(metin);
        }
    }
}
