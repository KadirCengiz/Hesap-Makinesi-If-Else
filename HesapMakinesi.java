import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {

        //Değişkenlerin tanımlanması.

        int n1, n2, select;

        //n1 ve n2 Sayısının girilmesi.

        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        //Seçme işleminin yapılması.

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        select = input.nextInt();

        //Hesaplama işlemlerinin yapılması.

        if (select == 1) {
            System.out.println("Toplam: " + (n1 + n2));
        } else if (select == 2) {
            System.out.println("Çıkarma: " + (n1 - n2));
        } else if (select == 3) {
            System.out.println("Çarpma: " + (n1 * n2));
        } else if (select == 4) {
            if (n2 != 0) ;
            System.out.println("Bölme: " + (n1 / n2));
        }
        else{
        System.out.println("Seçim hatası yaptınız. Yeniden deneyiniz.");
        }

        System.out.println("Program bitti.");
    }
}




