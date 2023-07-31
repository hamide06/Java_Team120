package practise_day01;

import java.util.Scanner;

public class method {

    public static void main(String[] args) {
        Scanner scaner= new Scanner(System.in);
        System.out.println("lutfen pozitif bır tamsayı gırın: ");
        int sayi= scaner.nextInt();

        asalsayikontrol(sayi);
    }

    private static String asalsayikontrol(int sayi) {
        String sonuc= "sayı asal sayı";

        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                sonuc= "asal sayı degıl";
            }
        }


        return sonuc;
    }}

