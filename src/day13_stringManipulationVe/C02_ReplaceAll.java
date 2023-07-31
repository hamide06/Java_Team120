package day13_stringManipulationVe;

public class C02_ReplaceAll {

    public static void main(String[] args) {

        String str="IJ4ava 8Ci4Can5dirava";
        str= str.replace("1","");
        System.out.println(str);

        //sayiların tamamından kurtulmak ıstersek replace ()yeterli olmaz
        //Javada sayılar özel karakterler ya da alfabetik karakterrleri tümüyle işlem yapmak ıstersenız replace All()
        //(istenen grup,yeni deger)

        //örneğin butun sayıların yerıne hıclık atamak ıcın
        str=str.replaceAll("//w" ,"");
        System.out.println(str);

    }
}
