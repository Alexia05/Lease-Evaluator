/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arelysalvarezpadilla
 */
public class LeaseEvaluatorTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //creating an object
        LeaseEvaluator myLeaseEvaluator = new LeaseEvaluator("Arelys", 36, 239.0, 1915.0, 10500, 0.25, 45678);

        //getting all the data
        String custName = myLeaseEvaluator.getcustName();
        int leaseTerm = myLeaseEvaluator.getleaseTerm();
        double montPay = myLeaseEvaluator.getmontPay();
        double downPay = myLeaseEvaluator.getdownPay();
        int freeMilesYear = myLeaseEvaluator.getfreeMilesYear();
        double chargeMiles = myLeaseEvaluator.getchargeMiles();
        double milesDriven = myLeaseEvaluator.getmilesDriven();

        //printing all the data 
        System.out.println("The customer name is " + custName);

        System.out.println("\nThe lease term is " + leaseTerm + " months");

        System.out.println("\nThe monthly payment is $" + montPay);

        System.out.println("\nThe down payment is $" + downPay);

        System.out.println("\nThe maximum number of \"free\" miles allowed per year is " + freeMilesYear + " miles");

        System.out.println("\nThe charge per mile over the maximum is $" + chargeMiles);

        System.out.println("\nThe number of miles actually driven over the life of the lease is " + milesDriven + " miles");

        //getting the actual cost per month
        double actCost = myLeaseEvaluator.getactCost();

        System.out.println("\nThe actual cost per month is $" + actCost);

        //changing the monthly payment  
        myLeaseEvaluator.change(219);

        double monthlyPay = myLeaseEvaluator.getmontPay();

        System.out.println("\nIf you change the monthly payment to $" + monthlyPay);

        //getting the actual cost with the new montlhy payment 
        double actCostN = myLeaseEvaluator.getactCost();

        System.out.println("\nThen the new actual cost per month would be $" + actCostN);
    }

}
