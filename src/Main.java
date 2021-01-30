import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    /*
    SHIFT + F10 - быстрый запуск выбранной конфигурации (справа сверху)
     */

    /*
    программы выбирает рандомное число от 0 до 100
    и просит вас в ввести число, после чего говорит меньше оно или больше
    если число равно - вы выиграли
    после того как пользователь уже сказал какое-то число
    диапазон запрашиваемых чисел измеяется
        загадано число 37
        дипазон 0-100
        пользователь ввел 65
        ему сказало что число больше
        диапазон 0-65
        ...
        "Введите число от (х-y)"

     */

    public static void main(String[] args)
    {
        /*int i; //0 4 байта
        float f = 5.5454F; //32 бита после запятой
        double d = 5.443453D; //64 бита после запятой
        boolean b; //false
        long l; //целое число 8 байтов
        char c = 'ё';

        Integer integer_value; //null
        Float float_value; //null
        Double double_value; //null
        Boolean boolean_value; //null
        Long long_value; //null
        Character character; //null

        Integer integer1 = 3434;
        Float fdwe = 43434.43F;*/

        /*String s; //null
        String s1 = "fewfwefjwef";
        System.out.println(s1.toUpperCase());
        s1 += "4444";
        s1 += 4;
        System.out.println(s1);
        */

        /*String s3 = "25";
        int i1 = 30 + Integer.parseInt(s3);
        System.out.println(i1);*/

        String p1 = "34434243";
        String p2 = "34434243";

        /*//не корректно
        if(p1 == p2) {
            System.out.println("равны");
        } else {
            System.out.println("не равны");
        }

        //корректно
        if(p1.equals(p2)) {
            //....
        }*/

        //int[] arr; //null
        /*int[] arr1 = new int[10];
        System.out.println(Arrays.toString(arr1));

        //Integer[] arr2 = new Integer[10];
        //System.out.println(Arrays.toString(arr2));

        for(int i=0; i<arr1.length; i++) {
            arr1[i] = i + 10;
        }

        System.out.println(Arrays.toString(arr1));

        for(int i : arr1) {
            System.out.printf(i + " | ");
        }
        System.out.println();

        String s3 = "start-" + (arr1[0] == 11 ? "1" : "2");
        System.out.println(s3);*/

        /*Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int i = Integer.parseInt(s);
        i += 100;
        System.out.println(i);*/

        /*Random rand = new Random();

        System.out.println(rand.nextInt());
        System.out.println(rand.nextInt(100)); //0-99
        System.out.println(rand.nextFloat()); //float от 0 до 1

        //50-100
        int i = 50 + rand.nextInt(50);*/
    }
}
