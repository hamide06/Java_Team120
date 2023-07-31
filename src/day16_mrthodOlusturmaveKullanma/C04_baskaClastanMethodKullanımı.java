package day16_mrthodOlusturmaveKullanma;

public class C04_baskaClastanMethodKullanımı {

    public static void main(String[] args) {

        System.out.println(C03_methodOlusturma.isimDuzenleme("bugra", "can")); //Bugra Can


        String isimDuzenle = C03_methodOlusturma.isimDuzenleme("mehmet","kemal");

        //duzenlenmıs ısmın uzunlugunu yazdırın

        System.out.println(isimDuzenle.length());
        
    }
}
