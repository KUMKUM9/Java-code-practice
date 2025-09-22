public class HarmonicSum {   
public static void main (String[] args) { 
 
final int MAX_DENOMINATOR = 50000;  
double sumL2R = 0.0;         
// Sum from left-to-right 
double sumR2L = 0.0;         
// Sum from right-to-left 
double absDiff;              
// Absolute difference between the two sums 
// for-loop for summing from left-to-right 
for (int denominator = 1; denominator <= MAX_DENOMINATOR; ++denominator) { 
// denominator = 1, 2, 3, 4, 5, ..., MAX_DENOMINATOR
sumL2R += (double)1/denominator;  
} 
System.out.println("The sum from left-to-right is: " + sumL2R); 

 for (int denominator = MAX_DENOMINATOR; denominator >= 1; denominator--) { 
// denominator = 1, 2, 3, 4, 5, ..., MAX_DENOMINATOR
sumR2L += (double)1/denominator;  
} 
System.out.println("The sum from left-to-right is: " + sumR2L);
      // Find the absolute difference and display 
      if (sumL2R > sumR2L) System.out.print(sumL2R-sumR2L);
		  
      else System.out.print(sumR2L-sumL2R);
   } 
} 