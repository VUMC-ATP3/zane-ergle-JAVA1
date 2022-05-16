package HomeWork;

import java.sql.SQLOutput;

public class HomeWork {
    public static void main(String[] args) {
        //Valsts

        String country = "Spānija";
        String suffix = "s";
        System.out.println("Valsts: "+ country);

        int population =  46788355;
        System.out.println("Iedzīvotāju skaits Spānijā ir "+ population);

        float area = 505990;
        System.out.println("Spānijas platība ir "+ area +" km2");

        String capital = "Madride";
        System.out.println("Spānijas galvaspilsēta ir "+ capital);

        String officialLanguage = "spāņu valoda";
        System.out.println("Oficiālā valoda Spānijā ir "+ officialLanguage);

        boolean isEUMemberState = true;
        System.out.println("Vai Spānija ir ES dalībvalsts? " + isEUMemberState);

        char currency = '€';
        System.out.println(country+suffix+ " valsts valūta ir "+ currency);

        System.out.println("\n"+country+ ", oficiāli "+country+suffix +" Karaliste (Reino de España), ir valsts, kura atrodas Pireneju pussalā, Dienvidrietumeiropā. \n "+country+" pieder arī Baleāru Salas Vidusjūrā un Kanāriju Salas Atlantijas okeānā pie Āfrikas krastiem. \n "+country+suffix +" platība ir "+area+ " km², tādēļ tā ir otra lielākā valsts Eiropas Savienībā pēc Francijas.\n Tieši šī iemesla dēļ mūsdienās "+officialLanguage +" runā vairāk nekā 400 miljoni cilvēku.\n Centrālā likumdošanas vara ir piešķirta parlamentam ar divām palātām. 2010. gadā "+country+suffix+" dzīvoja "+population+ "miljoni iedzīvotāju. \nLielākā "+country+suffix+" pilsēta ar 3,1 miljoniem iedzīvotāju ir "+capital + ".Tā ir arī valsts galvaspilsēta. \nOficiālā valoda valstī ir "+officialLanguage+".");

        //majas darbs ar aritmētiskajiem operatoriem
        int sum;
        int diff;
        int multiplication;
        double division;
        double modulo;
        int x = 12;
        int y = 5;
        int z = 10;
        int w = 7;

        //summa
        sum = x + y;
        System.out.println("\nsumma ir: "+ sum);
        System.out.println("summa ir: "+(w + z + y));
        System.out.println("summa ir: "+(y + z));
        System.out.println("x + y + z + w = " + (x + y + z + w));
        System.out.println("\n");

        //starpiba
        diff = x - y;
        System.out.println("starpiba ir: "+ diff);
        System.out.println("starpiba ir: "+(w - z - y));
        System.out.println("x - y - z - w = " + (x - y - z - w));
        System.out.println("\n");

        //reizinasana
        multiplication = x * y;
        System.out.println("reizinajums ir: "+ x*z);
        System.out.println("reizinajums ir: "+ (multiplication * y));
        System.out.println("reizinajums ir: "+ multiplication);
        System.out.println("x * y * z * w = " + (x * y * z * w));
        System.out.println("\n");

        //dalisana
        division = z / y;
        System.out.println("dalijums ir: "+ division);
        System.out.println("dalijums ir: "+ (division/y));
        System.out.println("dalijums ir: "+ (multiplication/division));
        System.out.println("\n");

        //modulis
        modulo = z%2;
        System.out.println("modulis ir: "+ modulo);
        System.out.println("modulis ir: "+ w%3);
        System.out.println("modulis ir: "+ w%5);
    }
}
