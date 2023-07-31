package practise_day01;

public class ARRAYS {

    public static void main(String[] args) {


        int[] list = {1, 3,10, 12, 25, 56, 35, 89};
        int toplam =0;

        for (int i = 0; i < list.length; i++) {
            toplam+=list[i];

        }
        System.out.println(toplam);
    }

}