package day05_matematikselislemler_incriment;

public class C01_Matematıkselİslemler {
    public static void main(String[] args) {


         int a = 27;
        int b = 4;
        System.out.println(a/b); //   27/4=6,75==6
        System.out.println(32/5); // 6,4 == 6

        double c = 24;
        System.out.println(c/b); // 27/4= 6,75
         //java ıkı tamsayıyı bölersenız sonucu tam sayı olarak size verir.

        // eger bolunen yada bolen den dauble olan varsa  dauble olarak verir

        System.out.println(2567/10); // 256,7 == 256
        System.out.println(2567%10); // 7 modulus kalanı verır

        System.out.println(256 %10); //6
        System.out.println(25%10); // 5
        System.out.println(2%10); // 2

        System.out.println(256/10); //25.6 ==25
        System.out.println(25/10); //2.5 == 2
        System.out.println(2/10); // 0.2 == 0


        // a'yı b'ye bolup sonucu ondalıklı olarak yazdırın

        double sonuc1 = a/b;
        System.out.println("sonuc1 :" + sonuc1);

        double sonuc2 = (double) (a/b);
        System.out.println(sonuc2);

        double sonuc3= (double)a/b;
        System.out.println("sonuc3: " + sonuc3);









    }


}
