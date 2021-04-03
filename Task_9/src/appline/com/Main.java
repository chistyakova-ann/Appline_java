package appline.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов в массиве ");
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        double sum=0;
        if(len>=1) {
            double[] myArray = new double[len];
            for (int i = 0; i < len; i++) {
                System.out.println("Введите " + (i + 1) + " элемент массива");
                myArray[i] = in.nextDouble();
            }
            for (int i = 0; i < len; i++) {
                sum += myArray[i];
            }
            double average = sum / len;
            System.out.println("Массив: ");
            for (int i = 0; i < len; i++) {
                System.out.print(myArray[i] * average + " ");
            }
        }else{System.out.println("Ввели неправильное значение "); }
    }
}
