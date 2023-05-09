import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan sınav notlarını isteyin
        System.out.print("Matematik sınav puanınız: ");
        int matematik = scanner.nextInt();

        System.out.print("Fizik sınav puanınız: ");
        int fizik = scanner.nextInt();

        System.out.print("Kimya sınav puanınız: ");
        int kimya = scanner.nextInt();

        System.out.print("Türkçe sınav puanınız: ");
        int turkce = scanner.nextInt();

        System.out.print("Tarih sınav puanınız: ");
        int tarih = scanner.nextInt();

        System.out.print("Müzik sınav puanınız: ");
        int muzik = scanner.nextInt();

        // Sınav notlarının ortalamasını hesaplayın
        int toplam = matematik + fizik + kimya + turkce + tarih + muzik;
        double ortalama = toplam / 6.0;

        // Ortalamayı ekrana yazdırın
        System.out.println("Ortalamanız: " + ortalama);

        // Ortalama 60'tan büyükse "Sınıfı Geçti" yazdırın, aksi takdirde "Sınıfta Kaldı" yazdırın
        String sonuc = (ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sonuc);
    }
}