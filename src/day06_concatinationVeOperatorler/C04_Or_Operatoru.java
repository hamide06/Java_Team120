package day06_concatinationVeOperatorler;

public class C04_Or_Operatoru {

    public static void main(String[] args) {

        /*
        or operatoru iyimserdir.
        yani tek bir dogru yeterli olur
       or opertorunde tum mantıksal idadeler false ıse sonuc false
        değilse true olur.

        or operatoru matematikte toplama işlemine benzer
        toplanan sayılardan bır tane bile 0 olmayan varsa sonuc sıfır olamaz
        2+0+0+0 = 2 olur
        0+0+0+0+1 !=0
        1+1+1+3+5 !=0

         */
        System.out.println(3>5 || 6>4);  // false||true => true
        System.out.println(3<5 ||  6>4); // true || true  ==> true
        System.out.println(3<5 || 6<4);  // true || false ==> true
        System.out.println(3>5 || 6<4);  // false || false ==> false

        int sayi =24;
        // sayi 3 e veya 5 'e bölünmelidir.
        System.out.println( sayi %3 ==0 || sayi %5 ==0); // true || false ==> true

        // sayi 0 'dan buyuk veya  100'den kucuk olmalıdır

        System.out.println(sayi >0 || sayi>100); //true ||  true ==> true

    }
}
