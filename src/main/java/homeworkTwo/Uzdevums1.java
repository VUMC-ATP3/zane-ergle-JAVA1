package homeworkTwo;

// 1. uzdevums
public class Uzdevums1 {

    public static void risinajums() {

        int x = 6;

        // a. mainīgā vērtība lielāka par 0
        System.out.println(x > 0); // true

        // b. mainīgā vērtība ir negatīva
        System.out.println(x < 0); // false

        // c. mainīgais lielāks par 5 un mazāks vai vienāds ar 10
        System.out.println((x > 5) && (x <= 10)); // true

        // d. mainīgais mazāks vai vienāds ar 5 un mainīgais ir mazāks par 10
        x = 3;
        System.out.println((x <= 5) && (x < 10)); // true

        // e. mainīgais vienāds ar 0 vai 10
        System.out.println((x == 0) || (x == 10)); // false

        // d. mainīgā reizinājums ir lielāks par 10
        x = 4;
        System.out.println(x * x >= 10); // true
    }
}
