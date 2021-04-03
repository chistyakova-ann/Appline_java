package appline.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите целое положительное число");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n>=1) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 1) {
                    sum = sum + i;
                }
            }
            System.out.println("Сумма нечетных чисел до " + n + ": " + sum);
        }else {System.out.println("Ввели неверное значение");}
    }
}
