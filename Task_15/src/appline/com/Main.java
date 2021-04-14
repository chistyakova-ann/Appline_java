package appline.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Курс доллара: ");
        Scanner in = new Scanner(System.in);
        double dollar = in.nextDouble();
        System.out.println("Количество рублей: ");
        double rub=in.nextDouble();
        double convert=rub/dollar;
        System.out.printf("%s %.2f","Итого:",convert);


    }
}
