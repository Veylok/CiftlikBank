import java.util.Scanner;

public class Ciftlik3 implements VeriTabani{
    @Override
    public void calistir() {

        Ciftlik ciftlik = new Ciftlik(0, 0, 100, 8, "Tavuk Çiftliği");


        ciftlik.seriNumarasi.add(1);
        ciftlik.hayvanTipi.add("inek");
        ciftlik.yas.add(4);
        ciftlik.kilo.add(500);

        ciftlik.seriNumarasi.add(2);
        ciftlik.hayvanTipi.add("inek");
        ciftlik.yas.add(4);
        ciftlik.kilo.add(500);

        ciftlik.seriNumarasi.add(3);
        ciftlik.hayvanTipi.add("inek");
        ciftlik.yas.add(4);
        ciftlik.kilo.add(500);

        ciftlik.seriNumarasi.add(4);
        ciftlik.hayvanTipi.add("inek");
        ciftlik.yas.add(4);
        ciftlik.kilo.add(500);

        ciftlik.seriNumarasi.add(5);
        ciftlik.hayvanTipi.add("inek");
        ciftlik.yas.add(4);
        ciftlik.kilo.add(500);

        ciftlik.seriNumarasi.add(6);
        ciftlik.hayvanTipi.add("inek");
        ciftlik.yas.add(4);
        ciftlik.kilo.add(500);

        ciftlik.seriNumarasi.add(7);
        ciftlik.hayvanTipi.add("inek");
        ciftlik.yas.add(4);
        ciftlik.kilo.add(500);

        ciftlik.seriNumarasi.add(8);
        ciftlik.hayvanTipi.add("inek");
        ciftlik.yas.add(4);
        ciftlik.kilo.add(500);

        ciftlik.tavukDegeri();
        ciftlik.koyunYemMaliyetiGünlük();
        ciftlik.tavukYumurtaUretimi();



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
                    ciftlik.tavukEkle();
                    break;

                case "hayvanbilgileriniyazdır":
                    ciftlik.hayvanBilgileriniYazdır();
                    break;
                case "hayvançıkar":
                    ciftlik.tavukCikar();
                    break;
                case "bütünhayvanlarınbilgileriniyazdır":
                    ciftlik.bütünHayvanBilgileriniYazdır();
                    break;
                case "çiftlikbilgileriniyazdır":
                    ciftlik.ciflikBilgileriniYazdir();
                    break;
                case "hayvanbilgilerinideğiştir":
                    ciftlik.hayvanBilgileriniDegistir();
                    break;

            }

        }



    }
}
