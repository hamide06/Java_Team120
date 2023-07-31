package day07_if_Statement;

import java.util.Scanner;

public class C05_BagimsizIfCumleleri {

    public static void main(String[] args) {

        // Kullanıcıan bır ucgenın 3 kenar uzunlugunu alın
        //ucgen eskenar ise "Eskenar ucgen" yazdırın

        Scanner scanner =new Scanner(System.in);
        System.out.println("ucgenin kenaruzunluklarini giriniz");
        double kenar1 =scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        /*
        javada uclu karsılastırma olmaz.
        ıkılı karsılaştırmalar yapıp and  || or operatorleri ile birleştirmeliyiz

         */
        if (kenar1==kenar2 && kenar1 ==kenar3){
            System.out.println("Eskenar Ucgen");

        }

    }
}
