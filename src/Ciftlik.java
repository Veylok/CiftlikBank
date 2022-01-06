import java.util.ArrayList;
import java.util.Scanner;

public class Ciftlik extends CiftlikBank  {

    public Ciftlik(double gelir, double gider, int degeri, int hayvansayisi, String ciftlikAdı) {
        super(gelir, gider, degeri, hayvansayisi, ciftlikAdı);
    }
    ArrayList<Integer> seriNumarasi = new ArrayList<Integer>();
    ArrayList<String> hayvanTipi = new ArrayList<String>();
    ArrayList<Integer> yas = new ArrayList<Integer>();
    ArrayList<Integer> kilo = new ArrayList<Integer>();
    final int inekDegeri=15000;
    final int koyunDegeri=750;
    final int tavukDegeri=35;
    final int inekYemMaliyeti=23; //günlük
    final int koyunYemMaliyeti=2; //günlük
    final double tavukYemMaliyeti= 0.1; //günlük
    static int inekSutÜretimMiktari=4;   //günlük
    static int koyunSutÜretimi=2;  //günlük
    static int tavuKYumurtaÜretimi=1; //günlük




    public void inekEkle() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hayvan eklemek için bilgilerini giriniz ");
        System.out.println("Mevcut hayvan sayısı: "+hayvansayisi);

        System.out.println("Hayvanın Seri numarasi");
        int numara = scan.nextInt();
        seriNumarasi.add(numara);

        System.out.println("Hayvanın tipi");
        String tipi = scan.next();
        hayvanTipi.add(tipi);

        System.out.println("Hayvanın yasi");
        int yasi = scan.nextInt();
        yas.add(yasi);

        System.out.println("Hayvanın kilosu");
        int kilosu = scan.nextInt();
        kilo.add(kilosu);

