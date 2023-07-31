package practice_05;

import java.util.Scanner;

public class C05_SwichStatement {

    public static void main(String[] args) {

        //kullanıcıdan o gunun hangı gun oldugunu girmesını ısteyelım.
        // haftanın kacıncı gunu oldugunu yazdırın

        System.out.println("Bugun gunlerden hangi gun?: ");
        Scanner scanner= new Scanner(System.in);
        String gun= scanner.next();
        gun=gun.toLowerCase();

        switch (gun){
            case "pazartesi" :
                System.out.println("haftanın 1. gunu");
                break;
            case "salı" :
                System.out.println("haftanın 2. gunu");
                break;
            case "carsamba" :
                System.out.println("haftanın 3. gunu");
                break;
            case "persembe" :
                System.out.println("haftanın 4. gunu");
                break;
            case "cuma" :
                System.out.println("haftanın 5. gunu");
                break;
            case "cumartesi" :
                System.out.println("haftanın 6. gunu");
                break;
            case "pazar" :
                System.out.println("haftanın 7. gunu");
                break;

            default:
                System.out.println("yanlış gun gırdınız");

        }
    }
}
