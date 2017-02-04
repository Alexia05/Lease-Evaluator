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
    public static void main(String[] args) 
    {
    
        LeaseEvaluator myLeaseEvaluator = new LeaseEvaluator("Arelys", 36, 219.0, 1915.0, 10500, 0.25, 45678);
        
        String custName = myLeaseEvaluator.getcustName();
        int leaseTerm = myLeaseEvaluator.getleaseTerm();
        double montPay = myLeaseEvaluator.getmontPay();
        double downPay = myLeaseEvaluator.getdownPay();
        int freeMilesYear = myLeaseEvaluator.getfreeMilesYear();
        double chargeMiles = myLeaseEvaluator.getchargeMiles();
        double milesDriven = myLeaseEvaluator.getmilesDriven();
        
        System.out.println("The customer name is " + custName);
        System.out.println("\nThe lease term is " + leaseTerm);
        System.out.println("\nThe monthly payment is " + montPay);
        System.out.println("\nThe downpayment is " + downPay);
        System.out.println("\nThe maximum number of \"free\" miles allowed per year is " + freeMilesYear);
        System.out.println("\nThe charge per mile over the maximum is " + chargeMiles);
        System.out.println("\nThe number of miles actually driven over the life of the lease is " + milesDriven);        
    }
    
}
