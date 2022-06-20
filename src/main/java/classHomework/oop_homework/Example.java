package classHomework.oop_homework;

import java.util.Date;

public class Example {
    public static void main(String args[]) {
        System.out.println("oop_homework");

        // Customer 1
        Customer customer1 = new Customer("Zane");
        customer1.setMember(false);
        customer1.setMemberType("Regular");

        System.out.println("Customer 1: " + customer1.toString());


        Visit visit1 = new Visit(customer1, new Date());
        visit1.setServiceExpense(100);
        visit1.setProductExpense(10);
        System.out.println("Visit 1: " + visit1.toString());


        // Customer 2
        Customer customer2 = new Customer("Uldis");
        customer2.setMember(true);
        customer2.setMemberType("Silver");

        System.out.println("Customer 2: " + customer2.toString());

        Visit visit2 = new Visit(customer2, new Date());
        visit2.setServiceExpense(100);
        visit2.setProductExpense(10);
        System.out.println("Visit 2: " + visit2.toString());


        // Customer 3
        Customer customer3 = new Customer("Edgars");
        customer3.setMember(true);
        customer3.setMemberType("Gold");

        System.out.println("Customer 3: " + customer3.toString());

        Visit visit3 = new Visit(customer3, new Date());
        visit3.setServiceExpense(100);
        visit3.setProductExpense(10);
        System.out.println("Visit 3: " + visit3.toString());


        // Customer 4
        Customer customer4 = new Customer("Kristaps");
        customer4.setMember(true);
        customer4.setMemberType("Premium");

        System.out.println("Customer 4: " + customer4.toString());

        Visit visit4 = new Visit(customer4, new Date());
        visit4.setServiceExpense(100);
        visit4.setProductExpense(10);
        System.out.println("Visit 4: " + visit4.toString());
    }
}