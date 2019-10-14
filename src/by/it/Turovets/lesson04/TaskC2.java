package by.it.Turovets.lesson04;

import java.util.Scanner;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int month1 = 31;
        int month2 = 28;
        int month3 = 31;
        int month4 = 30;
        int month5 = 31;
        int month6 = 30;
        int month7 = 31;
        int month8 = 31;
        int month9 = 30;
        int month10 = 31;
        int month11 = 30;
        int result;
        switch (month) {
            case (1):
                result = day;
                break;
            case (2):
                result = month1 + day;
                break;
            case (3):
                result = month1 + month2 + day;
                break;
            case (4):
                result = month1 + month2 + month3 + day;
                break;
            case (5):
                result = month1 + month2 + month3 + month4 + day;
                break;
            case (6):
                result = month1 + month2 + month3 + month4 + month5 + day;
                break;
            case (7):
                result = month1 + month2 + month3 + month4 + month5 + month6 + day;
                break;
            case (8):
                result = month1 + month2 + month3 + month4 + month5 + month6 + month7 + day;
                break;
            case (9):
                result = month1 + month2 + month3 + month4 + month5 + month6 + month7 + month8 + day;
                break;
            case (10):
                result = month1 + month2 + month3 + month4 + month5 + month6 + month7 + month8 + month9 + day;
                break;
            case (11):
                result = month1 + month2 + month3 + month4 + month5 + month6 + month7 + month8 + month9 + month10 + day;
                break;
            default:
                result = month1 + month2 + month3 + month4 + month5 + month6 + month7 + month8 + month9 + month10 + month11 + day;
                break;
        }
        System.out.println(result);
    }
}
