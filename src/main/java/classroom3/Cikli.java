package classroom3;

public class Cikli {

    public static void main(String[] args) {

        // cikls while
        int i = 0;
        while(i < 5) {
            System.out.println(i);
            i = i + 1;
        }

        String[] pieturas = {"Brīvības iela", "Marijas iela", "Čaka iela", "Barona iela"};
        int skaititajs = 0;
        while(skaititajs<4){
            System.out.println(pieturas[skaititajs]);
            skaititajs = skaititajs + 1;
        }

        int sakotnejs = 0;
        while (sakotnejs <= 1000) {
            System.out.println(sakotnejs);
            sakotnejs = sakotnejs +2;
        }

        int skaititajs2 = 0;
        while (skaititajs2 < pieturas.length) {
            System.out.println(skaititajs2);
            skaititajs2 = skaititajs2 +1;
        }
    }

    static void printetTekstaMasivu(String[] randomMasivs){
        int skaititajs = 0;
        while (skaititajs < randomMasivs.length) {
            System.out.println(randomMasivs[skaititajs]);
            skaititajs = skaititajs + 1;
        }
    }

}
