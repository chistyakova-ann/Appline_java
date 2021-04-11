package appline.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner in = new Scanner(System.in);
        String first_number = in.next();
        System.out.println("Введите второе число");
        int second_number = in.nextInt();
        int first_number_int = Integer.parseInt(first_number);
        if(first_number_int>second_number){
            System.out.println("Большее число: "+first_number_int);
            System.out.println("Меньшее число: "+(double)second_number);

        }else if(first_number_int<second_number){
            System.out.println("Большее число: "+second_number);
            System.out.println("Меньшее число: "+(double)first_number_int);

        }else{System.out.println("Значения равны: "+(double)second_number);}
    }

}
