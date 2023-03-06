import java.util.Scanner;

public class HipotenusBulma {
    public static void main(String[] args) {

        Scanner uzunluk = new Scanner(System.in);
        int kenar1, kenar2, hipotenus;

        System.out.print("1. Kenar Uzunluğu :");
        kenar1 = uzunluk.nextInt();

        System.out.print("2. Kenar Uzunluğu :");
        kenar2 = uzunluk.nextInt();

        hipotenus = (kenar1 * kenar1) + (kenar2 * kenar2);

        System.out.println("Hipotenüs :" + Math.sqrt(hipotenus));
    }
}
