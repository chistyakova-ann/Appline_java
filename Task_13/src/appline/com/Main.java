package appline.com;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите строку");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] myArray=str.split(" ");
        int col=0;
        System.out.println("Слова на латинице: ");
        for(int i=0;i<myArray.length;i++){
           if(myArray[i].matches("^[a-zA-Z]+$")){
               System.out.println(myArray[i]);
               col++;
           }
        }
        System.out.println("Количество слов на латинице: "+col);
    }
}
