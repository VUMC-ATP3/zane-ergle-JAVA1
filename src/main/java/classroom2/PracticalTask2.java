package classroom2;

import java.util.Scanner;

//24.05.2022 lekcija
public class PracticalTask2 {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ievadi pirmo skaitli!");
//        int skaitlis1 = scanner.nextInt();
//        System.out.println("Ievadi otro skaitli");
//        int skaitlis2 = scanner.nextInt();
//        int summa = skaitlis1 + skaitlis2
//        System.out.println("Skaitļu summa ir " + (skaitlis1 + skaitlis2) + "!");


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ievadi savu vārdu!");
//        String name = scanner.nextLine();
//        System.out.println("Ievadi savu vecumu");
//        int age = scanner.nextInt();
//        System.out.println("Esi sveicināts: " + name + "!");
//        System.out.println(String.format("Esi Sveicināts: %s !",name));
//        System.out.println("Jūsu vecums ir: " + age);


//        int a = 5;
//        int b = 10;
//        int c = 5;
//        int d = 11;
        //lielāks
//        System.out.println(b > a); //true
//        System.out.println(a > b); //false

        //mazāks
//        System.out.println(b > a); //true
//        System.out.println(a > b); //false

        //vienāds
//        System.out.println(a == c); //true
//        System.out.println(a == b); //false
//        System.out.println(b == c); //false
//
        //nav vienāds
//        System.out.println(a != b); //true
//        System.out.println(a != c); //true

        //mazāks vienāds
//        System.out.println(a <= c ); //true
//        System.out.println(b >= d); //false

//        int vecums = 18;
//        boolean vaiDrikstBalsot = (vecums >= 18);
//        System.out.println("Vai cilvēks drīkst balsot? " +vaiDrikstBalsot);
//
//        int e = 4;
//        boolean vaiIrPatiess = ((e < 5) && (e < 10));
//        System.out.println(vaiIrPatiess);
//
//        e = 5;
//        vaiIrPatiess = ((e > 5) && (e < 10));
//        System.out.println(vaiIrPatiess);
//
//        e = 5;
//        vaiIrPatiess = ((e > 5) || (e < 10));
//        System.out.println(vaiIrPatiess);

//        int vecums2 = 17;
//
//        if(vecums2 >=18){
//            System.out.println("Cilvēks drīkst balsot");
//        }
//        System.out.println("Koda turpinājums"        );

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ievadi savu vecumu...");
//        int vecums3 = scanner.nextInt();
//        if(vecums3>=18){
//            System.out.println("Cilvēks drīkst balsot");
//        }
//        else{
//            System.out.println("Cilvēks balsot nedrīkst!!!");
//        }
//        System.out.println("Koda turpinājums");

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ievadi skatli..");
//        int skaitlisViens = scanner.nextInt();
//        if(skaitlisViens==10){
//            System.out.println("Printejam Skaitlis 10");
//        } else if(skaitlisViens==15){
//            System.out.println("Printejam Skaitlis 15");
//        } else if(skaitlisViens==20){
//            System.out.println("Printejam Skaitlis 20");
//        } else {
//            System.out.println("Skaitlis ir nezināms");
//        }
//
//        System.out.println("Koda turpinājums");


        //jānodefinē cilvēks
        //int vecums6;
        //char dzimums2;

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Kāds ir jūsu vecums?");
//        int vecums6 = scanner.nextInt();
//        System.out.println("Kāds ir jūsu dzimums?");
//        String dzimums2 = scanner.nextLine();
//
//        if(vecums6>=60 && dzimums2 = "Sieviete") {
//            System.out.println("Sieviete drīkst doties pensijā");
//        } else if(vecums6<=60 && dzimums2 = "Sieviete"){
//            System.out.println("Sieviete nedrīkst doties pensijā");
//        } else if(vecums6>=65 && dzimums2 = "Vīrietis"){
//            System.out.println("Vīrietis drīkst doties pensijā");
//        } else if( vecums6>=65 && dzimums2 = "Vīrietis"){
//            System.out.println("Vīrietis nedrīkst doties pensijā");
//        }

//STRADA
//        int cilvekaVecums = 65;
//        char cilvekaDzimums = 'V';
//        boolean drikstDotiesPensija = false;
//
//        if (cilvekaVecums >= 65 && cilvekaDzimums == 'V') {
//            drikstDotiesPensija = true;
//        }
//        else if (cilvekaVecums >=60 && cilvekaDzimums == 'S'){
//            drikstDotiesPensija = true;
//        }
//
//        if(drikstDotiesPensija){
//            System.out.println("Cilveks drikst doties pensija!");
//        }


//        int diena = 13;
//        String dienasVards;
//
//        switch (diena){
//            case 1:
//                dienasVards="Pirmdiena";
//                break;
//            case 2:
//                dienasVards="Otrdiena";
//                break;
//            case 3:
//                dienasVards="Trešdiena";
//                break;
//            case 4:
//                dienasVards="Ceturdiena";
//                break;
//            case 5:
//                dienasVards="Piektdiena";
//                break;
//            case 6:
//                dienasVards="Sestdiena";
//                break;
//            case 7:
//                dienasVards="Svētdiena";
//                break;
//            default: dienasVards="Nezināma diena";
//        }
//        System.out.println(dienasVards);
//    }


//        Uzdevums 1
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ievadi veselu skaitli!");
//        int veselsSkaitlis = scanner.nextInt();
//        if (veselsSkaitlis == 0) {
//            System.out.println("Skaitlis ir 0");
//        } else if (veselsSkaitlis > 0) {
//            System.out.println("Skaitlis ir lielāks par 0");
//        } else {
//            System.out.println("Skaitlis ir mazāks par 0");
//        }

        //uzdevums, kas min paroli

        Scanner scanner = new Scanner(System.in);
        String parole = "Parole123";
        String lietotajaIevaditaParole;

        do {
            System.out.println("Ievadi paroli!");
            lietotajaIevaditaParole = scanner.nextLine();
            System.out.println("Notiek paroles pārbaude");
        } while (!lietotajaIevaditaParole.equals(parole)); {
            System.out.println("Pareiza parole");
        }



        //Uzdevums 2
        int skaitlisJauns = 5;

        if (skaitlisJauns % 2 == 0) {
            System.out.println("Skaitlis ir para skaitlis");
        } else {
            System.out.println("Skaitlis ir nepara skaitlis");
        }
    }
}
