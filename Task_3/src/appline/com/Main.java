package appline.com;

public class Main {
    public static void main(String[] args) {
        int[] mass = new int[] {10,125,45,7,5};
        int first_element=mass[0];
        int last_element=mass[mass.length-1];
        mass[0]=last_element;
        mass[mass.length-1]=first_element;
        int middle_element=mass[(mass.length-1)/2];
        int sum=mass[0]+middle_element;
        System.out.println("Сумма первого и средего элеметов массива: "+sum);
    }
}
