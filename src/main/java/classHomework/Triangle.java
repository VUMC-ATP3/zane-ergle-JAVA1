package classHomework;

public class Triangle {

    double sideOne;
    double sideTwo;
    double sideThree;
    double perimeter;
    double triangleArea;


    // b. Klasē jābūt no-arg konstruktoram, kas pasaka, ka mēs veidojam trijstūri
    public Triangle(){
        System.out.println("Creating new Triangle...");
    }

    // c. Klasē jābūt arg konstruktoram, kur tiek padotas visas trīs malas un uzreiz aprēķināts trijstūra laukums(hērona formula) un saglabāts laukuma mainīgajā
    public Triangle(double sideOne, double sideTwo, double sideThree){
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }


    public double calculateArea(){
        perimeter = (sideOne + sideTwo + sideThree)/2;
        triangleArea = Math.sqrt(perimeter*(perimeter-sideOne)*(perimeter-sideTwo)*(perimeter-sideThree));
        return triangleArea;
    }

    // d. Klasē jābūt metodei, kas atgriež true/false vai trīsstūris ir vienādmalu
    public boolean isEquilateral(){
        if ( sideOne == sideTwo && sideOne == sideThree){
            return true;
        } else {
            return false;
        }
    }

    // e. Klasē jābūt metodei, kas atgriež true/false vai trīsstūris ir vienādsānu
    public boolean isIsosceles(){
        if ( sideOne == sideTwo || sideOne == sideThree || sideTwo == sideThree){
            return true;
        } else {
            return false;
        }
    }
}

