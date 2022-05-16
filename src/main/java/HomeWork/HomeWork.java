package HomeWork;

import java.sql.SQLOutput;

public class HomeWork {
    public static void main(String[] args) {
        //Valsts

        String country = "Spānija";
        String suffix = "s";
        System.out.println("Valsts: " + country);

        int population =  46788355;
        System.out.println("Iedzīvotāju skaits Spānijā ir " + population);

        double area = 505990;
        System.out.println("Spānijas platība ir " + area + " km2");

        String capital = "Madride";
        System.out.println("Spānijas galvaspilsēta ir " + capital);

        String officialLanguage = "spāņu valoda";
        System.out.println("Oficiālā valoda Spānijā ir " + officialLanguage);

        boolean isEUMemberState = true;
        System.out.println("Vai Spānija ir ES dalībvalsts? " + isEUMemberState);

        char currency = '€';
        System.out.println(country+suffix+ " valsts valūta ir " + currency);

        System.out.println("\n" + country + ", oficiāli " + country + suffix + " Karaliste (Reino de España), ir valsts, kura atrodas Pireneju pussalā, Dienvidrietumeiropā. \n " + country + " pieder arī Baleāru Salas Vidusjūrā un Kanāriju Salas Atlantijas okeānā pie Āfrikas krastiem. \n " + country + suffix + " platība ir " + area + " km², tādēļ tā ir otra lielākā valsts Eiropas Savienībā pēc Francijas.\n Tieši šī iemesla dēļ mūsdienās " + officialLanguage + " runā vairāk nekā 400 miljoni cilvēku. \n Centrālā likumdošanas vara ir piešķirta parlamentam ar divām palātām. 2010. gadā " + country + suffix + " dzīvoja " + population + " miljoni iedzīvotāju. \nLielākā " + country + suffix + " pilsēta ar 3,1 miljoniem iedzīvotāju ir " + capital + ". Tā ir arī valsts galvaspilsēta. \n Oficiālā valoda valstī ir " + officialLanguage + ".");

        //Mājas darbs ar aritmētiskajiem operatoriem
        int sum;
        int diff;
        int multiplication;
        double division;
        double modulo;
        int x = 12;
        int y = 5;
        int z = 10;
        int w = 2;

        //summa
        sum = x + y;
        System.out.println("\nSumma x + y ir: " + sum);
        System.out.println("Summa w + z + y ir: " + (w + z + y));
        System.out.println("Summa y + z ir: " + (y + z));
        System.out.println("x + y + z + w = " + (x + y + z + w));
        System.out.println("\n");

        //starpība
        diff = x - y;
        System.out.println("Starpība x - y ir: " + diff);
        System.out.println("Starpība w - z - y ir: " + (w - z - y));
        System.out.println("x - y - z - w = " + (x - y - z - w));
        System.out.println("\n");

        //reizināšana
        multiplication = x * y;
        System.out.println("Reizinājums x * z ir: " + (x * z));
        System.out.println("Reizinājums x * y * y ir: " + (multiplication * y));
        System.out.println("Reizinājums x * y ir: " + multiplication);
        System.out.println("x * y * z * w = " + (x * y * z * w));
        System.out.println("\n");

        //dalīšana
        division = z / y;
        System.out.println("Dalījums z/y ir: " + division);
        System.out.println("Dalījums ((z/y)/w) ir: " + (division/w));
        System.out.println("Dalījums (x*y)/(z/y) ir: " + (multiplication/division));
        System.out.println("\n");

        //modulis
        modulo = x%2;
        System.out.println("Modulis ir: " + modulo);
        System.out.println("Modulis ir: " + x%3);
        System.out.println("Modulis ir: " + x%5);
    }
}
