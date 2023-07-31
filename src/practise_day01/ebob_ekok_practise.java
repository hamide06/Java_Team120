package practise_day01;

import java.util.Scanner;

public class ebob_ekok_practise {
    public static void main(String[] args) {

        // kullanıcıdan 2 tane tamsayı alın ve
        // ebob ekok bulun

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif ıkı tamsayı giriniz: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int flag = 0;
        System.out.println("Girdiğiniz sayılar sırasıyla: " + num1 +"-"+ num2);

        int limitEbob = 0;
        if (num1 < num2) {
            limitEbob = num1;

        } else {
            limitEbob = num2;
        }
        for (int i = limitEbob; i >= 2; i--) {
            if (num1 % i == 0 && num2 % i == 0) {

                System.out.println("Bu sayıların EBOB degeri: " + i);
                flag++;
                break;


            }
        }
        if (flag ==0){
            System.out.println(" Bu iki sayının ortak boleni yoktur");
        }
        // girilen sayıların enkucuk ortak kat degerını bulalım
        flag=0;
        // forloop yazarken 1 den baslayıp bir limit koyarak i degerini
        // 1 er arttırarak ilerleyecegiz
        System.out.println("Lütfen Ekok olabılecek maksimum limiti giriniz:");
            int limit= scanner.nextInt();
        for (int i = 1; i <(num1*num2) ; i++) {
            if (i%num1==0 && i%num2==0){
                System.out.println("Girdiğiniz sayının EKOK degeri: "+i);
                flag++;
                break;
            }

        }
        if (flag==0){
            System.out.println("Girdiğiniz sayıların belirttiğiniz limit degerinden kucuk bir EKOK degeri yoktur.");
        }



    }
}


