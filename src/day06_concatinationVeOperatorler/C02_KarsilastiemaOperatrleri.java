package day06_concatinationVeOperatorler;

public class C02_KarsilastiemaOperatrleri {

    public static void main(String[] args) {

        int a = 10;
        int  b= 20;

        //Java da = işareti karsılaştırma degıl atama işaretidir
        b= 2* a;
        //Javada esitiği kontrol etmek istersek == kullanırız
        System.out.println(b ==2*a); // 20 == 20 == true

       // assigmntta eşitiğinsol tarafında sadece veriable bulunur.
        //sol tarafta matematıksel işlem olmaz.
        //Karsılaştırma opetarorlerınde ıkın tarafta da işlem olabilir.

        System.out.println(3*b> 5*a); //60>50 ==> true
        System.out.println(b>= b-a); // 20 >=10 ==> true
        System.out.println(a>=b-a); // 10>=10 ==> true


        //Java da karsılaştırma op kullanılan ! ışareti boolean degerı tersıne cevırır
        System.out.println(a<b); // true
        System.out.println(  !  (a<b));   //true==false
        System.out.println(a  != b); // ture







    }
}
