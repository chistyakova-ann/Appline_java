package appline.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num_1 = in.nextInt();
        System.out.println("Введите второе число: ");
        int num_2 = in.nextInt();
        System.out.println("Введите третье число: ");
        int num_3 = in.nextInt();
        double average=(double)(num_1+num_2+num_3)/3;
        System.out.println("Среднее арифметическое: "+average);
        int average_round=(int)average/2;
        if(average_round>3){
        System.out.println("Программа выполнена корректно");}
    }
}
