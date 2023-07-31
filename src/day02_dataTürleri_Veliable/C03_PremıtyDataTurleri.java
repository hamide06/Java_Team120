package day02_dataTürleri_Veliable;

public class C03_PremıtyDataTurleri {

    public static void main(String[] args) {
// boolean mantıksal degerler olan true ve falce
        boolean bl1= true ;
        boolean bl2 = false ;

      char  ch1 = 'a';

     // char ch2 = "2";

      char ch3 = '/';

      // tam sayı olarak kabul eden velıable turleri
        // 3 byte, 4- short, 5- long
        // turkıye de sehır nufuslarını tutmak ıstıyoruz
        // data turu aynı olan veliable turu ne olursa olsun kapladıklrı alan aynıfır

        int nufus = 83458 ;

        int nufus2= 30100 ;


        //bit sehırdekı nufus sayısını tutacagız
         short notersayısı= 456;
         float fl1 = 20f ;
        float fl2 = 6f ;
        float  fl3 = fl1 / fl2 ;

        System.out.println(fl3); // 3,33333

double db1 = 20;
double db2 = 6;
 double db3 =  db1 / db2 ;
        System.out.println(db3); // 3,33333
// double bolme ısşmelerınde 0,000011 hata yapabılır
 // 20/5 = 3,99999999999

String str = "Hello World" ;
        System.out.println(str);
        System.out.println("true veya  falce");

        System.out.println("str"); // str

        // verilen ımı sayıyı carpıp sonucu yazın

        int sayi1 = 10;
        int sayi2 = 20;
        System.out.println(sayi1*sayi2);
        System.out.println(" verilen ıkı sayının carpımı:" + sayi1*sayi2);




    }
}


