package Arrays.One_D;

import java.util.Scanner;

public class stocksMaxProfit {
  public static void main(String[] args) {
    int arr[];
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number of days:");
    int n =sc.nextInt();
    arr=new int[n];
    System.out.println("Enter price of stock on:");
    for (int i=0;i<n;i++) {
      System.out.print("Day "+(i+1)+": ");
      arr[i] =sc.nextInt();
    }
    int cost_price = arr[0];
    int sell_price;
    int profit;
    int max_profit = Integer.MIN_VALUE;
    int profit_day = 1;
    System.out.println("Cost price on day 1 is "+arr[0]+" and on day 1 there will be no selling");
    for(int i=1;i<n;i++) {
      sell_price = arr[i];
      profit = sell_price - cost_price;
      if(max_profit < profit) {
        max_profit = profit;
        profit_day = i+1;
      }
      System.out.println("For day "+(i+1)+" selling price is "+arr[i]+" and cost price is "+cost_price+" and the profit will be "+profit);

      if(cost_price > arr[i]) {
        cost_price = arr[i];
      }
    }
    System.out.println("The maximum profit is on day "+profit_day+" and the proift is "+max_profit);
    sc.close();
  }
}
