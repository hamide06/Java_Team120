package practise_day01;

import java.util.Scanner;

public class homehome {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz: ");
        String cumle= scanner.nextLine();
        String kucukcumle= cumle.toLowerCase();
        if (kucukcumle.contains("ev")&& kucukcumle.contains("is")){
        System.out.println("hem ev hem is lazım");

    }else if (kucukcumle.contains("ev")){
            System.out.println("home home sweet home");

        } else if (kucukcumle.contains("is")) {
            System.out.println("çalısmak guzeldır");

        }else {
            System.out.println("cok calısmam lazım");
        }

        }
    }
