//Вывести все простые числа от 1 до 1000


import java.util.Scanner;

public class Task_2 {
    static void task_2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число и я покажу все простые числа до вашего : ");
        int max = in.nextInt();
        System.out.println("Список простых чисел : ");
        for (int i = 2; i <= max; i++) {
            boolean n = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    n = false;
                    break;
                }
            }
            if (n) {
                System.out.println(i);
            }
        }

    }
}

