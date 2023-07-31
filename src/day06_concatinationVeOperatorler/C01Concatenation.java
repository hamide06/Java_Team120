package day06_concatinationVeOperatorler;

public class C01Concatenation {

    public static void main(String[] args) {

        String s1= "Java";
        String s2= "Candır";
        String s3 = " ";
        String s4= "";
        int a = 3;
        int b= 5;
        // sadece yukarıdaki veliableları kullanarak aagıda verılen metınlerı yazdırın

        //Java35
        System.out.println(s1+a+b); //"Java35"

        //Java15
        System.out.println(s1+a*b); //"Java15"

        //8Candır
        System.out.println(a+b+s2); //8Candır

        //53Java
        System.out.println(b+ (a+s1));
        System.out.println(s4+b+a+s1); //"5"+3 ==53 ==53Java

        //23== Integer.parseInteger (23) = 23

        //35Java
        System.out.println(s4+a+b+s3+s1); //35Java

    }
}
