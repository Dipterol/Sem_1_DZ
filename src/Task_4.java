import java.util.Scanner;

public class Task_4 {
    static void task_4(){
    Scanner scanner = new Scanner(System.in);

        System.out.println("Введите уравнение в формате x? + x? = x, где вместо x поставьте цифры : \n");

    String equation = scanner.nextLine();

    equation =equation.replace(" ","");


    equation =equation.replace("?","");

    String[] parts = equation.split("[?+=]");

    int a = Integer.parseInt(parts[0]);
    int b = Integer.parseInt(parts[1]);
    int e = Integer.parseInt(parts[2]);

        for(
    int i = 0;
    i< 10;i++)

    {
        int q = a * 10 + i;
        int w = b * 10 + i;
        if (q + w == e) {
            System.out.printf("Ваш знак вопроса = " + i);
            System.out.printf("\nПолное уравнение выглядит так : " + q + " + " + w + " = " + e);
            return;

            }
         }
        System.out.println("Решений нет");
    }
}
