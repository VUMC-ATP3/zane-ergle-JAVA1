package homeworkTwo;

public abstract class HomeWorkTwo {


    public static void main(String[] args) {
        // 1. uzdevums
        System.out.println("\n1. uzdevums: Loģiskās izteiksmes");
        Uzdevums1.risinajums();

        // 2. uzdevums
        System.out.println("\n2. uzdevums: Kāds mēnesis?");
        Uzdevums2.risinajums();

        // 3. uzdevums
        System.out.println("\n3. uzdevums: Kurš no skaitļiem ir lielākais?");
        Uzdevums3.risinajums();

        // 4. uzdevums
        System.out.println("\n4. uzdevums: Luksafors");
        Uzdevums4.risinajums();

        // 5. uzdevums
        System.out.println("\n5. uzdevums: Metode printBusinessCard()\n");
        Uzdevums5.printBusinessCard();
        Uzdevums5.printBusinessCard();
        Uzdevums5.printBusinessCard();

        // 6. uzdevums
        System.out.println("\n6. uzdevums: Metode printBusinessCardTwo()\n");
        Uzdevums6.printBusinessCardTwo("Līga", "Kalniņa", "+371 12312312", "1965");
        Uzdevums6.printBusinessCardTwo("Juris", "Vītols", "+371 5142431", "1938");

        // 7. uzdevums
        System.out.println("\n7. uzdevums: Metode summa()");
        System.out.println(Uzdevums7.summa(-10, 888));

        // 8. uzdevums
        System.out.println("\n8. uzdevums: Metode Average()");
        System.out.println(Uzdevums8.average(10, 20, 30));
    }
}
