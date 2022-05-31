package classroom2;

public class Metodes {
    public static void main(String[] args) {
        System.out.println("Sākās  metodes izpilde");
        //checkPersonAge();
        checkPersonPension();
        checkPersionPension2(65, 'V');
        checkPersionPension2(64, 'V');
        checkPersionPension2(60, 'S');
        checkPersionPension2(65, 'S');
        aprekinatKvadrataLaukumu(6);
        int manaKvardataLaukums = aprekinatKvadrataLaukumu(99);
        System.out.println("Kvadrāta laukums ir: "+ manaKvardataLaukums);

        System.out.println("Beidzās metodes izpilde");

    }

    static int aprekinatKvadrataLaukumu (int mala){
        int laukums = mala * mala;
        return(laukums);
    }


    static void checkPersonPension() {
        int cilvekaVecums = 65;
        char cilvekaDzimums = 'V';
        boolean drikstDotiesPensija = false;

        if (cilvekaVecums >= 65 && cilvekaDzimums == 'V') {
            drikstDotiesPensija = true;
        } else if (cilvekaVecums >= 60 && cilvekaDzimums == 'S') {
            drikstDotiesPensija = true;
        }

        if (drikstDotiesPensija) {
            System.out.println("Cilveks drikst doties pensija!");
        }
    }

    static void checkPersionPension2(int vecums,char dzimums){
        boolean drikstDotiesPensija = false;
        if (vecums >= 65 && dzimums == 'V') {
            drikstDotiesPensija = true;
        } else if (vecums >= 60 && dzimums == 'S') {
            drikstDotiesPensija = true;
        }
        if (drikstDotiesPensija) {
            System.out.println(String.format("Dzimums: %s, Vecums: %s",dzimums,vecums));
            System.out.println("Cilveks drikst doties pensija!");
        }else{
            System.out.println(String.format("Dzimums: %s, Vecums: %s",dzimums,vecums));
            System.out.println("Cilveks nedrikst doties pensija!");
        }
    }



}

