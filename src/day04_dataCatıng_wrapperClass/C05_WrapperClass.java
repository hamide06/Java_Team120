package day04_dataCatıng_wrapperClass;

public class C05_WrapperClass {

    public static void main(String[] args) {


        String str ="Java Candir";
        System.out.println(str.charAt(3)); //a

        int sayi= 20;
        /*
        Java prımıtıve data turleri için hazır metot olusturamaz. ancak
        pirimitive data turleri içinde hazır metotlar kullanabılecekler WapperClaslar oluşturmuştur.

        int ==> Integer
        char==> Charecter
        short ==> Short
        double ==>Double...

        WapperClasslar pirimitive data turleri ile hiç problemsız atama yapılabilir.
         */

        int sayi2 = 5;
        Integer sayi3 = sayi2;
        int sayi4= sayi3;

        System.out.println(Integer.MIN_VALUE); //-2147483648
        System.out.println(Integer.MAX_VALUE);  //2147483647

      //  Short sayi5=(short)sayi3;  Wappercacc lar arasında casting olmaz.

        System.out.println(Short.MIN_VALUE);  //-32768

        // İçinden sadece sayısal ifadeler bulunan b ır strıng verıldıgınde matematıksel işlem yapmanız gerekırse
        // ıInteger.parseInt() ile ıntegera cevırebılırız.
         String str1= "22";
         String str2 = "33";
         //bu degerleri toplayıp yazdırın
        System.out.println(str1+str2); //2233

        System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2)); //55



        char ch1 = '1';
        System.out.println(Character.isDigit(ch1)); // true
        System.out.println(Character.isLetter(ch1)); // falce
        System.out.println(Character.isWhitespace(ch1)); // falce


    }
}
