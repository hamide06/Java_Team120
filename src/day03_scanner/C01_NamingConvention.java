package day03_scanner;

public class C01_NamingConvention {

    public static void main(String[] args) {

        // java case sensıtıve (buyuk kucuk harf duyarlıdır)
        int sayi=10;

        //intsayı=20
        //longsayi=345
        int Sayi=25;
        int SAYİ=23;
        int sAYİ=45;

        System.out.println(sAYİ);  //45
        System.out.println(SAYİ); // 23
        System.out.println(Sayi); // 25

        // veliable isimleri kucuk harflr başlar
        // buyuk hatflr baslarsanız java kabul eder ancak kurala aykırıdır
        // int sa yi =35;
        // int sa&yi = 45;

        int say_i = 34;
        int sayi12345 = 12345;
       // int sa&yi = 21;
        // int sa.yi = 35;

        //& ve _ isinde kullanılabılır ama ılk harf olaak kullanılması namıng conventıon a uygun degıldır.
        int _sayi=75;
        int $sayi=87;
       // int 45sayi= 67;

        // birden fazla kelımeden olusan ısım varsa camelcase kullanılır
        int sinifinEnYuksekNotu = 99;
        int MaksimumSayi=100;



    }
}
