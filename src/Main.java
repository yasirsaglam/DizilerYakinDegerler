import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] dizi = {56, -34, 15, 4, 8, 101, -2, -89};
        System.out.println("Dizi : " + Arrays.toString(dizi));
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int n = input.nextInt();
        int min = dizi[0];
        int max = dizi[0];
        Arrays.sort(dizi);
        for (int i : dizi) {
            if (i < n) {
                min = i;
            }
            if (i > n) {
                max = i;
                break;
            }
        }
        System.out.println("Küçük Yakın Değer : " + min);
        System.out.println("Büyük Yakın Değer : " + max);
    }
}
