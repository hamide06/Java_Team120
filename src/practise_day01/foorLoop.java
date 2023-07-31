package practise_day01;

import java.util.Scanner;

public class foorLoop {
    public static void main(String[] args) {

        // kullanıcıdan pozıtıf bır sayı alın
        // 1 den o sayıya kadar olan sayıların
        // 4 ıle bolunebılenlerı yazdırın

        Scanner scanner= new Scanner(System.in);
        System.out.println("lutfrn pozıtıf bıe sayı gırın");
        int girilenSayi= scanner.nextInt();
        if (girilenSayi<=0){
            System.out.println("yanlıs giriş yaptınız");

        }else {


        for (int i = 1; i <girilenSayi ; i++) {
            if (i%4 ==0){
                System.out.print(i+ "-");
            }
        }

        }

    }
}
