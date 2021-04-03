package appline.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String x="123";
        final String y="java";
        final String z="anna";
        boolean flag=false;
        System.out.println("Введите количество элементов в массиве ");
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String[] myArray = new String[len];
        for(int i=0;i<len;i++){
            System.out.println("Введите "+(i+1)+" элемент массива");
            myArray[i]=in.next();
        }
        for(int i=0;i<len;i++) {
            if(myArray[i].equals(x)||myArray[i].equals(y)||myArray[i].equals(z)){
                flag=true;
            }
        }
        if(flag)
        System.out.println("Данное значение имеется в константах");
    }
}
