package homeworkTwo;

import java.util.Scanner;

// 4. uzdevums
public class Uzdevums4 {
    public static void risinajums() {

        Scanner c = new Scanner(System.in);
        System.out.println("Kāda krāsa deg luksaforā? ");
        String color = c.nextLine();

        if (color.equalsIgnoreCase("zaļa")) {
            System.out.println("Gājējs Šķērso ielu.");
        }
        else if (color.equalsIgnoreCase("dzeltena")) {
            System.out.println("Gājējs gatavojas sķērsot ielu.");
        }
        else if (color.equalsIgnoreCase("sarkana")) {
            System.out.println("Gājējs gaida zaļo signālu, lai šķērsotu ielu");
        }
        else if (!color.equals("zaļa") || !color.equals("dzeltena") || !color.equals("sarkana")) {
            System.out.println("Luksafors nedarbojas (vai norādīta nepareiza krāsa). Gājējam jānovērtē satiksme un jāšķērso ielu, kad tas ir iespējams.");
        }
    }
}
