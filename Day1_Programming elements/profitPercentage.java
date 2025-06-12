public class profitPercentage{
public static void main (String[] args){
double costPrice = 129;
        double sellingPrice = 191;

        double profit = sellingPrice - costPrice;
        double profitPercent = (profit / costPrice) * 100;

        System.out.println(
            "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
            "Profit is INR " + profit + "\n" +
            "Profit Percentage is " + profitPercent + "%"
        );
    }
}