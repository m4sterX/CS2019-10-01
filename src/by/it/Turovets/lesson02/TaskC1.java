package by.it.Turovets.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 60

*/
class TaskC1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int a=sc.nextInt();
        int answ = i + a;
        System.out.println("Sum = " + answ);
    }




}
