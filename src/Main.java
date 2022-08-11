import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVui long nhap chi so cua mot phan tu bat ky:");
        int x = scanner.nextInt();
        try {
            System.out.println("gia tri cua phan tu co chi so 5"+ x + "la: "+ arr[x]);

        }catch (IndexOutOfBoundsException e){
            System.out.println("chi so vuot qua gioi han cua mang");
        }
    }
}
