import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    /*
    ALT-ENTER - автоматический импорт либо вывод контекстного меню устранения ошибки
     */

    public static void main(String[] args)
    {
        /*Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        //int i = Integer.parseInt(input) * 1000;
        float f = Float.parseFloat(input) * 1.5F;

        System.out.println("read: " + input + " " + f);*/

        /*Random rand = new Random();
        System.out.println(rand.nextInt());
        System.out.println(rand.nextInt(1000));*/

        /*
        мин число - 1
        макс число - 99

        прогрмма выбирает рандомное число в выбранном диапазоне
        и спрашивает у вас число, вы вводите число, программа говорит
        больше оно или меньше загаданного рандомного
        если вы угадали - то выводит количество шагов
        после каждого шага диапазон обновляется

        пример:
            1) загадано число 32
            2) текущий диапазон 1-99
               вы спросили число 54
               программа ответила меньше
            3) текущий диапазон 1-53
               ...
         */

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Введите нижнюю границу: ");
        int minBound = Integer.parseInt(scanner.nextLine());

        System.out.printf("Введите верхнюю границу: ");
        int maxBound = Integer.parseInt(scanner.nextLine());

        System.out.printf("Введите количество попыток: ");
        int rounds = Integer.parseInt(scanner.nextLine());

        int x = minBound + rand.nextInt(maxBound - minBound + 1);

        for(int i=1; i<=rounds; i++)
        {
            System.out.print("Введите следующее число (" + minBound + "-" + maxBound + " | " + (rounds-i+1) + " попыток): ");
            int temp = Integer.parseInt(scanner.nextLine());

            if(temp > x) {
                System.out.println("Введенное число больше x");
                maxBound = temp;
            } else if(temp < x) {
                System.out.println("Введенное число меньше x");
                minBound = temp;
            } else {
                System.out.println("Вы выиграли за " + i + " попыток!");
                return;
            }
        }

        System.out.println("Вы проиграли! Было загадано число " + x);
    }
}
