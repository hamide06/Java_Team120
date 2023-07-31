package day04_dataCatıng_wrapperClass;

public class C03_charDataCasting {
    public static void main(String[] args) {


        char ch1 = 'A';
        int sayi1 = ch1 ;
        System.out.println("ch1:"+ch1);
        System.out.println("sayi1:"+ sayi1);
        /*
        char data turu özel bır data turudur. her ne kadar char data turu
        içerisinde sayı,harf,özel karakter alsa da ascıı tablosunda sayısal degerlerı kullanabilir.
        aynı sekılde
        char data turunfe bır velıable matematıksel işlemle kullanırsanız ascıı tablosundaki degeri, ile
         matematıksel işleme cevırır

         */

        String str1= "java";
        String str2 = " ";
        String str3 = "Candır";
        System.out.println(str1+str2+str3); // Java Candır

        char ch2= 'a';
        char ch3= 'b';
        System.out.println(ch2+ch3); // 195


        // veılen ınt bır sayının ascıı tablosundaki  char karsılıgını yazdırın

        int karakter =65;

        char asciDegeri = (char) karakter ;


        System.out.println("veilen sayinın asci tablosundak karsılıgi:"+ asciDegeri);


    }
}
