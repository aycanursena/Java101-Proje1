import java.util.Scanner;
public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {

        Scanner not = new Scanner(System.in);
        int matematik, fizik, kimya, türkçe, tarih, müzik;
        float ortalama;
        System.out.print("Matematik dersi notunuz :");
        matematik = not.nextInt();

        System.out.print("Fizik dersi notunuz:");
        fizik = not.nextInt();

        System.out.print("Kimya dersi notunuz:");
        kimya = not.nextInt();

        System.out.print("Türkçe dersi notunuz:");
        türkçe = not.nextInt();

        System.out.print("Tarih dersi notunuz:");
        tarih = not.nextInt();

        System.out.print("Müzik dersi notunuz:");
        müzik = not.nextInt();

        ortalama = (fizik + kimya + türkçe + tarih + müzik + matematik) / 6;
        System.out.println("Not ortalamanız : " + ortalama);
        System.out.println(ortalama > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");
    }
}
