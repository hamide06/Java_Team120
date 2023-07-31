package day11_StringManipulations;

public class C07_index_of {

    public static void main(String[] args) {

        String str = "Ali topu at, at Ali at ";

        // Ali' nın index i nedir? 0
        System.out.println(str.indexOf("Ali"));
        // at'in index'i nedir? 9
        System.out.println(str.indexOf("at"));

        //op'un index'i nedir? 5
        System.out.println(str.indexOf("op"));
        System.out.println(str.indexOf('a')); // 9
        System.out.println(str.indexOf("a", 10)); // 13
        System.out.println(str.indexOf("yusuf")); // -1



    }
}
