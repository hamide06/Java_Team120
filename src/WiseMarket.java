import java.util.Scanner;

public class WiseMarket {
    /*
    bir market yazılımı yazdıgımızı dusunerek asagıdakı menu
    ıle gırıs yapın. ılgılı bolume yonlendıren,
    alısverıs yaptıran ve sepet tutatrını hesaplayarak
     hafızada tutan kasaya gıdınce fıs yazdıran bır fiş
     yazdırın.

    ==================== WISE MARKET KASA PROGRAMI ===================================
ilk programa girildiginde bizi bir menu karsilasin bu secenekler
  1 ŞARKÜTERİ ÜRÜNLERİ
  2 MANAV ÜRÜNLERİ
  3 MARKET
  secime gore ,
  4-urunleri listele ve
  5-fiyatlari gelsin
  veliable belirleyelım
  urunadı, urun mıktari, urun adeti,urun kodu, sepet, toplam

     */
    static Scanner scan= new Scanner(System.in);
    static String urunAdi;
    static double urunFiyati;
    static double urunMiktari;
    static int urunKodu;
    static String sepet="";
    static double toplam;

    public static void main(String[] args) { girisekrani();


    }

    private static void girisekrani() {
        System.out.println("====================T120 WISE MARKET ===================================");
        System.out.println("==================== Hosgeldiniz ===================================");
        System.out.println("==================== Menu ===================================");
        System.out.println("Lutfen alısverıs yapmak istedıgınız reyonu secınız");
        System.out.println("1- Sarkuteri \n2 - Manav\n3 - Market\n4 - FişYazdır\n5 -Cıkıs ");

int secim= scan.nextInt();
if (!(secim>=1 && secim<=5)){
    System.out.println("Gecersiz bir tusa bastınız. tekrar deneyin");
    girisekrani();

}else {
    switch (secim){
        case 1:
            sarkuteri();
            break;
        case 2:
            manav();
            break;
        case 3:
            market();
            break;
        case 4:
            fisYazdir();
            break;
        case 5:
           cikis();
        default:





    }
}

    }
    public static void sarkuteri() {
        System.out.println("Şarkteri Reyonuna Hoşgeldiniz");girisEkrani();
    }

    private static void girisEkrani() {
    }

    public static void manav() {
        System.out.println("Manav Reyonuna Hoşgeldiniz");girisEkrani();
    }

    public static void market() {
        System.out.println("Market Reyonuna Hoşgeldiniz");girisEkrani();
    }
    public static void fisYazdir() {
        System.out.println("Alışveriş Fişi");girisEkrani();
    }
    public static void cikis() {
        System.out.println(" Çıkış Ekranı");girisEkrani();


    }

}
