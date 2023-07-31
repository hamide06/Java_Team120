package practise_day01;

import javax.swing.*;
import java.util.Scanner;

public class istenenKadarYazdirma {

    ///*
    //* Kullanicidan 3 harften uzun bir kelime ve 10�dan kucuk bir sayi alin,
    //* Kelimenin son 2 harfini girilen sayi kadar yan yana yazdirin

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz :");
        String kelime= scanner.next();
        System.out.println("Bir rakam giriniz: ");
        int rakam= scanner.nextInt();

        String somikiharf= kelime.substring(kelime.length()-2);
        if (rakam<9){

        for (int i = 1; i <= rakam ; i++) {
            System.out.println(somikiharf);
        }

        }else {
            System.out.println("girdiğiniz birr rakam degıl sayıdır. Rakamlar: 0,1,2,3,4,5,6,7,8,9 olmalıdır");


        }
    }
}
