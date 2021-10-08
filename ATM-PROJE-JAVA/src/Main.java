import java.awt.*;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static String secim2; //her yerden ulasilabilir
    public static Object ArrayList;
    public static String devam;
    public static String evet;
    public static String hayir;
    public static int hesaptakiPara;
    public static int paraYatirma;
    public static int paracekme;
    public static int paragonderme;
    public static int yatirilacakPara;
    public static int cekilecekpara;
    public static int gonderilecekmiktar;
    public static String[] musteriIsimleri = {"ayse", "eda", "ali", "ahmet", "demir"};
    public static String[] musteriSoyadlari = {"yildirim", "yildiz", "yilmaz", "bulut", "celik"};
    public static int[] sifreler = {1, 2, 3, 4, 5};
    public static int[] paralar = {1000, 2000, 3000, 4000, 5000};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //kayitli musteri isimleri ve sifreleri

        System.out.println("adinizi giriniz:");
        String isim1 = scanner.nextLine();
        System.out.println("soyadinizi giriniz:");
        String soyad1 = scanner.nextLine();
        System.out.println("sifrenizi giriniz:");
        int sifre1 = scanner.nextInt();
        for (int i = 0; i < musteriIsimleri.length; i++) {
            if (musteriIsimleri[i].equals(isim1) &&
                    musteriSoyadlari[i].equals(soyad1) && sifreler[i] == sifre1) {
                System.out.println("bu isimde ve bu sifrede bir musteri var!");
                break;
            }
        }

        System.out.println("bankaya hosgeldiniz:");
        System.out.println(" **menu**");
        System.out.println("yapmak istediginiz islemi seciniz:");
        System.out.println("1)hesaptaki parayi sorgulama 2)para yatirma 3)para cekme 4)para gonderme");
        int secim = scanner.nextInt();
        switch (secim) {
            case 1:
                hesaptakiPara();
                break;
            case 2:
                paraYatirma();
                break;
            case 3:
                paracekme();
                break;
            case 4:
                paragonderme();
                break;
        }
    }

            public static void hesaptakiPara () {
                Scanner scanner = new Scanner(System.in);
                System.out.println("adinizi tekrar giriniz: ");
                String isim1 = scanner.nextLine();
                System.out.println("sifrenizi tekrar giriniz: ");
                int sifre1 = scanner.nextInt();
                for (int i = 0; i < musteriIsimleri.length; ++i) {
                    if (sifre1 == sifreler[i] && isim1.equals(musteriIsimleri[i])) {
                        System.out.printf(musteriIsimleri[i] + " kisisinin hesabindaki para miktari: " + paralar[i]);
                        return;
                    }
                }
            }
            public static void paraYatirma () {

                Scanner scanner = new Scanner(System.in);
                System.out.println("adinizi tekrar giriniz: ");
                String isim1 = scanner.nextLine();
                System.out.println("sifrenizi tekrar giriniz: ");

                int sifre1 = scanner.nextInt();
                for (int i = 0; i < musteriIsimleri.length; i++) {
                    if (isim1.equals(musteriIsimleri[i]) && sifre1 == sifreler[i]) {
                        do{
                        System.out.println("ne kadar para yatiracaksiniz?");
                        yatirilacakPara = scanner.nextInt();
                        }while (yatirilacakPara<0);
                        paralar[i] = paralar[i] + yatirilacakPara;

                        System.out.println(musteriIsimleri[i] + " in hesabina " +
                                yatirilacakPara + " yatirildi." + "toplam para " + paralar[i] + " tl oldu. ");}
                    }
                }


            //String devam=scanner.nextLine();
            public static void paracekme () {
                Scanner scanner = new Scanner(System.in);
                System.out.println("adinizi tekrar giriniz: ");
                String isim1 = scanner.nextLine();
                System.out.println("sifresinizi tekrar giriniz: ");
                int sifre1 = scanner.nextInt();
                for (int i = 0; i < musteriIsimleri.length; i++) {
                    if (sifre1 == sifreler[i] && isim1.equals(musteriIsimleri[i])) {
                        System.out.println("ne kadar para cekeceksiniz?");
                        cekilecekpara = scanner.nextInt();
                        paralar[i] = paralar[i] - cekilecekpara;
                        System.out.println("hesabinizdan " + cekilecekpara + " tl para cektiniz. Kalan miktar " + paralar[i]);
                        return;
                    }
                }
            }
            public static void paragonderme () {
                Scanner scanner = new Scanner(System.in);
                System.out.println("adinizi tekrar giriniz: ");
                String isim1 = scanner.nextLine();
                System.out.println("sifresinizi tekrar giriniz: ");
                int sifre1 = scanner.nextInt();
                for (int i = 0; i < musteriIsimleri.length; i++) {
                    System.out.println("ne kadar para gondereceksiniz?");
                    int gonderilecekmiktar = scanner.nextInt();
                    paralar[i] = paralar[i] - gonderilecekmiktar;
                    System.out.println(gonderilecekmiktar + " tl gonderildi. sizin kalan paraniz: " + paralar[i] + "");
                    String devam = scanner.nextLine();
                    if (devam.equals(hayir)) return;
                }
            }


    }
