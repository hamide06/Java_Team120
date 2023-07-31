package day08_if_else_statement;

import java.util.Scanner;

public class C03_if_else_statements {
    public static void main(String[] args) {


            // Kullanicidan bir not isteyin
            // not 85 den buyukse AA
            // not 65 den buyukse BB
            // not 50 den buyukse CC
            // gerye kalanlar DD

        /*
        bır ıf else statements else ile bıtmek zorunda degıldır.

         */

       Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        double not = scanner.nextDouble();

        if (not>=85) {
            System.out.println("AA");
        } else if (not>=65) {
            System.out.println("BB");

            }else if (not>=50) {
            System.out.println("CC");
        }else {
            System.out.println("DD");


        }


    }
    }

