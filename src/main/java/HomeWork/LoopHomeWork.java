package HomeWork;

// 1.uzdevums

import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {

        // 1. uzdevums
        int sum = 0;
        Scanner nr = new Scanner(System.in);
        int number;

        System.out.println("\n1. uzdevums: Skaitļu summa");
        while(sum <= 100){
            System.out.println("Enter number: ");
            number = nr.nextInt();
            sum = sum + number;
            //System.out.println("Current sum is: " + sum);
        }
        System.out.println(sum);
        System.out.println("Gatavs");


        // 2. uzdevums
        boolean isPrime = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("\n2. uzdevums: Pirmsskaitlis");
        System.out.println("Enter number: ");
        int num = scan.nextInt();
        int i = 2;
        while (i <= num/2){
            if (num % i == 0){
                isPrime = false;
                break;
            }
            i++;
        }
        if(isPrime)
            System.out.println(num + " is a Prime number");
        else
            System.out.println(num + " is not a Prime number");


        // 3. uzdevums
        int [] numbers = {13, 26, 39, 52, 65, 78, 91, 104, 117};

        int a = 0;
        System.out.println("\n3. uzdevums: Masīvu izvade uz ekrāna");
        System.out.println("\nINTEGERS");
        System.out.println("Printing using WHILE cycle");
        while (a < numbers.length){
            System.out.println(numbers[a]);
            a++;
        }

        int b = 0;
        System.out.println("\nPrinting using DO WHILE cycle");
        do {
            System.out.println(numbers[b]);
            b++;
        } while (b < numbers.length);


        System.out.println("\nPrinting using FOR cycle");
        for (int p = 0; p < numbers.length; p++){
            System.out.println(numbers[p]);
        }

        System.out.println("\nPrinting using FOR EACH cycle");
        for (int nr1 : numbers){
            System.out.println(nr1);
        }


        String[] colors = {"White", "Yellow", "Red", "Green", "Blue", "Black"};
        System.out.println("\nSTRINGS");
        System.out.println("Printing using WHILE cycle");
        int c = 0;
        while (c < colors.length){
            System.out.println(colors[c]);
            c++;
        }

        int d = 0;
        System.out.println("\nPrinting using DO WHILE cycle");
        do {
            System.out.println(colors[d]);
            d++;
        } while (d < colors.length);


        System.out.println("\nPrinting using FOR cycle");
        for (int ii = 0; ii < colors.length; ii++){
            System.out.println(colors[ii]);
        }

        System.out.println("\nPrinting using FOR EACH cycle");
        for (String col : colors){
            System.out.println(col);
        }


        char[] vowel = {'a', 'e', 'i', 'o', 'u' };
        int m = 0;
        System.out.println("\nCHAR");
        System.out.println("Printing using WHILE cycle");
        while (m < vowel.length){
            System.out.println(vowel[m]);
            m++;
        }

        int n = 0;
        System.out.println("\nPrinting using DO WHILE cycle");
        do {
            System.out.println(vowel[n]);
            n++;
        } while (n < vowel.length);


        System.out.println("\nPrinting using FOR cycle");
        for (int iii = 0; iii < vowel.length; iii++){
            System.out.println(vowel[iii]);
        }

        System.out.println("\nPrinting using FOR EACH cycle");
        for (char vw : vowel){
            System.out.println(vw);
        }


        // 4. uzdevums
        System.out.println("\n4. uzdevums: Masīvs ar pāra skaitļiem");
        int[] evenNumberList = new int[100];

        int even = 0;
        for (int iiii = 0; iiii < evenNumberList.length; iiii++){
            evenNumberList[iiii] = even;
            //even +=2;
            even = even + 2;
            System.out.print(even + " " +"\n");
        }

        // 5. uzdevums
        System.out.println("\n5. uzdevums: Skaitļa faktoriāls");
        calculateFactorial(5);
        calculateFactorial(12);
        calculateFactorial(77);//nekorekts rezultāts


        // 6. uzdevums
        final int pinNumber = 1313;
        int tries = 0;

        Scanner scan2 = new Scanner(System.in);
        System.out.println("\n6. uzdevums: PIN koda validācija");
        System.out.println("Ievadiet PIN numuru: ");
        int pin = scan2.nextInt();
        tries++;

        while (pin != pinNumber && tries < 3){
            System.out.println("Nepareizs PIN, mēģiniet vēlreiz.");
            System.out.println("Ievadiet PIN numuru: ");
            pin = scan2.nextInt();
            tries++;
        }
        if (pin == pinNumber){
            System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ!");
        } else if (tries == 3) {
            System.out.println("Atvainojiet, bet jūs esat bloķēts.");
        }

    }

    static void calculateFactorial (int number) {
        int factorial = 1;
        for (int f = 1; f <= number; f++) {
            factorial = factorial * f;
        }
        System.out.println(("Number " + number + " factorial is " + factorial + "!"));
    }
}



