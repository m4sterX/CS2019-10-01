package by.it.Turovets.lesson04;

/*
Вывести таблицу умножения 10 x 10 (двоныйм циклом),
но вывод должен быть словами:

Ожидаемый вывод:
два умножить на два равно четыре
два умножить на три равно шесть
два умножить на четыре равно восемь
два умножить на пять равно десять
два умножить на шесть равно двенадцать
два умножить на семь равно четырнадцать
два умножить на восемь равно шестнадцать
два умножить на девять равно восемнадцать
два умножить на десять равно двадцать
три умножить на два равно шесть
три умножить на три равно девять
три умножить на четыре равно двенадцать
...
и т.д. до фразы
...
десять умножить на десять равно сто
*/

public class TaskC3 {
    public static void main(String[] args) {
        for (int i = 2, j = 2; j <= 10; j++) {
            int result = i * j;
            String a;
            String b;
            String c;
            switch (i) {
                case (2):
                    a = "два";
                    break;
                case (3):
                    a = "три";
                    break;
                case (4):
                    a = "четыре";
                    break;
                case (5):
                    a = "пять";
                    break;
                case (6):
                    a = "шесть";
                    break;
                case (7):
                    a = "семь";
                    break;
                case (8):
                    a = "восемь";
                    break;
                case (9):
                    a = "девять";
                    break;
                default:
                    a = "десять";
                    break;


            }
                switch (j)  {
                    case (2):
                        b = "два";
                        break;
                    case (3):
                        b = "три";
                        break;
                    case (4):
                        b = "четыре";
                        break;
                    case (5):
                        b = "пять";
                        break;
                    case (6):
                        b = "шесть";
                        break;
                    case (7):
                        b = "семь";
                        break;
                    case (8):
                        b = "восемь";
                        break;
                    case (9):
                        b = "девять";
                        break;
                    default:
                        b = "десять";
                        break;
                }
                switch (result){
                    case (2):
                        c = "два";
                        break;
                    case (3):
                        c = "три";
                        break;
                    case (4):
                        c = "четыре";
                        break;
                    case (5):
                        c = "пять";
                        break;
                    case (6):
                        c = "шесть";
                        break;
                    case (7):
                        c = "семь";
                        break;
                    case (8):
                        c = "восемь";
                        break;
                    case (9):
                        c = "девять";
                        break;
                    case (10):
                        c = "десять";
                        break;
                        case (12):
                        c = "двенадцать";
                            break;
                        case (14):
                        c = "четырнадцать";
                            break;
                        case (15):
                        c = "пятнадцать";
                            break;
                        case (16):
                        c = "шестнадцать";
                            break;
                        case (18):
                        c = "восемнадцать";
                            break;
                        case (20):
                        c = "двадцать";
                            break;
                        case (21):
                        c = "двадцать один";
                            break;
                        case (24):
                        c = "двадцать четыре";
                            break;
                        case (25):
                        c = "двадцать пять";
                            break;
                        case (27):
                        c = "двадцать семь";
                            break;
                        case (30):
                        c = "тридцать";
                            break;
                        case (32):
                        c = "тридцать два";
                            break;
                        case (28):
                        c = "двадцать восемь";
                            break;
                        case (36):
                        c = "тридцать шесть";
                            break;
                        case (35):
                        c = "тридцать пять";
                            break;
                        case (40):
                        c = "сорок";
                            break;
                        case (42):
                        c = "сорок два";
                            break;
                        case (45):
                        c = "сорок пять";
                            break;
                        case (48):
                        c = "сорок восемь";
                            break;
                        case (50):
                        c = "пятьдесят";
                            break;
                        case (49):
                        c = "сорок девять";
                            break;
                        case (54):
                        c = "пятьдесят четыре";
                            break;
                        case (56):
                        c = "пятьдесят шесть";
                            break;
                        case (60):
                        c = "шестьдесят";
                            break;
                        case (63):
                        c = "шестьдесят три";
                            break;
                        case (64):
                        c = "шестьдесят четыре";
                            break;
                        case (70):
                        c = "семьдесят";
                            break;
                        case (72):
                        c = "семьдесят два";
                            break;
                        case (80):
                        c = "восемьдесят";
                            break;
                        case (81):
                        c = "восемьдесят один";
                            break;
                        case (90):
                        c = "девяносто";
                            break;
                        default:
                        c = "сто";
                            break;
                }
            System.out.println(a + " умножить на " + b + " равно " + c);
           // System.out.println(i + "*" + j + "=" + result);
            if (j == 10) {
                i++;
                j = 1;
            }
            if (i == 11) {
                break;
            }
        }
    }
}
