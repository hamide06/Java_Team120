package day17_methodOlusturmaMethodOverloading;

import day16_mrthodOlusturmaveKullanma.C01_methodOlusturma;
import day16_mrthodOlusturmaveKullanma.C03_methodOlusturma;

public class C03_BaskaClasstnMethodKullanma {


        public static void main(String[] args) {
                C01_methodOlusturma.altString("Method budur...",7,8); // b
                System.out.println(C03_methodOlusturma.isimDuzenleme("omer", "GOK"));
                // Omer Gok
                System.out.println(C01_asalSayiBulma.asalSayiMi(59)); // true
                System.out.println(C02_TamBolenlerSayisiniBulma.tamBolenlerSayisi(12)); // 6
            }
        }

