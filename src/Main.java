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
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите нижнюю граниицу: ");
        int minBound = Integer.parseInt(scanner.nextLine());

        System.out.print("Введите верхнюю граниицу: ");
        int maxBound = Integer.parseInt(scanner.nextLine());

        System.out.print("Введите количество попыток: ");
        int chances = Integer.parseInt(scanner.nextLine());

        int x = minBound + rand.nextInt(maxBound - minBound + 1);

        for(int i=1; i<= chances; i++)
        {
            System.out.printf("Введите число от " + minBound + " до " + maxBound + " (попытка " + i + "): ");
            int j = Integer.parseInt(scanner.nextLine());

            if(x > j) {
                System.out.println("Число больше");
                minBound = j;
            } else if(x < j) {
                System.out.println("Число меньше");
                maxBound = j;
            } else {
                System.out.println("Вы выиграли!");
                return;
            }
        }

        System.out.println("Вы проиграли, число было " + x);
    }
}
