import java.util.Scanner;

public class UcgenAlanHesapla {
    public static void main(String[] args) {
        Scanner uzunluk = new Scanner(System.in);

        int a, b, c, cevre, u, alan;

        System.out.print("1. Kenar Uzunluğunu Giriniz :");
        a = uzunluk.nextInt();
        System.out.print("1. Kenar Uzunluğunu Giriniz :");
        b = uzunluk.nextInt();
        System.out.print("1. Kenar Uzunluğunu Giriniz :");
        c = uzunluk.nextInt();

        cevre = a + b + c;
        System.out.println("Üçgenin Çevresi :" + cevre);

        u = cevre / 2;

        alan = u + (u - a) * (u + b) * (u - c);
        System.out.println("Üçgenin Alanı :" + Math.sqrt(alan));
    }
}