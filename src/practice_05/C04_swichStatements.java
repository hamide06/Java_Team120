package practice_05;

import java.util.Scanner;

public class C04_swichStatements {

    public static void main(String[] args) {

        // kullanıcıdan dogdugu ayın numarasını girmesını ısteyıp
        //hangi ay dogdugunu yazdıran kot dızısını yazdırın

        System.out.println("Lutfen dogdugunuz ayın sayısını sayınız: ");
        Scanner scan= new Scanner(System.in);
        int ay= scan.nextInt();

        switch(ay){
            case 1:
                System.out.println("ocak ayında dogdunuz");
                break;
            case 2:
                System.out.println("subat ayında dogdunuz");
                break;
            case 3:
                System.out.println("mart ayında dogdunuz");
                break;
            case 4:
                System.out.println("nisan ayında dogdunuz");
                break;
            case 5:
                System.out.println("mayıs ayında dogdunuz");
                break;
            case 6:
                System.out.println("haziran ayında dogdunuz");
                break;
            case 7:
                System.out.println("temmuz ayında dogdunuz");
                break;
            case 8:
                System.out.println("agustos ayında dogdunuz");
                break;
            case 9:
                System.out.println("eylul ayında dogdunuz");
                break;
            case 10:
                System.out.println("ekım ayında dogdunuz");
                break;
            case 11:
                System.out.println("kasım ayında dogdunuz");
                break;
            case 12:
                System.out.println("aralık ayında dogdunuz");
            default:
                System.out.println("yanlış ay numarası gırdınız");


        }


    }
}
