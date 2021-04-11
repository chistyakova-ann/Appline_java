package appline.com;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double[] myArray = new double[15];
        final int min = -20;
        final int max = 20;
        double maxArray=-20;
        double minArray=20;
        double rnd=0;
        for (int i = 0; i < 15; i++) {
            do{
                rnd = rnd(min,max);
            } while(rnd>20 | rnd<-20);

           myArray[i]= rnd;
           System.out.println(myArray[i]);
        }
        for (int i = 0; i < 15; i++) {
            if(maxArray<= myArray[i]){
                maxArray = myArray[i];
            }
        }
        for (int i = 0; i < 15; i++) {
            if(minArray>= myArray[i]){
                minArray = myArray[i];
            }
        }
        System.out.println("Максимальное значение:");
        System.out.println(maxArray);
        System.out.println("Минимальное значение:");
        System.out.println(minArray);
        System.out.println("Максимальное зачение по модулю:");
        if(Math.abs(maxArray)>=Math.abs(minArray)){
            System.out.println(maxArray);
        }else{System.out.println(minArray);}
    }
    public static double rnd(int min, int max)
    {

        max -= min;
        return (Math.random() * ++max) + min;
    }
}
