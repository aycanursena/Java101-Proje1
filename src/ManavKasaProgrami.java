import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);

        double armutFiyat, elmaFiyat, domatesFiyat, muzFiyat, patlicanFiyat, miktar, odenecekTutar;
        double armut, elma, domates, muz, patlican;
        armutFiyat = 2.14;
        elmaFiyat = 3.67;
        domatesFiyat = 1.11;
        muzFiyat = 0.95;
        patlicanFiyat = 5.00;

        System.out.print("Alınan Armut Miktarı (kg) :");
        miktar = veri.nextDouble();
        armut = armutFiyat * miktar;

        System.out.print("Alınan Elma Miktarı (kg) :");
        miktar = veri.nextDouble();
        elma = elmaFiyat * miktar;

        System.out.print("Alınan Domates Miktarı (kg) :");
        miktar = veri.nextDouble();
        domates = domatesFiyat * miktar;

        System.out.print("Alınan Muz Miktarı (kg) :");
        miktar = veri.nextDouble();
        muz = muzFiyat * miktar;

        System.out.print("Alınan Patlıcan Miktarı (kg) :");
        miktar = veri.nextDouble();
        patlican = patlicanFiyat * miktar;

        odenecekTutar = armut + elma + domates +muz + patlican;
        System.out.println("Ödenecek Tutar :" + odenecekTutar);
    }
}