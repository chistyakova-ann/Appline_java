package appline.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Отгадайте загадку: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();
        String str="Заархивированный вирус";
        String str1="Подсказка";
        int i=0;

        while(i<2){
            if(answer.equals(str)){
                System.out.println("Правильно!");
                return;
            }else if(answer.equals(str1) & i==0){
                System.out.println("Введите: Заархивированный вирус");
                answer = in.nextLine();
                if(answer.equals(str)){
                    System.out.println("Правильно!");
                    return;
                }else{
                    System.out.println("Обидно, приходи в другой раз");return;
                }

            }else{  System.out.println("Подумай еще!");
               answer = in.nextLine();
               i++;
                if(answer.equals(str1) & i>=1){
                    System.out.println("Подсказка уже недоступна");
                    answer = in.nextLine();
                }

                if(i==2 & answer.equals(str)){
                    System.out.println("Правильно!");
                    return;
                }

           }

        }

        if(i>=2){
            System.out.println("Обидно, приходи в другой раз");
        }
    }
}
