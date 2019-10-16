package by.it.Turovets.lesson02;

import java.util.Scanner;

import static java.lang.Integer.toBinaryString;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt(); //Первое число
        int number2=sc.nextInt();//второе число
        System.out.println("DEC:" + number1 +"+"+ number2 + "=" + (number1 + number2)); // DEC

        String number1bin= toBinaryString(number1); // number1bin
        String number2bin= toBinaryString(number2); // number2bin
        int sumNumber = number1 + number2; //60
        String sumbin= toBinaryString(sumNumber); // 60 в бин
        System.out.println("BIN:" + number1bin+ "+" + number2bin + "=" + sumbin); //BIN

        String number1hex= Integer.toHexString(number1); // number1bin
        String number2hex= Integer.toHexString(number2); // number2bin
        String sumHex= Integer.toHexString(sumNumber); // 60 в hex
        System.out.println("HEX:" + number1hex+ "+" + number2hex + "=" + sumHex); //BIN

        String number1oct= Integer.toOctalString(number1); // number1bin
        String number2oct= Integer.toOctalString(number2); // number2bin
        String sumoct= Integer.toOctalString(sumNumber); // 60 в hex
        System.out.println("OCT:" + number1oct+ "+" + number2oct + "=" + sumoct); //BIN
    }
}
