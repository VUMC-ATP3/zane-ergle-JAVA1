package classHomework;

public class Main {
    public static void main(String[] args) {

        Triangle triangleOne = new Triangle();
        triangleOne.sideOne = 8;
        triangleOne.sideTwo = 8;
        triangleOne.sideThree = 8;
        System.out.println("\nTriangle created");
        System.out.println("Triangle is Isosceles: " + triangleOne.isIsosceles());//vai ir vienādsānu
        System.out.println("Triangle is Equilateral: " + triangleOne.isEquilateral()); //vai ir vienādmalu
        System.out.println("Triangle area is: " + triangleOne.calculateArea());


        Triangle triangleTwo = new Triangle(10,10,10);
        System.out.println("\nTriangle created");
        System.out.println("Triangle is Isosceles: " + triangleTwo.isIsosceles());//vai ir vienādsānu
        System.out.println("Triangle is Equilateral: " + triangleTwo.isEquilateral());//vai ir vienādmalu
        System.out.println("Triangle area is: " + triangleTwo.calculateArea());
    }
}
