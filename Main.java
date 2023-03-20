import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random prng = new Random();

        //part A
        System.out.print("How many sales would you like to make? ");
        int sales = Integer.valueOf(reader.nextLine());
        double[] cashFlow = new double[sales];

        for (int i = 0; i < sales; i++)
            cashFlow[i] = prng.nextDouble()*100.0;

        printSales(cashFlow);
        computeMetrics(cashFlow);


    }
    //part B
    private static void printSales(double[] stuff) {
        for (int i = 0; i < stuff.length; i++)
            System.out.println(String.format("%.2f",stuff[i]));
    }

    //part C
    private static void computeMetrics(double[] stuff) {


//        int x;
//        x += stuff[0];
//        x += stuff[1];
//        x += stuff[2];
//        x += stuff[3];
//        x += stuff[4];

        //total
        double total = 0;
        for(int i=0; i<stuff.length; i++)
            total += stuff[i];
        System.out.println("Total = " + String.format("%.2f", total));

        //highest
        double high = stuff[0];
        for (int i = 1; i < stuff.length; i++)
            if (stuff[i] > high)
            {
                high = stuff[i];
        }

            System.out.println("Highest = " + String.format("%.2f",high));

        //lowest
        double low = stuff[0];
        for (int i = 1; i < stuff.length; i++)
            if (stuff[i] < low)
            {
                low = stuff[i];
            }

            System.out.println("Lowest = " + String.format("%.2f", low));

        //mean(average)
        double average = total/stuff.length;
        System.out.println("Average = " + String.format("%.2f",average));
    }
    // Generate Sales
        //Print Sales
        //Compute Metrics
        //Call Functions from Main()

    }

