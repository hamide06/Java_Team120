package day07_if_Statement;

import java.util.Scanner;

public class C04_BagimsizIfCümleleri {

    public static void main(String[] args) {

        //Kullanıcıdan bir sayı alın
        //3 ile bölunebiliyorsa "uc ile bolunebilen sayi"
        //5 ile bölunebiliyorsa "5 ile bölunebilen sayı" yazdırın

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int girilensayi = scanner.nextInt();
        if (girilensayi %3 ==0) {
            System.out.println("3 ile bolunebilen sayi");
        }
        if (girilensayi %5 ==0) {
            System.out.println("5 ile bolunebilen sayi");

        }
    }
}
