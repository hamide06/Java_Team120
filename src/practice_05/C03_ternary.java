package practice_05;

import java.util.Scanner;

public class C03_ternary {
    public static void main(String[] args) {


        // soru kenar degerleri verılen ucgenın ıkızkenar ucgen
        // olup olmadıgını kontrol edip donut veren kot dızısını yazalım
        Scanner scan = new Scanner(System.in);
        System.out.println("Kontrol etmek istediğiniz üçgenın kenar degerlerini giriniz:");
        System.out.println("kenar 1: ");
        double kenar1 = scan.nextDouble();
        System.out.println("Kenar 2: ");
        double kenar2 = scan.nextDouble();
        System.out.println("Kenar 3: ");
        double kenar3 = scan.nextDouble();

        // ifle yapın??


        if (kenar1 > 0 && kenar2 > 0 && kenar3 > 0) {
            if (kenar1==kenar2 || kenar1==kenar3 || kenar2==kenar3){
                System.out.println("Giridiğiniz değerler bir ikizkenar üçgene aittir");
            }else{
                System.out.println("Giridiğiniz değerlere sahip üçgen bir ikizkenar üçgen değildir.");
            }
        } else {
            System.out.println("Yanlış giriş yaptınız");



    }
}}