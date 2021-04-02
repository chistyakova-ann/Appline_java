package appline.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double x = in.nextDouble();
        System.out.println("Введите второе число: ");
        double y = in.nextDouble();
        System.out.println("Введите третье число: ");
        double z = in.nextDouble();
        double average=(x+y+z)/3;
        System.out.println("Среднее арифметическое: "+average);
        int average_round= (int) Math.floor(average/2);
        if(average_round>3){
        System.out.println("Программа выполнена корректно");}
    }
}
