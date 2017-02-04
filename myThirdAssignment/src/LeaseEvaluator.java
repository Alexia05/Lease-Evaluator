/*
 * This LeaseEvaluator contains important information to discover 
 * the true cost per month of a leasing car
 */

/**
 *
 * @author arelysalvarezpadilla
 */
public class LeaseEvaluator {

    //instance variables 
    private String custName;                 //The customer name 
    private double montPay;                  //The monthly payment
    private int leaseTerm;                   //The term of the lease in months
    private double downPay;                  //The down payment
    private int freeMilesYear;               //The maximum number of “free” miles allowed per year
    private double chargeMiles;               //The charge per mile for all miles over the maximum
    private double milesDriven;              //The number of miles actually driven over the life of the lease

    //constructor
    public LeaseEvaluator(String custNameI, int leaseTermI, double monthlyPayment, double downPayment, int milesYear, double chargeMilesI, double milesDrivenI) {
        custName = custNameI;
        leaseTerm = leaseTermI;
        montPay = monthlyPayment;
        downPay = downPayment;
        freeMilesYear = milesYear;
        chargeMiles = chargeMilesI;
        milesDriven = milesDrivenI;
    }

    //get customer's name 
    public String getcustName() {
        return custName;
    }

    //get the monthly payment
    public double getmontPay() {
        return montPay;
    }

    //get the lease term
    public int getleaseTerm() {
        return leaseTerm;
    }

    //get the downpayment
    public double getdownPay() {
        return downPay;
    }

    //get the maximum number of “free” miles allowed per year
    public int getfreeMilesYear() {
        return freeMilesYear;
    }

    //get the charge per mile for all miles over the maximum
    public double getchargeMiles() {
        return chargeMiles;
    }

    //get the number of miles actually driven over the life of the lease
    public double getmilesDriven() {
        return milesDriven;
    }

    //changing the montly payment
    public void change(int monthlyPay) {
        montPay = monthlyPay;
    }

    /**
     * actual cost per month including: down payment, all monthly payments, and
     * excess mileage charges, divided by the number of months of the lease.
     */
    private double actCost;                      //actual cost per month
    private double totalCharges;                 //all the charges

    public double getactCost() {
        totalCharges = (downPay + (montPay * leaseTerm) + chargeMiles) / leaseTerm;
        actCost = totalCharges + (totalCharges * 7) / 100;
        return actCost;
    }

}
