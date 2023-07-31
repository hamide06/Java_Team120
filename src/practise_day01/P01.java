package practise_day01;

public class P01 {

    public static void main(String[] args) {
        //System.out.println("Merhaba Java");
        //System.out.println("Hello World");
        //System.out.print("yazdırma fonksiyonu-"); //println fonksıyonu verilen string ifadeyi alt satıra gecer
        //System.out.println("merhaba");
        //Bu işaret tek satırlık yorum için kullanılır.
        /* Bu işaret birden cok satır için
        kullanılır

         */

        // soru : konsola "Hello Java Ben Geldim " yazdırınız.
        System.out.println("Hello Java Ben Geldim");
        System.out.println("\"Hello Java Ben Geldim\"");
        /*
        \ " basına ve sonuna koyarak yazmaya baslarsak
        cıft tırnakta yazar"\
        \' = metın ıcınde tek tırnak
        \n or \r =  kendınden sonraki metnı alt satıra baslatır
        \t =  kendınden sonra tab bosluk bırakır


         */
        System.out.println(" \'Hello Wise\' ");
        System.out.println();
        System.out.println("hello Wine\nSen neymissin be abi!");
        System.out.println();
        System.out.println("Hello Wine\t\t\t\tHello Future");


        /*soru2 : konsola
        Değer atayarak
        Berrak Gezgin - Software Development Engineer in Test

         */
        /*
        Javada veriable dediğimiz degişkenler kullanılır.
        Prmitive - Non Primitive

         */

        String name = "berrak";
        String surname = "Gezgin" ;
        String job= "Software Development Engineer in Test";
        System.out.println(name+" "+surname+" " + "-"+job);

/* Odev sorusu: Aşagıdaki gibi bir atm karsılama ekranı hazırlayıp yazdırın.
        ************  WİSE BANK   ************
     WİSE ATM'YE HOŞGELDİNİZ
     1- Bakiye Sorgulma
     2- Para Yatıirma
     3- Para Çekme
     4- Bilgi Güncelleme
     5- Kart İade
     ************   WİSE BANK   ***********


 */

     
    }

}
