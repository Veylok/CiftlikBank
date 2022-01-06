import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        String islem = null;
        Scanner scan = new Scanner(System.in);
        Ciftlik1 ciftlik1 = new Ciftlik1();
        Ciftlik2 ciftlik2 = new Ciftlik2();
        Ciftlik3 ciftlik3 = new Ciftlik3();


        while (0<1){
            System.out.println("");
            System.out.println("Yapmak istediğiniz işlem nedir");
            System.out.println("Yapabileceğiniz işlemler: ");
            System.out.println("Çiftlik1aç-Çiftlik2aç-Çiftlik3aç");
            islem = scan.next();

            switch (islem) {
                case "Çiftlik1aç" :
                    ciftlik1.calistir();
                case "Çiftlik2aç" :
                    ciftlik2.calistir();
                case "Çiftlik3aç" :
                    ciftlik3.calistir();
            }
        }
    }
}




