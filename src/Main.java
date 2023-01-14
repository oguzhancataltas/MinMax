import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number, small, large, number1;

        System.out.print("Kaç Tane Sayı Gireceksiniz : ");
        number = input.nextInt();

        System.out.print("1. Sayıyı Giriniz : ");
        number1 = input.nextInt();

        small = number1;
        large = number1;

        for (int i = 2; i <= number; i++) {
            System.out.print(i + ". Sayıyı Giriniz : ");
            number1 = input.nextInt();

            if (small > number1) {
                small = number1;
            }
            if (large < number1) {
                large = number1;
            }
        }

        System.out.println("En Büyük Sayı : " + large);
        System.out.println("En Küçük Sayı : " + small);
    }
}
