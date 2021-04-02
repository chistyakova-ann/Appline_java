package appline.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int x=5;
        final int y=9;
        final int z=87;
        boolean flag=false;
        System.out.println("Введите количество элементов в массиве ");
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] myArray = new int[len];
        for(int i=0;i<len;i++){
            System.out.println("Введите "+(i+1)+" элемент массива");
            myArray[i]=in.nextInt();
        }
        for(int i=0;i<len;i++) {
            if (myArray[i] == x || myArray[i] == y || myArray[i] == z) {
                flag=true;
            }
        }
        if(flag)
        System.out.println("Данное значение имеется в константах");
    }
}
