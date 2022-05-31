package classroom3;

public class Masivi {
    public static void main(String[] args) {

//        majuParbaude(1, 3, 2);
//
//        String pietura = "Brīvības iela";
//       saraksts/array/masīvs
//        String[] pieturas = {"Brīvības iela", "Marijas iela", "Čaka iela", "Barona iela"};
//        int[] majuNumuri = {1, 2, 3, 4, 5, 6, 7, 8};
//        char[] patskaņi = {'a', 'e', 'i', 'o', 'u' };
//
//        System.out.println(pieturas[0] + pieturas[1] + pieturas[2] + pieturas[3]);
//        pieturas[3] = "Zemitānu stacija";
//        System.out.println(pieturas[0] + pieturas[1] + pieturas[2] + pieturas[3]);
//
//        System.out.println("Cik pieturas ir masīvā? " +  pieturas.length);
//
//        String [] hokejaCempionatsTopTris = new String[3];
//        System.out.println("Cik vietas ir čempionātā? " + hokejaCempionatsTopTris.length);
//        System.out.println(hokejaCempionatsTopTris[0]);
//
//        String pirmaVieta = "Latvija";
//        String otraVieta = "Krievija";
//        String tresaVieta = "Somija";
//
//        hokejaCempionatsTopTris[0] = pirmaVieta;
//        hokejaCempionatsTopTris[1] = otraVieta;
//        hokejaCempionatsTopTris[2] = tresaVieta;
//
//        System.out.println(hokejaCempionatsTopTris[0] + "\n" +  hokejaCempionatsTopTris[1] + "\n" + hokejaCempionatsTopTris[2]);
//
        //

//        static void printetIntegerMasivu(intp[] kautko){
//            int i = 0;
//            while (i<kautko.length){
//                System.out.println(kautko[i]);
//                i++;
//            }
//        }

//        int y = 0;
//        do {
//            System.out.println("DO WHILE: " + y);
//            y = y + 1; // y++
//        } while (y < 10);
//
    }


    static void majuParbaude(int sakums, int beigas, int iznemums) {
        int majuNumuri = sakums;
        while (majuNumuri <= beigas) {
            if (majuNumuri % 3 == 0 || majuNumuri % 5 == 0 || majuNumuri == iznemums) {
                System.out.println("šie māju numuri neder " + majuNumuri);
            } else {
                System.out.println("šie māju numuri DER " + majuNumuri);
            }
            majuNumuri = majuNumuri + 1;
        }
    }


}