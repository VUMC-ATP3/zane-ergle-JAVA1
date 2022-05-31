package homeworkTwo;

import java.util.Scanner;

// 2. uzdevums
public class Uzdevums2 {

    public static void risinajums() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet mēneša numuru no 1 - 12");
        int month = scanner.nextInt();
        String monthName = null;

        switch (month) {
            case 1:
                monthName = "Janvāris";
                break;
            case 2:
                monthName = "Februāris";
                break;
            case 3:
                monthName = "Marts";
                break;
            case 4:
                monthName = "Aprīlis";
                break;
            case 5:
                monthName = "Maijs";
                break;
            case 6:
                monthName = "Jūnijs";
                break;
            case 7:
                monthName = "Jūlijs";
                break;
            case 8:
                monthName = "Augusts";
                break;
            case 9:
                monthName = "Septembris";
                break;
            case 10:
                monthName = "Oktobris";
                break;
            case 11:
                monthName = "Novembris";
                break;
            case 12:
                monthName = "Decembris";
                break;
            default: monthName = "Mēneša numurs ievadīts nepareizi";
        }

        System.out.println(monthName);
    }
}
