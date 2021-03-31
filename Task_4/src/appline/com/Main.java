package appline.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int x = in.nextInt();
        System.out.println("Введите второе число: ");
        int y = in.nextInt();
        System.out.println("Введите третье число: ");
        int z = in.nextInt();
        double average=(double)(x+y+z)/3;
        System.out.println("Среднее арифметическое: "+average);
        int average_round=(int)average/2;
        if(average_round>3){
        System.out.println("Программа выполнена корректно");}
    }
}
