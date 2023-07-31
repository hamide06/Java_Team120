package day11_StringManipulations;

public class C04_contains {
    public static void main(String[] args) {
        String str= "java gun gectikce guzellesiyor";

        // str java icerir mi ?
        System.out.println(str.contains("java")); // false

        // str a icerir mi ?
        System.out.println(str.contains("a")); // true

        // *** contains method'u aranan metnin sayisiyla ilgilenmez
        //     sadece VAR veya YOK sonucu dondurur

    }
}
