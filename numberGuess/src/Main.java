import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);
        System.out.println(number);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWrong = false;
        boolean isWin = false;

        while (right < 5) {
            System.out.print("Lütfen tahmininizi giriniz : ");
            selected = input.nextInt();

            if (selected < 0 || selected > 100) {
                System.out.print("Lütfen 0 ile 100 arasında bir değer giriniz!!");
                if (isWrong) {
                    right++;
                    System.out.print("Çok fazla hatalı giriş yaptınız. Kalan hakkınız" + (5 - right));
                } else {
                    System.out.print("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");

                }
                continue;
            }
            if (selected == number) {
                System.out.print("Tebrikler. Girdiğiniz sayı doğrudur. " + number);
                break;
            } else {
                System.out.println("Hatalı bir sayı girdiniz !");
                if (selected > number) {
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
                }

                wrong[right++] = selected;
                System.out.println("Kalan hakkı : " + (5 - right));

            }
            if (!isWin && isWrong) {
                System.out.println("Kaybettiniz ! ");
                if (!isWrong) {
                    System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
                }

            }
        }
    }
}