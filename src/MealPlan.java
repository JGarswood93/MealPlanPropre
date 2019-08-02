import java.util.Arrays;
import java.util.Scanner;

public class MealPlan {

    public static void main(String[] args) {

        /**
        call this method in order to get a total number of weeks
         */

        int numWeeks = getTotalMealWeeks();
        double[] dailyMealCost = new double[7];

        /**
        print array content before calling the method
         */

        System.out.println("Before calling the method: " + Arrays.toString(dailyMealCost));
        /**
        getter to get the total meal cost as a method
         */
        getDailyMealCost(dailyMealCost);

        /**
        this prints the array content after calling the method
         */
        System.out.println("After calling the method: " +
                Arrays.toString(dailyMealCost));
        /**
        number of weeks and daily meal cost to find the total
        num of weeks is a call by value the daily meal cost is an array.
        it is passing the address of the variable to the method
         */

        double totalCost = computeMealPlanCost(numWeeks, dailyMealCost);

        //this is a method to print the total cost
        printTotalMealPlanCost(totalCost);
    }

    public static void printTotalMealPlanCost(double totalCost) {
        System.out.printf("Your estimated total meal plan cost for the " + "semester is: $%5.2f", totalCost);
        System.out.println();
    }

    private static double computeMealPlanCost(int numWeeks, double[] dailyCost) {

        double totalCost = 0, weeklyCost = 0;
        for(int i = 0; i < dailyCost.length; i++) {
            weeklyCost += dailyCost[i];
        }
        totalCost = weeklyCost * numWeeks;
        return totalCost;
    }

    private static void getDailyMealCost(double[] dailyCost) {
        Scanner in = new Scanner(System.in);
        /**
        Allows varying amount to comply with what has been entered in the console
         */
        for(int i = 0; i < dailyCost.length; i++){
            System.out.println("Enter the estimated cost for day " + (i+1));
            dailyCost[i] = in.nextDouble();
        }
    }

    private static int getTotalMealWeeks() {

        Scanner in = new Scanner(System.in);

        System.out.println("How many weeks are in your semester");
        int totalWeeks = in.nextInt();
        return totalWeeks;
}

}