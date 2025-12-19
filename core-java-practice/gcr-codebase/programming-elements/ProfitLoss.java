
public class ProfitLoss {
    public static int calculate(int cp, int sp) {
        return sp - cp;
    }

    public static void main(String[] args) {
        int cp = 129;
        int sp = 191;
        int profit = calculate(cp, sp);
        double pPercentage = (profit / (double) cp) * 100;
        System.out.println("The Cost Percentage is INR " + cp + " and Selling Price is INR" + sp);
        System.out.println("The Profit is INR " + profit + " and Profit Percentage is " + pPercentage + "%");

        
    }
    
}
