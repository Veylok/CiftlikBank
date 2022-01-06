import java.util.Scanner;

public class Ciftlik2 implements VeriTabani{
    @Override
    public void calistir() {

        Ciftlik ciftlik2 = new Ciftlik(0, 0, 0, 8, "Koyun Çiftliği");


        ciftlik2.seriNumarasi.add(1);
        ciftlik2.hayvanTipi.add("koyun");
        ciftlik2.yas.add(6);
        ciftlik2.kilo.add(100);

        ciftlik2.seriNumarasi.add(2);
        ciftlik2.hayvanTipi.add("koyun");
        ciftlik2.yas.add(6);
        ciftlik2.kilo.add(80);

        ciftlik2.seriNumarasi.add(3);
        ciftlik2.hayvanTipi.add("koyun");
        ciftlik2.yas.add(6);
        ciftlik2.kilo.add(70);

        ciftlik2.seriNumarasi.add(4);
        ciftlik2.hayvanTipi.add("koyun");
        ciftlik2.yas.add(6);
        ciftlik2.kilo.add(100);

        ciftlik2.seriNumarasi.add(5);
        ciftlik2.hayvanTipi.add("koyun");
        ciftlik2.yas.add(6);
        ciftlik2.kilo.add(90);

        ciftlik2.seriNumarasi.add(6);
        ciftlik2.hayvanTipi.add("koyun");
        ciftlik2.yas.add(6);
        ciftlik2.kilo.add(80);

        ciftlik2.seriNumarasi.add(7);
        ciftlik2.hayvanTipi.add("koyun");
        ciftlik2.yas.add(6);
        ciftlik2.kilo.add(120);

        ciftlik2.seriNumarasi.add(8);
        ciftlik2.hayvanTipi.add("koyun");
        ciftlik2.yas.add(6);
        ciftlik2.kilo.add(100);

        ciftlik2.koyunDegeri();
        ciftlik2.koyunYemMaliyetiGünlük();
        ciftlik2.sütKoyunÜretimiGünlük();


        String islem = null;
        Scanner scan = new Scanner(System.in);


        while (1 > 0) {
            System.out.println("");
            System.out.println("Yapmak istediğiniz işlem nedir");
            System.out.println("Yapabileceğiniz işlemler: ");
            System.out.println("hayvanekle-hayvançıkar-hayvanbilgilerinideğiştir");
            System.out.println("çiftlikbilgileriniyazdır-hayvanbilgileriniyazdır-bütünhayvanlarınbilgileriniyazdır");

            islem = scan.next();

            switch (islem) {
                case "hayvanekle":
                    ciftlik2.koyunEkle();
                    break;

                case "hayvanbilgileriniyazdır":
                    ciftlik2.hayvanBilgileriniYazdır();
                    break;
                case "hayvançıkar":
                    ciftlik2.koyunCıkar();
                    break;
                case "bütünhayvanlarınbilgileriniyazdır":
                    ciftlik2.bütünHayvanBilgileriniYazdır();
                    break;
                case "çiftlikbilgileriniyazdır":
                    ciftlik2.ciflikBilgileriniYazdir();
                    break;
                case "hayvanbilgilerinideğiştir":
                    ciftlik2.hayvanBilgileriniDegistir();
                    break;

            }

        }



    }
}
