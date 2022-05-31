package classroom;

public class Main {
    public static void main(String[] args) {

        int dogAge =  3;
        String dogName = "Reksis";
        // (mainiga tips) (mainiga nosaukums) = (vertiba);
        double dogWeight = 15.8;
        float augumsSuns = 60.212345F; //daļskaitlis
        boolean isHungry=false; //true=1, false=0

        System.out.println("Vecums");
        System.out.println(dogAge);
        System.out.println("Vārds");
        System.out.println(dogName);
        System.out.println("Svars");
        System.out.println(dogWeight+"kg");
        System.out.println("Suņa augstums");
        System.out.println(augumsSuns+" ");
        System.out.println("Vai mans suns ir izsalcis");
        System.out.println(isHungry);


        int vecumsKakis =  99;
        String vardsKakis = "Mjau";

        System.out.println("Vecums");
        System.out.println(vecumsKakis);
        System.out.println("Vārds");
        System.out.println(vardsKakis);

        System.out.println(dogAge+vecumsKakis);


        int gadaApgrozijumsDolaros = 21422255;
        byte monthsInYear = 12;
        short autoPrice = 12316;
        long netIncome = 2147483699L;

        System.out.println(gadaApgrozijumsDolaros + "\n" + monthsInYear + "\n" + autoPrice + "\n" + netIncome);

        //dogAge.eguals(dogAge);

        int summa;
        int starpiba;
        int reizinajums;
        double dalijums;
        double modulis;
        int x = 5;
        int y = 37;

        double z = 5;
        double q = 10;
        double w = 12;

        summa = x + y;
        System.out.println("summa ir: "+ summa);

        starpiba = x - y;
        System.out.println("starpiba ir: "+ starpiba);

        reizinajums = x * y;
        System.out.println("reizinajums ir: "+ reizinajums);

        dalijums = q / z;
        System.out.println("dalijums ir: "+ dalijums);

        modulis = w%7;
        System.out.println("modulis ir: "+ modulis);


        double lowestTemperature = -20.4;
        float highestTemperature = 40.65512312F;
        System.out.println("Augstaka temp ir " + highestTemperature + "zemaka temp ir " + lowestTemperature);
        String teikums = String.format("Augstākā temperatūra ir %.2f Zemākā temperatūra ir %s",highestTemperature,lowestTemperature);
        System.out.println(teikums);

        String teikums2 = String.format("Augstākā temperatūra ir %.2f Zemākā temperatūra ir %2Ss. Zemāka temp %2$s. Augstaka Temo %1$.4f",highestTemperature,lowestTemperature);



    }
}
