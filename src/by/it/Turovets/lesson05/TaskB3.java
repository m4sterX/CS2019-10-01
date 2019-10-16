package by.it.Turovets.lesson05;

/*
Минимум и максимум
1. Создать массив m на 10 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Отсортируйте массив любым способом
4. Выполните вычисление новых (после сортировки) индексов первого и последнего элемента
исходного массива и выведите их в виде:
Index of first element=???
Index of last element=???

Например, для такого ввода
123 99 88 77 66 5 4 3 0 2

ожидается такой вывод:
Index of first element=9
Index of last element=1

*/


import java.util.Scanner;



public class TaskB3 {
    public static void main(String[] args) {
        int[] m = new int[10];
        int[] h = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= m.length - 1; i++) {
            m[i] = sc.nextInt();
        }
        System.arraycopy(m,0,h,0,10);

        boolean b = true;
        while (b) {
            b = false;
            for (int i = 1; i < m.length; i++) {
                if (m[i] < m[i - 1]) {
                    swap(m, i, i - 1);
                    b=true;
                }
            }
        }
        Integer f = m[0];
        Integer l = m[m.length - 1];
        int indexNum1 = getArrayIndex(h,f);
        int indexNum2 = getArrayIndex(h,l);
        System.out.println("Index of first element="+indexNum1);
        System.out.println("Index of last element="+indexNum2);

    }

    public static void swap(int[] array, int s1, int s2) {
        int s3 = array[s1];
        array[s1] = array[s2];
        array[s2] = s3;
    }
    public static int getArrayIndex(int[] arr,int value) {

        int k=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]==value){
                k=i+1;
                break;
            }
        }
        return k;
    }
}