        hayvansayisi++;
        degeri=degeri+inekDegeri;
        gider=gider+inekYemMaliyeti;
        gelir=gelir+sütİnekÜretimiGünlük()/hayvansayisi;
    }
    public void koyunEkle() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hayvan eklemek için bilgilerini giriniz ");
        System.out.println("Mevcut hayvan sayısı: "+hayvansayisi);

        System.out.println("Hayvanın Seri numarasi");
        int numara = scan.nextInt();
        seriNumarasi.add(numara);

        System.out.println("Hayvanın tipi");
        String tipi = scan.next();
        hayvanTipi.add(tipi);

        System.out.println("Hayvanın yasi");
        int yasi = scan.nextInt();
        yas.add(yasi);

        System.out.println("Hayvanın kilosu");
        int kilosu = scan.nextInt();
        kilo.add(kilosu);

        hayvansayisi++;
        degeri=degeri+koyunDegeri;
        gider=gider+koyunYemMaliyeti;
    }
    public void tavukEkle() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hayvan eklemek için bilgilerini giriniz ");
        System.out.println("Mevcut hayvan sayısı: "+hayvansayisi);

        System.out.println("Hayvanın Seri numarasi");
        int numara = scan.nextInt();
        seriNumarasi.add(numara);

        System.out.println("Hayvanın tipi");
        String tipi = scan.next();
        hayvanTipi.add(tipi);

        System.out.println("Hayvanın yasi");
        int yasi = scan.nextInt();
        yas.add(yasi);

        System.out.println("Hayvanın kilosu");
        int kilosu = scan.nextInt();
        kilo.add(kilosu);

        hayvansayisi++;
        degeri=degeri+tavukDegeri;
        gider=  (gider+tavukYemMaliyeti);
    }
    public void inekCıkar(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Çıkarmak istediğiniz hayvanı liste sırasına göre seçiniz");
        bütünHayvanBilgileriniYazdır();
        int i = scan.nextInt();
        i--;
        seriNumarasi.remove(i);
        hayvanTipi.remove(i);
        kilo.remove(i);
        yas.remove(i);

        hayvansayisi--;
        degeri=degeri-inekDegeri;
        gider=gider-inekYemMaliyeti;

    }
    public void koyunCıkar(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Çıkarmak istediğiniz hayvanı liste sırasına göre seçiniz");
        bütünHayvanBilgileriniYazdır();
        int i = scan.nextInt();
        i--;
        seriNumarasi.remove(i);
        hayvanTipi.remove(i);
        kilo.remove(i);
        yas.remove(i);

        hayvansayisi--;
        degeri=degeri-koyunDegeri;
        gider=gider-koyunYemMaliyeti;

    }
    public void tavukCikar(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Çıkarmak istediğiniz hayvanı liste sırasına göre seçiniz");
        bütünHayvanBilgileriniYazdır();
        int i = scan.nextInt();
        i--;
        seriNumarasi.remove(i);
        hayvanTipi.remove(i);
        kilo.remove(i);
        yas.remove(i);

        hayvansayisi--;
        degeri=degeri-tavukDegeri;
        gider=gider-tavukYemMaliyeti;

    }
    public void bütünHayvanBilgileriniYazdır(){
        for (int i=0; i<seriNumarasi.size();i++) {
            System.out.println("Hayvanın seri numarası: " + seriNumarasi.get(i));
            System.out.println("Hayvann tipi: " + hayvanTipi.get(i));
            System.out.println("Hayvanın kilosu: " + kilo.get(i));
            System.out.println("Hayvanın yaşı: " + yas.get(i));
        }
    }
    public void hayvanBilgileriniYazdır() {
        System.out.println("Bilgisini görmek istediğiniz hayvanın seri numarasını giriniz");
        System.out.println("Var olan hayvan sayısı "+hayvansayisi+ " hayvan sayisindan yüksek bir seri numarası giremezsiniz");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        i--;
        System.out.println("Hayvanın seri numarası: " + seriNumarasi.get(i));
        System.out.println("Hayvann tipi: " + hayvanTipi.get(i));
        System.out.println("Hayvanın kilosu: " + kilo.get(i));
        System.out.println("Hayvanın yaşı: " + yas.get(i));

    }
    public void hayvanBilgileriniDegistir(){
        System.out.println("Değiştirmek istediğiniz hayvanı liste sırasına göre seçiniz");
        bütünHayvanBilgileriniYazdır();
        Scanner scan = new Scanner(System.in);
        int numara = scan.nextInt();
        numara--;
        System.out.println("Hayvanın Seri numarasi");
        int serino= scan.nextInt();
        seriNumarasi.set(numara,serino);

        System.out.println("Hayvanın tipi");
        String tipi = scan.next();
        hayvanTipi.set(numara,tipi);

        System.out.println("Hayvanın yasi");
        int yasi = scan.nextInt();
        yas.set(numara,yasi);

        System.out.println("Hayvanın kilosu");
        int kilosu = scan.nextInt();
        kilo.set(numara,kilosu);

    }

    public void ciflikBilgileriniYazdir() {
        System.out.println("Çifliğin geliri: " + this.gelir);
        System.out.println("Çifliğin gideri: " + this.gider);
        System.out.println("Çifliğin değeri: " + this.degeri);
        System.out.println("Çiflikliğin hayvan sayisi: " + this.hayvansayisi);
        System.out.println("Çiftliğin adı: " + this.ciftlikAdı);
    }
    public double sütİnekÜretimiGünlük(){
        int inekSayisi=seriNumarasi.size();
        // çiğ sütün satış fiyatı 4TL'dir
        return gelir= gelir+ inekSayisi*4*inekSutÜretimMiktari; // 1 hayvanın günlük ürettiği süt ile 100Tl kazanç sağlanıyor
        }
    public double inekYemMaliyetiGünlük(){
        int inekSayisi= seriNumarasi.size();
        // bir ineğin günlük yem maliyeti 23tldir.a
        return this.gider = gider+ inekSayisi*inekYemMaliyeti;
    }
    public double inekDegeri(){
        int inekSayisi= seriNumarasi.size();
        // bir ineğin değeri 15.000Tldir
        return  (this.degeri =  inekSayisi*inekDegeri);
    }
    public double sütKoyunÜretimiGünlük(){
        int koyunSayisi= seriNumarasi.size();
        // bir koyunun çiğ süt değeri 5tl'dir
        return gelir = gelir + koyunSayisi*5*koyunSutÜretimi;
    }
    public double koyunYemMaliyetiGünlük(){
        int koyunSayisi= seriNumarasi.size();
        // bir ineğin günlük yem maliyeti 23tldir.
        return this.gider = gider+ koyunSayisi*koyunYemMaliyeti;
    }
    public double koyunDegeri(){
        int koyunSayisisi= seriNumarasi.size();
        //bir koyunun değeri 700tl'dir
        return this.gelir = gelir +koyunSayisisi*koyunDegeri;
    }
    public double tavukDegeri(){
        int tavukSayisi= seriNumarasi.size();
        //bir tavuğun değeri 35tl'dir
        return this.gelir =gelir+tavukSayisi*tavukDegeri;
    }
    public double tavukYumurtaUretimi(){
        int tavukSayisi= seriNumarasi.size();
        //bir tavuğun yumurta değeri 0.80'TLdir
        return this.gelir =gelir*tavukSayisi*0.80;
    }
    public double tavukYemMaliyetiGünlük(){
        int tavukSayisi=seriNumarasi.size();
        //bir tavuğın günlük yem maliyeti 0.1'TLdir
        return gider=gider+tavukSayisi*tavukYemMaliyeti;
    }
}

