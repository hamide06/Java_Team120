package day21_Array;

import java.util.Arrays;

public class C06_BaskaClassdanMetetKullanma {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8};
        System.out.println("eski array : " + Arrays.toString(arr)); // eski array : [2, 4, 6, 8]
        arr =C02_ArrayinTumElementleriniİstenenKadarArtırma.elementleriArtir(arr,4);
        System.out.println("yeni array : " + Arrays.toString(arr)); // yeni array : [6, 8, 10, 12]
        System.out.println(C03_PozıtıfElementleriTopla.pozitifElementleriTopla(arr)); // 36
        C04_ElementSay.elemanSay(arr,6); // method void oldugu icin bizim sout yapmamiza gerek yok
        // kullanicidan deger alarak int[] olusturmak istiyorum
        int[] kullaniciArrayi = C05_ArrayOlustur.arrayOlustur();
        System.out.println(Arrays.toString(kullaniciArrayi));
    }
}


