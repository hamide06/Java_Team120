package day05_matematikselislemler_incriment;

public class C03_increment_Declement {

    public static void main(String[] args) {

        // sayı veliable mım degerını 2 katının 5 fazlası yapın
         //2. yontem

        int sayi=10;

        sayi *=2;
        System.out.println(sayi);
        sayi =10;
        sayi *= 3; // sayi=30
        sayi /=3;


        System.out.println(sayi);

        int a= 10;
        // a nın degerını yeni
        // olusturdugumuz b ye atayıp yanına a nın degerıni 1 artırın
        // sonra a ve b yi yazdırın

        int b= a;
        a++;
        System.out.println("a :"+a+"b:"+b);
        a=10;

        // a  ın degeını 1 arırın sonra a nın degerını b ye atayın

        a++;
        b= a;
        System.out.println("a:"+a +"b :"+b); // a:11 b:11
    }
}
