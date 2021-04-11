package appline.com;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String str="I like Java!!!";

        boolean check_1=str.contains("Java");
//        if(check_1)System.out.println("Строка содержит \"Java\"");
//        else System.out.println("Строка не содержит \"Java\"");

        boolean check_2=str.startsWith("I like");
 //       if(check_2)System.out.println("Строка начинается с \"I like\"");
 //       else System.out.println("Строка не начинается с \"I like\"");

        boolean check_3=str.endsWith("!!!");
 //       if(check_3)System.out.println("Строка заканчивается на \"!!!\"");
 //       else System.out.println("Строка не заканчивается на\"!!!\"");

        if(check_1 && check_2 && check_3){
            System.out.println(str.toUpperCase(Locale.ROOT));
        }
        String result = str.replace("a",  "o");
        System.out.println(result.substring(7,11));
    }
}
