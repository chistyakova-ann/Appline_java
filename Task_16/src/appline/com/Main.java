package appline.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите уравнение: ");
        Scanner in = new Scanner(System.in);
        String equation = in.next();
        String[] myArray=equation.split("");
int answer=0;
        if(myArray[1].equals("+")){
            if(myArray[0].equals("x")){

        int number_4=Integer.parseInt(myArray[4]);
        int number_2=Integer.parseInt(myArray[2]);
        answer=number_4-number_2;
                System.out.print("Вывод: "+answer);
            }else if(myArray[2].equals("x")){
                int number_4=Integer.parseInt(myArray[4]);
                int number_0=Integer.parseInt(myArray[0]);
                answer=number_4-number_0;
                System.out.print("Вывод: "+answer);
            }else if(myArray[4].equals("x")){
                int number_0=Integer.parseInt(myArray[0]);
                int number_2=Integer.parseInt(myArray[2]);
                answer=number_0+number_2;
                System.out.print("Вывод: "+answer);
            }else{System.out.print("Что-то неверно");}

        }else if(myArray[1].equals("-")){
            if(myArray[0].equals("x")){

                int number_4=Integer.parseInt(myArray[4]);
                int number_2=Integer.parseInt(myArray[2]);
                answer=number_4+number_2;
                System.out.print("Вывод: "+answer);
            }else if(myArray[2].equals("x")){
                int number_4=Integer.parseInt(myArray[4]);
                int number_0=Integer.parseInt(myArray[0]);
                answer=number_0-number_4;
                System.out.print("Вывод: "+answer);
            }else if(myArray[4].equals("x")){
                int number_0=Integer.parseInt(myArray[0]);
                int number_2=Integer.parseInt(myArray[2]);
                answer=number_0-number_2;
                System.out.print("Вывод: "+answer);
            }else{System.out.print("Что-то неверно");}
        }else{System.out.print("Неверный знак");}
    }
}
