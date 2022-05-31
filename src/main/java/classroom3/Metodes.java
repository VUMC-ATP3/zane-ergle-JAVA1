package classroom3;

public class Metodes {
    public static void main(String[] args) {

        int b = 9;
        int a = kvadrataLaukums(3);
        float c = taisnsturaLaukums(3.45F, 4.5F);
        printetTekstu(a, c);
    }

    static void printetTekstu (int a, float c){
        System.out.println("Kvadrāta laukums ir: " + a);
        System.out.println("Taisnstūra laukums ir: " + c);
    }

    // Metode, kas aprēķina kvadrāta laukumu
    static int kvadrataLaukums(int mala) {
        int laukums = mala * mala;
        return laukums;
    }

    static float taisnsturaLaukums (float a, float b) {
        float s = a * b;
        return (s);
    }



}
