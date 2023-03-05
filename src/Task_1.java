//Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
//        Ввод:5
//        Треугольное число 1 + 2 + 3 + 4 + 5 = 15
//        n! 1 * 2 * 3 * 4 * 5 = 120


import java.util.Scanner;

public class Task_1 {
    static void task_1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число : ");
        int num = in.nextInt();
        int triNum = 0;
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            triNum += i;
            fact *= i;
        }
        System.out.printf("Треугольное число = " + triNum + "\nN! = " + fact);
    }
}
