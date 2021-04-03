package appline.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите количество строк в массиве ");
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        if(row<1){System.out.println("Ввели неправильное количество строк");return;}
        System.out.println("Введите количество столбцов в массиве ");
        int column = in.nextInt();

        if(column<1){System.out.println("Ввели неправильное количество столбцов");return;}
        double[][] myArray = new double[row][column];
        for(int i=0;i<row;i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Введите [" + (i + 1) + "] [" + (j + 1) + "]" + " элемент массива");
                myArray[i][j] = in.nextDouble();
            }
        }
        System.out.println("Первая строка массива умноженная на 3: ");
        for(int j=0;j<column;j++){
            System.out.print(myArray[0][j]*3+" ");
        }
    }
}
