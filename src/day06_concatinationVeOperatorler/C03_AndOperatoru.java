package day06_concatinationVeOperatorler;

public class C03_AndOperatoru {

    public static void main(String[] args) {

        System.out.println(5 > 3 && 6 > 4); // true and true ==> true

        System.out.println(5 < 3 && 6 > 4 ); // false + true ==> false
        System.out.println(4 > 3 && 6 < 4 ); // true and false ==> false
        System.out.println(5 <= 3 && 6<=4); // false and false ==> falser

        //  && yani and opetaoruyle baglanan boolean ıfadeerın hepsi true ıse true bı tane false vrsa flse dur.
        //bu yonuyle matematıktekı carpıya benzer.

        //bır sayının hem 2 hem 3 hemde 5 ile bolunebılmesı lazım
        int sayi =24;
        System.out.println(sayi %2 == 0 && sayi %3 ==0 && sayi %5==0);
        //                     true      &&    true    &&       false   ==> false

        //sayi 0 veya daha buyuk 100 veya daha kucuk olmalıdır
        //sayi 0 ile 100 arasında olmalıdır sınırlar dahil. 0 ve 100 dahil
        System.out.println(sayi >= 0 && sayi <= 100); // true && true ==> true



    }
}
