/*
 * Annie Lee
 * Sept 20, 2021
 * Problem Set 1-A Math Formulas
 */

public class ProblemSet1A {
   
     public static void main(String[] args) {
         
        System.out.print('\u000C'); // clear terminal window each time you run
        
        // ------------------------- QUADRATIC FORMULA START -----------------------
        
        int a = 1;
        int b = 5;
        int c = 6;
       
        // Formula
        double quadraticAns = (-b + Math.sqrt((b*b) - (4*a*c))) / (2 * a);
        double negativeQuadraticAns = (-b - Math.sqrt((b*b) - (4*a*c))) / (2 * a);
       
        // Print answer
        System.out.println("QUADRATIC FORMULA");
        System.out.println("The solutions for " + a + "x^2 + " + b + "x + " + c
        + " are " + negativeQuadraticAns + " and " + quadraticAns + ".");
        
        // ------------------------- QUADRATIC FORMULA END ------------------------
        
        // ------------------------- SLOPE FORMULA START --------------------------
        
        double x1 = 0.0;
        double y1 = 0.0;
        double x2 = 2.0;
        double y2 = 3.0;

        // Formula
        double slopeAns = (y2 - y1) / (x2 - x1);
       
        // Print answer
        System.out.println("\nSLOPE FORMULA");
        System.out.println("A line connecting the points (" + (int) x1 + ", " +
        (int) y1 + ")" + " and (" + (int) x2 + ", " + (int) y2 + ") has a slope of "
        + slopeAns);
        
        // -------------------------- SLOPE FORMULA END ----------------------------
       
        // -------------------------- MIDPOINT FORMULA START -----------------------
        
        // Formula
        double midpointX = (x1 + x2) / 2;
        double midpointY = (y1 + y2) / 2;
        
        // Print answer
        System.out.println("\nMIDPOINT FORMULA");
        System.out.println("The midpoint between (" + (int) x1 + ", " + (int) y1 +
        ") and (" + (int) x2 + ", " + (int) y2 + ") is (" + midpointX + ", " +
        midpointY + ")" );
        
        // -------------------------- MIDPOINT FORMULA END ------------------------
        
        // ------------------- SUM OF AN ARITHMETIC SERIES START ------------------
        
        int numOfTerms = 5; 
        double firstTerm = 1.0;
        double addFirstTerm = firstTerm;
        double difference = 1.0;
        double sum = 0;
        
        // Formula
        for (int i = 0; i < numOfTerms; i++) {
            sum += addFirstTerm;
            addFirstTerm += difference;
        }
       
        // Print answer
        System.out.println("\nSUM OF AN ARITHMETIC SERIES");
        System.out.println("The sum of the first " + numOfTerms + 
        " terms of an arithmetic series that starts with "+ firstTerm + 
        "\nand increases by " + difference + " is " + sum);
        
        // -------------- SUM OF AN ARITHMETIC SERIES END ------------------------
        
        // ------------ SUM OF A FINITE GEOMETRIC SERIES START -------------------
        
        int k = 3; // number of terms
        double g = 3.0; // first term
        double r = 2.0; // common ratio
        
        // Formula
        double geometricAns = (g * (1 - (int)(Math.pow(r, k)))) / (1 - r);
        
        // Print answer
        System.out.println("\nSUM OF A FINITE GEOMETRIC SERIES");
        System.out.println("The sum of the first " + k +
        " terms of a finite geometric series that starts with " + g + 
        "\nand increases by a rate of " + r + " is " + geometricAns);
        
        // ------------ SUM OF A FINITE GEOMETRIC SERIES START -------------------
       
    }
   
}
