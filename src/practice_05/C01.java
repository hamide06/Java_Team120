package practice_05;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {

        // kenar degerleri girilen bır ucgenin
        // dık ucgen olup olmadıgını kontrol edıp
        // donut veren kod dızısını yazınız

        Scanner scanner= new Scanner(System.in);
        System.out.println("kontrol edılecek ucgenın kenarlarının uzunluklarını gırınız");
        System.out.println("birinci kenar uzunlugu: ");

        int a= scanner.nextInt();
        System.out.println("ıkıncı kenar uzunlugu: ");
        int b= scanner.nextInt();
        System.out.println("ucuncu kenar uzunlugu: ");
        int c= scanner.nextInt();
        if ((a*a)+(b*b)==(c*c)){
            System.out.println("gırdıgınız degerlere sahıp ucgen dık ucgendır");

        } else if ((a*a)+(c*c)==(b*b)) {
            System.out.println("gırdıgınız degerlere sahıp ucgen dık ucgendir");


        } else if ((b*b)+(c*c)==(a*a)) {
            System.out.println("girdiğiniz degerlere sahıp ucgen dık ucgendır");


        }else{
            System.out.println("girdiğiniz dgerlere sahıp ucgen dık ucgen degıldır");

        }if ((a*a)+(b*b)==(c*c)||(a*a)+(c*c)==(b*b)||(b*b)+(c*c)==(a*a)){
            // || or işaretıyle yazılanlardan bırının dogrulanması
            // yeterlıdır. && işaretıyle yazılanların tamamı dogru olması gerekır
            System.out.println("Girirln degerler dık ucgendir.");

        }else {
            System.out.println("girdiğiniz degerlere sahıp dık ucgen degıldır.");
        }

    }


}
