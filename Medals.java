package Project2;

import java.util.ArrayList;

public class Medals {

    /*
    Create a program that will print a table of medal winner counts with row totals
    I have provided the initial values needed, all you need to do is put the logic for printing the table
    The table should look like this:

         Country   Gold    Silver    Bronze  Total
         Canada       1       0       1       2
          China       1       1       1       3
        Germany       0       0       1       1
          Korea       1       0       0       1
          Japan       0       1       1       2
         Russia       0       1       1       2
  United States       1       1       0       2


*/
public class Medals
{
   public static void main(String[] args)
   {
      final int countries = 7;
      final int medals = 3;

      String[] countries =
         {
            "Canada",
            "China",
            "Germany",
            "Korea",
            "Japan",
            "Russia",
            "United States"
         };

      int[][] counts =
         {
            { 1, 0, 1 }, total 2
            { 1, 1, 0 }, total 3
            { 0, 0, 1 }, total 1
            { 1, 0, 0 }, total 1
            { 0, 1, 1 }, total 2
            { 0, 1, 1 }, total 2
            { 1, 1, 0 } total 2
         }
      
      System.out.println("country, bronze, Gold, Silver, Total");
      
      // Print countries, counts, and row totals
      for (int i = 0; i < COUNTRIES; i++)
      {
         // Process the ith row
         System.out.printf("%15s", countries[i]);

         int total = 0; 

         // Print each row element and update the row total
         for (int j = 0; j < MEDALS; j++)
         {
            System.out.printf("%8d", counts[i][j]);
            total = total + counts[i][j];
         }
         
         // Display the row total and print a new line
         System.out.printf("%8d\n", total);
      }
   }
}





    After that create an ArrayList that is the total of each medal awarded (IE 4 gold, 4 silver, 5 bronze)
    print the total of each medal 
    Hints:
        int rows = counts.length; (get the rows)
        int cols = counts[0].length; (gets the columns)   
        counts[j][i] in a nested for loop would get you the totals of the column  
        Gold    Silver    Bronze
        4       4         5


    void display(int arr[], int size)  
    {
        for(int i=0; i<=size;i++)
    }  
    int main ()
{ 
    int arr[13]=(2,3,1,1,2,2,2)
    display(arr,size);

    return 0;

    FINAL TABLE SHOULD LOOK LIKE THIS:

        Country    Gold    Silver    Bronze  Total
         Canada       1       0       1       2
          China       1       1       1       3
        Germany       0       0       1       1
          Korea       1       0       0       1
          Japan       0       1       1       2
         Russia       0       1       1       2
  United States       1       1       0       2
          Total    Gold    Silver    Bronze   X
                      4       4       5
    */

    public static void main(String[] args) {
        final int COUNTRIES = 7;
        final int MEDALS = 3;

        String[] countries = {
            "Canada",
            "China",
            "Germany",
            "Korea",
            "Japan",
            "Russia",
            "United States"
        };

        int[][] counts = 
        { 
            { 1, 0, 1 },
            { 1, 1, 0 }, 
            { 0, 0, 1 }, 
            { 1, 0, 1 }, 
            { 0, 1, 1 }, 
            { 0, 1, 1 },
            { 1, 1, 0 }
        };
        System.out.println("        Country    Gold    Silver    Bronze   Total");


        // TODO
        // NOTE: THIS CAN BE DONE WITH AN ARRAY OR ARRAY LIST OR BOTH IF YOU FIND IT EASIER
        // Print countries, counts, and row totals (IE total medals by country)
        // for formatting use these printf statements
        // System.out.printf("%15s", countries[i]);
        // System.out.printf("%8d", counts[i][j]);
        // System.out.printf("%8d\n", total);
        // These print statements are just for reference for the table above
        // if you want to change them you can
        // HINTS:
        // You will need a nested for loop 
        // (IE for i less than COUNTRIES, and for j < MEDALS)
        // Process the ith row
        // Print each row element and update the row total
        // Display the row total and print a new line



        // Display the total medals of each medal class
        // First create an Integer Array/ArrayList called medalCounts 
        // your rows are counts.length
        // your columns are counts[0].length

        // Make a for loop that will calculate the sum for each column 
        // hint: make a temp variable for the sum and then at the end of the for loop add each sum of
        // each column to the Array/ArrayList medalCounts
        // print the Array list and chart to look like this
        // Gold    Silver    Bronze
        // 4       4         5
     
    }
    
}



