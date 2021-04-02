package appline.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите что хотите перевести: 1 - масса, 2 - расстояние");
        Scanner in = new Scanner(System.in);
        int choose_1 = in.nextInt();
        int choose_2=0;
        double gramm=0,kilo=0,funt=0,unc=0;
        double metr=0,mile=0,yard=0,fut=0;
        if(choose_1==1){
                System.out.println("Выберите единицу измерения: 1 - грамм, 2 - килограмм, 3 - фунт, 4 - унция");
                 choose_2 = in.nextInt();
                switch (choose_2){
                    case 1:
                        System.out.println("Введите количество выбраных единиц");
                        gramm = in.nextDouble();
                        kilo=gramm/1000;
                        funt=kilo*2.20462;
                        unc=kilo*35.274;
                        break;
                    case 2:
                        System.out.println("Введите количество выбраных единиц");
                        kilo = in.nextDouble();
                        gramm=kilo*1000;
                        funt=kilo*2.20462;
                        unc=kilo*35.274;
                        break;
                    case 3:
                        System.out.println("Введите количество выбраных единиц");
                        funt = in.nextDouble();
                        gramm=funt*453.592;
                        kilo=gramm/1000;
                        unc=kilo*35.274;
                        break;
                    case 4:
                        System.out.println("Введите количество выбраных единиц");
                        unc = in.nextDouble();
                        gramm=unc*28.3495;
                        kilo=gramm/1000;
                        funt=kilo*2.20462;
                        break;
                    default:
                        System.out.println("Такой единицы измерения нет!");
                        return;
                }
            System.out.println("Результат:");
            System.out.printf("Граммы: %.5f\n",gramm);
            System.out.printf("Килограммы: %.5f\n",kilo);
            System.out.printf("Фунты: %.5f\n",funt);
            System.out.printf("Унции: %.5f\n",unc);
        } else if(choose_1==2){
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            choose_2 = in.nextInt();
            switch (choose_2){
                case 1:
                    System.out.println("Введите количество выбраных единиц");
                    metr = in.nextDouble();
                    mile=metr*0.000621371;
                    yard=metr*1.09361;
                    fut=metr*3.28084;
                    break;
                case 2:
                    System.out.println("Введите количество выбраных единиц");
                    mile = in.nextDouble();
                    metr=mile*1609.34;
                    yard=metr*1.09361;
                    fut=metr*3.28084;
                    break;
                case 3:
                    System.out.println("Введите количество выбраных единиц");
                    yard = in.nextDouble();
                    metr=yard*0.9144;
                    mile=metr*0.000621371;
                    fut=metr*3.28084;
                    break;
                case 4:
                    System.out.println("Введите количество выбраных единиц");
                    fut = in.nextDouble();
                    metr=fut*0.3048;
                    mile=metr*0.000621371;
                    yard=metr*1.09361;
                    break;
                default:
                    System.out.println("Такой единицы измерения нет!");
                    return;
            }
            System.out.println("Результат:");
            System.out.printf("Метры: %.5f\n",metr);
            System.out.printf("Мили: %.5f\n",mile);
            System.out.printf("Ярды: %.5f\n",yard);
            System.out.printf("Футы: %.5f\n",fut);
    }else {System.out.println("Выбрали неправильное значение!");}
    }
}
