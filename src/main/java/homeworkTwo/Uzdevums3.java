package homeworkTwo;

import java.util.Scanner;

// 3. uzdevums
public class Uzdevums3 {
    public static void risinajums() {

        Scanner scanner1 = new Scanner(System.in);
        int m, n, l;

        System.out.println("Enter the first number: ");
        m = scanner1.nextInt();
        System.out.println("Enter the second number: ");
        n = scanner1.nextInt();
        System.out.println("Enter the third number: ");
        l = scanner1.nextInt();

        if (m > n && m > l) {
            System.out.println("Largest number is: " + m);
        }
        else if (n > l) {
            System.out.println("Largest number is " + n);
        }
        else {
            System.out.println("Largest number is " + l);
        }
    }
}
