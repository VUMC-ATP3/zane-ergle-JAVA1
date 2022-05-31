package classroom3;

import java.util.Random;

public class Uzdevums1 {

    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);
        //String parole = "Parole123";
        //String lietotajaIevaditaParole;
        //like cilvekam ievadit pozitivu skaitli, ja ievada 0 vai negativs, likt ievadit atkal.
        // Ja ir pozitivs, beigt darbu
        //int number;

//        do {
//            System.out.println("Ievadi pozitivu skaitli");
//            number = scanner.nextInt();
//        } while (number <= 0); {
//            System.out.println("Derigs skatilis " + number);
//        }
//
//
//        for (int j = 0; j <=10; j++){
//            System.out.println(j);
//        }

        String [] mansMasivs = {"Juris", "Anna", "Zane", "Janis"};

        for (int j = 0; j< mansMasivs.length; j++){
            System.out.println(mansMasivs[j]);
        }

        for (int j = 0; j >= -100; j--) {
            System.out.println("FOR CIKLS" + j);
        }


        String [] mansMasivs2 = {"Juris","Anna","Peteris","Jānis"};
        for (String xxxx : mansMasivs2){
            System.out.println(xxxx);
        }


        for (int j = 0; j < 10; j++) {
            if(j==6){
                break;
            }
            System.out.println("FOR CIKLS BREAK EXaMPLE " + j);
        }

        int[] skaitluMasivs = {3, 4, 6, 7, 2, 1, -5, 4, 2, 6, -4, -3, 3};
        //atrast masīvā pirmo negatīvo skaitli un izvadīt to un  tā indexu(poziciju) uz ekrāna

        for (int j = 0; j < skaitluMasivs.length; j++) {
            if (skaitluMasivs[j] < 0) {
                System.out.println("Pirmais negativais skaitlis: " + skaitluMasivs[j]);
                System.out.println("Indekss ir: " + j);
                break;
            }
        }

        Random skaitluGenerators = new Random();
        for (int i = 0; i < 1000 ; i++) {
            System.out.println(skaitluGenerators.nextInt(1000));
        }


        int nejaussSkaitlis = skaitluGenerators.nextInt(50);
        System.out.println(nejaussSkaitlis);



    }



}
