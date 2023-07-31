package day04_dataCatıng_wrapperClass;

public class C01_DataCasting {
    public static void main(String[] args) {

        /* char, blooan ve strıng dıger data turlerıne cast edemeyız.
        ancak sayısal data ıceren prımıtive data turlerını bırbırıbne cast edebılırız.
         burdakikural
         1- daha kucuk data turundekı degerı daha genıs data turundekı veliabşe atama yapar.
         java outo vetenımg taoar yani  otomatık atar.
       2- daha geniş kapsamşıdan daha dar kapsaömlıya atama yaparsak java bunu otomtık yapmaz. bız
        sorumlulugu uzerımıze alarak bu castıng yaptırabiliriz.
         sorumlulugu almak için degerın onune bır parantez acıp parantez içine cast etmek istedıgımız data turunu
        yazabılırız.
         daraltma  (explicit Narrowing) yapıldıgında data kayıpları olabolecegı gıbı data baskalasabılır.

         */

        String str = "java Candir";

        double dbl1 = 123.6;

      //  int sayi1 = dbl1;
        int sayi1 =(int)dbl1;
        System.out.println("sayi1 : "+sayi1); //123




        // int sayi1= str;
        //char chr1= str;
        //boolean bll = str;

        String s1= str;

      //  boolean bl1= 10;

      // boolean bl2= 's';


        int sayi2= 'k';
      //  double dbl1= sayi2;

        int sayi3 = 10;
        double dbl2 = 4.5;
        short sh1 = 3;
        byte by1=7;

       // sayi3 = dbl2;
        sayi3 = sh1;
        sayi3 = by1 ;
        dbl2 = sayi3 ;
        dbl2 = sh1 ;
        dbl2 = by1;

       // by1=dbl2;
       by1 = (byte)dbl2;

       //  by1 = sh1 ;
        by1=(byte)sh1;

       //  by1 = sayi3;
        by1= (byte) sayi3;

       // sh1 = dbl2;
        sh1 = (short) dbl2 ;

       // sh1 = sayi3;
        sh1 = (short)sayi3;

        sh1 = by1;











    }

}
