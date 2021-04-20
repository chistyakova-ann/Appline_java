package appline.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите количество строк: ");
        Scanner in = new Scanner(System.in);
        int kol = in.nextInt();
        String[] str=new String[kol];
        int [] kol_unique= new int[kol];
        int max=0;
        String max_string=null;
        int [] count=new int[kol];
        for (int i=0;i<kol;i++){
            System.out.print("Введите "+(i+1)+" строку: ");
            str[i]= in.next();
           String [] str_spl=str[i].split("");
            boolean flag=false;

            for(int j=0;j<str[i].length();j++){
                ++kol_unique[i];
                for(int k=j+1; k<str_spl.length;k++){
                    if(str_spl[k].equals(str_spl[j])){
                       ++count[i];
                       break;
                    }
                }
                }

kol_unique[i]=kol_unique[i]-count[i];
//System.out.println(kol_unique[i]);
if(kol_unique[i]>max){
    max=kol_unique[i];
    max_string=str[i];
}
        }
        System.out.println(max_string);
    }


}
