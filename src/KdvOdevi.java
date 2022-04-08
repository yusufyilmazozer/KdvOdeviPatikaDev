import java.util.Scanner;

public class KdvOdevi {
    public static void main(String[] args) {

        double urunFiyati, kdvTutari;
        Scanner input = new Scanner(System.in);

        System.out.print("Ürün Fiyatını yazınız:");
        urunFiyati = input.nextDouble();

        /* kodun bu bölümünü baya fazla düşündüm bulamadım
        en sonunda discord sunucusundan yardım istedim ve nasıl
        yapabileceğim konusu anlatıldı ifade şu şekilde:

        int a = (10 == 10) ? 12 : 20;

        parantez içindeki koşul doğru ise a'nın değeri 12 olur. yanlış ise 20 olur. burada doğru olduğu için 12 olacak. buna ternary operatör diyoruz
        */

        int a = (urunFiyati <= 1000) ? 18 : 8;

        kdvTutari = (urunFiyati*a)/100;
        System.out.println("KDV`siz Fiyat " + urunFiyati);
        System.out.println("KDV`li Fiyat " + (kdvTutari+urunFiyati));
        System.out.println("KDV Tutarı " + kdvTutari);


    }
}
