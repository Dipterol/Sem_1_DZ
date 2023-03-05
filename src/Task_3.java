//Реализовать простой калькулятор (+ - / *)
//        Ввод числа ->
//        Ввод знака ->
//        Ввод числа ->


import java.util.Scanner;

public class Task_3 {
    static void task_3() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число\n");
        int num = in.nextInt();
        Scanner in2 = new Scanner(System.in);
        System.out.println("Введите оператор ( *,/,+,-)\n");
        char operator = in.next().charAt(0);
        Scanner in3 = new Scanner(System.in);
        System.out.println("Введите второе число\n");
        int num2 = in.nextInt();
        double result;

        switch (operator) {
            case '+':
                result = num + num2;
                break;
            case '-':
                result = num - num2;
                break;
            case'*':
                result = num * num2;
                break;
            case '/':
                result = num / num2;
                break;
            default:
                System.out.println("Не знаком пока с такой операцией");
                return;
        }
        System.out.printf("Результат вычисления : " + num + " " + operator  + " " + num2 + " = " + result);
        in.close();
    }
}

