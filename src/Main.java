import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        List<BörsiHind> börsiHindList = loeHinnad("Börs.txt");
        for (BörsiHind hind : börsiHindList) {
            System.out.println(hind);

        }
    }

    public static List<BörsiHind> loeHinnad(String failinimi) throws Exception {
        List<BörsiHind> börsiHindList  = new ArrayList<>();
        try(Scanner sc = new Scanner(new File(failinimi))) {
            while (sc.hasNextLine()) {
                String[] rida = sc.nextLine().split(" ");
                String kellaaegStr = rida[2].replace(",", "");
                String kuupäev = rida[1];
                int tund = LocalTime.parse(kellaaegStr).getHour();
                double hind = Double.parseDouble(rida[4]);
                BörsiHind börsiHind1 = new BörsiHind(kuupäev, tund, hind);
                börsiHindList.add(börsiHind1);

            }
        }
        return börsiHindList;
    }
}