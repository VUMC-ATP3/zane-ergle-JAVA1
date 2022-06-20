package classHomework.oop_homework;

import java.util.Date;

class Visit {

    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer, Date date) {
        this.customer = customer;
        this.date = date;
    }

    public String getName() {
        return this.customer.getName();
    }

    public double getServiceExpense() {
        return this.serviceExpense;
    }

    public void setServiceExpense(double ex) {
        this.serviceExpense = ex;
    }

    public double getProductExpense() {
        return this.productExpense;
    }

    public void setProductExpense(double ex) {
        this.productExpense = ex;
    }

    public double totalServiceExpense(){
        return this.serviceExpense - (this.serviceExpense * DiscountRate.getServiceDiscountRate(this.customer.getMemberType()));
    }

    public double totalProductExpense(){
        return this.productExpense - (this.productExpense * DiscountRate.getProductDiscountRate(this.customer.getMemberType()));
    }
    public double getTotalExpense() {
        if (this.customer != null) {
            //return this.serviceExpense - (this.serviceExpense * DiscountRate.getServiceDiscountRate(this.customer.getMemberType())) + this.productExpense - (this.productExpense * DiscountRate.getProductDiscountRate(this.customer.getMemberType()));
            return totalProductExpense() + totalServiceExpense();
        }

        return 0.0;
    }


        public String toString() {
            if (this.customer != null) {
                return "Visit(" + this.date + ", " + this.customer.toString() + ", " + this.serviceExpense + ", " + this.productExpense + ", " + this.getTotalExpense() + ")";
            }

            return "";
        }
}