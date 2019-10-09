package by.it.Turovets.lesson03;

import java.util.Scanner;

/*
Lesson 03. Task B2. Нужно написать программу, которая вводит три числа  a b c типа int с клавиатуры
и вычисляет корни квадратного уравнения a*a*x + b*x + c = 0:
1) Если два корня, то выводится два корня через пробел.
2) Если один корень, то выводится только одно число - корень.
3) Если нет действительных корней, то выводится сообщение об ошибке "Отрицательный дискриминант"

В программе должен быть определен статический метод dis вычисления дискриминанта,
который принимает на входе три числа типа int a,b,c
а на выходе возвращает число типа double

Примеры работы

Ввод:
2 5 3
Вывод:
-1.0 -1.5

Ввод:
2 4 2
Вывод:
-1.0

Ввод:
2 2 2
Вывод:
Отрицательный дискриминант

*/
class TaskB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int  second= sc.nextInt();
        int third = sc.nextInt();
        double resofdis = dis(first,second,third);
        if (resofdis>0){
            double x1 = ((-1*second) + Math.sqrt(resofdis))/(2*first);
            double x2 = ((-1*second) - Math.sqrt(resofdis))/(2*first);
            System.out.println(x1+" "+x2);
        }
        if(resofdis==0){
            double x = (double)((-1*second)/(2*first));
            System.out.println(x);
        }
        if(resofdis<0){
            System.out.println("Отрицательный дискриминант");
        }
    }
    public static double dis(int a, int b, int c){

            double d = b*b-4*a*c;
            return d ;

    }

    ;
}






